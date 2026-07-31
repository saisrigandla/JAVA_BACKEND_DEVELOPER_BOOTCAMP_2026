import java.util.Scanner;
public class CollegeAdmissionEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Student's Marks: ");
        int marks=sc.nextInt();
        System.out.print("Enter Student's Age: ");
        int age=sc.nextInt();
        System.out.print("Does Student have Sports quota? ");
        boolean sportsQuota=sc.nextBoolean();
        if(marks<0||marks>100){
                System.out.println("Invalid marks");
            }
        else if(age<17){
                System.out.println("Age is not Eligible");
            }
        else if((marks>=75)||(marks>=60&&sportsQuota)){
            System.out.println("Eligible for Admission");
        }
        else{
            System.out.println("Not Eligible for Admission");
        } 
        sc.close();
    }
        
}
