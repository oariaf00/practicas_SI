package practica4_SI;

import java.util.ArrayList;
import java.util.Arrays;

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
	
	//Arrays para las permutaciones
	static int[] peso0= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	static int[] peso1= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,1};
	static int[] peso2= {0,0,0,0,0,0,0,0,0,0,0,0,0,1,1};
	
	static ArrayList<Integer> combPeso0 = new ArrayList<Integer>();
	static ArrayList<Integer> combPeso1 = new ArrayList<Integer>();
	static ArrayList<Integer> combPeso2 = new ArrayList<Integer>();
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
		
		int longitudAlfabeto2 = calculaLongitudFuente();
		System.out.println("Longitud del alfabeto fuente: " + longitudAlfabeto2);
		
		//Hallamos las permutaciones necesarias para el calculo de los errores
		permutaciones();
		
		//Multiplicamos las permutaciones con la matriz de control
		productoPermutaciones();
		
		//Comenzamos con la decodificación de la lista
		obtenerCodigoFinal();
	
		System.out.println("Ha llegado al final de la ejecución");
	}

	private static void productoPermutaciones() {
		int[][] tmp= new int[15][1];
		int i=0;
		//Introducimos las permutaciones para multiplicarlas por H
		while(i+15<=combPeso0.size()) {
			for(int j=0 ; j<15; j++) {
				tmp[j][0]=combPeso0.get(i+j);
			}
			int [][] producto= multiplicaPermutaciones(tmp, H);
			
			for(i=0;i<producto.length;i++) {
				for(int j=0 ; j<producto[0].length; j++) {
					sindromes_peso0.add(producto[i][j]);
				}
			}
			
			i=i+15;
		}
		
		i=0;
		
		while(i+15<=combPeso1.size()) {
			for(int j=0 ; j<15; j++) {
				tmp[j][0]=combPeso1.get(i+j);
			}
			
			int [][] producto= multiplicaPermutaciones(tmp, H);
			
			for(int k=0;k<producto.length;k++) {
				for(int l=0 ; l<producto[0].length; l++) {
					sindromes_peso1.add(producto[k][l]);
				}
			}
			
			i=i+15;
		}
		
		i=0;
		
		while(i+15<=combPeso2.size()) {
			for(int j=0 ; j<15; j++) {
				tmp[j][0]=combPeso2.get(i+j);
			}
			
			int [][] producto= multiplicaPermutaciones(tmp, H);
			
			for(int k=0;k<producto.length;k++) {
				for(int l=0 ; l<producto[0].length; l++) {
					sindromes_peso2.add(producto[k][l]);
				}
			}
			
			i=i+15;
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
		int[] bloque= new int[15];
		
		while(i+15<=lista.length) {
			System.out.println("iteracion: "+i);
			for(j=0 ; j<15; j++) {
				//Dividimos en bloques de 15 dígitos
				arrayCod[j][0]= lista[i+j];
				//Hacemos una copia para luego restarle el error patrón
				bloque[j]=lista[i+j];
				
			}
			//Hallamos el síndrome del bloque extraído, almacenandolo en sindromes_palabras
			ArrayList<Integer> tmp= multiplicaPalabras(arrayCod, H);
			
			/*
			 * Este valor determina si la palabra tiene error o no, si devuelve -1 en el texto a desencriptar
			 * introducimos el bloque origina, y si tiene error lo reemplazamos por el de array de permutaciones
			 */
			System.out.println(tmp);
			int pos=comparaErrores(tmp);
			
			if(pos!=-1) {
				System.out.println("Hay error");
			}
			else {
				System.out.println("No hay error");
			}
			
			i+=15;
		}
		
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

	
	private static int comparaErrores(ArrayList<Integer> tmp) {
		// TODO Auto-generated method stub
		//Recorremos la lista de sindromes_permutaciones buscando uno igual
		int i=0;
		ArrayList<Integer> bloque= new ArrayList<Integer>();

		while(i<sindromes_peso0.size()) {
			for(int k=0; k<9; k++){
				bloque.add(sindromes_peso0.get(i+k));
			}
			
			if(tmp.equals(bloque)) {
				return i;
			}
			bloque.clear();
			i+=tmp.size();			
		}
		
		bloque.clear();
		
		while(i<sindromes_peso1.size()) {
			for(int k=0; k<9; k++){
				bloque.add(sindromes_peso1.get(i+k));
			}
			
			if(tmp.equals(bloque)) {
				return i;
			}
			bloque.clear();
			i+=tmp.size();			
		}
		
		bloque.clear();
		
		while(i<sindromes_peso2.size()) {
			for(int k=0; k<9; k++){
				bloque.add(sindromes_peso2.get(i+k));
			}
			
			if(tmp.equals(bloque)) {
				return i;
			}
			bloque.clear();
			i+=tmp.size();			
		}
		return -1;
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
