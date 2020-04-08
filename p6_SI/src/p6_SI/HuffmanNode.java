package p6_SI;

/*
 * Clase de un nodo del árbol
 */
class HuffmanNode extends HuffmanTree {
    public final HuffmanTree left, right; //Sub-árboles
 
    public HuffmanNode(HuffmanTree l, HuffmanTree r) {
        super(l.frequency + r.frequency);
        left = l;
        right = r;
    }
}