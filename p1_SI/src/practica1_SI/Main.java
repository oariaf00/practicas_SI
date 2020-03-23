package practica1_SI;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.JFileChooser;

public class Main {

	public static void main(String[] args) {
		//Apertura del archivo txt
		String texto = importarTexto();
		
		//Pasamos el texto a un array de char caracter a caracter
		char[] arrayTexto = texto.toCharArray();
		
		ej1(arrayTexto);
		ej2(arrayTexto);
	}
	
	public static  String importarTexto(){
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		String textoFinal="";

		try {
			/* Apertura del fichero y creacion de BufferedReader para poder
			hacer una lectura comoda (disponer del metodo readLine()).*/
			
			//El archivo meterlo en la carpeta res del proyecto
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
		
		//Escaneamos el array y contamos el numero de caracteres de 'd' que hay
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
		
		//Array con los caracteres sin repetir
		ArrayList<Character> arraySimbolosUnicos = new ArrayList<Character>();
		
		//Array que guarda las frecuencias de cada caracter en la misma posicion
		ArrayList<Integer> arrayFrecuencia = new ArrayList<Integer>();
		
		/*
		 * En este bucle añadimos todos los símbolos distintos que hay en el texto 
		 */
		for(int i=0 ; i<arrayTexto.length ; i++){
			if(!existeLetra(arrayTexto[i], arraySimbolosUnicos)){
				arraySimbolosUnicos.add(arrayTexto[i]);
			}
		}
		
		/*
		 * Inicializamos el array con las frecuencias
		 */
		
		for(int i=0 ; i<arraySimbolosUnicos.size() ; i++){
			arrayFrecuencia.add(0);
		}
		
		/*
		 * Calculamos la frecuencia de cada símbolo
		 */
		for(int j=0; j<arrayTexto.length; j++) {
			for(int m=0; m<arraySimbolosUnicos.size(); m++) {
				if(arrayTexto[j] == arraySimbolosUnicos.get(m)) {
					int tmp= arrayFrecuencia.get(m);
					arrayFrecuencia.set(m, tmp+1);
				}
			}
		}
		
		/*
		 * Creamos un array para guardar las frecuencias de mayor a menor y luego sacar sus probabilidades
		 */
		
		ArrayList<Double> frecuenciasOrdenadas= new ArrayList<Double>();
		
		for(int i=0;i<arrayFrecuencia.size();i++) {
			//Copiamos los elementos en otro ArrayList para ordenar las frecuencias
			frecuenciasOrdenadas.add((double) arrayFrecuencia.get(i));
		}
		
		ArrayList<Character> simbolosOrdenados= new ArrayList<Character>();
		
		//Ordenamos el array de mayor a menor 
		Comparator<Double> comparador = Collections.reverseOrder();
		Collections.sort(frecuenciasOrdenadas, comparador);
		
		/*
		 * Ahora recorremos por orden las frecuencias máximas y vamos mirando a qué símbolo corresponden
		 * guardándolos en otro array para luego imprimirlos
		 */
		
		for(int i=0;i<frecuenciasOrdenadas.size();i++) {
			for(int j=0;j<arrayFrecuencia.size();j++) {
				if(frecuenciasOrdenadas.get(i)==(double) arrayFrecuencia.get(j)) {
					if(!existeLetra(arraySimbolosUnicos.get(j), simbolosOrdenados)) {
						simbolosOrdenados.add(arraySimbolosUnicos.get(j));
						break;
					}
				}
			}
		}
		
		/*
		 * Repetimos el proceso anterior para hallar las probabilidades de cada símbolo
		 */
		
		ArrayList<Double> probabilidad = new ArrayList<Double>();
		
		System.out.println("--------------------------------------------------");
		
		for(int i=0; i<arrayFrecuencia.size(); i++) {
			probabilidad.add((double) (arrayFrecuencia.get(i)/(double)arrayTexto.length));
		}
		
		ArrayList<Double> probabilidadesOrdenadas= new ArrayList<Double>();
		
		for(int i=probabilidad.size()-1;i>=0;i--) {
			probabilidadesOrdenadas.add(probabilidad.get(i));
		}
		
		//Ordenamos los arrays de Mayor a menor para imprimir los valores
		Collections.sort(probabilidadesOrdenadas, comparador);
		
		System.out.println("Simbolos con mayor frecuencia y su probabilidad:");
		
		//Si queremos que imprima X elementos modificamos los valores del bucle
		for(int i=0;i<4;i++) {
			System.out.print("'"+simbolosOrdenados.get(i)+"' -> ");
			System.out.print("Frecuencia: "+frecuenciasOrdenadas.get(i)+" | ");
			System.out.println("Probabilidad: "+probabilidadesOrdenadas.get(i));
		}
		

	}

	public static boolean existeLetra(char letra, ArrayList<Character> arraySimbolosUnicos){
		
		for(int i=0 ; i<arraySimbolosUnicos.size() ; i++){
			if(letra== arraySimbolosUnicos.get(i)){
				return true;
			}
		}
		return false;
	}
}