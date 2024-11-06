/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment3task1;
import java.util.Scanner;
public class Assignment3task1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter two numbers, separated by space:  ");
        String num = input.nextLine();
        
        System.out.print("Please enter he operatoe (+,-,*,or /): ");
        char op = input.nextLine().charAt(0);
        
        System.out.print("Please enter a formular, e.g:(3.14 * 2): ");
        String form = input.nextLine();
        
        double num1 = Double.parseDouble(num.substring(0,num.indexOf(' ')+1));
        double num2 = Double.parseDouble(num.substring(num.indexOf(' ')+1));
        
        double total = calcResult(num1,num2);
        double total2 = calcResult2(num1,num2,op);
        double total3 = calcResult3(form);
        
        System.out.println("Calling the first method :"+ num1 + "+" + num2 + "="+" "+ total);
        System.out.println("Calling the second method:"+ num1 + op + num2 + "="+ " " + total2);
        System.out.println("Calling the third method :"+ form + "="+ " " + total3);
    }
    public static double calcResult(double num1,double num2){
            double result = num1 + num2;
            return result;
    }
    public static double calcResult2(double num1, double num2,char oper){
        switch(oper){
            case '+':
                return num1+ num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1/num2;
            default:
                System.out.println("Incorrect Operator");
                return 0;
            
        }
    }
    public static double calcResult3(String formula){
        double num1 = Double.parseDouble(formula.substring(0,formula.indexOf(' ')));
        char op = formula.charAt(formula.indexOf(' ')+1);
        double num2 = Double.parseDouble(formula.substring(formula.indexOf(' ')+3));
        switch(op){
            case '+':
                return num1+ num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1/num2;
            default:
                System.out.println("Incorrect Operator");
                return 0;
        }
    }
}
