/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_2_linket_list;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hecto
 */
public class EVA2_2_LINKET_LIST {

    public static void main(String[] args) {
        Lista milista = new Lista();
        /*int arreglo[] = new int[1000000];
        long ini, fin, tiempo;
        
        ini = System.nanoTime();
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random() * 100);
        }
        fin = System.nanoTime();
        tiempo = fin - ini;
        System.out.println("tiempo del arreglo " + tiempo);
        
        ini = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            milista.AgregarNodo((int)(Math.random() * 100));
        }
        fin = System.nanoTime();
        tiempo = fin - ini;
        System.out.println("tiempo del arreglo " + tiempo);
        */
        
        System.out.println(milista.longitud());
        //System.out.println(milista.estaVacia());
        milista.AgregarNodo(100);
        milista.AgregarNodo(200);
        milista.AgregarNodo(300);
        milista.AgregarNodo(400);
        milista.AgregarNodo(500);
        milista.AgregarNodo(600);
        milista.imprimir();
        /*System.out.println(milista.longitud());
        System.out.print(milista.estaVacia());
        milista.vaciarLista();
        System.out.println("Vaciamos la liasta");
        milista.imprimir();
        System.out.println(milista.longitud());
        */
        try {
            
            milista.insertarEn(9999, 0);
            milista.insertarEn(8888, 0);
            milista.insertarEn(7777, 0);
            milista.insertarEn(-1, 3); 
            milista.longitud();
            
            
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        milista.imprimir();
        try {
            System.out.println(milista.optenerValor(5));  
            milista.BorrarEn(5);
            milista.BorrarEn(4);
            milista.imprimir();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
