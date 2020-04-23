package practica7_SI;

import java.util.ArrayList;

public class Main {
	
	//Alfabeto a usar
	static char[] alf= {'a','á','b','c','d','e','é','f','g','h','i','í','j','k','l','m','n','ñ','o','ó','p','q','r','s','t','u','ú','v','w','x','y','z','A','Á','B','C','D','E','É','F','G','H','I','Í','J','K','L','M','N','Ñ','O','Ó','P','Q','R','S','T','U','Ú','V','W','X','Y','Z','0','1','2','3','4','5','6','7','8','9',' ', ',', '.', ':', '-', '(', ')'};

	//Datos del ejercicio 1
	static String texto_01= "FúhíYzHX,.Yz UW,xXzYiúuzTzTúzxYHúhxXMzTzXuH-kYVúuzzYÍÍ.zYzÍYzjUXh8YZzpúuzYkUhh.YVúuzTz,úuzXGYuÚXh-kYVúuzzYzÚYhHXuzWwUYÍXuMzX,zVXKWúzKXzÍYzxYÍVYzYxXWHúuYMzzKXzÍYzJWÚIxhWHYzÚY8zKXzÍYzWuÍYZ";
	
	//Datos del ejercicio 2
	static String texto_02="Áh(vxmaumEl51:lsheumcE7ÚplimoomÁAfdmhq-iérÁfebm-yha.yCófé -úoe.rylf6:me3 hrúÉ2fgdó4 nvrlá13B(krqÓpx2Ú -yh úAmxeb4-úoiÁscx3f3-x(mjúifebm-mhvjKpn)65";
	
	//Datos del ejercicio 3
	static String texto_03="m4whh)ChQlp6DwhjGzhn8K6Lb)3td0Z3SLztQpÚAnéÍZáy";
	
	//Creamos la matrz equivalente a la tabla de los ejercicios
	// (Una tabla para cada ejercicio)
	static int[][] tabla1= new int[3][texto_01.length()];
	static int[][] tabla2= new int[3][texto_01.length()];
	static int[][] tabla3= new int[3][texto_01.length()];
	
	//Valores de la sustitución mono alfabética
	static int a= 16;
	static int b=62;
	
	//Clave para Vigenere
	static String clave= "21 de abril";
	static int[] claveNumerica;

	public static void main(String args[]) {
		//Creamos un método para cada ejercicio
		
		//Método para conseguir la clave de Vigenere en numérico
		claveNumerica= hallarClave();
		
		System.out.println("*** EJERCICIO 1 ***");
		ej1();
		System.out.println();
		System.out.println("*** EJERCICIO 2 ***");
		ej2();
		System.out.println();
		System.out.println("*** EJERCICIO 3 ***");
		ej3();
	}

	/**
	 * Método para pasar la clave a números
	 * @return arrray con la clave numerica
	 */
	private static int[] hallarClave() {
		// TODO Auto-generated method stub
		int[] claveNumerica= new int[clave.length()];
		
		for(int i=0;i<clave.length();i++) {
			int pos= buscaNumero(clave.charAt(i));
			claveNumerica[i]=pos;
		}
		
		return claveNumerica;
	}

	private static void ej1() {
		// TODO Auto-generated method stub
		/*
		 * Buscamos el número equivalente en función de la fórmula de la sustitución
		 * mono alfabética de la que disponemos
		*/
		
		for(int i=0;i<texto_01.length();i++) {
			char tmp= texto_01.charAt(i);
			int pos= buscaNumero(tmp);
			
			//Si tenemos posición válida
			int a2= calcularInverso(a);
			
			//Pasamos A a negativo
			int x= alf.length-a2;
			int b2= (x*b)%alf.length;
			
			int valor= (a2*pos+b2)%alf.length;
			tabla1[0][i]= valor;
		}
		
		//Creamos un string para descifrar el mensaje
		String sol="";
		
		for(int j=0;j<tabla1[0].length;j++) {
			int pos= tabla1[0][j];
			String letra= String.valueOf(alf[pos]);
			sol+=letra;
		}
		
		ArrayList<Character> texto= new ArrayList<Character>();
		
		//Pasamos el array a un arraylist para eliminar los espacios dobles
			for(int k=0 ; k<sol.length(); k++) {
				texto.add(sol.charAt(k));
			}
		
			//Sustituimos los espacios seguidos por saltos de linea
			for(int k=0 ; k<texto.size(); k++) {
				if(k<texto.size()-1) {
					if(texto.get(k)==' ' && texto.get(k+1)==' ') {
						texto.set(k, '\n');
						texto.remove(k+1);
					}
				}
			}
			
			//Imprimimos la solución final
			System.out.println("Mensaje decodificado: ");
			for(int k=0 ; k<texto.size(); k++) {
				System.out.print(texto.get(k));
			}
	}

	private static int calcularInverso(int a2) {
		// TODO Auto-generated method stub
		int i=1;
		while(i<alf.length) {
			int tmp= a2*i;
			//System.out.println(i);
			if(tmp%alf.length==1) {
				//System.out.println(tmp%alf.length);
				return i;
			}
			i++;
		}
		return -1;
	}

