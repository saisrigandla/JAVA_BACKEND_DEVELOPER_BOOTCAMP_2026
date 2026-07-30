
import java.util.Scanner;

public class ShoppingBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int productPrice1 = sc.nextInt();
        int productPrice2 = sc.nextInt();
        int productPrice3 = sc.nextInt();
        int totalBill = productPrice1+productPrice2+productPrice3;
        float average = totalBill/3f;
        System.out.println();
        System.out.println("Total = "+totalBill);
        System.out.println("Average = "+average);
        sc.close();
    }
}
