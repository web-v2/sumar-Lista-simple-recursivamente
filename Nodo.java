package Listas;
/**
 *
 * @author SamirV2
 */
public class Nodo {
    private int datos;
    private Nodo siguiente;
    
    public Nodo(int datos) {
        this.datos = datos;
        this.siguiente = null;
    }
    
    public Nodo() {
        this.datos = 0;
        this.siguiente = null;
    }
    
    public int getDatos() {
        return datos;
    }

    public void setDatos(int datos) {
        this.datos = datos;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
        
}
