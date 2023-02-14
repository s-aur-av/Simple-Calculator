package Saurav;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Take input from user till user does not press X or x
        int ans = 0;
        while(true){

            // Take Operator as input
            System.out.print("Enter the operator: ");
            char op = in.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                
                //Input two numbers
                
                System.out.print("Enter the first number: ");
                int num1 = in.nextInt();
                System.out.print("Enter the second number: ");
                int num2 = in.nextInt();

                if (op == '+'){
                    ans = num1 + num2;
                } 
                if (op == '-'){
                    ans = num1 + num2;
                }
                if (op == '*'){
                    ans = num1 + num2;
                }
                if (op == '/'){
                    if (num1 != 0){
                    ans = num1 + num2;
                    }
                }
                if (op == '%'){
                    ans = num1 % num2;
                }
            

            } else if (op == 'x' || op == 'X'){
                break;
            } else {
                System.out.println("Invalid Operation");
        }

            System.out.println(ans);


        }
    }
}
