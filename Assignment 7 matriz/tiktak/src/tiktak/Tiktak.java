/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiktak;

/**
 *
 * @author Personal
 */
import java.util.Scanner;
public class Tiktak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] board = {"_","_","_","_","_","_","_","_","_"};
        int turn=0;
        boolean win=false;
        do{
            showBoard(board);
            String ficha = turn%2==0? "X":"O";
            playing(ficha, board);
            win = evaluateWin(board, ficha);
            turn++;
        }while(!win);
    }
    public static void showBoard(String[]board){
        System.out.println(board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println(board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println(board[6] + " | " + board[7] + " | " + board[8]);
    }
    public static void playing(String ficha, String[] board){
        System.out.println("Turno de jugador " + ficha);
        Scanner entrada = new Scanner(System.in);
        int posicion = entrada.nextInt();
        while(posicion>8 || !board[posicion].equals("_")){
            System.out.println("No es posible jugar en esa posicion");
            entrada = new Scanner(System.in);
            posicion = entrada.nextInt();
        }
        board[posicion] = ficha;
    }
    public static boolean evaluateWin(String board[], String ficha){
        if(board[0].equals(board[1]) && board[0].equals(board[2]) && !board[0].equals("_")){
            showBoard(board);
            System.out.println("El jugador " + ficha + " gana");
            return true;
        }else if(board[3].equals(board[4]) && board[3].equals(board[5]) && !board[3].equals("_")){
            showBoard(board);
            System.out.println("El jugador " + ficha + " gana");
            return true;
        }else if(board[6].equals(board[7]) && board[6].equals(board[8]) && !board[6].equals("_")){
            showBoard(board);
            System.out.println("El jugador " + ficha + " gana");
            return true;
        }else if(board[0].equals(board[3]) && board[0].equals(board[6]) && !board[0].equals("_")){
            showBoard(board);
            System.out.println("El jugador " + ficha + " gana");
            return true;
        }else if(board[1].equals(board[4]) && board[1].equals(board[7]) && !board[1].equals("_")){
            showBoard(board);
            System.out.println("El jugador " + ficha + " gana");
            return true;
        }else if(board[2].equals(board[5]) && board[2].equals(board[8]) && !board[2].equals("_")){
            showBoard(board);
            System.out.println("El jugador " + ficha + " gana");
            return true;
        }else if(board[0].equals(board[4]) && board[0].equals(board[8]) && !board[0].equals("_")){
            showBoard(board);
            System.out.println("El jugador " + ficha + " gana");
            return true;
        }else if(board[2].equals(board[4]) && board[2].equals(board[6]) && !board[2].equals("_")){
            showBoard(board);
            System.out.println("El jugador " + ficha + " gana");
            return true;
        }
           return false; 
    }
}
