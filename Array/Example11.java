//missing number in an sorted array
class MissingElement{
    public int missingElement(int arr[]){
        int cnt=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=cnt){
           return cnt;
            }cnt++;
        }


        return cnt;
    }
}
class Example11{
  public static void main(String[] args) {
    
  int arr[]={1,2,4,5,6};
  MissingElement obj=new MissingElement();
    int op= obj.missingElement(arr);
    System.out.println(op);

    }}
