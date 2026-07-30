
import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int initialBalance = sc.nextInt();
        int deposit = sc.nextInt();
        int newBalance=initialBalance+deposit;
            System.out.println("Initial Balance : "+initialBalance);
            System.out.println("Deposit : "+deposit);
            System.out.println();
            System.out.println("New Balance : "+newBalance);
    sc.close();
}
}