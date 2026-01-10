//search elements in an array

import java.util.*;

class FindNumber{
    public boolean findNumber(int arr[],int k){
       boolean flag=false;
                for(int i=0;i<arr.length;i++){
                        if(arr[i]==k){
                            return true;
                        }
                      
                }return false;

    } 
    

}


class Example1{
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8};
        int k;
        Scanner sc=new Scanner(System.in);
    
        System.out.println("Enter a number to find in an array:");
        k=sc.nextInt();
        FindNumber obj=new FindNumber();
       boolean result= obj.findNumber(arr, k);
        
                if(result){
                    System.out.println("number is found in an array"); }
                    else{
                            System.out.println("number is not in an array");
                    }


    }
}

