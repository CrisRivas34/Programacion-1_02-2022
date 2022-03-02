/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercice7;

/**
 *
 * @author fundacion
 */
import java.util.Scanner;
public class Exercice7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number;
        int matrizNumber;
        int sum_fila = 0;
        int sum_columna = 0;
        int sum_diagonal = 0;
        int sum_diagonalinv = 0;
        System.out.print("Digite el numero para fila y columna de la matriz");
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
    System.out.print("Digite el numero de fila para sumar");
    Scanner NumberFila = new Scanner(System.in);
    number = NumberFila.nextInt();
    
    for(int i=0; i<matrizNumber;i++){
        sum_fila += matriz[i][number-1];
    }
// PARA COLUMNA
    System.out.print("Digite el numero de columna para sumar");
    Scanner NumberColumna = new Scanner(System.in);
    int number2 = NumberColumna.nextInt();
    
    for(int i=0; i<matrizNumber;i++){
        sum_columna += matriz[number2-1][i];
    }
    // PARA DIAGONAL
    for(int i=0; i<matrizNumber; i++){
        sum_diagonal += matriz[i][i];
        System.out.println("xd");
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
