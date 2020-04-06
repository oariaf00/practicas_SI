package practica4_SI;

import java.util.ArrayList;

public class Main {
	
	//Lista del código a desencriptar
	static int[] lista= {1,1,0,1,0,0,0,1,0,1,0,0,1,1,0,0,0,1,1,1,1,0,1,1,1,0,1,1,1,0,1,1,0,1,1,1,0,1,0,1,0,1,0,0,0,0,0,1,0,1,0,1,1,0,0,1,0,0,1,1,1,1,1,0,0,0,0,0,1,0,0,0,1,1,0,1,1,1,1,1,1,0,0,1,1,0,1,1,0,0,1,0,1,1,1,0,0,0,1,0,1,1,0,0,1,1,1,0,0,1,0,1,0,1,0,1,0,1,1,1,0,0,1,0,1,0,0,0,0,1,1,1,0,1,1,0,0,0,1,0,0,1,0,1,1,0,1,1,0,0,0,1,1,1,0,0,0,1,0,0,1,1,1,0,1,0,1,1,0,0,1,1,1,1,1,0,0,0,0,0,1,0,0,1,0,1,1,1,1,1,0,0,0,0,0,1,0,1,0,0,1,0,0,0,1,0,1,0,1,0,0,0,0,1,0,1,1,0,1,1,1,0,0,1,1,0,0,0,1,1,0,0,1,1,1,0,1,1,1,0,0,1,1,0,1,0,1,1,1,0,1,0,1,0,1,1,0,0,1,0,1,0,1,1,0,0,0,1,0,0,0,0,0,1,1,0,0,1,1,1,0,1,1,1,0,0,1,1,0,1,1,1,0,1,1,1,0,0,1,1,0,0,0,0,1,0,1,0,1,1,0,1,1,0,0,1,1,0,1,0,1,0,1,0,1,1,1,0,0,1,0,1,1,1,0,0,1,0,1,1,0,1,1,0,0,0,0,1,1,1,1,0,1,0,0,0,1,1,0,0,0,1,1,0,0,1,0,1,0,0,1,0,0,1,1,1,1,1,0,1,1,0,0,0,1,0,0,1,0,0,0,0,0,1,1,0,0,1,1,0,1,1,0,1,1,0,0,1,0,0,0,1,0,1,0,1,0,1,1,1,0,1,0,0,1,1,0,1,1,0,0,0,1,0,0,1,1,0,1,1,0,1,0,0,1,0,1,0,1,0,0,0,0,0,0,1,0,1,0,1,0,0,1,1,0,0,0,0,0,1,0,0,1,0,1,0,0,1,1,0,0,0,1,1,1,0,0,0,1,0,0,1,0,0,0,0,0,1,1,1,1,0,1,1,1,0,0,0,0,0,0,1,1,0,1,0,0,1,1,1,1,0,0,0,1,1,0,1,1,0,1,1,0,1,1,1,0,0,1,1,0,1,0,1,1,0,1,1,0,1,1,1,0,0,1,1,0,0,1,0,1,0,1,0,1,0,1,0,0,0,0,0,0,1,1,1,0,1,0,1,0,0,1,1,0,0,1,0,1,0,0,1,0,1,0,0,1,0,0,0,0,1,0,0,1,1,1,0,0,1,1,1,0,1,1,0,0,1,0,0,1,1,1,1,0,0,1,0,1,0,0,1,0,0,1,1,1,0,1,0,1,1,0,0,1,0,1,0,1,0,0,0,1,0,1,1,1,0,0,1,0,1,1,0,1,0,1,1,0,0,0,1,1,0,0,1,1,0,1,0,1,1,1,1,0,0,0,1,0,0,1,0,1,1,0,1,1,0,1,0,0,1,0,0,0,1,1,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,1,0,1,0,1,0,1,1,0,0,1,0,1,0,1,0,1,1,1,0,1,0,1,0,0,0,1,0,1,1,1,0,0,1,1,1,1,1,0,1,1,1,1,0,1,0,1,0,1,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,1,0,1,1,1,0,0,1,1,1,1,1,0,0,0,1,1,0,1,1,0,1,1,1,1,1,1,0,0,1,1,1,1,1,0,0,0,1,1,0,0,0,0,0,1,0,1,0,1,1,0,0,1,0,1,1,1,0,0,1,0,1,1,0,1,1,0,0,0,0,1,1,1,1,0,1,0,0,0,1,1,0,0,0,0,1,1,1,0,0,1,0,0,1,1,1,0,1,1,0,1,0,1,0,1,1,0,0,0,0,0,1,0,0,0,1,1,1,1,0,1,0,0,0,1,1,0,0,1,0,1,0,0,1,1,0,1,1,0,1,1,0,0,1,1,0,0,1,0,1,0,1,0,1,1,0,0,1,1,0,1,1,1,1,1,1,0,1,1,1,0,0,1,1,1,1,0,0,0,1,1,1,0,1,0,1,0,1,1,1,0,1,0,0,0,1,0,1,0,0,1,1,0,1,1,1,1,0,1,1,1,1,0,1,0,1,0,1,1,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1,1,1,0,0,1,1,1,0,0,1,0,0,1,0,0,1,1,1,0,0,0,1,0,1,1,0,1,1,0,0,0,1,1,1,1,1,1,0,0,1,1,0,1,0,1,1,1,1,1,0,0,1,1,1,0,0,1,0,1,0,0,0,0,1,1,0,1,0,0,1,0,0,1,0,0,0,0,1,0,0,1,0,0,0,1,1,0,1,0,1,1,1,0,0,1,1,0,1,1,0,1,1,0,1,1,1,1,1,0,0,0,0,0,1,0,0,1,0,0,0,0,1,0,1,1,0,0,0,1,1,1,1,1,0,1,0,0,0,0,0,0,0,0,0,1,1,0,1,0,1,0,1,0,0,0,0,0,0,1,1,1,1,1,0,1,0,0,1,1,1,0,0,0,1,1,1,0,0,1,1,0,1,0,0,1,1,0,0,1,0,0,0,1,1,0,1,1,1,1,0,1,0,1,1,1,1,0,0,0,1,1,0,0,0,0,0,1,0,1,0,1,1,0,0,1,0,0,0,1,1,0,1,0,0,1,0,1,0,1,0,1,0,1,1,0,0,1,1,1,0,1,1,0,1,1,0,1,1,1,1,1,0,1,1,1,1,0,0,0,1,0,1,1,1,0,1,1,0,1,1,1,1,1,0,1,1,0,0,0,0,0,0,1,0,1,0,1,0,0,0,1,0,1,0,1,0,0,1,1,1,1,0,0,0,1,0,0,1,0,0,0,1,0,1,0,1,1,0,0,1,0,1,0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,0,1,0,0,1,1,0,1,1,0,0,1,1,1,1,1,0,0,1,0,0,1,0,0,1,1,1,1,1,0,0,0,1,1,1,1,0,1,1,1,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,1,0,1,0,1,1,0,0,0,1,0,1,1,0,0,1,0,1,0,1,0,1,0,1,1,1,0,1,1,1,1,1,1,1,0,1,1,1,0,0,1,1,1,0,0,0,1,1,0,1,1,0,0,0,1,0,1,0,0,0,1,1,0,0,1,1,1,1,1,0,1,0,1,1,1,1,1,0,0,0,1,0,1,0,1,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,1,1,0,0,1,0,1,0,1,0,1,0,1,1,1,1,1,0,0,0,0,1,0,0,1,0,0,1,0,0,1,1,0,0,1,1,1,0,0,1,0,1,0,1,0,0,0,0,0,1,0,0,1,0,1,0,0,1,1,0,0,0,1,1,1,1,1,1,0,0,1,0,0,1,1,0,0,0,1,1,0,0,1,1,1,0,1,1,1,0,0,0,1,0,0,0,0,0,1,0,0,0,1,1,0,1,1,0,0,0,1,0,1,1,1,1,0,0,0,1,1,1,1,0,1,1,0,1,1,0,0,0,1,0,0,1,0,0,1,1,0,1,1,0,1,1,1,0,0,1,0,0,0,0,0,0,0,0,0,1,1,0,1,0,1,0,1,0,0,0,1,1,1,0,0,1,0,0,1,1,1,1,1,0,1,1,0,0,1,0,0,0,1,1,0,1,0,1,0,1,0,1,0,1,1,0,1,1,0,0,1,1,0,0,1,0,1,0,1,0,1,0,1,1,1,0,1,1,0,1,1,1,0,1,1,1,0,0,1,1,1,0,0,1,1,1,1,1,0,0,1,1,1,0,1,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,0,1,0,0,0,0,0,1,0,1,0,0,1,1,0,1,0,1,0,1,0,0,0,1,1,1,0,0,1,1,0,0,1,0,1,1,0,0,0,1,0,1,0,1,0,0,1,0,0,1,0,0,1,0,1,1,1,0,0,1,1,0,1,0,0,1,1,0,1,0,1,0,1,1,1,0,0,0,0,0,1,0,1,1,0,0,1,0,1,0,1,0,1,0,0,0,0,0,0,1,1,0,1,0,1,1,0,0,0,1,0,1,1,0,0,1,0,0,1,1,1,1,1,0,1,0,1,0,0,1,0,0,1,0,0,1,0,1,0,0,1,1,0,1,1,0,1,1,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1,0,1,1,1,0,0,1,0,1,0,1,1,0,0,1,0,0,1,0,1,0,1,0,0,1,0,1,0,1,0,0,1,0,1,1,0,1,1,0,0,0,0,0,1,0,1,1,1,1,1,0,0,1,0,1,0,1,0,0,0,0,1,0,0,0,0,1,1,1,1,0,1,1,1,0,1,0,1,1,1,1,0,1,0,0,1,1,1,0,1,1,1,0,1,0,0,1,0,1,0,1,0,1,1,1,0,0,0,0,0,0,1,0,0,1,0,0,1,0,0,0,1,1,1,1,0,1,0,0,1,0,1,0,1,0,1,0,1,0,1,1,0,1,0,0,0,1,1,0,0,0,1,1,0,1,0,0,0,1,0,0,1,0,0,0,0,0,0,1,0,0,0,0,1,1,1,0,0,1,1,0,1,0,1,1,1,0,1,0,1,1,1,0,0,1,1,0,0,1,1,0,0,0,1,1,1,0,0,1,1,0,0,0,1,0,1,1,1,1,1,1,0,0,0,1,0,1,1,0,0,1,0,1,1,0,0,1,0,1,0,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,0,0,1,0,0,0,1,1,1,1,1,0,1,1,0,0,1,1,1,1,1,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,1,0,1,1,0,1,0,0,0,1,1,0,1,1,0,1,1,1,1,0,0,1,1,0,1,0,1,0,0,1,1,0,1,1,0,1,1,0,1,1,0,0,0,0,0,0,0,1,0,0,1,1,1,0,0,1,1,1,0,0,1,1,1,0,1,0,1,1,0,1,1,1,1,1,1,0,0,1,0,0,0,1,1,0,1,0,1,0,1,1,1,1,0,1,1,1,1,1,1,1,1,1,0,1,0,1,0,1,1,0,1,0,1,1,0,0,1,1,1,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,1,0,1,0,1,0,0,1,0,0,1,0,0,1,0,1,0,1,1,1,0,0,1,0,0,1,0,0,1,1,1,0,0,0,1,0,1,0,1,0,1,1,1,1,0,1,1,0,1,0,0,0,1,1,1,0,1,1,0,1,0,0,0,1,0,0,0,0,0,1,1,1,0,0,0,0,0,1,1,1,0,0,1,0,1,0,1,0,1,1,0,0,1,0,1,0,1,0,1,1,0,0,1,0,0,0,1,0,0,1,0,1,1,0,1,1,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,1,0,1,0,0,1,1,0,1,1,0,0,1,0,0,0,1,0,0,0,1,1,0,0,1,0,0,0,1,1,0,1,1,1,0,0,1,1,0,1,1,1,0,0,1,0,1,1,0,1,1,0,0,0,0,0,0,0,1,1,0,1,0,1,0,1,1,1,1,1,0,0,0,0,0,1,0,1,1,1,0,0,1,0,0,0,1,0,1,0,0,1,1,0,0,0,1,0,0,1,0,1,1,0,0,0,1,0,0,0,1,1,0,0,0,1,0,0,0,1,1,1,1,0,0,0,0,0,1,0,0,0,0,0,0,1,0,1,0,1,0,0,0,1,1,0,0,0,1,0,1,1,1,1,0,0,0,1,0,1,0,0,1,1,1,0,1,0,1,1,0,0,1,0,0,0,0,1,1,1,0,1,0,0,0,1,1,0,1,1,1,1,0,0,0,1,1,0,1,1,0,1,1,1,1,0,0,0,1,0,1,0,1,0,1,0,0,0,0,0,1,0,0,0,0,0,1,1,1,0,0,1,1,0,0,1,1,1,0,0,0,0,1,0,1,0,1,0,0,0,1,0,0,0,1,1,0,1,1,1,0,0,1,1,1,0,1,1,1,0,0,0,0,1,1,1,1,1,1,0,1,0,1,1,0,1,0,1,1,0,1,1,1,1,0,1,0,1,0,0,0,1,0,0,0,1,1,0,1,1,1,1,0,1,0,1,0,0,1,0,0,1,1,1,0,1,1,0,0,1,1,0,1,1,0,1,1,1,1,1,0,1,1,0,1,1,1,1,1,1,1,1,1,0,0,1,1,0,0,1,1,1,0,0,0,1,0,0,1,0,1,1,1,1,1,1,0,0,0,0,0,1,0,1,1,0,1,0,0,0,0,0,0,1,1,1,1,1,0,1,1,1,0,0,0,1,0,1,0,0,1,1,0,0,1,0,0,0,0,0,0,1,1,1,0,0,1,1,1,0,1,0,0,1,1,1,1,1,0,0,0,0,0,1,1,1,0,1,1,0,0,1,0,0,0,1,1,0,0,0,0,1,0,1,1,0,1,0,0,1,0,0,0,0,0,1,1,1,0,1,1,0,0,0,1,1,0,0,0,0,1,1,0,1,0,1,1,1,1,1,1,1,1,0,1,1,1,0,1,1,0,1,0,0,0,1,1,0,0,1,1,1,0,0,0,0,1,0,0,0,1,1,0,0,0,0,1,0,1,1,0,1,0,0,1,0,0,0,1,0,0,1,1,0,0,0,1,0,0,1,0,0,0,1,1,1,1,0,0,0,0,0,0,0,1,1,1,0,0,1,0,0,1,0,0,0,0,1,1,0,1,0,1,0};
	//Alfabeto que usaremos para traducir
	static char[] alf= {'A','Á','B','C','D','E','É','F','G','H','I','Í','J','K','L','M','N','Ñ','O','Ó','P','Q','R','S','T','U','Ú','V','W','X','Y','Z', '.',';',':','(',')','¿', '?', '¡','!','-','0','1','2','3','4','5','6','7','8','9','a','á','b','c','d','e','é','f','g','h','i','í','j','k','l','m','n','ñ','o','ó','p','q','r','s','t','u','ú','v','w','x','y','z'};

