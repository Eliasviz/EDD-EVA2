/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_1_lista;

/**
 *
 * @author Elias
 */
public class EVA2_1_LISTA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nodo inicio = null;
        inicio = new Nodo(100);
        inicio.setSiguiente(new Nodo(200));
        inicio.getSiguiente().setSiguiente(new Nodo(300));
    }
    
}

class Nodo{
private int valor;
private Nodo siguiente;

    public Nodo(){
        this.valor = 0;
        this.siguiente = null;
    }
    public Nodo(int valor) {
        this.valor = valor;
        this.siguiente = null;
    }


    public int getValor() {
        return valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

        
}