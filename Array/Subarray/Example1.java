//print all values of a subarray

import java.util.Scanner;
class Example1{
    public static void main(String []args){
        int arr[]={4,2,10,3,12,-2,15};
        SubArray obj=new SubArray();
        obj.subArray(arr);
    }
}
class SubArray{
    Scanner sc=new Scanner(System.in);
public void subArray(int arr[]){
    int startIndex=sc.nextInt();
    int endIndex=sc.nextInt();
    for(int i=startIndex;i<=endIndex;i++){
        System.out.print(arr[i]+",");

    }System.out.println("");

}


}
