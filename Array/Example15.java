//carryforwars or prefix sum:finding maximum element upto entered last index.
import java.util.Scanner;
class MaxElement{
    Scanner sc=new Scanner(System.in);
    public void maxElement(int arr[]){
        int []preArr=new int[arr.length];
        preArr[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>preArr[i-1]){
                preArr[i]=arr[i];
            }else{
                preArr[i]=preArr[i-1];
            }
        }
         for(int i=0;i<arr.length;i++){
            System.out.print(preArr[i]);
           //3,4,5,5,5,7,9,9
        }
        System.out.println("Enter number of queries:");
        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            System.out.print("Enter the last index:");
            int lastIndex=sc.nextInt();
            int maxEle=preArr[lastIndex];
    System.out.println("Maximum element upto this index is :"+maxEle);
            // return maxEle;
        }

    // return -1;
    }
}
public class Example15 {
    public static void main(String[] args) {
        int arr[]={3,4,5,1,2,7,9,8};
       MaxElement obj= new MaxElement();
       obj.maxElement(arr);
    //    System.out.println("Maximum element upto this index is :"+op);

    }
    
}

