import java.util.Scanner;
public class LargestOfThreeNumbersUsingTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number A : ");
        int a = sc.nextInt();
        System.out.print("Enter a number B : ");
        int b = sc.nextInt();
        System.out.print("Enter a number C : ");
        int c = sc.nextInt();
        String result=
        (a>b&&a>c)?"A is greatest among A,B & C"
        :(b>a&&b>c)?"B is greatest among A,B & C"
        :(c>a&&c>b)?"C is greatest among A,B & C"
        :(a==b&&b==c)?"A,B & C are equal and Greatest"
        :(a==b)?"A & B are Greatest among A,B & C and A&B are equal"
        :(b==c)?"B & C are Greatest among A,B & C and B&C are equal"
        :(a==c)?"A & C are Greatest among A,B & C and A&C are equal"
        :"All are equal";
    System.out.println(result);
    sc.close();
    }
}