	private static int buscaNumero(char tmp) {
		// TODO Auto-generated method stub
		for(int i=0;i<alf.length;i++) {
			if(tmp==alf[i]) {
				return i;
			}
		}
		//Nunca debería llegar a este punto
		return -1;
	}

	private static void ej2() {
		// TODO Auto-generated method stub
		
		//Introducimos los valores numéricos de la tabla en la primera fila
		for(int i=0;i<texto_02.length();i++) {
			char tmp= texto_02.charAt(i);
			int pos= buscaNumero(tmp);
			
			//Si tenemos posición válida
			tabla2[0][i]= pos;
		}
		
		//Metemos en bucle los numeros de la clave hasta rellenar la fila
		int j=0;
		for(int i=0;i<tabla2[0].length;i++) {
			tabla2[1][i]=claveNumerica[j];
			j++;
			if(j>=claveNumerica.length) {
				j=0;
			}
		}
		
		/*
		 * Ahora procedemos a restar los valores de las dos primeras filas para obtener
		 * los valores de los caracteres a traducir
		 */
		
		String sol= "";
		
		for(int i=0;i<texto_02.length();i++) {
			int valor= tabla2[0][i]-tabla2[1][i];
			if(valor<0) {
				int tmp= Math.abs(valor);
				valor= alf.length-tmp;
			}
			String letra= String.valueOf(alf[valor]);
			sol+=letra;
		}
		
		ArrayList<Character> texto= new ArrayList<Character>();
		
		//Pasamos el array a un arraylist para eliminar los espacios dobles
			for(int k=0 ; k<sol.length(); k++) {
				texto.add(sol.charAt(k));
			}
		
			//Sustituimos los espacios seguidos por saltos de linea
			for(int k=0 ; k<texto.size(); k++) {
				if(k<texto.size()-1) {
					if(texto.get(k)==' ' && texto.get(k+1)==' ') {
						texto.set(k, '\n');
						texto.remove(k+1);
					}
				}
			}
			
			//Imprimimos la solución final
			System.out.println("Mensaje decodificado: ");
			for(int k=0 ; k<texto.size(); k++) {
				System.out.print(texto.get(k));
			}
		
	}
	
	private static void ej3() {
		// TODO Auto-generated method stub
		
		//PRIMERO APLICAMOS LA DECODIFICACION DE VIGENERE
		//Introducimos los valores numéricos de la tabla en la primera fila
				for(int i=0;i<texto_03.length();i++) {
					char tmp= texto_03.charAt(i);
					int pos= buscaNumero(tmp);
					
					//Si tenemos posición válida
					tabla3[0][i]= pos;
				}
				
				//Metemos en bucle los numeros de la clave hasta rellenar la fila
				int j=0;
				for(int i=0;i<tabla3[0].length;i++) {
					tabla3[1][i]=claveNumerica[j];
					j++;
					if(j>=claveNumerica.length) {
						j=0;
					}
				}
				
				/*
				 * Ahora procedemos a restar los valores de las dos primeras filas para obtener
				 * los valores de los caracteres a traducir
				 */
				
				String sol= "";
				
				for(int i=0;i<texto_03.length();i++) {
					int valor= tabla3[0][i]-tabla3[1][i];
					if(valor<0) {
						int tmp= Math.abs(valor);
						valor= alf.length-tmp;
					}
					String letra= String.valueOf(alf[valor]);
					sol+=letra;
				}
				
				//System.out.println(sol);
				
				//AHORA APLICAMOS LA DECODIFICACION MONO ALFABÉTICA
				
				/*
				 * Buscamos el número equivalente en función de la fórmula de la sustitución
				 * mono alfabética de la que disponemos
				*/
				
				for(int i=0;i<sol.length();i++) {
					char tmp= sol.charAt(i);
					int pos= buscaNumero(tmp);
					
					//Si tenemos posición válida
					int a2= calcularInverso(a);
					
					//Pasamos A a negativo
					int x= alf.length-a2;
					int b2= (x*b)%alf.length;
					
					int valor= (a2*pos+b2)%alf.length;
					tabla1[0][i]= valor;
				}
				
				//Creamos un string para descifrar el mensaje
				String solucion ="";
				
				for(int k=0;k<sol.length();k++) {
					int pos= tabla1[0][k];
					String letra= String.valueOf(alf[pos]);
					solucion+=letra;
				}
				
				ArrayList<Character> texto= new ArrayList<Character>();
				
				//Pasamos el array a un arraylist para eliminar los espacios dobles
				for(int k=0 ; k<solucion.length(); k++) {
					texto.add(solucion.charAt(k));
				}
				
				//Sustituimos los espacios seguidos por saltos de linea
				for(int k=0 ; k<texto.size(); k++) {
					if(k<texto.size()-1) {
						if(texto.get(k)==' ' && texto.get(k+1)==' ') {
							texto.set(k, '\n');
							texto.remove(k+1);
						}
					}
				}
					
				//Imprimimos la solución final
				System.out.println("Mensaje decodificado: ");
				for(int k=0 ; k<texto.size(); k++) {
					System.out.print(texto.get(k));
				}
		
	}
}
