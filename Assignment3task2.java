/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment3task2;
import java.util.Scanner;
public class Assignment3task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a word: ");
        String word = input.nextLine();
        
        System.out.println("Please choose the case you want to convert: \n 1.'l' or 'L' for lowercase \n 2.'u' or 'U' for upprecase \n 3.'t' or 'T' for titlecase");
        String type = input.nextLine();
        
        String Upper = upper(word);
        String Title = title(word);
        String Lower = lower(word);
        
        
        System.out.printf("%-37s:%s\n", "Original word:", word );
        System.out.println("Calling the first convertCase method :" +Title);
                
        switch(type){
            case "U":
                System.out.println("Calling the second convertCase method:" +Upper);break;
            case "L":
                System.out.println("Calling the second convertCase method:" +Lower);break;
            case "T":
                System.out.println("Calling the second convertCase method:" +Title);break;
            case "u":
                System.out.println("Calling the second convertCase method:" +Upper);break;
            case "l":
                System.out.println("Calling the second convertCase method:" +Lower);break;
            case "t":
                System.out.println("Calling the second convertCase method:" +Title);break;
        }
        
        
    }
    public static String lower(String word){
        String lowerword = (word.toLowerCase());
        return lowerword;
    }
    public static String upper(String word){
        String upperword = (word.toUpperCase());
        return upperword;
    }
    public static String title(String word){
        String firstupper = word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
        return firstupper;
    }
}
