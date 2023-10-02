public class App {
    
    public static void main(String[] args) throws Exception {
        //Declaración de nodos
        Node raiz = new Node (0);
        Node b = new Node (1);
        Node c = new Node (2);
        Node d = new Node (3);
        Node e = new Node (4);
        Node f = new Node (5);
        Node g = new Node (6);
        Node h = new Node (7);
        Node i = new Node (8);
        Node j = new Node (9);

        //Posicion de nodos
        raiz.left = b;
        raiz.right = c;
        b.left = d;
        b.right = e;
        c.right = f;
        f.left = g;
        f.right = h;
        g.left = i;
        g.right = j;
       
        ArbolBinario arbol = new ArbolBinario(raiz);


        //Recorridos 
        System.out.println("Recorrido en Preorden:");
        arbol.preorden(raiz);

        System.out.println("\nRecorrido en Inorden:");
        arbol.inorden(raiz);

        System.out.println("\nRecorrido en Posorden:");
        arbol.posorden(raiz);


    }
}
