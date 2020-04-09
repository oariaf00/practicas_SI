package p6_SI;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Ej2 {
	/*
	 * Implementaciï¿½n del algoritmo de Huffman
	 * Encriptacion de un texto
	 * Para implementar el Algoritmo de Huffman es necesario conocer los ï¿½rboles binarios.
	 */
	static ArrayList<Integer> longitudes= new ArrayList<Integer>();
	static int[] charFreqs = new int[9];
	static double[] probabilidades= new double[9];
	
	int longitudMensajeDato= 2020;
	
	
	public void principal() {
        
        //Paso 1 - Recorre el texto contando los sï¿½mbolos y hace un vector de frecuencias.
        charFreqs[0]=3136;
        charFreqs[1]=484;
        charFreqs[2]=728;
        charFreqs[3]=1232;
        charFreqs[4]=1232;
        charFreqs[5]=728;
        charFreqs[6]=286;
        charFreqs[7]=169;
        charFreqs[8]=286;
        int total = 0;
        
        for(int i=0;i<charFreqs.length;i++) {
			total+=charFreqs[i];
		}
        
        // Crear el ï¿½rbol de cï¿½digos
        HuffmanTree tree = buildTree(charFreqs);
        
        // Tabla
        System.out.println("TABLA DE CODIGOS");
        System.out.println("SIMBOLO\tCANTIDAD\tCODIGO DE HUFFMAN");
        printCodes(tree, new StringBuffer());
        
        /*
         * Entropia
         */
        
        double logTotal = Math.log((double)total)/Math.log(2);
		double sumatorio = 0;
		double aux=0;
		double resultadoFinal;
		
		/*
		 * Método para calcular la entropía
		 */
		
		for(int l=0; l<charFreqs.length; l++) {
			aux = Math.log(charFreqs[l])/Math.log(2);
			aux = aux * charFreqs[l];
			sumatorio = sumatorio + aux;
			aux=0;
		}
		
		double segundaParte = (double)1/(double)total;
		segundaParte = segundaParte * sumatorio;
		
		resultadoFinal = logTotal - segundaParte;
		
		System.out.println("Entropía: "+resultadoFinal);
		
		/*
		 * Longitud binaria
		 */
        double longitudBinaria= 0.0;
		int longitudCodigo;
		double tmp;
		
		for(int i=0;i<charFreqs.length;i++) {
			double x= (double) charFreqs[i]/ (double) total;
			probabilidades[i]=x;
		}
		
		for(int i=0;i<longitudes.size();i++) {
			longitudCodigo= longitudes.get(i);
			tmp= probabilidades[i]*longitudCodigo;
			longitudBinaria+=tmp;
		}
		
		System.out.println("LB: "+longitudBinaria);
		
		System.out.println("Eficacia: "+(double) resultadoFinal/ (double)longitudBinaria);
		
		double lEstimada= (longitudBinaria/2)*longitudMensajeDato;
		
		System.out.println("Longitud estimada del apartado b: "+lEstimada);

    }

	/* Crear el ï¿½rbol de codificaciï¿½n - A partir de la cantidad de frecuencias de cada letra
	 * Se crea un ï¿½rbol binario para la codificacion del texto
	 * Parï¿½metro de Entrada: charFreqs: array con cantidad de frecuencias de cada letra
	 * Parï¿½metro de salida: trees: ï¿½rbol binario para la codificacion y decodificaciï¿½n
	 */
    public static HuffmanTree buildTree(int[] charFreqs) {
    	// Crea una cola de prioridad
        //La cola se crearï¿½ en el orden de frecuencia de la letra en el texto
        PriorityQueue<HuffmanTree> trees = new PriorityQueue<HuffmanTree>();
        // Crear las hojas de ï¿½rbol para cada letra
        for (int i = 0; i < charFreqs.length; i++){
            if (charFreqs[i] > 0)
                trees.offer(new HuffmanLeaf(charFreqs[i], (char)i)); //insertar los elementos, nodo de hoja, en la cola de prioridad
        }
        // Recorre todos los elementos de la cola
        // Creando el ï¿½rbol binario de abajo hacia arriba
        while (trees.size() > 1) {
        	// Toma los dos nodos con menor frecuencia
            HuffmanTree a = trees.poll(); // poll- devuelve el siguiente nodo de la cola o NULL si no tiene mï¿½s
            HuffmanTree b = trees.poll(); // poll - Devuelve el siguiente nodo de la cola o NULL si no tiene mï¿½s
 
            // Crear los nodos del ï¿½rbol binario
            trees.offer(new HuffmanNode(a, b)); 
        }
     // Devuelve el primer nodo del ï¿½rbol
        return trees.poll();
    }
    
    /*
    * Mï¿½todo para recorrer el ï¿½rbol y mostrar la tabla de codificadion
    * Parï¿½metros de entrada: ï¿½rbol - Raï¿½z del ï¿½rbol 
    * Prefix - texto codificado con 0 y / o 1
    */ 
    
    public static void printCodes(HuffmanTree tree, StringBuffer prefix) {
        assert tree != null;
        
        
        if (tree instanceof HuffmanLeaf) {
            HuffmanLeaf leaf = (HuffmanLeaf)tree;
            
            
            System.out.println(leaf.value + "\t" + leaf.frequency + "\t\t" + prefix);
            
            longitudes.add(prefix.length());
 
        } else if (tree instanceof HuffmanNode) {
            HuffmanNode node = (HuffmanNode)tree;
 
            // traduce la izquierda
            prefix.append('0');
            printCodes(node.left, prefix);
            prefix.deleteCharAt(prefix.length()-1);
 
            // traduce la derecha 
            prefix.append('1');
            printCodes(node.right, prefix);
            prefix.deleteCharAt(prefix.length()-1);
        }
    }
    
    /*
    * Mï¿½todo para devolver el cï¿½digo comprimido de una letra (w)
    * Parï¿½metros de entrada: ï¿½rbol - Raï¿½z del ï¿½rbol 
    * Prefix - texto codificado con 0 y / o 1
    * W - Letra
    * Parï¿½metros de salida: prefijo- Letra codificada
    */ 
    public static String getCodes(HuffmanTree tree, StringBuffer prefix, char w) {
        assert tree != null;
        
        if (tree instanceof HuffmanLeaf) {
            HuffmanLeaf leaf = (HuffmanLeaf)tree;
            
            //devuelve el texto
            if (leaf.value == w ){
            	return prefix.toString();
            }
            
        } else if (tree instanceof HuffmanNode) {
            HuffmanNode node = (HuffmanNode)tree;
 
            // vuelve a recorrer la izquierda
            prefix.append('0');
            String left = getCodes(node.left, prefix, w);
            prefix.deleteCharAt(prefix.length()-1);
 
            // vuelve a recorrer la derecha
            prefix.append('1');
            String right = getCodes(node.right, prefix,w);
            prefix.deleteCharAt(prefix.length()-1);
            
            if (left==null) return right; else return left;
        }
		return null;
    }

}
