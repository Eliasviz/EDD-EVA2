/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eval3_6_ordenamiento;

/**
 *
 * @author hecto
 */
public class EVAL3_6_ORDENAMIENTO {

    public static void main(String[] args) {
        int[] datos = new int[10];
        int[] datosselection = new int[10];
        int[] insertionSort = new int[10];
        int[] bublleSort = new int[10];
        int[] datosquick = new int[10];
        
        llenar(datos);
        imprimir(datos);
        copiar(datos, datosselection);
        
        long ini = System.nanoTime();
        selectionSort(datosselection);
        System.out.println("selection sort;");
        long fin = System.nanoTime();
        //tiempo = fin - ini;
        imprimir(datosselection);
        
        long tiempo;
        //long ini = System.nanoTime();
        insertionSort(insertionSort);
        //long fin = System.nanoTime();
        tiempo = fin - ini;
        System.out.println("selection sort;" + tiempo);
        imprimir(insertionSort);
        //long ini = System.nanoTime();
        bubbleSort(bublleSort);
        System.out.println("selection sort;");
        //long fin = System.nanoTime();
        
        
        ini = System.nanoTime();
        quicksort(datosquick);
        fin = System.nanoTime();
        imprimir(datosquick);
    }
    
    public static void llenar(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) ( Math.random() * 100);
        }
    }
    
    public static void copiar(int[] origen, int[] destino){
        for (int i = 0; i < origen.length; i++) {
            destino[i] = origen[i];
        }
    }
    public static void imprimir(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }
        System.out.println("");
    }    
    
    public static void selectionSort(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            int min = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if(arreglo[j] < arreglo[min])
                    min = j;
            }
            if(min != i){
            int temp = arreglo[i];
            arreglo[i] = arreglo[min];
            arreglo[min] = temp;
            }
        }
    }
    
    public static void insertionSort(int[] arreglo){
        for (int i = 1; i < arreglo.length; i++) {
            int temp = arreglo[i];
            int insP = i;
            for (int prev = i - 1; prev >= 0; prev--) {
                if(arreglo[prev] > temp){
                    arreglo[insP] = arreglo[prev];
                    insP--;
                }else
                    break;
            }
            arreglo[insP] = temp;
        }
    }
    
    public static void bubbleSort(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < (arreglo.length - 1); j++) {
                if(arreglo[j] > arreglo[j + 1]){
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }
    
    public static void quicksort(int[] arreglo){
        quicksortpriv(arreglo, 0, arreglo.length - 1);
    }
    
    private static void quicksortpriv(int[] arreglo, int ini, int fin){
        int pivote, too_big, too_small;
        pivote = ini;
        too_big = ini;
        too_small = fin;
        if(ini < fin){
            while(too_big < too_small){
                while(arreglo[too_big] <= arreglo[pivote] && too_big < too_small){
                    too_big++;
                }
                while(arreglo[too_big] > arreglo[pivote]){
                    too_small--;
                }
                if(too_big < too_small){
                    int temp = arreglo[too_big];
                    arreglo[too_big] = arreglo[too_small];
                    arreglo[too_small] = temp;
                }
            }
            int temp = arreglo[pivote];
            arreglo[pivote] = arreglo[too_small];
            arreglo[too_small] = temp;
            pivote = too_small;
            quicksortpriv(arreglo, ini, pivote - 1);            
            quicksortpriv(arreglo, pivote + 1, fin);
        }
    }
}
