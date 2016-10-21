/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema15;
import java.util.*;
/**
 *
 * @author Miguel
 */
public class PP2Problema15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] arr = new int [10][10];        //Declaracion de un arreglo de 10x10
      
        System.out.println(arr.length);     //Declaracion de metodos
        arr=llenarArreglo(arr);
        mostrarArreglo(arr);
    }
    public static int[][]  llenarArreglo(int [][] a){   //Metodo que llena el arreglo de manera aleatoria
        Random rnd = new Random();                      //Se utilizo la funcion "Random" y dos ciclos for para recorrer el arreglo
        for(int i=0; i<10;++i){
            for (int j=0; j<10;++j){
                a[i][j]= (int)(rnd.nextFloat()*10+0);
            }
        }  
        return a;
         }

    
    public static void mostrarArreglo(int[][]a){        //Metodo que devuelve la matriz generada de manera aleatoria, así como las sumas de cada 
                                                        //fila y columna. Se utilizaron ciclos for para llegar al resultado.
        for(int i=0; i<10;++i){System.out.print("\n");
             int sumah=0;    
          for (int j=0; j<10;++j){  
                sumah= sumah+a[i][j];
                System.out.print("[ "+  a[i][j]  +" ]");}
          System.out.print("suma: "+sumah);                       
        } 
            
        System.out.print("\n");
        for(int i=0; i<10;++i){
             int sumav=0;              
          for (int j=0; j<10;++j){  
                sumav= sumav+a[j][i];}
            System.out.print("[s"+  sumav  +"]");
            
        }
        System.out.print("\n");
    System.out.println("*Los datos con la s al inicio son la sumatoria de la correspondiente columna");
    }}