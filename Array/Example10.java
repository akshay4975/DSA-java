//find consecutive numbers in an array
class Example10{
public static void main(String[] args) {
    
    int arr[]={6,5,33,33,11,77,88,88};
    
    for(int i=0;i<arr.length-1;i++){
        if(arr[i]==arr[i+1]){
            System.out.println("consecutive numbers:"+arr[i]);
        }
    }
   
}
}
