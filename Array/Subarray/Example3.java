//print all subarrays of given array
class SubArray{
    public void subArray(int arr[]){

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+",");

                }System.out.println("");
            }
        }

    }
}
class Example3{
    public static void main(String[] args) {
        int arr[]={2,8,9};
        SubArray obj=new SubArray();
        obj.subArray(arr);
    }
}