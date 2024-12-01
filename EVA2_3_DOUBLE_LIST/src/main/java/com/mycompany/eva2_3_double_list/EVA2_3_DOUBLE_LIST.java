/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_3_double_list;

/**
 *
 * @author hecto
 */
public class EVA2_3_DOUBLE_LIST {

    public static void main(String[] args) {
        Classe_doble lista = new Classe_doble();
        lista.AgregarNodo(100);
        lista.AgregarNodo(200);
        lista.AgregarNodo(300);
        lista.AgregarNodo(500);
        lista.imprimir();
        lista.longitud();
        lista.longitudivet();
        lista.imprimir();
        try{
        lista.insertarEn(9999, 0);
        lista.insertarEn(0, 3);
        lista.imprimir();
        }catch(Exception e){
            
        }
        
    }
}
