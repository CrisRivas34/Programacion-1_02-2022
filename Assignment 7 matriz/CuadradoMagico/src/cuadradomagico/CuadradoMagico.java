/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuadradomagico;

/**
 *
 * @author Personal
 */
import java.util.Scanner;
public class CuadradoMagico {

    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args) {
        System.out.println("Digite el tamaño del cuadrado magico:");
        Scanner entrada = new Scanner(System.in);
        int numeroMatriz = entrada.nextInt();
        while(numeroMatriz%2==0){
            System.out.println("No es posible usar un par");
            entrada = new Scanner(System.in);
            numeroMatriz = entrada.nextInt();
        }
        int matriz[][] = new int[numeroMatriz][numeroMatriz];
        int fila=0;
        int columna = numeroMatriz/2;
        int iterador=1;
        int filaCopia,columnaCopia;
        while(iterador <= numeroMatriz*numeroMatriz){
            matriz[fila][columna]=iterador;
            iterador++;
            filaCopia = fila;
            columnaCopia = columna;
            fila = fila-1;
            columna = columna+1;
            if(fila==-1){
                fila = numeroMatriz-1;
            }
            if(columna==numeroMatriz){
                columna=0;
            }
            if(matriz[fila][columna]!=0){
                fila=filaCopia+1;
                columna=columnaCopia;
            }
        }
        for(int i=0; i<numeroMatriz; i++){
            for(int j=0; j<numeroMatriz; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