	//Matriz generadora para esta codificación (Introducida manualmente matriz identidad)
	int[][] matrizGeneradora={
			{1,0,0,0,0,0,1,0,1,0,1,0,1,1,1},
			{0,1,0,0,0,0,1,0,1,0,1,1,0,0,1},
			{0,0,1,0,0,0,1,0,1,1,0,1,1,0,0},
			{0,0,0,1,0,0,0,1,0,1,0,0,1,1,0},
			{0,0,0,0,1,0,0,0,1,1,1,0,0,1,1},
			{0,0,0,0,0,1,1,1,1,1,0,0,0,0,0}};
	
	//Matriz A
	static int[][] A={
			{1,0,1,0,1,0,1,1,1},
			{1,0,1,0,1,1,0,0,1},
			{1,0,1,1,0,1,1,0,0},
			{0,1,0,1,0,0,1,1,0},
			{0,0,1,1,1,0,0,1,1},
			{1,1,1,1,0,0,0,0,0}};
	
	//Matriz de control
	static int [][] H= matrizTraspuestaYNegativa(A);
	
	//Base=2 porque estamos trabajando con un código binario
	static int base = 2;
	
	//ArrayLists donde meteremos los códigos con el ruido
	static ArrayList<Integer> codigoFinal = new ArrayList<Integer>();
	static ArrayList<Integer> ruido = new ArrayList<Integer>();
	
