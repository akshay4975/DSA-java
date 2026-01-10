// Reverse the array
// class Example9{
// public static void main(String[] args) {
    
//     int arr[]={6,5,33,22,11,77,88};


//     for(int i=arr.length-1;i>=0;i--){

//        System.out.println(arr[i]);
//     }
        
// }
// }
//or
class Example9{
public static void main(String[] args) {
    
    int arr[]={6,5,33,22,11,77,88};
  for(int start=0,end=arr.length-1;start<end;start++,end--){
    int temp=arr[start];
    arr[start]=arr[end];
    arr[end]=temp;
    
  }
for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]);
}

}}
