import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Salary: ");
        int salary = sc.nextInt();
        System.out.print("Enter Employee Experience: ");
        int experience = sc.nextInt();
        if(salary<=50000){
            if(experience>=2){
                System.out.println("Eligible for bonus");
            }
            else{
                System.out.println("Not Eligible for Bonus");
            }
        }else{
            System.out.println("Not Eligible for Bonus");
        }
        sc.close();

    }
}
