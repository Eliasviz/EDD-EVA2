/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_2_linket_list;

/**
 *
 * @author hecto
 */
public class Nodo {
    private int valor;
    private Nodo siguiente;
    
    public Nodo(){
    this.valor = 0;
    this.siguiente = null;
    
    }

    public Nodo(int valor) {
        this.valor = valor;
        this.siguiente = siguiente;
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
