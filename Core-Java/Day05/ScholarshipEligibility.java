import java.util.Scanner;
public class ScholarshipEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Student's Marks: ");
        int studentMarks=sc.nextInt();
        System.out.print("Enter Student's Family Income: ");
        int familyIncome=sc.nextInt();
        if((studentMarks>=90)||(studentMarks>=75&&familyIncome<=200000)){
            System.out.println("Eligible for Scholarship");
        }else{
            System.out.println("Not Eligible for Scholarship");
        }
        sc.close();
    }
}
