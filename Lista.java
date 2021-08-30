package Listas;

/**
 *
 * @author SamirV2
 */
public class Lista {

    private int tamanio;
    private Nodo primero;
    private Nodo ultimo;
    private int res;
    
    public Lista() {
        this.primero = null;
        this.ultimo = null;
        tamanio = 0;
        res = 0;
    }

    public int tam(){
        return tamanio;
    }
    public void setRes(int i){
        this.res = i;
    }
    public boolean estaVacia() {
        return primero == null;
    }

    public void insertarNodo(int datos) {
        Nodo nuevo = new Nodo(datos);
        if (estaVacia()) {
            primero = ultimo = nuevo;
        } else {
            ultimo.setSiguiente(nuevo);
            ultimo = nuevo;
        }
        tamanio++;

    }

    public void imprimirLista() {
        if (!estaVacia()) {
            Nodo recorrer = primero;

            while (recorrer != null) {
                System.out.print(recorrer.getDatos() + ", ");
                recorrer = recorrer.getSiguiente();
            }
            System.out.println("");
        } else {
            System.out.println("Lista Vacia");
        }
    }
    
    public void vaciarListaRapido() {
        primero = ultimo = null;
        tamanio = 0;
    }

    public void imprimirRecursivo() {
        if (!estaVacia()) {
            Nodo recorrer = primero;
            recorridoRecursivo(recorrer, 0);         
            System.out.println("");
        } else {
            System.out.println("Lista Vacia");
        }
    }    

    public void sumarRecursivo() {
        if (!estaVacia()) {
            Nodo recorrer = primero;
            System.out.println("La sumatoria es: "+recorridoRecursivoSuma(recorrer, 0));            
        } else {
            System.out.println("Lista Vacia");
        }
    }
    
    public void recorridoRecursivo (Nodo l, int i) {
        int t = tam()-1;        
        if (i == t) { 
            System.out.println ("Ultimo elemento..."+l.getDatos()); 
        } else {
            System.out.println("Leyendo... " + l.getDatos());
            recorridoRecursivo(l.getSiguiente(), i+1);
        }       
    }

    public int recorridoRecursivoSuma (Nodo l, int i) {        
        int t = tam();        
        if (i != t) {            
            res = res + l.getDatos();
            recorridoRecursivoSuma(l.getSiguiente(), i+1);            
        }
        return res;
    }    
}
