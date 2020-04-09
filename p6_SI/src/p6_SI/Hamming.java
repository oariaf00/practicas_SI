package p6_SI;

import java.util.ArrayList;

public class Hamming {
	int longitudBloque;
	int distanciaHamming;
	int T;
	int[] lista;
	ArrayList<Integer[]> bloques= new ArrayList<Integer[]>();
	
	public Hamming(int l, int[] lista) {
		this.longitudBloque=l;
		this.lista= lista;
	}

	public int calcularDistancia() {
//		int i = 0, count = 0;
//		ArrayList<Integer> distancias= new ArrayList<Integer>();
//		int[] bloque = new int[longitudBloque];
//		int[] bloqueSiguiente= new int[longitudBloque];
//	    while (i< lista.length-longitudBloque-1){
//	    	//Almacenamos el bloque correspondiente
//	       for(int j=0;j<longitudBloque;j++) {
//	    	   bloque[j]=lista[i+j];
//	       }
//	       
//	    	   //Almacenamos el siguiente bloque para comparar
//	    		   for(int j=0;j<longitudBloque;j++) {
//			    	   bloqueSiguiente[j]=lista[i+longitudBloque+j];
//	    		   }
//	       
//	       for(int j=0;j<longitudBloque;j++) {
//	    	  System.out.print(bloque[j]);
//	       }
//	       System.out.println();
//	       
//	       for(int j=0;j<longitudBloque;j++) {
//	    	   System.out.print(bloqueSiguiente[j]);
//	       }
//	       System.out.println();
//	       
//	       //Comparamos la distancia entre ambas palabras
//	       for(int j=0;j<bloque.length;j++) {
//	    		   if(bloque[j]!=bloqueSiguiente[j]) {
//	    			   count++;
//	    		   }
//	       }
//	       System.out.println(count);
//	       
//	       distancias.add(count);
//	       count=0;
//	        i+=longitudBloque; 
//	    }
//	    int minima= distancias.get(0);
//	    
//	    for(int j=0;j<distancias.size();j++) {
//	    	if(minima>distancias.get(j)) {
//	    		minima=distancias.get(j);
//	    	}
//	    }
//	    
//	    System.out.println(distancias);
//	    System.out.println(minima);
//	    return minima;
		return 0;
	}

	public int calcularT() {
		// TODO Auto-generated method stub
		int T=0;
		return T;
	}
}
