/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication35;

public class ArrayGenerator {
    int i=0;
    int cantidad = 100;
    int rango = 140;
    String view = "";
    //0 1 1 2 3 5 8 13 21 34 55 89 144 233 377

    public String getResult(){
        int arreglo[] = new int[cantidad];
        arreglo[i]=(int)(Math.random()*rango);
        i = 1;
        do{
            arreglo[i]=(int)(Math.random()*rango);
            for(int j=0; j<i; j++){
                if(arreglo[i]==arreglo[j]||arreglo[i]==0||arreglo[i]==1
                        ||arreglo[i]==2||arreglo[i]==3||arreglo[i]==5||
                        arreglo[i]==8||arreglo[i]==13||arreglo[i]==21||arreglo[i]==34
                        ||arreglo[i]==55||arreglo[i]==89){
                    i--;
                }
            }
            view = view + arreglo[i] + " ";
            i++;
        }while(i<cantidad);
        return view;
    }
    
    @Override
    public String toString(){
        return getResult();
    }
}
