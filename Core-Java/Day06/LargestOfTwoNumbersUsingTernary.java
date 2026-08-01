import java.util.Scanner;
public class LargestOfTwoNumbersUsingTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter First number: ");
        int firstNumber = sc.nextInt();
         System.out.print("Enter Second number: ");
        int secondNumber = sc.nextInt();
        String result = 
        (firstNumber>secondNumber)?"First Number is greater":(secondNumber>firstNumber)?"Second Number is greater":"Both numbers are equal";
        System.out.println(result);
        sc.close();

    }
}
