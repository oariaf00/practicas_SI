package practica1_SI;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JFileChooser;

public class Main {

	public static void main(String[] args) {
		String texto = importarTexto();
		
		char[] arrayTexto = texto.toCharArray();
		
		ej1(arrayTexto);
		ej2(arrayTexto);
	}
	
	public static  String importarTexto()
	{
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		String textoFinal="";

		try {
			/* Apertura del fichero y creacion de BufferedReader para poder
			hacer una lectura comoda (disponer del metodo readLine()).*/
			final JFileChooser fc= new JFileChooser("/res");
			int returnVal= fc.showOpenDialog(null);
			archivo= fc.getSelectedFile();
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			
			String nombreArchivo= archivo.getAbsolutePath();
			if(nombreArchivo.equals("")) {
				System.out.println("No se ha seleccionado ningún archivo.");
				System.exit(0);
			}

			// Lectura del fichero
			String linea;
			while ((linea = br.readLine()) != null) {
				textoFinal += linea;
				textoFinal += "  ";
			}
			textoFinal = textoFinal.substring(0, textoFinal.length()-2);
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
	
	public static void ej1(char[] arrayTexto){
		double contador = 0; //Numero de veces de 'd'
		
		for(int i=0 ; i<arrayTexto.length ; i++){
			if(arrayTexto[i] == 'd'){
				contador++;
			}
		}
		
		//arrayTexto.length es el número de símbolos
		double prob = contador/arrayTexto.length;
		System.out.println("Probabilidad del símbolo 'd': "+prob);
	}
	
	public static void ej2(char[] arrayTexto){
		ArrayList<Character> arrayLetras = new ArrayList<Character>();
		ArrayList<Integer> arrayFrecuencia = new ArrayList<Integer>();
		
		/*
		 * En este bucle añadimos todos los símbolos que hay en el texto sin repetir
		 */
		for(int i=0 ; i<arrayTexto.length ; i++){
			if(!existeLetra(arrayTexto[i], arrayLetras, arrayFrecuencia)){
				arrayLetras.add(arrayTexto[i]);
			}
			
		}
		
		/*
		 * Inicializamos el array de las frecuencias
		 */
		double [] arrayFrecu = new double[arrayLetras.size()];
		for(int x=0; x<arrayFrecu.length; x++) {
			arrayFrecu[x]=0;
		}
		
		/*
		 * Calculamos la frecuencia de cada símbolo
		 */
		for(int j=0; j<arrayTexto.length; j++) {
			for(int m=0; m<arrayLetras.size(); m++) {
				if(arrayTexto[j] == arrayLetras.get(m)) {
					arrayFrecu[m]++;
				}
			}
		}
		
		/*
		 * Creamos un array para guardar las 4 mayores frecuencias y luego sacar sus probabilidades
		 */
		double[] arrayOrdenado= new double[arrayFrecu.length];
		int[] maxFrecuencias= new int[4];
		
		for(int i=0;i<arrayFrecu.length;i++) {
			arrayOrdenado[i]=arrayFrecu[i];
		}
		
		Arrays.sort(arrayOrdenado);
		
		/*
		 * Como el array está ordenado de menor a mayor cogemos las posiciones finales
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
				if(maxFrecuencias[j]==arrayFrecu[m]) {
					simbolos[j]= arrayLetras.get(m);
					break;
				}
			}
		}
		
		double [] probabilidad = new double [arrayFrecu.length];
		
		System.out.println();
		
		for(int i=0; i<arrayFrecu.length; i++) {
			probabilidad[i] = arrayFrecu[i]/arrayTexto.length;
		}
		
		/*
		 * Hacemos lo mismo que hicimos con las frecuencias pero con las probabilidades
		 */
		
		Arrays.sort(probabilidad);
		
		double[] maxProb= new double[4];
		
		maxProb[0]= probabilidad[probabilidad.length-1];
		maxProb[1]= probabilidad[probabilidad.length-2];
		maxProb[2]= probabilidad[probabilidad.length-3];
		maxProb[3]= probabilidad[probabilidad.length-4];
		
		System.out.println("Simbolos con mayor probabilidad:");
		for(int i=0;i<simbolos.length;i++){
			System.out.println("'"+simbolos[i]+"': "+maxFrecuencias[i]+" "+maxProb[i]+".");
		}

	}

	public static boolean existeLetra(char letra, ArrayList<Character> arrayLetras, ArrayList<Integer> arrayFrecuencia){
		
		for(int i=0 ; i<arrayLetras.size() ; i++){
			if(letra == arrayLetras.get(i)){
				return true;
			}
		}
		return false;
	}
}