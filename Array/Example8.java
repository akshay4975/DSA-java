//count positive,negative and zero numbers in an array
class Example8{
public static void main(String[] args) {
    
    int arr[]={6,5,33,-22,11,-77,88,0};
  int positiveCnt=0;
  int negativeCnt=0;
  int zeroCnt=0;
    for(int i=0;i<arr.length;i++){
       if(arr[i]>0){
        positiveCnt++;
       }
       else if(arr[i]<0){
        negativeCnt++;
       }
       else{
        zeroCnt++;
       }
    }
    System.out.println("Positive Elements in an array is:"+positiveCnt);
    System.out.println("negative Elements in an array is:"+negativeCnt);
    System.out.println("negative Elements in an array is:"+zeroCnt);
}
}
