import java.util.Scanner;
public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before Swap");
        System.out.println(a);
        System.out.println(b);
        System.out.println("After Swap");
        int temp =a ;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
        sc.close();
    }
}
