import java.util.Scanner;
public class Prime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        boolean isPrime=true;
        for(int i =2; i<n; i++)
        {
         if(n%i==0){
                isPrime=false;
                break;
            }
           
        }
        if(isPrime) {
            System.out.println(n +" - Prime");
        }else{
            System.out.println(n +" - Not a Prime");
        }
        
             sc.close();
        } 
        
      
            
    }
       
