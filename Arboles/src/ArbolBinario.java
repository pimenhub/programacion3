public class ArbolBinario {
    Nodo raiz;
    public ArbolBinario(){
        this.raiz = null;
    }

    public void insertarNodo(int valorInsertar){
        if(raiz == null){
            raiz = new Nodo(valorInsertar);
        }else{
            raiz.insertar(valorInsertar);
        }
    }

    public void enOrden(){
        enOrdenRec(raiz);
        System.out.println("");
    }

    private void enOrdenRec(Nodo raiz) {
        if (raiz != null) {
            enOrdenRec(raiz.izquierda);
            System.out.print(raiz.dato + " ");
            enOrdenRec(raiz.derecha);
        }else return;
    }

    // Recorrido en preorden
    public void preOrden() {
        preOrdenRec(raiz);
        System.out.println();
    }
    private void preOrdenRec(Nodo raiz) {
        if (raiz != null) {
            System.out.print(raiz.dato + " ");
            preOrdenRec(raiz.izquierda);
            preOrdenRec(raiz.derecha);
        }else return;
    }

    // Recorrido en inOrden
    public void inOrden() {
        inOrdenRec(raiz);
        System.out.println();
    }
    private void inOrdenRec(Nodo raiz) {
        if (raiz != null) {
            preOrdenRec(raiz.izquierda);
            System.out.print(raiz.dato + " ");
            preOrdenRec(raiz.derecha);
        }else return;
    }

    // Recorrido en postOrden
    public void postOrden() {
        postOrdenRec(raiz);
        System.out.println();
    }
    private void postOrdenRec(Nodo raiz) {
        if (raiz != null) {
            preOrdenRec(raiz.izquierda);
            preOrdenRec(raiz.derecha);
            System.out.print(raiz.dato + " ");
        }else return;
    }
}