	//Valor de la distancia de Hamming y la capacidad correctora
	static int d=5;
	static int capacidadCorrectora=2;
	
	//Matriz binaria y limpia(despues de quitar los q tienen peso > 2)
	static int [][] matrizBinaria;
	static int [][] matrizBinariaLimpia;
	static ArrayList<Integer> matrizBinariaAL = new ArrayList<Integer>();
	static ArrayList<Integer> matrizBinariaLimpiaAL = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		* Calculamos la longitud mínima para codificar cada caracter del alfabeto fuente
		* y escogemos el valor inmediatamente superior entero como indica la fórmula
		*/
		int longitudAlfabeto2 = calculaLongitudFuente();
		System.out.println("Longitud del alfabeto fuente: " + longitudAlfabeto2);
		
		obtenerCodigoFinal();
		
		
		
		//System.out.println("Conjuntos a decodificar: ");
		/*for(int k=0;k<codigoFinal.size();k++) {
			if(k%15==0&&k!=0) {
				System.out.println();
			}
			System.out.print(codigoFinal.get(k));
		}*/
		
		
	}
	
	
	/**
	 * Método que devuelve la longitud de la palabra de la fuente
	 * @return
	 */
	private static int calculaLongitudFuente() {
		double logaritmoFuente = Math.log10(alf.length)/Math.log10(base);
		int longitudAlfabeto2 = (int) Math.ceil(logaritmoFuente);
		return longitudAlfabeto2;
	}
	
	/**
	 * Método que divide las palabras de la lista inicial
	 * @return ArrayList con las palabras a decodificar
	 */
	private static void obtenerCodigoFinal() {
		// TODO Auto-generated method stub
		/*
		 * Dentro de los conjuntos de 15, debemos diferenciar entre los dígitos para decodificar el mensaje
		 * y el ruido.
		 */
		
		int i=0;
		int j=0;
		int[][] arrayCod = new int [15][1];
		
		while(i+15<=lista.length) {//Mientras haya palabras en el código
			for(j=0 ; j<15; j++) {
				//Aquí entrará para meter los dígitos en el código final
				arrayCod[j][0]= lista[i+j];
				codigoFinal.add(lista[i+j]);
			}
			
			//Hallamos el síndrome del bloque extraído
			int[][] sindrome= multiplica(arrayCod, H);
		
			System.out.println("Síndrome: ");
			for(j=0 ; j<sindrome.length; j++) {
				for(int l=0;l<sindrome[0].length;l++) {
					System.out.print(sindrome[j][l]+" ");
				}
				System.out.println();
			}
			
			
			i = i+15;
		}
		
		System.out.println("AL:");
		for (int k = 0; k < matrizBinariaAL.size(); k++) {
			System.out.print(matrizBinariaAL.get(k)+" ");
		}
		
		int num, numSindromes, aux;
		num=0;
		
		numSindromes = matrizBinariaAL.size()/9;
		
		System.out.println();
		System.out.println("Numero de sindromes "+numSindromes+"  num sindromes*9 "+matrizBinariaAL.size());
		
		for(int q=0; q<numSindromes; q++) {
			aux=0;
			
			for(int p=0; p<9; p++) {
				if(matrizBinariaAL.get((q*9)+p)==1) {
					aux++;
				}
			}
			
			if(aux<3) {
				for(int t=0; t<9; t++) {
					matrizBinariaLimpiaAL.add(matrizBinariaAL.get((q*9)+t));
				}
			}
			
		}	
		
		System.out.println("AL limpita:");
		for (int k = 0; k < matrizBinariaLimpiaAL.size(); k++) {
			System.out.print(matrizBinariaLimpiaAL.get(k)+" ");
		}
		System.out.println();
		System.out.println("matriz limpia. get size "+matrizBinariaLimpiaAL.size()+" division entre 9: "+matrizBinariaLimpiaAL.size()/9);
		/*
		 * En las siguientes líneas comprobamos que no haya cola dentro del código que nos han dado para
		 * decodificar. De ser así cogemos los dígitos que constituyan la cola y los añadimos al arraylist
		 * con el código final a descifrar
		 */
		System.out.println(lista.length);
		int mod = lista.length%15;
		
		if(mod>0) {
			int [] cola = new int [mod];
			for(int k=i; k<lista.length; k++){
				cola[k-i] = lista[k];
				codigoFinal.add(cola[k-i]);
			}
		}
	}
	
	public static int[][] matrizTraspuestaYNegativa(int[][] original) {
		int[][] traspuesta= new int[original[0].length][original.length];
		
		for (int x = 0; x < original.length; x++){
			for (int y = 0; y < original[x].length; y++){
				traspuesta[y][x] = original[x][y];
			}
		}
		
		int [][] identidad= new int[traspuesta.length][traspuesta.length];
		
		for (int x = 0; x < identidad.length; x++){
			for (int y = 0; y < identidad.length; y++){
				if(x==y) {
					identidad[x][y]=1;
				}
				else {
					identidad[x][y]=0;
				}
			}
		}
		
		int[][] H= new int[traspuesta.length][identidad[0].length+traspuesta[0].length];
		
		for(int i=0;i<identidad.length;i++) {
			for(int j=0;j<identidad[0].length;j++) {
				H[i][j]=identidad[i][j];
			}
		}
		
		for(int i=0;i<traspuesta.length;i++) {
			for(int j=0;j<traspuesta[0].length;j++) {
				H[i][j+identidad[0].length]=traspuesta[i][j];
			}
		}
		
		for(int k=0;k<H.length;k++) {
			for(int l=0;l<H[0].length;l++) {
				System.out.print(H[k][l]+" ");
			}
			System.out.println();
		}
		
		return H;
	}
	
	/**
	 * Método para multiplicar dos matrices
	 * @param A
	 * @param B
	 * @return
	 */
	public static int[][] multiplica (int [][] arrayCod, int [][] H){
	       // filas de la matriz A
	       int m= H[0].length;
	       // columnas de la matriz B
	       int o= arrayCod.length;
	       // nueva matriz 
	       int [][] C= new int [H.length][arrayCod[0].length];
	       
	       matrizBinaria = new int [H.length][arrayCod[0].length];
	       // se comprueba si las matrices se pueden multiplicar
	       if (m==o){
	         for (int i=0; i<C.length;i++){
	            for (int j=0; j<C[0].length;j++){
	             //aqui se multiplica la matriz
	              int a=0;
	              for(int k=0;k<o;k++){
	                  a=a+H[i][k]*arrayCod[k][j];
	              }
	              C[i][j]=a;
	              //Añadimos el contenido al arraylist de sindromes
	              matrizBinariaAL.add(a%2);
	            }

	         }
	       }
	       
	       
	       
	       
	       /**
	        *  si no se cumple la condición se retorna una matriz vacía
	        */
	       return C;
	    }
	
	/**
	 * 
	 * Método para traducir los símbolos en binario a texto plano
	 * 
	 * @param codigoLetra
	 * @param alf2
	 * @return
	 */
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
