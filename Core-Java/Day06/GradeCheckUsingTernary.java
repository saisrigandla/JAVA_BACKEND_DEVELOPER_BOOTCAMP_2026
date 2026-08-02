import java.util.Scanner;
public class GradeCheckUsingTernary {
     public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Your Marks: ");
        int marks = sc.nextInt();
        String result = 
        (marks<0||marks>100)?"Invalid Marks":
        (marks>=90)?"A Grade":
        (marks>=75)?"B Grade":
        (marks>=60)?"C Grade":
        (marks>=35)?"Pass":
        "Fail";
        System.out.println(result);
        sc.close();
    }
}
