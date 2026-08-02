import java.util.Scanner;
public class VotingEligibilityUsingTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Your Age: ");
        int age = sc.nextInt();
        String result = 
        (age>=18)?"Eligible to Vote":
        (age<0)?"Invalid Age":
        "Not Eligible to Vote";
        System.out.println(result);
        sc.close();
    }
}
