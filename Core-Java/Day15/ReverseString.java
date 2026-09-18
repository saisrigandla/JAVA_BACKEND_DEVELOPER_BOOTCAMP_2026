public class ReverseString {
    public static void main(String[] args) {
        String ogname = "SAAS";
        String revname ="";

        for (int i = ogname.length() - 1; i >= 0; i--){
            revname=revname+ogname.charAt(i);
            
        }
        System.out.print(revname);
        if (ogname.equals(revname)){
            System.out.println(" is palindrome");
        }else{
            System.out.println(" is not a palindrome"); 
            
        }
       
}
}


