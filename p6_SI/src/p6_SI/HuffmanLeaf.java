package p6_SI;

/*
 * Clase de nodo de cada hoja del árbol
 */
class HuffmanLeaf extends HuffmanTree {
    public final char value; //La letra se asigna a un nodo de hoja
 
    public HuffmanLeaf(int freq, char val) {
        super(freq);
        value = val;
    }
}