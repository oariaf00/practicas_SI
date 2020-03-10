package practica3_SI;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		int [] letraCod= new int [6];
		int base = 2;
		
		double longitudAlf2 = Math.log10(alf2.length)/Math.log10(base);
		int longitudAlfabeto2 = (int) Math.ceil(longitudAlf2);
		System.out.println("longitud: " + longitudAlfabeto2);
		
		int i=0;
		int j=0;
		int [] arrayCod = new int [7];
		int [] arrayDecod = new int [4];
		 
		int longArrayFinal = (lista2.length/7)+(lista2.length%7);
		
		ArrayList<Integer> arrayFinal = new ArrayList<Integer>();
		
		while(i+7<=lista2.length) {
			for(j=0 ; j<7; j++) {
				if(j<4){
					arrayDecod[j] = lista2[i+j];
					arrayFinal.add(arrayDecod[j]);
					arrayCod[j] = lista2[i+j];
					System.out.print(arrayDecod[j]);
				}else {
					arrayCod[j] = lista2[i+j];
				}
				
			}
			System.out.println();
			i = i+7;
		}
		
		int mod = lista2.length%7;
		
		System.out.println("i: "+i);
		if(mod>0) {
			int [] cola = new int [mod];
			for(int k=i; k<lista2.length; k++){
				cola[k-i] = lista2[k];
				arrayFinal.add(cola[k-i]);
				System.out.print(cola[k-i]);
			}
		}
		
		System.out.println(arrayFinal);
		
		int tamanioArrayLetras = arrayFinal.size()/6;
		
		i=0;
		j=0;
		int k=0;
		int [] arrayCodigoLetra = new int [6];
		char [] arrayLetras = new char [tamanioArrayLetras];
		
		while(i+6<=arrayFinal.size()) {
			
			for(j=0 ; j<6; j++) {
				arrayCodigoLetra[j] = arrayFinal.get(i+j);
				System.out.print(arrayCodigoLetra[j]);
				}
			
			arrayLetras[k] = traducirLetra(arrayCodigoLetra, alf2);
			System.out.println();
			System.out.println("LETRA: " + arrayLetras[k]);
			k++;
			
			System.out.println();
			i = i+6;
		}
		
		
		for(int q=0 ; q<arrayLetras.length ; q++)
		{
			System.out.print(arrayLetras[q]);
		}
		
		
	}
	
	public static char traducirLetra(int [] codigoLetra, char [] alf2) {
		
		int sumaCodigo = 0;
		int potencia = 0;
		
		for(int i=codigoLetra.length-1 ; i>=0 ; i--)
		{
			if(codigoLetra[i] == 1)
			{
				System.out.println("SUMOOOOOOOOOOOOOOOOOOOOOO");
				//int potenciaDos = 2^potencia;
				//System.out.println("POTENCIA " + potencia);
				sumaCodigo = sumaCodigo + calcularPotencia(potencia);
				System.out.println("POSICION: " + sumaCodigo);
			}
			potencia++;
		}
		
		return alf2[sumaCodigo];
	}
	
	public static int calcularPotencia(int potencia)
	{
		int potenciaDos = 1;
		
		if(potencia != 0)
		{
			for(int i=0 ; i<potencia ; i++)
			{
				potenciaDos = potenciaDos * 2;
			}
			return potenciaDos;
		}
		
		return potenciaDos;
	}
	
}


























