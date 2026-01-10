//count even and odd numbers in an array
class Example7{
public static void main(String[] args) {
    
    int arr[]={6,5,33,22,11,77,88};
  int evenCnt=0;
  int oddCnt=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]%2==0){
            evenCnt++;
        }
        else{
            oddCnt++;
        }
    }
    System.out.println("Even Elements in an array is:"+evenCnt);
    System.out.println("Odd Elements in an array is:"+oddCnt);
}
}
