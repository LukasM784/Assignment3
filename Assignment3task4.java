/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment3task4;
import java.util.Scanner;
import java.util.Random;
public class Assignment3task4 {
    public static void main(String[] args) {
        int heads = 0;
        int tails = 0;
        while(true){
            Scanner input = new Scanner(System.in);
            System.out.print("1. Toss Coin\n2.Exit\nChoice: ");
            int choice = input.nextInt();
            
            boolean coinflip = flip();
            if (choice == 2){
                break;
            }
            
            else{
                if (coinflip == false){
                    heads ++;
                }
                if (coinflip == true){
                    tails++;
                }
            }
            
            System.out.println("Heads:"+heads+", Tails:"+ tails);
        }
    }
    public static boolean flip(){
        Random coin = new Random();
        boolean flip = coin.nextBoolean();
        return flip;
    }
    
}
