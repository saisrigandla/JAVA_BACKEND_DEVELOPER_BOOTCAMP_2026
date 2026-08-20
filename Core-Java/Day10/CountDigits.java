//import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        //Scanner sc = new Scanner (System.in);
        //System.out.print("enter a number: ");
        //int n= sc.nextInt();
        int n = 507535;
        int count= 0;
        int rev = 0;
       for(int i =0; i<=n; i++){
        int rem = n%10;
        rev=rev*10+rem;
        n=n/10; 
        rev++;
         count++;
       }
         System.out.println(count);
    }
}
