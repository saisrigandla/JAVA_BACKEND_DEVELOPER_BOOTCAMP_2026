import java.util.Scanner;
public class CalculatorUsingTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter First Number: ");
        double firstNumber = sc.nextDouble();
        System.out.print("Enter Operator to perform an operation:");
        char operator = sc.next().charAt(0);
        System.out.print("Enter Second Number: ");
        double secondNumber= sc.nextDouble();
        switch(operator){
            case '+' :
                System.out.println("Result = "+(firstNumber+secondNumber));
                break;
            case '-' :
                System.out.println("Result = "+ (firstNumber-secondNumber));
                break;
            case '*' :
                System.out.println("Result = "+(firstNumber*secondNumber));
                break;
            case '/' :
                System.out.println("Result = "+(firstNumber/secondNumber));
                break;
            case '%' :
                System.out.println("Result = "+(firstNumber%secondNumber));
                break;
            default:
                System.out.println("Invalid Operator");
            
        }
        sc.close();

    }
}
