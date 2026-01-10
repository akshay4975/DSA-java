// find max element in an array
class Example2{
    public static void main(String[] args) {
        int []arr={  2,4,3,1,7,9 };
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.err.println("MAx element in an array is:"+max);
    }
}