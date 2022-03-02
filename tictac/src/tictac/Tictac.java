/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tictac;

/**
 *
 * @author fundacion
 */
import java.util.Scanner;
public class Tictac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] board = {"_","_","_","_","_","_","_","_","_"};
        int turn = 0;
        do {
            showboard(board);
            String ficha = turn%2==0? "X":"0";
            Player(ficha, board);
            turn++;
        }while(true);        
    }
    static void showboard(String[] board){
        System.out.println(board[0] + " " + board[1] + " " + board[2]);
        System.out.println(board[3] + " " + board[4] + " " + board[5]);
        System.out.println(board[6] + " " + board[7] + " " + board[8]);
    }
    
    static void Player(String ficha, String[] board){
        System.out.println("COloca una marca jugador " + ficha);
        Scanner play = new Scanner(System.in);
        int posicion = play.nextInt();
        board[posicion] = ficha;
    }
}
