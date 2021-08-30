
package Listas;

import java.util.Scanner;

/**
 *
 * @author SamirV2
 */
public class main {
    public static void main(String[] args) {
Scanner leer = new Scanner(System.in);
        Lista lista = new Lista();
        Nodo n = new Nodo();
        int datos = 0, op = 0;
        do {
            System.out.println("*****************");
            System.out.println("1. Ingresar datos");
            System.out.println("2. Imprimir lista");            
            System.out.println("3. Sumar Lista");
            System.out.println("4. Vaciar Lista");
            System.out.println("0. Salir");
            System.out.println("*****************");
            System.out.println("Digite una opcion");
            op = leer.nextInt();
            switch (op) {
                case 1:                    
                    try {
                        System.out.println("Digite un valor entero");
                        datos = leer.nextInt();
                        lista.insertarNodo(datos);   
                    } catch (Exception e) {
                        System.out.println("Error, Dato NO es un entero! "+e);
                    }                    
                    break;
                case 2:                    
                    lista.imprimirRecursivo();
                    break;
                case 3:
                    lista.sumarRecursivo();
                    lista.setRes(0);
                    break;
                case 4:
                    lista.vaciarListaRapido();
                    break;
                case 0:
                    System.out.println("Gracias por utilizar nuestro software");
                    break;
                default:
                    System.out.println("Opcion invalida intente de nuevo");
            }

        } while (op != 0);        
    }
}
