import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextInt();
        double pi = 3.14;
        if(radius>=0){
        System.out.println("Area of a Circle : "+3.14*radius*radius);
        System.out.println("Circumference of a Circle : "+2*pi*radius);
    }else{
        System.out.println("Negative radius is not accepted!");
    }
    sc.close();
}

}
