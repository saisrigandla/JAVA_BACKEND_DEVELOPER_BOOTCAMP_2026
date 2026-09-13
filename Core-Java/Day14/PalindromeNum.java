public class PalindromeNum {
    public static void main(String[] args) {
int num = 535;
int org=num;
int rev=0;
for(int i=1; i<=num; i++){
    int rem = num%10;
    rev = rev*10+rem;
    num=num/10;
}
if(org==rev){
    System.out.println("Palindrome");
}else{
    System.out.println("Not Palindrome");
}
}}