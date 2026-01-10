//product of all elements in an array
class Example6{
public static void main(String[] args) {
    
    int arr[]={6,5,33,22,11,77,88};
    int prod=1;
    for(int i=0;i<arr.length;i++){
        prod*=arr[i];
    }
    System.out.println("Product of all elements in an array is:"+prod);
}
}
