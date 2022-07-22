
import java.util.Scanner;

public class main {
    public static void main(String args[]) {
        double firstNum, secondNum;
        String operator;
        System.out.println("Enter the 2 numbers\n");
        Scanner s = new Scanner(System.in);
        firstNum = s.nextDouble();
        secondNum = s.nextDouble();
        System.out.println("Enter the operator\n");
        operator = s.next();
        double result = 0.0;
        if (operator.equals("+")) {
            result = firstNum + secondNum;
            System.out.println("The result of " + firstNum + " and " + secondNum + " is " + result);
        } else if (operator.equals('-')) {
            result = firstNum - secondNum;
            System.out.println("The result of " + firstNum + " and " + secondNum + " is " + result);
        } else if (operator.equals("*")) {
            result = firstNum * secondNum;
            System.out.println("The result of " + firstNum + " and " + secondNum + " is " + result);
        } else if (operator.equals("/")) {
            if (secondNum == 0)
                System.out.println("Cannnot divide by zero\n");
            else
                result = firstNum / secondNum;
            System.out.println("The result of " + firstNum + " and " + secondNum + " is " + result);
        }

    }
}
