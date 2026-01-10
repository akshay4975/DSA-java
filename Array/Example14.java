//prefix array
import java.util.Scanner;
class PrefixArray{
    Scanner sc=new Scanner(System.in);
    public void prefixArray(int arr[]){
        int preArr[]=new int[arr.length];
        preArr[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            preArr[i]=arr[i]+preArr[i-1];
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(preArr[i]);
        }
        System.out.print("Enter Number of Queries");
        int q=sc.nextInt();
        int sum=0;
        for(int i=0;i<q;i++){
            System.out.print("Enter the starting index:");
            int start=sc.nextInt();
            System.out.print("Enter the Ending index:");
            int end=sc.nextInt();
            if(preArr[start]==0){
                sum=preArr[end];
            }
            else{
            sum=preArr[end]-preArr[start-1];
         
        }
            System.out.println("sum is:"+sum);
        
        }
        
   
    }

}

public class Example14 {
    public static void main(String[] args) {
        int arr[]={-3,6,2,4,5,2,8,-9,3,1};
        PrefixArray obj=new PrefixArray();
        obj.prefixArray(arr);
        
    }
}
