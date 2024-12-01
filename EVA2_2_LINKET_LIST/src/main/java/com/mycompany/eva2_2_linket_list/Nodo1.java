/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_2_linket_list;

/**
 *
 * @author hecto
 */
public class Nodo1 {
    private int valor;
    private Nodo1 siguiente;
    
    public Nodo1(){
    this.valor = 0;
    this.siguiente = null;
    
    }

    public Nodo1(int valor) {
        this.valor = valor;
        //this.siguiente = siguiente;
    }
    
    public int getValor() {
        return valor;
    }

    public Nodo1 getSiguiente() {
        return siguiente;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setSiguiente(Nodo1 siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
}
