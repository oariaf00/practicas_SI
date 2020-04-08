package p6_SI;
/*
 * Clase abstracta de arbol
 * De forma objetiva una clase abstracta sirve como modelo para una clase concreta, en este caso para las clases NODE y LEAF
 */
abstract class HuffmanTree implements Comparable<HuffmanTree> {
    public final int frequency; // Frecuencia del árbol
    //
    public HuffmanTree(int freq) { 
    	frequency = freq; 
    }
    
    // Compara las frecuencias  para la ordenación en la cola
    public int compareTo(HuffmanTree tree) {
        return frequency - tree.frequency;
    }
}