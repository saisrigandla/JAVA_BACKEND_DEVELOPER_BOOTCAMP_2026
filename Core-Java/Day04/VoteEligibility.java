import java.util.Scanner;
public class VoteEligibility{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Checking Vote Eligibility");
        System.out.println("-------------------------");
        System.out.print("Input: ");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("Eligible to Vote");
        }else{
            System.out.println("Not Eligible to Vote");
        }
    }
}