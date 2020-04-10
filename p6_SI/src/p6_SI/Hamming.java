package p6_SI;

import java.util.ArrayList;

import java.util.ArrayList;

public class Hamming {
	int[][] matrizGeneradora;
	int distancia;
	
	public Hamming(int[][] G) {
		this.matrizGeneradora=G;
		distancia=distanciaHamming(matrizGeneradora, 3, 3);
	}


	private static int distanciaHamming(int[][] matriz, int q, int identidad) {

		int distanciaHamming = 0;

		int k = matriz.length;			//fila
		int n = matriz[0].length;		//columna

		int[][] matrizIdentidad = new int[k][k];
		int[][] matrizFinal = new int[k][k+n];

		int filaAux = 0; 
		int colAux = 0;

		for (int i = 0; i < k; i++) {
			for (int j = 0; j < k; j++) {
				if (i == j) {
					matrizIdentidad[i][j] = 1;
				}
			}
		}

		for (int i = 0; i < matrizFinal.length; i++) {
			colAux = 0;
			for (int j = 0; j < matrizFinal[0].length; j++) {
				if (j < k) {
					matrizFinal[i][j] = matrizIdentidad[i][j];
				}else {
					matrizFinal[i][j] = matriz[filaAux][colAux];
					colAux++;
				}			
			}
			filaAux++;		
		}
		
		//System.out.println("Matriz G creada con éxito");

		String[] elementos = new String[q];

		elementos[0]="0";
		elementos[1]="1";
		
		String[][] permutaciones = permutaciones(elementos, identidad);
		
//		for (int i = 0; i < permutaciones.length; i++) {
//			for (int j = 0; j < permutaciones[0].length; j++) {
//					System.out.print(permutaciones[i][j]+"\t");
//			}	
//			System.out.println();
//		}

		int[][] matrizFinal2 = multiplicarMatrices(permutaciones,matrizFinal, q);
		
		//System.out.println("MatrizFinal: ");
		
//		for (int i = 0; i < matrizFinal.length; i++) {
//			for (int j = 0; j < matrizFinal[0].length; j++) {
//					System.out.print(matrizFinal[i][j]+"\t");
//			}	
//			System.out.println();
//		}
		
//		System.out.println("MatrizFinal2: ");
//		
//		for (int i = 0; i < matrizFinal2.length; i++) {
//			for (int j = 0; j < matrizFinal2[0].length; j++) {
//					System.out.print(matrizFinal2[i][j]+"\t");
//			}	
//			System.out.println();
//		}
		
		int distancia = peso(matrizFinal2);

		//System.out.println("Distancia de Hamming: " +distancia);
		
		return distancia;
	}

	private static String[][] permutaciones(String[] elementos, int identidad){
		
		String[][] permutaciones;		
		ArrayList<String> permutacionesAuxiliar = new ArrayList<String>();
	
		permutacionesRecursivo(permutacionesAuxiliar, elementos, "",identidad, elementos.length);
		permutaciones = new String[permutacionesAuxiliar.size()][identidad];
		
		for (int i = 0; i < permutacionesAuxiliar.size(); i++) {
			for (int j = 0; j < identidad; j++) {
				permutaciones[i][j] = String.valueOf(permutacionesAuxiliar.get(i).charAt(j));
			}
		}

		return permutaciones;
	}
	
    private static void permutacionesRecursivo(ArrayList<String> permutacionesAuxiliar, String[] elem, String act, int n, int r) {
        if (n == 0) {
        	permutacionesAuxiliar.add(act);
        } else {
        		for (int i = 0; i < r-1; i++) {
                	permutacionesRecursivo(permutacionesAuxiliar, elem, act + elem[i] + "", n - 1, r);

        	}
            
        }
    }
    
	public static int[][] multiplicarMatrices(String[][] matrizA, int[][] matrizB, int q){

		int filaA = matrizA.length;
		int columnaA = matrizA[0].length;

		int filaB = matrizB.length;
		int columnaB = matrizB[0].length;

		if (columnaA != filaB) {
			System.out.println("No se ha podido multiplicar las matrices.");
			return null;
		}else {
			int[][] resultado = new int[filaA][columnaB];

			for (int x=0; x < filaA; x++) {
				for (int y=0; y < columnaB; y++) {
					for (int z=0; z < columnaA; z++) {
						resultado [x][y] += Integer.parseInt(matrizA[x][z]) * matrizB[z][y]; 
					}		          
					resultado [x][y] =resultado [x][y] % q;
				}
			}
			return resultado;
		}		
	}
	
	public static int peso(int[][] matriz) {

		int filas = matriz.length;
		int columnas = matriz[0].length;
		int[] pesos = new int[filas];
		int pesoAux = 0;
		
		for (int i = 0; i < filas; i++) {
			pesoAux = 0;
			for (int j = 0; j < columnas; j++) {
				if (matriz[i][j] != 0) {
					pesoAux++;
				}
				
			}
			pesos[i] = pesoAux;
		}
		
//		for (int i = 0; i < filas; i++) {
//			System.out.println(pesos[i]);
//		}

		int menor =50;

		for (int i = 0; i < pesos.length; i++) {
			if (pesos[i] <= menor && pesos[i] != 0){
				menor = pesos[i];
			}
		}

		return menor;
	}
    
}
