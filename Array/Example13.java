class Duplicates{
    public int duplicates(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i==j)continue;
                if(arr[i]==arr[j]){
                    return arr[i];

                }
            }
    
       }return -1;
    }
}


public class Example13 {
    public static void main(String[] args) {
        int arr[]={ 0,1,3,2, };
        Duplicates obj=new Duplicates();
       int op= obj.duplicates(arr);
       System.out.println("Duplicates in an array"+op);
        
    }
}
