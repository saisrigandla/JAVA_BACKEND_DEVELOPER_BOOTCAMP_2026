import java.util.Scanner;
public class PrintEvenNumUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int i = 1;
        System.out.print("Enter a number: ");
        int n = sc .nextInt();
        while(i<=n){
            if(i%2==0){
                System.out.println(i);
            }
            i++;
        }
        sc.close();
    }
}
