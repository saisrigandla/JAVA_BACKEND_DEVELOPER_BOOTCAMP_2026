import java.util.Scanner;
public class LargestOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b&&a>c){
            System.out.println("a is Largest among three numbers");
        }
        else if(b>a&&b>c){
            System.out.println("b is Largest among three numbers");
        }
         else if(c>a&&c>b){
            System.out.println("c is Largest among three numbers");
        }
        else if(a==b&&b==c){
            System.out.println("a, b & c are Largest among three numbers");
        }
        else if(a==b){
            System.out.println("a, b are Largest among three numbers");
        }
        else if(b==c){
            System.out.println("b, c are Largest among three numbers");
        }
        else if(a==c){
            System.out.println("a, c are Largest among three numbers");
        }
        else{
            System.out.println("a, b, & c are Largest");
        }
        sc.close();
    }
}
