package p6_SI;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.JFileChooser;

import p6_SI.Huffmann;
import p6_SI.Lista;
import p6_SI.ListaArboles;

public class Ej1 {
	
	static String texto = importarTexto();
	static char [] arrayTexto = texto.toCharArray();
	public void principal() {
		// TODO Auto-generated method stub
		
		//EJERCICIO 1
		double entropia= ej1(arrayTexto);
		System.out.println("H(f)="+entropia);
		
		//EJERCICIO 2
		Lista listaCaminos= ej2();
        
        //EJERCICIO 3
        //Array donde guardamos los códigos de los símbolos
        ej3(listaCaminos, entropia);
        
	}

	public static double ej1(char[] arrayTexto){
		ArrayList<Character> arraySimbolosUnicos = new ArrayList<Character>();
		
		//Añadimos todos los simbolos en el array que son distintos
		for(int i=0 ; i<arrayTexto.length ; i++){
			if(!existeLetra(arrayTexto[i], arraySimbolosUnicos)){
				arraySimbolosUnicos.add(arrayTexto[i]);
			}
		}
		
		System.out.println("Número de símbolos unicos: "+arraySimbolosUnicos.size());
		
		//Creamos e inicializamos el array de las frecuencias
		double [] arrayFrecu = new double[arraySimbolosUnicos.size()];
		
		for(int x=0; x<arrayFrecu.length; x++) {
			arrayFrecu[x]=0;
		}
		
		//Calculamos la frecuencia de cada elemento en la misma posición
		for(int j=0; j<arrayTexto.length; j++) {
			for(int m=0; m<arraySimbolosUnicos.size(); m++) {
				if(arrayTexto[j] == arraySimbolosUnicos.get(m)) {
					arrayFrecu[m]++;
				}
			}
		}
		
		//Creamos el array de las probabilidades y las calculamos en el bucle
		double [] probabilidad = new double [arrayFrecu.length];
		for(int i=0; i<arrayFrecu.length; i++) {
			probabilidad[i] = arrayFrecu[i]/arrayTexto.length;
		}
		
		/*
		 * Mediante la fórmula de la entropía y los logaritmos calculamos el valor
		 */
		
		double logTotal = Math.log((double)arrayTexto.length)/Math.log(2);
		double sumatorio = 0;
		double aux=0;
		double resultadoFinal;
		
		/*
		 * Método para calcular la entropía
		 */
		
		for(int l=0; l<arrayFrecu.length; l++) {
			aux = Math.log(arrayFrecu[l])/Math.log(2);
			aux = aux * arrayFrecu[l];
			sumatorio = sumatorio + aux;
			aux=0;
		}
		
		double segundaParte = (double)1/(double)arrayTexto.length;
		segundaParte = segundaParte * sumatorio;
		
		resultadoFinal = logTotal - segundaParte;
		
		return resultadoFinal;
	}
	
	private static Lista ej2() {
		// TODO Auto-generated method stub
		Huffmann h= new Huffmann(texto);
		Lista l = h.ToNodos();
        ListaArboles la = h.cuentaLetras(l);
        ListaArboles l2 = h.juntaNodo(la);
        h.encuentraCamino(l2.getInicio().getDato().getRaiz(), "");
        Lista listaCaminos = h.regresaCaminos();
        String x = h.convierte(listaCaminos);
        //System.out.println(x);
        System.out.println("Longitud del texto introducido: "+ x.length());
        System.out.println("----------------------------------------");
        return listaCaminos;
	}
	
	private static void ej3(Lista listaCaminos, double entropia) {
		// TODO Auto-generated method stub
		ArrayList<String> codigos= listaCaminos.anadirCodigos();
        
        System.out.print("Símbolos y sus códigos:\n");
        listaCaminos.recorrer2();
        System.out.println("----------------------------------------");
      
        //Hallamos las probabilidades de los elementos
        double[] probabilidades= probabilidades(arrayTexto);
        
      //Obtenemos la lista de elementos únicos
        ArrayList<Character> arraySimbolosUnicos= obtenerSimbolosUnicos();
        
        System.out.println("Símbolos y sus probabilidades:");
        for(int i=0;i<probabilidades.length;i++) {
        	System.out.println("'"+arraySimbolosUnicos.get(i)+"':"+probabilidades[i]);
        }
        System.out.println("----------------------------------------");
      
        //Obtener elementos ordenados por arrayHuffman
        ArrayList<Character> arrayHuffman= listaCaminos.anadirSimbolos();
        
        double longitudBinaria= hallarLongitud(arraySimbolosUnicos, probabilidades, arrayHuffman, codigos);
        System.out.println("La longitud binaria de este código es: "+longitudBinaria);
        
        double eficacia= hallarEficacia(entropia, longitudBinaria, (double) arraySimbolosUnicos.size());
        System.out.println("La eficacia de este código es: "+eficacia);
	}
	
	public static ArrayList<Character> obtenerSimbolosUnicos() {
		//Array con los caracteres sin repetir
		ArrayList<Character> arraySimbolosUnicos = new ArrayList<Character>();
		
		/*
		 * En este bucle añadimos todos los símbolos distintos que hay en el texto 
		 */
		for(int i=0 ; i<arrayTexto.length ; i++){
			if(!existeLetra(arrayTexto[i], arraySimbolosUnicos)){
				arraySimbolosUnicos.add(arrayTexto[i]);
			}
		}
		
		return arraySimbolosUnicos;
	}
	
