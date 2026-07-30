import java.util.Scanner;
public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks=sc.nextInt();
        if(marks>100||marks<0){
            System.out.println("Invalid Marks");
        }
        else if(marks>=90){
            System.out.println("A Grade");
        }
        else if(marks>=75){
            System.out.println("B Grade");
        }
        else if(marks>=60){
            System.out.println("C Grade");
        }
        else if(marks>=35){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
        sc.close();
    }
}
