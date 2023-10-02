class ArbolBinario {
    private Node raiz;

    public ArbolBinario(Node raiz) {
        this.raiz = raiz;
    }
    //rrecorrido preorden
    public void preorden(Node nodo) {
        if (nodo != null) {
            System.out.print(nodo.value() + " ");
            preorden(nodo.left());//Si el nodo es null pasa por el nodo izquierdo
            preorden(nodo.right());//Después pasa por el nodo derecho
        }
    }
//recorrido inorden
    public void inorden(Node nodo) {
        if (nodo != null) {
            inorden(nodo.left()); //Si el nodo es null, pasa primero por el nodo izquierdo 
            System.out.print(nodo.value() + " "); //Pone al nodo que estabamos trabajando
            inorden(nodo.right()); //Pasa al nodo derecho
        }
    }
//recorrido posorden
    public void posorden(Node nodo) {
        if (nodo != null) {
            posorden(nodo.left()); //Si el nodo es null, pasa al izquierdo
            posorden(nodo.right()); //Luego al derecho
            System.out.print(nodo.value() + " "); //Luego imprime el nodo actual
        }
    }
}