	public static double[] probabilidades(char[] arrayTexto){
		
		ArrayList<Character> arraySimbolosUnicos= obtenerSimbolosUnicos();
		
		/*
		 * Inicializamos el array de las frecuencias
		 */
		
		double [] arrayFrecu = new double[arraySimbolosUnicos.size()];
		for(int x=0; x<arrayFrecu.length; x++) {
			arrayFrecu[x]=0;
		}
		
		/*
		 * Calculamos la frecuencia de cada símbolo
		 */
		
		for(int j=0; j<arrayTexto.length; j++) {
			for(int m=0; m<arraySimbolosUnicos.size(); m++) {
				if(arrayTexto[j] == arraySimbolosUnicos.get(m)) {
					arrayFrecu[m]++;
				}
			}
		}
		
		/*
		 * Creamos un array para guardar las 4 mayores frecuencias y luego sacar sus probabilidades
		 * Si es necesario sacar más probabilidades cambiamos la dimensión del array
		 */
		double[] arrayOrdenado= new double[arrayFrecu.length];
		int[] maxFrecuencias= new int[4];
		
		/*
		 * Pasamos los datos de la frecuencia al array para ordenarlos de menor a mayor
		 */
		for(int i=0;i<arrayFrecu.length;i++) {
			arrayOrdenado[i]=arrayFrecu[i];
		}
		
		//Método que ordena los arrays de menor a mayor
		Arrays.sort(arrayOrdenado);
		
		/*
		 * Como el array está ordenado de menor a mayor cogemos las posiciones finales
		 * En caso de que pidiese más posiciones pues las metemos como aqui abajo
		 */
		
		maxFrecuencias[0]= (int) arrayOrdenado[arrayOrdenado.length-1];
		maxFrecuencias[1]= (int) arrayOrdenado[arrayOrdenado.length-2];
		maxFrecuencias[2]= (int) arrayOrdenado[arrayOrdenado.length-3];
		maxFrecuencias[3]= (int) arrayOrdenado[arrayOrdenado.length-4];
		
		/*
		 * Buscamos la equivalencia de la letra a la que corresponde esa frecuencia
		 * y la almacenamos en el array
		 */
		
		char[] simbolos= new char[4];
		
		for(int j=0; j<4; j++) {
			for(int m=0; m<arrayFrecu.length; m++) {
				//Si coinciden las frecuencias metemos el símbolo al que corresponde
				if(maxFrecuencias[j]==arrayFrecu[m]) {
					//Metemos el símbolo al que corresponde
					simbolos[j]= arraySimbolosUnicos.get(m);
					break;
				}
			}
		}
		
		double [] probabilidad = new double [arrayFrecu.length];
		
		System.out.println();
		
		for(int i=0; i<arrayFrecu.length; i++) {
			probabilidad[i] = arrayFrecu[i]/arrayTexto.length;
		}
		
		return probabilidad;
}
	
	private static int buscaPosicionArray(int pos, ArrayList<Character> arraySimbolosUnicos, ArrayList<Character> arrayHuffman) {
		// TODO Auto-generated method stub
			for(int j=0;j<arrayHuffman.size();j++) {
				if(arraySimbolosUnicos.get(pos).equals(arrayHuffman.get(j))) {
					return j;
				}
			}
		
		return -1;//Nunca debería llegar a este punto porque tienen que tener ambos arrays los mismos elementos
	}
	
	private static double hallarLongitud(ArrayList<Character> arraySimbolosUnicos, double[] probabilidades,
			ArrayList<Character> arrayHuffman, ArrayList<String> codigos) {
		// TODO Auto-generated method stub
		double longitudBinaria= 0.0;
		int longitudCodigo;
		double tmp;
		
		for(int i=0;i<arraySimbolosUnicos.size();i++) {
			int pos=buscaPosicionArray(i, arraySimbolosUnicos, arrayHuffman);
			longitudCodigo= codigos.get(pos).length();
			tmp= probabilidades[i]*longitudCodigo;
			longitudBinaria+=tmp;
		}
		return longitudBinaria;
	}

	private static double hallarEficacia(double entropia, double longitudBinaria, double q) {
		// TODO Auto-generated method stub
		//Omitimos el log2(2) porque al trabajar con un código binario con q=2
		//ese resultado nos va a dar 1
		return entropia/longitudBinaria;
	}
	
	public static  String importarTexto(){
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		String textoFinal="";
		final JFileChooser fc;
		int returnVal;

		try {
			// Apertura del fichero y creacion de BufferedReader para poder
			// hacer una lectura comoda (disponer del metodo readLine()).

			fc= new JFileChooser();
			returnVal= fc.showOpenDialog(null);
			archivo= fc.getSelectedFile();
			
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);

			// Lectura del fichero
			String linea;
			while ((linea = br.readLine()) != null) {
				//System.out.println(linea);
				
				textoFinal += linea;
				textoFinal += "  ";
			}
			textoFinal = textoFinal.substring(0, textoFinal.length()-2);
			//System.out.println(textoFinal);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// En el finally cerramos el fichero, para asegurarnos
			// que se cierra tanto si todo va bien como si salta
			// una excepcion.
			try {
				if (null != fr) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return textoFinal;

	}
	
	

	public static boolean existeLetra(char letra, ArrayList<Character> arraySimbolosUnicos){
		
		for(int i=0 ; i<arraySimbolosUnicos.size() ; i++){
			if(letra == arraySimbolosUnicos.get(i)){
				return true;
			}
		}
		return false;
	}
}
