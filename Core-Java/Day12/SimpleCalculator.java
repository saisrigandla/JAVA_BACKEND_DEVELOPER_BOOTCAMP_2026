import java.util.Scanner;
public class SimpleCalculator {
        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            double a = 3;
            double b = 0;
            char operator = sc.next().charAt(0);
            switch(operator) {
                case '+':
                    System.out.println(a+b);
                    break;
                case '-':
                    System.out.println(a-b);
                    break;
                case '*':
                    System.out.println(a*b);
                    break;
                case '/':
                    if(b!=0){
                        System.out.println(a/b);
                    }else{
                        System.out.println("cannot divide by zero");
                    }
                case '%':
                    System.out.println(a%b);
                    
                    break;
                default:
                    System.out.println("Invalid number");
            }
            sc.close();
        }
}
