//Average of an array
class Example5{
public static void main(String[] args) {
    
    int arr[]={6,5,33,22,11,77,88};
    int sum=0;
    for(int i=0;i<arr.length;i++){
        sum+=arr[i];
    }
    double avg=sum/arr.length;
    System.out.println("Average of an array is:"+avg);
}
}
