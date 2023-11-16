package programme_1_calculate;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //declaring a scanner object
        Scanner sc = new Scanner(System.in);
        String answer;
        do{
            System.out.println("Please first number: "); //input wizard
            int a = sc.nextInt();
            System.out.println("Please second number: "); //input wizard
            int b = sc.nextInt();
            System.out.println("Please enter one of symbol +,-,*,/ :"); //input wizard
            char symbol = sc.next().charAt(0);
            Calculator calculator = new Calculator();
            calculator.calculateResult(a,b,symbol);
            System.out.println("Would you like to do more calculation. Please enter 'y' or 'n' :"); //input wizard
            answer = sc.next().toLowerCase(Locale.ROOT);
        }
        while(answer.startsWith("y"));
        //closing a scanner
        sc.close();
    }
}
