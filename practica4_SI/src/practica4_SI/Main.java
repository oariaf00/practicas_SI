package practica4_SI;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	
	//Lista del código a desencriptar
	static int[] lista= {1,1,0,1,0,0,0,1,0,1,0,0,1,1,0,0,0,1,1,1,1,0,1,1,1,0,1,1,1,0,1,1,0,1,1,1,0,1,0,1,0,1,0,0,0,0,0,1,0,1,0,1,1,0,0,1,0,0,1,1,1,1,1,0,0,0,0,0,1,0,0,0,1,1,0,1,1,1,1,1,1,0,0,1,1,0,1,1,0,0,1,0,1,1,1,0,0,0,1,0,1,1,0,0,1,1,1,0,0,1,0,1,0,1,0,1,0,1,1,1,0,0,1,0,1,0,0,0,0,1,1,1,0,1,1,0,0,0,1,0,0,1,0,1,1,0,1,1,0,0,0,1,1,1,0,0,0,1,0,0,1,1,1,0,1,0,1,1,0,0,1,1,1,1,1,0,0,0,0,0,1,0,0,1,0,1,1,1,1,1,0,0,0,0,0,1,0,1,0,0,1,0,0,0,1,0,1,0,1,0,0,0,0,1,0,1,1,0,1,1,1,0,0,1,1,0,0,0,1,1,0,0,1,1,1,0,1,1,1,0,0,1,1,0,1,0,1,1,1,0,1,0,1,0,1,1,0,0,1,0,1,0,1,1,0,0,0,1,0,0,0,0,0,1,1,0,0,1,1,1,0,1,1,1,0,0,1,1,0,1,1,1,0,1,1,1,0,0,1,1,0,0,0,0,1,0,1,0,1,1,0,1,1,0,0,1,1,0,1,0,1,0,1,0,1,1,1,0,0,1,0,1,1,1,0,0,1,0,1,1,0,1,1,0,0,0,0,1,1,1,1,0,1,0,0,0,1,1,0,0,0,1,1,0,0,1,0,1,0,0,1,0,0,1,1,1,1,1,0,1,1,0,0,0,1,0,0,1,0,0,0,0,0,1,1,0,0,1,1,0,1,1,0,1,1,0,0,1,0,0,0,1,0,1,0,1,0,1,1,1,0,1,0,0,1,1,0,1,1,0,0,0,1,0,0,1,1,0,1,1,0,1,0,0,1,0,1,0,1,0,0,0,0,0,0,1,0,1,0,1,0,0,1,1,0,0,0,0,0,1,0,0,1,0,1,0,0,1,1,0,0,0,1,1,1,0,0,0,1,0,0,1,0,0,0,0,0,1,1,1,1,0,1,1,1,0,0,0,0,0,0,1,1,0,1,0,0,1,1,1,1,0,0,0,1,1,0,1,1,0,1,1,0,1,1,1,0,0,1,1,0,1,0,1,1,0,1,1,0,1,1,1,0,0,1,1,0,0,1,0,1,0,1,0,1,0,1,0,0,0,0,0,0,1,1,1,0,1,0,1,0,0,1,1,0,0,1,0,1,0,0,1,0,1,0,0,1,0,0,0,0,1,0,0,1,1,1,0,0,1,1,1,0,1,1,0,0,1,0,0,1,1,1,1,0,0,1,0,1,0,0,1,0,0,1,1,1,0,1,0,1,1,0,0,1,0,1,0,1,0,0,0,1,0,1,1,1,0,0,1,0,1,1,0,1,0,1,1,0,0,0,1,1,0,0,1,1,0,1,0,1,1,1,1,0,0,0,1,0,0,1,0,1,1,0,1,1,0,1,0,0,1,0,0,0,1,1,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,1,0,1,0,1,0,1,1,0,0,1,0,1,0,1,0,1,1,1,0,1,0,1,0,0,0,1,0,1,1,1,0,0,1,1,1,1,1,0,1,1,1,1,0,1,0,1,0,1,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,1,0,1,1,1,0,0,1,1,1,1,1,0,0,0,1,1,0,1,1,0,1,1,1,1,1,1,0,0,1,1,1,1,1,0,0,0,1,1,0,0,0,0,0,1,0,1,0,1,1,0,0,1,0,1,1,1,0,0,1,0,1,1,0,1,1,0,0,0,0,1,1,1,1,0,1,0,0,0,1,1,0,0,0,0,1,1,1,0,0,1,0,0,1,1,1,0,1,1,0,1,0,1,0,1,1,0,0,0,0,0,1,0,0,0,1,1,1,1,0,1,0,0,0,1,1,0,0,1,0,1,0,0,1,1,0,1,1,0,1,1,0,0,1,1,0,0,1,0,1,0,1,0,1,1,0,0,1,1,0,1,1,1,1,1,1,0,1,1,1,0,0,1,1,1,1,0,0,0,1,1,1,0,1,0,1,0,1,1,1,0,1,0,0,0,1,0,1,0,0,1,1,0,1,1,1,1,0,1,1,1,1,0,1,0,1,0,1,1,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1,1,1,0,0,1,1,1,0,0,1,0,0,1,0,0,1,1,1,0,0,0,1,0,1,1,0,1,1,0,0,0,1,1,1,1,1,1,0,0,1,1,0,1,0,1,1,1,1,1,0,0,1,1,1,0,0,1,0,1,0,0,0,0,1,1,0,1,0,0,1,0,0,1,0,0,0,0,1,0,0,1,0,0,0,1,1,0,1,0,1,1,1,0,0,1,1,0,1,1,0,1,1,0,1,1,1,1,1,0,0,0,0,0,1,0,0,1,0,0,0,0,1,0,1,1,0,0,0,1,1,1,1,1,0,1,0,0,0,0,0,0,0,0,0,1,1,0,1,0,1,0,1,0,0,0,0,0,0,1,1,1,1,1,0,1,0,0,1,1,1,0,0,0,1,1,1,0,0,1,1,0,1,0,0,1,1,0,0,1,0,0,0,1,1,0,1,1,1,1,0,1,0,1,1,1,1,0,0,0,1,1,0,0,0,0,0,1,0,1,0,1,1,0,0,1,0,0,0,1,1,0,1,0,0,1,0,1,0,1,0,1,0,1,1,0,0,1,1,1,0,1,1,0,1,1,0,1,1,1,1,1,0,1,1,1,1,0,0,0,1,0,1,1,1,0,1,1,0,1,1,1,1,1,0,1,1,0,0,0,0,0,0,1,0,1,0,1,0,0,0,1,0,1,0,1,0,0,1,1,1,1,0,0,0,1,0,0,1,0,0,0,1,0,1,0,1,1,0,0,1,0,1,0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,0,1,0,0,1,1,0,1,1,0,0,1,1,1,1,1,0,0,1,0,0,1,0,0,1,1,1,1,1,0,0,0,1,1,1,1,0,1,1,1,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,1,0,1,0,1,1,0,0,0,1,0,1,1,0,0,1,0,1,0,1,0,1,0,1,1,1,0,1,1,1,1,1,1,1,0,1,1,1,0,0,1,1,1,0,0,0,1,1,0,1,1,0,0,0,1,0,1,0,0,0,1,1,0,0,1,1,1,1,1,0,1,0,1,1,1,1,1,0,0,0,1,0,1,0,1,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,1,1,0,0,1,0,1,0,1,0,1,0,1,1,1,1,1,0,0,0,0,1,0,0,1,0,0,1,0,0,1,1,0,0,1,1,1,0,0,1,0,1,0,1,0,0,0,0,0,1,0,0,1,0,1,0,0,1,1,0,0,0,1,1,1,1,1,1,0,0,1,0,0,1,1,0,0,0,1,1,0,0,1,1,1,0,1,1,1,0,0,0,1,0,0,0,0,0,1,0,0,0,1,1,0,1,1,0,0,0,1,0,1,1,1,1,0,0,0,1,1,1,1,0,1,1,0,1,1,0,0,0,1,0,0,1,0,0,1,1,0,1,1,0,1,1,1,0,0,1,0,0,0,0,0,0,0,0,0,1,1,0,1,0,1,0,1,0,0,0,1,1,1,0,0,1,0,0,1,1,1,1,1,0,1,1,0,0,1,0,0,0,1,1,0,1,0,1,0,1,0,1,0,1,1,0,1,1,0,0,1,1,0,0,1,0,1,0,1,0,1,0,1,1,1,0,1,1,0,1,1,1,0,1,1,1,0,0,1,1,1,0,0,1,1,1,1,1,0,0,1,1,1,0,1,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,0,1,0,0,0,0,0,1,0,1,0,0,1,1,0,1,0,1,0,1,0,0,0,1,1,1,0,0,1,1,0,0,1,0,1,1,0,0,0,1,0,1,0,1,0,0,1,0,0,1,0,0,1,0,1,1,1,0,0,1,1,0,1,0,0,1,1,0,1,0,1,0,1,1,1,0,0,0,0,0,1,0,1,1,0,0,1,0,1,0,1,0,1,0,0,0,0,0,0,1,1,0,1,0,1,1,0,0,0,1,0,1,1,0,0,1,0,0,1,1,1,1,1,0,1,0,1,0,0,1,0,0,1,0,0,1,0,1,0,0,1,1,0,1,1,0,1,1,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1,0,1,1,1,0,0,1,0,1,0,1,1,0,0,1,0,0,1,0,1,0,1,0,0,1,0,1,0,1,0,0,1,0,1,1,0,1,1,0,0,0,0,0,1,0,1,1,1,1,1,0,0,1,0,1,0,1,0,0,0,0,1,0,0,0,0,1,1,1,1,0,1,1,1,0,1,0,1,1,1,1,0,1,0,0,1,1,1,0,1,1,1,0,1,0,0,1,0,1,0,1,0,1,1,1,0,0,0,0,0,0,1,0,0,1,0,0,1,0,0,0,1,1,1,1,0,1,0,0,1,0,1,0,1,0,1,0,1,0,1,1,0,1,0,0,0,1,1,0,0,0,1,1,0,1,0,0,0,1,0,0,1,0,0,0,0,0,0,1,0,0,0,0,1,1,1,0,0,1,1,0,1,0,1,1,1,0,1,0,1,1,1,0,0,1,1,0,0,1,1,0,0,0,1,1,1,0,0,1,1,0,0,0,1,0,1,1,1,1,1,1,0,0,0,1,0,1,1,0,0,1,0,1,1,0,0,1,0,1,0,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,0,0,1,0,0,0,1,1,1,1,1,0,1,1,0,0,1,1,1,1,1,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,1,0,1,1,0,1,0,0,0,1,1,0,1,1,0,1,1,1,1,0,0,1,1,0,1,0,1,0,0,1,1,0,1,1,0,1,1,0,1,1,0,0,0,0,0,0,0,1,0,0,1,1,1,0,0,1,1,1,0,0,1,1,1,0,1,0,1,1,0,1,1,1,1,1,1,0,0,1,0,0,0,1,1,0,1,0,1,0,1,1,1,1,0,1,1,1,1,1,1,1,1,1,0,1,0,1,0,1,1,0,1,0,1,1,0,0,1,1,1,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,1,0,1,0,1,0,0,1,0,0,1,0,0,1,0,1,0,1,1,1,0,0,1,0,0,1,0,0,1,1,1,0,0,0,1,0,1,0,1,0,1,1,1,1,0,1,1,0,1,0,0,0,1,1,1,0,1,1,0,1,0,0,0,1,0,0,0,0,0,1,1,1,0,0,0,0,0,1,1,1,0,0,1,0,1,0,1,0,1,1,0,0,1,0,1,0,1,0,1,1,0,0,1,0,0,0,1,0,0,1,0,1,1,0,1,1,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,1,0,1,0,0,1,1,0,1,1,0,0,1,0,0,0,1,0,0,0,1,1,0,0,1,0,0,0,1,1,0,1,1,1,0,0,1,1,0,1,1,1,0,0,1,0,1,1,0,1,1,0,0,0,0,0,0,0,1,1,0,1,0,1,0,1,1,1,1,1,0,0,0,0,0,1,0,1,1,1,0,0,1,0,0,0,1,0,1,0,0,1,1,0,0,0,1,0,0,1,0,1,1,0,0,0,1,0,0,0,1,1,0,0,0,1,0,0,0,1,1,1,1,0,0,0,0,0,1,0,0,0,0,0,0,1,0,1,0,1,0,0,0,1,1,0,0,0,1,0,1,1,1,1,0,0,0,1,0,1,0,0,1,1,1,0,1,0,1,1,0,0,1,0,0,0,0,1,1,1,0,1,0,0,0,1,1,0,1,1,1,1,0,0,0,1,1,0,1,1,0,1,1,1,1,0,0,0,1,0,1,0,1,0,1,0,0,0,0,0,1,0,0,0,0,0,1,1,1,0,0,1,1,0,0,1,1,1,0,0,0,0,1,0,1,0,1,0,0,0,1,0,0,0,1,1,0,1,1,1,0,0,1,1,1,0,1,1,1,0,0,0,0,1,1,1,1,1,1,0,1,0,1,1,0,1,0,1,1,0,1,1,1,1,0,1,0,1,0,0,0,1,0,0,0,1,1,0,1,1,1,1,0,1,0,1,0,0,1,0,0,1,1,1,0,1,1,0,0,1,1,0,1,1,0,1,1,1,1,1,0,1,1,0,1,1,1,1,1,1,1,1,1,0,0,1,1,0,0,1,1,1,0,0,0,1,0,0,1,0,1,1,1,1,1,1,0,0,0,0,0,1,0,1,1,0,1,0,0,0,0,0,0,1,1,1,1,1,0,1,1,1,0,0,0,1,0,1,0,0,1,1,0,0,1,0,0,0,0,0,0,1,1,1,0,0,1,1,1,0,1,0,0,1,1,1,1,1,0,0,0,0,0,1,1,1,0,1,1,0,0,1,0,0,0,1,1,0,0,0,0,1,0,1,1,0,1,0,0,1,0,0,0,0,0,1,1,1,0,1,1,0,0,0,1,1,0,0,0,0,1,1,0,1,0,1,1,1,1,1,1,1,1,0,1,1,1,0,1,1,0,1,0,0,0,1,1,0,0,1,1,1,0,0,0,0,1,0,0,0,1,1,0,0,0,0,1,0,1,1,0,1,0,0,1,0,0,0,1,0,0,1,1,0,0,0,1,0,0,1,0,0,0,1,1,1,1,0,0,0,0,0,0,0,1,1,1,0,0,1,0,0,1,0,0,0,0,1,1,0,1,0,1,0};
	//Alfabeto que usaremos para traducir
	static char[] alf= {'A','Á','B','C','D','E','É','F','G','H','I','Í','J','K','L','M','N','Ñ','O','Ó','P','Q','R','S','T','U','Ú','V','W','X','Y','Z',' ','.',',',';',':','(',')','¿', '?', '¡','!','-','0','1','2','3','4','5','6','7','8','9','a','á','b','c','d','e','é','f','g','h','i','í','j','k','l','m','n','ñ','o','ó','p','q','r','s','t','u','ú','v','w','x','y','z'};

	//Matriz generadora para esta codificación (Introducida manualmente matriz identidad)
	static int[][] matrizGeneradora={
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
	static int longitudAlfabeto2=0;
	
	//ArrayLists donde meteremos los códigos con el ruido
	static ArrayList<Integer> codigoFinal = new ArrayList<Integer>();
	static ArrayList<Integer> decodificacion = new ArrayList<Integer>();
	static ArrayList<Integer> ruido = new ArrayList<Integer>();
	
	//Valor de la distancia de Hamming y la capacidad correctora
	static int d=5;
	static int capacidadCorrectora=2;
	
	//Arrays para las permutaciones
	static int[] peso0= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	static int[] peso1= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,1};
	static int[] peso2= {0,0,0,0,0,0,0,0,0,0,0,0,0,1,1};
	
	//Arrays donde se guardan las combinaciones distinguidas por pesos
	static ArrayList<Integer> combPeso0 = new ArrayList<Integer>();
	static ArrayList<Integer> combPeso1 = new ArrayList<Integer>();
	static ArrayList<Integer> combPeso2 = new ArrayList<Integer>();
	
	//Arrays donde se guardan los resultados de buscar cada síndrome por la matriz H
	static ArrayList<Integer> sindromes_peso0 = new ArrayList<Integer>();
	static ArrayList<Integer> sindromes_peso1 = new ArrayList<Integer>();
	static ArrayList<Integer> sindromes_peso2 = new ArrayList<Integer>();
	
	//Matriz binaria y limpia(despues de quitar los q tienen peso > 2)
	static int [][] matrizBinaria;
	static int [][] matrizBinariaLimpia;
	static ArrayList<Integer> sindromes_palabras = new ArrayList<Integer>();
	static ArrayList<Integer> matrizBinariaLimpiaAL = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		* Calculamos la longitud mínima para codificar cada caracter del alfabeto fuente
		* y escogemos el valor inmediatamente superior entero como indica la fórmula
		*/
		longitudAlfabeto2 = calculaLongitudFuente();
		System.out.println("Longitud del alfabeto fuente: " + longitudAlfabeto2);
		
		//Hallamos las permutaciones necesarias para el calculo de los errores
		permutaciones();
		
		//Multiplicamos las permutaciones con la matriz de control
		productoPermutaciones();
		
		//Comenzamos con la decodificación de la lista
		obtenerCodigoFinal();
		decodificar();
	}

	
	/**
	 * Método que coge el array corregido y lo trocea y decodifica
	 */
	private static void decodificar() {
		// TODO Auto-generated method stub
		//Como en este caso la identidad es de tamaño matrizGeneradora.length, cogemos los matrizGeneradora.length primeros elementos
		int[] bloque= new int[matrizGeneradora[0].length];
		int i=0;
		while(i+matrizGeneradora[0].length<=codigoFinal.size()) {
			for(int j=0 ; j<matrizGeneradora[0].length; j++) {
				bloque[j]=codigoFinal.get(i+j);
			}
			
			for(int j=0 ; j<matrizGeneradora.length; j++) {
				decodificacion.add(bloque[j]);
			}
			
			i=i+matrizGeneradora[0].length;
		}
		
		/*
		 * En las siguientes líneas comprobamos que no haya cola dentro del código que nos han dado para
		 * decodificar. De ser así cogemos los dígitos que constituyan la cola y los añadimos al arraylist
		 * con el código final a descifrar
		 */
		
		int mod = lista.length%matrizGeneradora[0].length;
		if(mod>0) {
			int [] cola = new int [mod];
			for(int k=i; k<lista.length; k++){
				cola[k-i] = lista[k];
				decodificacion.add(cola[k-i]);
			}
		}
		
		//Decodificamos las palabras
		i=0;
		int k=0;
		int [] arrayCodigoLetra = new int [longitudAlfabeto2];
		char [] arrayLetras = new char [decodificacion.size()/longitudAlfabeto2];
		while(i+7<=decodificacion.size()) {
			//Con este bucle for conseguimos los matrizGeneradora.length elementos para conseguir el símbolo buscado.
			for(int j=0 ; j<longitudAlfabeto2; j++) {
				arrayCodigoLetra[j] = decodificacion.get(i+j);
			}
			//Llamamos al método para traducir la letra y la añadimos a un array
			arrayLetras[k] = traducirLetra(arrayCodigoLetra, alf);
			k++;
			i = i+7;
		}
		
		ArrayList<Character> texto= new ArrayList<Character>();
		
		//Pasamos el array a un arraylist para eliminar los espacios dobles
		for(int j=0 ; j<arrayLetras.length; j++) {
			texto.add(arrayLetras[j]);
		}
		
		//Sustituimos los espacios seguidos por saltos de linea
		for(int j=0 ; j<texto.size(); j++) {
			if(texto.get(j)==' ' && texto.get(j+1)==' ') {
				texto.set(j, '\n');
				texto.remove(j+1);
			}
		}
		
		System.out.println("Mensaje decodificado: ");
		for(int j=0 ; j<texto.size(); j++) {
			System.out.print(texto.get(j));
		}
		
	}

	/**
	 * Método que hace el producto de la matriz H por cada permutación
	 */
	private static void productoPermutaciones() {
		int[][] tmp= new int[matrizGeneradora[0].length][1];
		int i=0;
		//Introducimos las permutaciones para multiplicarlas por H
		//Estas son las permutaciones con peso 0
		while(i+matrizGeneradora[0].length<=combPeso0.size()) {
			for(int j=0 ; j<matrizGeneradora[0].length; j++) {
				tmp[j][0]=combPeso0.get(i+j);
			}
			int [][] producto= multiplicaPermutaciones(tmp, H);
			
			for(i=0;i<producto.length;i++) {
				for(int j=0 ; j<producto[0].length; j++) {
					sindromes_peso0.add(producto[i][j]);
				}
			}
			
			i=i+matrizGeneradora[0].length;
		}
		
		i=0;
		//Estas son las permutaciones con peso 1
		while(i+matrizGeneradora[0].length<=combPeso1.size()) {
			for(int j=0 ; j<matrizGeneradora[0].length; j++) {
				tmp[j][0]=combPeso1.get(i+j);
			}
			
			int [][] producto= multiplicaPermutaciones(tmp, H);
			
			for(int k=0;k<producto.length;k++) {
				for(int l=0 ; l<producto[0].length; l++) {
					sindromes_peso1.add(producto[k][l]);
				}
			}
			
			i=i+matrizGeneradora[0].length;
		}
		
		i=0;
		
		//Estas son las permutaciones con peso 2
		while(i+matrizGeneradora[0].length<=combPeso2.size()) {
			for(int j=0 ; j<matrizGeneradora[0].length; j++) {
				tmp[j][0]=combPeso2.get(i+j);
			}
			
			int [][] producto= multiplicaPermutaciones(tmp, H);
			
			for(int k=0;k<producto.length;k++) {
				for(int l=0 ; l<producto[0].length; l++) {
					sindromes_peso2.add(producto[k][l]);
				}
			}
			
			i=i+matrizGeneradora[0].length;
		}
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
	 * Método que calcula y almacena las permutaciones
	 */
	private static void permutaciones() {
		do {
            for(int i=0;i<peso0.length;i++) {
            	combPeso0.add(peso0[i]);
            }
        } while (nextPermutation(peso0));
		
		do {
			for(int i=0;i<peso1.length;i++) {
            	combPeso1.add(peso1[i]);
            }
        } while (nextPermutation(peso1));
		
		do {
			for(int i=0;i<peso2.length;i++) {
            	combPeso2.add(peso2[i]);
            }
        } while (nextPermutation(peso2));
		
	}
	
	/**
	 * Método que realiza las permutaciones de los errores
	 * @param array
	 * @return
	 */
	private static boolean nextPermutation(int[] array) {

        int i = array.length - 1;
        while (i > 0 && array[i - 1] >= array[i]) {
            i--;
        }

        if (i <= 0) {
            return false;
        }

        int j = array.length - 1;
        while (array[j] <= array[i - 1]) {
            j--;
        }

        int temp = array[i - 1];
        array[i - 1] = array[j];
        array[j] = temp;

        j = array.length - 1;
        while (i < j) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
        
        return true;
    }

	/**
	 * Método que corrije y almacena las palabras código
	 * @return ArrayList con las palabras a decodificar
	 */
	private static void obtenerCodigoFinal() {
		// TODO Auto-generated method stub
		/*
		 * Dentro de los conjuntos de matrizGeneradora[0].length, debemos diferenciar entre los dígitos para decodificar el mensaje
		 * y el ruido.
		 */
		
		int i=0;
		int j=0;
		int[][] arrayCod = new int [matrizGeneradora[0].length][1];
		int[] bloque= new int[matrizGeneradora[0].length];
		while(i+matrizGeneradora[0].length<=lista.length) {
			for(j=0 ; j<matrizGeneradora[0].length; j++) {
				//Dividimos en bloques de matrizGeneradora[0].length dígitos
				arrayCod[j][0]= lista[i+j];
				//Hacemos una copia para luego restarle el error patrón
				bloque[j]=lista[i+j];
				
			}
			//Hallamos el síndrome del bloque extraído, almacenandolo en tmp
			//Dentro de tmp hay 9 digitos que corresponden al producto de H*arrayCod (Bloque de matrizGeneradora[0].length digitos)
			ArrayList<Integer> tmp= multiplicaPalabras(arrayCod, H);
			
			/*
			 * Este valor determina si la palabra tiene error o no, si devuelve -1 en el texto a desencriptar
			 * introducimos el bloque origina, y si tiene error lo reemplazamos por el de array de permutaciones
			 */
			int[] error_patron=comparaErrores(tmp);
			
			//En función de si hay error o no corregimos la palabra
			if(error_patron!=null) {//Hay error
				int[] palabraCorregida=restarError(bloque, error_patron);
				
				for(int k=0;k<arrayCod.length;k++) {
					codigoFinal.add(palabraCorregida[k]);
				}
			}
			else {//No hay error
				for(int k=0;k<arrayCod.length;k++) {
					codigoFinal.add(bloque[k]);
				}
			}
			
			i+=matrizGeneradora[0].length;
		}
	}
	
	/**
	 * Método para restar el error a la palabra código
	 * @param arrayCod
	 * @param error_patron
	 * @return
	 */
	private static int[] restarError(int[] arrayCod, int[] error_patron) {
		// TODO Auto-generated method stub
		int[] retorno= new int[arrayCod.length];
		for(int i=0;i<arrayCod.length;i++) {
			int x= arrayCod[i];
			int y= error_patron[i];
			retorno[i]= Math.abs(x-y);
		}
		return retorno;
		
	}

	/**
	 * Método en el que comparamos el síndrome de la palabra con los síndromes de las permutaciones
	 * @param tmp síndrome de la palabra correspondiente
	 * @return posición del error patrón para extraerlo
	 */
	private static int[] comparaErrores(ArrayList<Integer> tmp) {
		// TODO Auto-generated method stub
		//Recorremos la lista de sindromes_permutaciones buscando uno igual
		int i=0;
		
		//Representa la posición del síndrome para luego buscarlo en el error patrón
		int contador=0;
		ArrayList<Integer> bloque= new ArrayList<Integer>();
		int[] retorno= new int[matrizGeneradora[0].length];

		//Realizamos este proceso con los 3 arrays de permutaciones
		while(i<sindromes_peso0.size()) {
			//Extraemos los errores de las permutaciones para comparar si es igual al del parámetro
			for(int k=0; k<9; k++){
				bloque.add(sindromes_peso0.get(i+k));
			}
			
			if(tmp.equals(bloque)) {
				//Almacenamos en un int el error patron correspondiente a devolver
				int pos= ((i)/9)*matrizGeneradora[0].length;
				for(int k=0;k<matrizGeneradora[0].length;k++){
					retorno[k]=combPeso0.get(k);
				}
				return retorno;
			}
			
			//Limpiamos el array para la siguiente iteración y que no se acumulen los resultados ya escaneados
			bloque.clear();
			contador++;
			i+=tmp.size();			
		}
		
		bloque.clear();
		contador=0;
		
		while(i<sindromes_peso1.size()) {
			for(int k=0; k<9; k++){
				bloque.add(sindromes_peso1.get(i+k));
			}
			
			if(tmp.equals(bloque)) {
				//Almacenamos en un int el error patron correspondiente a devolver
				int pos= ((i)/9)*matrizGeneradora[0].length;
				for(int k=0;k<matrizGeneradora[0].length;k++){
					retorno[k]=combPeso1.get(pos+k);
				}
				
				return retorno;
			}
			bloque.clear();
			contador++;
			i+=tmp.size();			
		}
		
		bloque.clear();
		contador=0;
		
		while(i<sindromes_peso2.size()) {
			for(int k=0; k<9; k++){
				bloque.add(sindromes_peso2.get(i+k));
			}
			
			if(tmp.equals(bloque)) {
				//Almacenamos en un int el error patron correspondiente a devolver
				int pos= ((i)/9)*matrizGeneradora[0].length;
				for(int k=0;k<matrizGeneradora[0].length;k++){
					retorno[k]=combPeso2.get(pos+k);
				}
				return retorno;
			}
			bloque.clear();
			contador++;
			i+=tmp.size();			
		}
		return null;
	}

	/**
	 * Método para calcular la matriz de control
	 * @param original
	 * @return
	 */
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
		
		for(int i=0;i<traspuesta.length;i++) {
			for(int j=0;j<traspuesta[0].length;j++) {
				H[i][j]=traspuesta[i][j];
			}
		}
		
		for(int i=0;i<identidad.length;i++) {
			for(int j=0;j<identidad[0].length;j++) {
				H[i][j+traspuesta[0].length]=identidad[i][j];
			}
		}
		
		return H;
	}
	
	/**
	 * Método para multiplicaPalabrasr dos matrices
	 * @param A
	 * @param B
	 * @return
	 */
	public static ArrayList<Integer> multiplicaPalabras (int [][] arrayCod, int [][] H){
	       // filas de la matriz A
	       int m= H[0].length;
	       // columnas de la matriz B
	       int o= arrayCod.length;
	       // nueva matriz 
	       ArrayList<Integer> C= new ArrayList<Integer>();
	       
	       //matrizBinaria = new int [H.length][arrayCod[0].length];
	       // se comprueba si las matrices se pueden multiplicaPalabrasr
	       if (m==o){
	         for (int i=0; i<H.length;i++){
	            for (int j=0; j<arrayCod[0].length;j++){
	             //aqui se multiplica la matriz
	              int a=0;
	              for(int k=0;k<o;k++){
	                  a=a+H[i][k]*arrayCod[k][j];
	              }
	              C.add(a%2);
	              
	              //Añadimos el contenido al arraylist de sindromes
	              sindromes_palabras.add(a%2);
	            }

	         }
	         return C;
	       }
	       return null;
	    }
	
	/**
	 * Método para multiplicar dos matrices
	 * @param A
	 * @param B
	 * @return 
	 * @return
	 */
	public static int[][] multiplicaPermutaciones (int [][] arrayCod, int [][] H){
	       // filas de la matriz A
	       int m= H[0].length;
	       // columnas de la matriz B
	       int o= arrayCod.length;
	       // nueva matriz 
	       int [][] C= new int [H.length][arrayCod[0].length];
	       
	       //matrizBinaria = new int [H.length][arrayCod[0].length];
	       // se comprueba si las matrices se pueden multiplicaPalabrasr
	       if (m==o){
	         for (int i=0; i<C.length;i++){
	            for (int j=0; j<C[0].length;j++){
	             //aqui se multiplica la matriz
	              int a=0;
	              for(int k=0;k<o;k++){
	                  a=a+H[i][k]*arrayCod[k][j];
	              }
	              C[i][j]=a%2;
	              
	              //Añadimos el contenido al arraylist de sindromes
	              //sindromes_palabras.add(a%2);
	            }

	         }
	       }
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
				sumaCodigo = sumaCodigo + calcularPotencia(potencia);
			}
			potencia++;
		}
		
		return alf[sumaCodigo];
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
