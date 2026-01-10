// find min element in an array
class Example3{
    public static void main(String[] args) {
        int []arr={  2,4,3,1,7,9 };
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.err.println("Min element in an array is:"+min);
    }
}