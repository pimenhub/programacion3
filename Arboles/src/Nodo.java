public class Nodo {
    int dato;
    Nodo izquierda;
    Nodo derecha;

    public Nodo(int valorNodo){
        this.dato = valorNodo;
        this.izquierda = null;
        this.derecha = null;
    }

    public void insertar(int valorInsertar){
        if(valorInsertar < dato){
            if(izquierda == null){
                izquierda = new Nodo(valorInsertar);
            }
            else{
                izquierda.insertar(valorInsertar);
            }
        }else if(valorInsertar > dato){
            if(derecha == null){
                derecha = new Nodo(valorInsertar);
            }
            else{
                derecha.insertar(valorInsertar);
            }
        }
    }
}
