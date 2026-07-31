import java.util.Scanner;
public class ElectricityBillCategory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Electricity Units: ");
        int electricityUnits=sc.nextInt();
        if(electricityUnits<0){
            System.out.println("Invalid Units");
        }
        else if(electricityUnits<=100){
            System.out.println("Low Usage");
        }else if(electricityUnits<=200){
            System.out.println("Medium Usage");
        }else if(electricityUnits<=300){
            System.out.println("High Usage");
        }else{
            System.out.println("Very High Usage");
        }
        sc.close();

    }
}
