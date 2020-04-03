package practica3_SI;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		//Datos del problema
		char [] alf = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',' ','.',',',';','¿','?','¡','!'};
		char [] alf2 = {'a','b','c','d','e',' ','A','B','C','D','E','f','g','h','i','j','k','l','m','n','F','G','H','I','J','K','L','M','N','o','p','q','r','s','t','u','v','w','x','y','z','O','P','Q','R','S','T','U','V','W','X','Y','Z','.',',',';','¿','?','¡','!'};
		
		int [] lista= {1,0,0,1,1,0,0,1,0,0,1,1,0,0,0,1,0,0,1,1,0,0,1,1,0,0,1,
		       1,0,0,1,1,1,1,0,0,1,0,0,1,1,0,0,0,0,0,0,0,0,0,1,0,0,1,1,
		       0,1,0,0,0,1,1,1,0,0,0,1,0,1,1,0,0,0,0,0,0,0,1,1,0,1,0,1,
		       0,1,1,0,1,0,1,0,0,1,1,1,0,0,0,0,1,0,0,1,1,0,1,0,0,1,1,0,
		       0,0,1,0,0,1,1,0,1,1,1,0,1,0,0,1,1,0,1,0,1,0,0,0,0,0,0,0,
		       0,0,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,
		       1,0,0,0,1,0,1,1,0,0,0,0,0,0,0,1,0,0,0,1,1,1,0,1,0,0,1,1,
		       0,1,0,1,1,0,0,1,0,1,0,0,1,1,0,0,0,0,0,0,0,0,1,0,0,0,1,1,
		       1,1,1,1,0,1,0,0,0,0,1,1,1,1,0,0,1,0,1,1,0,1,0,0,1,0,1,0,
		       1,0,0,0,1,0,1,1,0,0,0,0,0,0,0,0,1,1,0,0,1,1,0,1,0,1,1,0,
		       1,0,0,0,0,0,0,0,1,0,0,0,1,1,1,0,0,0,0,0,0,0,1,1,0,0,0,0,
		       1,1,1,1,0,1,0,0,1,1,1,0,1,0,0,1,1,1,1,1,1,1,1,0,1,1,0,0,1};
		
		int [] lista2= {0,1,0,1,1,0,1,1,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,
		       0,0,1,0,0,1,1,0,0,1,0,0,1,1,0,0,0,1,1,1,1,0,1,0,1,0,0,1,
		       0,0,0,0,1,0,1,1,0,0,0,1,0,1,1,0,1,1,0,0,1,1,0,0,1,0,1,0,
		       1,0,0,0,1,0,1,1,0,0,1,0,1,0,1,0,0,0,0,0,0,0,0,1,0,0,1,1,
		       0,1,0,0,0,1,1,1,1,1,1,0,1,0,0,0,1,0,0,1,1,0,1,1,0,0,0,0,
		       1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,1,0,1,0,1,1,0,1,0,1,
		       0,0,0,0,1,0,1,1,0,1,0,1,1,0,1,0,0,0,1,0,1,1,0,0,0,0,0,0,
		       0,0,0,0,0,0,0,0,0,1,0,1,1,0,1,0,1,1,1,0,0,0,1,0,1,0,0,1,
		       0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,
		       1,1,0,0,0,1,1,1,1,0,0,0,1,1,1,1,1,1,0,1,0,0,0,0,0,0,0,0,
		       0,1,0,0,0,1,1,1,0,0,0,0,0,0,0,1,1,0,1,0,1,0,0,1,0,0,1,1,
		       0,0,1,0,1,1,0,1,0,0,1,0,1,0,1,1,0,0,1,1,0,0,0,0,0,1,0,1,
		       1,0,0,0,1,0,1,1,0,1,0,1,1,0,1,0,0,1,0,1,0,1,0,0,0,1,0,1,
		       1,0,0,0,1,0,1,1,0,0,1,1,1,1,0,1,0,0,0,1,1,1,0,1,0,0,1,1,
		       0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,1,1,0,0,0,0,1,0,1,0,0,1,1,
		       0,0,0,0,1,0,1,1,0,1,0,0,1,1,0,0,1,0,0,1,1,0,1,0,0,0,1,1,
		       1,0,1,0,0,1,1,0,0,1,0,1,1,0,1,0,0,0,0,0,0,0,1,0,0,1,1,0,
		       0,1,1,0,1,0,1,0,1,0,0,0,1,1,1,0,0,1,0,1,0,1,0,0,0,0,0,0,
		       0,0,0,0,1,0,1,1,0,0,0,0,0,0,0,0,0,1,0,1,0,1,1,0,0,0,1,1,
		       1,1,0,0,1,1,0,0,1,1,0,1,0,1,0,1,1,1,0,1,0,0,1,1,1,1,1,1,
		       1,1,0,1,1,0,0,1};
		
		//Base=2 porque estamos trabajando con un código binario
		int base = 2;
		
		/*
		 * Calculamos la longitud mínima para codificar cada caracter del alfabeto fuente
		 * y escogemos el valor inmediatamente superior entero como indica la fórmula
		 */
		double logaritmoFuente = Math.log10(alf2.length)/Math.log10(base);
		int longitudAlfabeto2 = (int) Math.ceil(logaritmoFuente);
		System.out.println("Longitud del alfabeto fuente: " + longitudAlfabeto2);
		
		/*
		 * Para saber en cúantos elementos tenemos que dividir el mensaje a decodificar nos fijaremos
		 * en el número de columnas de la matriz generadora G=(I | A) 
		 * 
		 *				  (1,0,0,0,1,1,1
		 *En este caso G=  0,1,0,0,1,1,0
		 * 				   0,0,1,0,1,0,1
		 * 				   0,0,0,1,0,1,1)
		 * 
		 * Al tener 7 columnas dividimos en grupos de 7 dígitos
		 * 		  
		 */
		
		int i=0;
		int j=0;
		int [] arrayCod = new int [7];
		int [] arrayDecod = new int [4];
		
		ArrayList<Integer> codigoFinal = new ArrayList<Integer>();
		
		/*
		 * Dentro de los conjuntos de 7, debemos diferenciar entre los dígitos para decodificar el mensaje
		 * y el ruido. En este caso como trabajamos con una matriz identidad de dimensiones 4x4 (I), agrupamos
		 * los conjuntos de 4 en 4 números, sobrando así 3 dígitos los cuales forman el denominado ruido
		 */
		
		while(i+7<=lista2.length) {//Mientras haya palabras en el código
			for(j=0 ; j<7; j++) {
				if(j<4){
					//Aquí entrará para meter los dígitos en el código final
					arrayDecod[j] = lista2[i+j];
					codigoFinal.add(arrayDecod[j]);
				}else {
					//Este será el ruido
					arrayCod[j] = lista2[i+j];
				}
			}
			i = i+7;
		}
		
		/*
		 * En las siguientes líneas comprobamos que no haya cola dentro del código que nos han dado para
		 * decodificar. De ser así cogemos los dígitos que constituyan la cola y los añadimos al arraylist
		 * con el código final a descifrar
		 */
		
		int mod = lista2.length%7;
		
		if(mod>0) {
			int [] cola = new int [mod];
			for(int k=i; k<lista2.length; k++){
				cola[k-i] = lista2[k];
				codigoFinal.add(cola[k-i]);
			}
		}
		
		/*
		 * En este bucle imprimimos las palabras a descifrar
		 */
		
		System.out.println("Conjuntos a decodificar: ");
		for(int k=0;k<codigoFinal.size();k++) {
			if(k%4==0&&k!=0) {
				System.out.println();
			}
			System.out.print(codigoFinal.get(k));
		}
		
		/*
		 * Como la longitud hallada anteriormente del alfabeto fuente es de 6, dividimos el código a decodificar
		 * en conjuntos de 6 partes
		 */
		
		int tamanioArrayLetras = codigoFinal.size()/6;
		
		i=0;
		j=0;
		int k=0;
		int [] arrayCodigoLetra = new int [6];
		char [] arrayLetras = new char [tamanioArrayLetras];
		
		/*
		 * Repetimos el bucle de antes: Recorremos todo el array con el código y mientras haya conjuntos de 6 elementos
		 * vamos traduciendolo para obtener el mensaje que queremos descifrar
		 */
		System.out.println();
		
		while(i+6<=codigoFinal.size()) {
			//Con este bucle for conseguimos los 6 elementos para conseguir el símbolo buscado.
			System.out.println("Código a traducir: ");
			for(j=0 ; j<6; j++) {
				arrayCodigoLetra[j] = codigoFinal.get(i+j);
				System.out.print(+arrayCodigoLetra[j]);
			}
			System.out.println();
			//Llamamos al método para traducir la letra y la añadimos a un array
			arrayLetras[k] = traducirLetra(arrayCodigoLetra, alf2);
			System.out.println();
			System.out.println("LETRA: " + arrayLetras[k]);
			k++;
			
			System.out.println();
			i = i+6;
		}
		
		//Imprimimos el resultado final
		System.out.println("Mensaje decodificado: ");
		for(int q=0 ; q<arrayLetras.length ; q++){
			System.out.print(arrayLetras[q]);
		}
		
		
	}
	
	public static char traducirLetra(int [] codigoLetra, char [] alf2) {
		
		int sumaCodigo = 0;
		int potencia = 0;
		
		for(int i=codigoLetra.length-1 ; i>=0 ; i--){
			if(codigoLetra[i] == 1){
				//int potenciaDos = 2^potencia;
				//System.out.println("POTENCIA " + potencia);
				sumaCodigo = sumaCodigo + calcularPotencia(potencia);
				System.out.println("POSICION: " + sumaCodigo);
			}
			potencia++;
		}
		
		return alf2[sumaCodigo];
	}
	
	public static int calcularPotencia(int potencia){
		int potenciaDos = 1;
		
		if(potencia != 0){
			for(int i=0 ; i<potencia ; i++){
				potenciaDos = potenciaDos * 2;
			}
			return potenciaDos;
		}
		
		return potenciaDos;
	}
	
}


























