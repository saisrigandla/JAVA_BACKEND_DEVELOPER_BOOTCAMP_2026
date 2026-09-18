public class FindNum{
    public static void main(String[] args) {
        int arr[] = {1,3,5,8,10,16,1,1};
        int add=0;
        for(int i = 0; i<arr.length;i++){
            if((arr[i]%2==0)||(arr[i]%3==0)){
            add=add+1;
            }
            }
            System.out.println(add);
            
            
        }
    }
    
    

