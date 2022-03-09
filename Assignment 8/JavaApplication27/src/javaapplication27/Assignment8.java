/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication27;

/**
 *
 * @author Personal
 */
public class Assignment8 {
    Assignment8(String input){
        String[] oracion;
        oracion = input.split(" ");
        for(int i=0; i< oracion.length; i++){
            String palabra = oracion[i];
            String auxstr = "";
            String res = ""+palabra.charAt(0);
            for(int j=1; j < palabra.length()-1; j++){
                auxstr = auxstr + palabra.charAt(j);
            }
            while(auxstr.length()>0){
                int min_val = 0;
                int max_val = auxstr.length();
                double randomNum = Math.random() * ( max_val - min_val );
                int valor = (int)randomNum;
                res = res + auxstr.charAt(valor);
                auxstr = auxstr.substring(0, valor) + auxstr.substring(valor+1);
            }
            res = res + palabra.charAt(palabra.length()-1);
            oracion[i] = res;
        }
        for (int i=0; i<oracion.length; i++){
            System.out.println(oracion[i]);
        }
    }
}
// for palabraas // for sacar caracteres del medio, // for desordenar