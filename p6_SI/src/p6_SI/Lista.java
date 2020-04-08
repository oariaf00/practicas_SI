package p6_SI;

import java.util.ArrayList;

/**
 *
 * @author Victor
 */
public class Lista {

    private Nodo inicio;

    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public Lista() {
        this.setInicio(null);
    }

    public void insertarInicio(char d) {
        Nodo nuevo = new Nodo(d);
        if (inicio == null) {
            inicio = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
    }
    
    //Método que saca los símbolos que hay en el Texto
    public void recorrer() {
        Nodo aux = inicio;
        while (aux != null) {
            System.out.print(aux.getDato() + " -> ");
            aux = aux.getSiguiente();
        }
    }
    
    //Método para añadir los símbolos del texto en un array
    public ArrayList<Character> anadirSimbolos() {
    	ArrayList<Character> arrayHuffman= new ArrayList<Character>();
        Nodo aux = inicio;
        while (aux != null) {
            arrayHuffman.add(aux.getDato());
            aux = aux.getSiguiente();
        }
        
        return arrayHuffman;
    }

    public void insertarFinal(char d) {
        Nodo nuevo = new Nodo(d);
        if (inicio == null) {
            inicio = nuevo;
        } else {
            Nodo aux = inicio;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }

    public Integer eliminarValor(char valor) {
        Integer contador = 0;
        if (inicio != null) {
            Nodo aux = inicio;
            Nodo ant = null;
            while (aux != null) {
                if (aux.getDato() == valor) {
                    if (ant == null) {
                        inicio = inicio.getSiguiente();
                        aux.setSiguiente(null);
                        aux = inicio;
                    } else {
                        ant.setSiguiente(aux.getSiguiente());
                        aux.setSiguiente(null);
                        aux = ant.getSiguiente();
                    }
                    contador++;
                } else {
                    ant = aux;
                    aux = aux.getSiguiente();
                }
            }
        }
        return contador;
    }

    public void insertarInicio(char letra, String camino) {
        Nodo nuevo = new Nodo(letra, camino);
        if (inicio == null) {
            inicio = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
    }

    //Método que saca los valores binarios que tiene cada valor en el texto
    public void recorrer2() {
        Nodo aux = inicio;
        while (aux != null) {
            System.out.println("'"+aux.getDato()+ "'"+":" + aux.getCamino() + " ");
            aux = aux.getSiguiente();
        }
    }
    
  //Método que saca los valores binarios que tiene cada valor en el texto
    public ArrayList<String> anadirCodigos() {
        Nodo aux = inicio;
        ArrayList<String> longitudes= new ArrayList<String>();
        while (aux != null) {
            longitudes.add(aux.getCamino());
            aux = aux.getSiguiente();
        }
        return longitudes;
    }

    public void insertarFinal(char letra, String camino) {
        Nodo nuevo = new Nodo(letra, camino);
        if (inicio == null) {
            inicio = nuevo;
        } else {
            Nodo aux = inicio;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }

}
