import java.util.Scanner;
public class CompareInput {
   public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    String input ="";
    while (!input.equalsIgnoreCase("exit")) {
      System.out.println("Enter something or just enter exit");  
      input = sc.nextLine();
    }
    sc.close();
   } 
}
