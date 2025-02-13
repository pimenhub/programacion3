public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, World!");
        ArbolBinario arbol = new ArbolBinario();
        int[] valores = {50, 30, 70, 20, 40, 60, 80};
        //int[] valores = {39, 48, 47, 53, 34, 39, 87, 29, 51, 98, 32, 64, 0, 51, 28};
        for (int valor : valores) {
            arbol.insertarNodo(valor);
        }

        System.out.println("Datos en Orden");
        arbol.enOrden();
        System.out.println("");

        System.out.println("Recorrido en preorden:");
        arbol.preOrden();
        System.out.println("");

        System.out.println("Recorrido en inorden:");
        arbol.inOrden();
        System.out.println("");

        System.out.println("Recorrido en postorden:");
        arbol.postOrden();
        System.out.println("");
    }
}