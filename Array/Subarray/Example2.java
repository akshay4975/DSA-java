//find sum of all elements in an subarray

import java.util.Scanner;
class Example2{
    public static void main(String []args){
        int arr[]={4,2,10,3,12,-2,15};
        SubArray obj=new SubArray();
        int sum=obj.subArray(arr);
           System.out.println("Sum of a subarray is:"+sum);
    }
}
class SubArray{
    Scanner sc=new Scanner(System.in);
    int sum=0;
public int subArray(int arr[]){
    int startIndex=sc.nextInt();
    int endIndex=sc.nextInt();
    for(int i=startIndex;i<=endIndex;i++){
        System.out.print(arr[i]+",");
        sum+=arr[i];
     

    }System.out.println("");



return sum;
}   


}
