import java.util.Scanner;
public class LoanEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter borrowers Age: ");
        int age = sc.nextInt();
        System.out.print("Enter borrowers monthly salary:");
        int monthlySalary = sc.nextInt();
        System.out.print("Enter borrowers credit score:");
        int creditScore=sc.nextInt();
            if((age>=21)&&(monthlySalary>=25000)&&(creditScore>=700)){
                System.out.println("Eligible for Loan");
            }else{
                System.out.println("Not Eligible for Loan");
            }
            sc.close();
    }

}