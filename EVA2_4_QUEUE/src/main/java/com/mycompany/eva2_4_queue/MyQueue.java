/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_4_queue;

/**
 *
 * @author hecto
 */
public class MyQueue {
    private Nodo1 inicio;
    private Nodo1 fin;
    private Nodo1 previo;
    
    public MyQueue(){
    inicio = null;
    previo = null;
    }
    
    public void MyQueue(){
        
    }
     public void AgregarNodo(int valor){
    Nodo1 nuevo = new Nodo1(valor);
    Nodo1 temp = inicio;
    
        
    
    if (inicio == null){
        inicio = nuevo;
        fin = nuevo;
    }else{
        /*
        while(temp.getSiguiente() != null){
        temp = temp.getSiguiente();
        
        }
        temp.setSiguiente(nuevo);
        */
        fin.setSiguiente(nuevo);
        nuevo.setPrevio(fin);
        fin = nuevo;
    }
}
    
    public void imprimir(){
        Nodo1 temp = inicio;
        while(temp != null){
            System.out.print("[" + temp.getValor() + "]");
            temp = temp.getSiguiente();
        }
        System.out.println("");
    }
    
    public boolean estaVacia(){
    boolean bande = false;
    if (inicio == null)
        bande = true;
    return bande;
    
    }
    
    
    public void vaciarLista(){
        inicio = null;
        fin = null;
    }
    
    public int longitud(){
        int tama = 0;
        Nodo1 temp = inicio;
        while(temp != null){
            tama++;
            temp = temp.getSiguiente();
        }        
        return tama;
    }
    public int longitudivet(){
        int tama = 0;
        Nodo1 temp = previo;
        while(temp != null){
            tama++;
            temp = temp.getPrevio();
        }        
        return tama;
    }
    
    public void insertarEn(int valor, int posicion) throws Exception {
        if (inicio == null){
            throw new Exception("Lista vacia, nose puede incertar el nodo");
        }else{
            if((posicion >= 0)  && (posicion < longitud())){
                Nodo1 nuevo = new Nodo1(valor);
                if(posicion == 0){
                    nuevo.setSiguiente(inicio);
                    inicio = nuevo;
                }else{
                    int i = 0;
                    Nodo1 temp = inicio;
                    while(i < posicion){
                        i++;
                        temp = temp.getSiguiente();
                        } 
                    nuevo.setSiguiente(temp);
                    nuevo.setPrevio(temp.getPrevio());
                    temp.getPrevio().setSiguiente(nuevo);
                    temp.setPrevio(nuevo);
                    
                }                      
        }else
                throw new Exception("Posicion no valida,nose puede incertar");
        }
    }
    
    public int peek() throws Exception{
        if (inicio == null){
            throw new Exception("Lista vacia, nose puede incertar el nodo");
        }else{
            return inicio.getValor();
        }
    }
    public int poll() throws Exception{
        if (inicio == null){
            throw new Exception("Lista vacia, nose puede incertar el nodo");
        }else{
            int valor = inicio.getValor();
            if(longitud() == 1){
                vaciarLista();
            }else{
                    inicio = inicio.getSiguiente();
                    inicio.setPrevio(null);
                    }
            return valor;
        }
    }    
}

    

