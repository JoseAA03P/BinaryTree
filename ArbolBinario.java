class ArbolBinario {
    private Node raiz;

    public ArbolBinario(Node raiz) {
        this.raiz = raiz;
    }
    
    public void preorden(Node nodo) {
        if (nodo != null) {
            System.out.print(nodo.value() + " ");
            preorden(nodo.left());
            preorden(nodo.right());
        }
    }

    public void inorden(Node nodo) {
        if (nodo != null) {
            inorden(nodo.left());
            System.out.print(nodo.value() + " ");
            inorden(nodo.right());
        }
    }

    public void posorden(Node nodo) {
        if (nodo != null) {
            posorden(nodo.left());
            posorden(nodo.right());
            System.out.print(nodo.value() + " ");
        }
    }
}
