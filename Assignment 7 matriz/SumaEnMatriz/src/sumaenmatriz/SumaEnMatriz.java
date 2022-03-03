/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumaenmatriz;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class SumaEnMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number = 0;
        int number1 = 0;
        int number2 = 0;
        int matrizNumber;
        int sum_fila = 0;
        int sum_columna = 0;
        int sum_diagonal = 0;
        int sum_diagonalinv = 0;
        System.out.println("Digite el numero para fila y columna de la matriz: ");
        Scanner entryNumber = new Scanner(System.in);
        matrizNumber = entryNumber.nextInt();
        int matriz[][] = new int[matrizNumber][matrizNumber];
        for(int i=0; i<matrizNumber;i++){
            for(int j=0; j<matrizNumber; j++){
                Scanner entry = new Scanner(System.in);
                System.out.println("Digite un numero para la matriz: ");
                number = entry.nextInt();
                matriz[j][i] = number;
            }
        } 
    // PARA FILA
    while(number1==0 || number1 > matrizNumber){
        System.out.print("Digite el numero de fila para sumar: ");
        Scanner NumberFila = new Scanner(System.in);
        number1 = NumberFila.nextInt();
    }
    for(int i=0; i<matrizNumber;i++){
        sum_fila += matriz[i][number1-1];
    }
// PARA COLUMNA
    while(number2==0 || number2 > matrizNumber){    
        System.out.print("Digite el numero de columna para sumar: ");
        Scanner NumberColumna = new Scanner(System.in);
        number2 = NumberColumna.nextInt();
    }
    for(int i=0; i<matrizNumber;i++){
        sum_columna += matriz[number2-1][i];
    }
    // PARA DIAGONAL
    for(int i=0; i<matrizNumber; i++){
        sum_diagonal += matriz[i][i];
    }
    // PARA DIAGONAL INVERTIDA
    number = matrizNumber-1;
    
    for(int i=0; i<matrizNumber; i++){
        sum_diagonalinv += matriz[number-i][i];
      
    }
     System.out.println("La suma de la fila es: "+sum_fila);
     System.out.println("La suma de la columna es: "+sum_columna);
     System.out.println("La suma de la diagonal es: "+sum_diagonal);
     System.out.println("La suma de la diagonal invertida es: "+sum_diagonalinv);
    }
    
}
