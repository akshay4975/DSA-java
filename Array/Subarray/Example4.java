//print sum of every single subarray of a given array.
class SubArray{
    public void subArray(int arr[]){

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                    System.out.print(arr[k]+" ");

                }
                System.err.print("="+sum);
                System.out.println("");
            }
        }

    }
}
class Example4{
    public static void main(String[] args) {
        int arr[]={2,8,9};
        SubArray obj=new SubArray();
        obj.subArray(arr);
    }
}