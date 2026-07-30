import java.util.Scanner;
public class IsPassOrFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the Marks:");
        int studentMarks=sc.nextInt();
        if(studentMarks>=35){
            System.out.println("You are Passed!");
        }else{
            System.out.println("You are Failed!\nTry Again best results are ahead!!\nAll the Best!!!\n:)");
        }

    }
}
