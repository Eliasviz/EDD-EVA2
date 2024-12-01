/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_2_linket_list;

/**
 *
 * @author hecto
 */
public class Lista {
    private Nodo inicio;
    private Nodo fin;
    
    public Lista(){
    inicio = null;
    
    }
    
    public void AgregarNodo(int valor){
    Nodo nuevo = new Nodo(valor);
    Nodo temp = inicio;
    
        
    
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
        fin = nuevo;
    }
}
    
    public void imprimir(){
        Nodo temp = inicio;
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
        Nodo temp = inicio;
        while(temp != null){
            tama++;
            temp = temp.getSiguiente();
        }        
        return tama;
    }
    
    public void insertarEn(int valor, int posicion) throws Exception {
        if (inicio == null){
            throw new Exception("Lista vacia, nose puede incertar el nodo");
        }else{
            if((posicion >= 0)  && (posicion < longitud())){
                Nodo nuevo = new Nodo(valor);
                if(posicion == 0){
                    nuevo.setSiguiente(inicio);
                    inicio = nuevo;
                }else{
                    int i = 0;
                    Nodo temp = inicio;
                    while(i < (posicion - 1)){
                        i++;
                        temp = temp.getSiguiente();
                        } 
                    nuevo.setSiguiente(temp.getSiguiente());
                    temp.setSiguiente(nuevo);
                    
                }                      
        }else
                throw new Exception("Posicion no valida,nose puede incertar");
        }
    }
    public int optenerValor(int posicion) throws Exception {
        if (inicio == null){
            throw new Exception("Lista vacia, nose puede incertar el nodo");
        }else{
            if((posicion >= 0)  && (posicion < longitud())){
                int i = 0;
                    Nodo temp = inicio;
                    while(i < posicion){
                        i++;
                        temp = temp.getSiguiente();
                        }
                    return temp.getValor();
            }else{
            throw new Exception("Lista vacia, nose puede incertar el nodo");
            }    
        
        }
    }
    
    public void BorrarEn(int posicion) throws Exception {
      if (inicio == null){
            throw new Exception("Lista vacia, nose puede borrar el nodo");
        }else{
            if((posicion >= 0)  && (posicion < longitud())){               
                
                    int i = 0;
                    Nodo temp = inicio;//, dos;
                    while(i < (posicion - 1)){
                        i++; 
                        temp = temp.getSiguiente();                    
                    }
                    
                    temp.setSiguiente(temp.getSiguiente().getSiguiente());
                    
                    //temp = temp.getSiguiente();
        }else
                throw new Exception("Posicion no valida, no se puede borrar");
    } 
    }
}