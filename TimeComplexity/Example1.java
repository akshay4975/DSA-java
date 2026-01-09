//Calculation of count factor and check whether number is prime or not


class CountFactor{
   public void countFactor(int num){
       
        int cnt=0;
        for(int i=1;i*i<=num;i++){
            if(num%i==0){
                if(i*i==num){
                    cnt++;
                }else{
                        cnt+=2;
                    }
                
            }
        }System.out.println(cnt);
        checkPrime(cnt);
   } 

public void checkPrime( int cnt){
    if(cnt==2){
        System.out.println("Number is prime");
    }
    else{
        System.out.println("number is not prime");
    }
}
}
class Example1{
    public static void main(String[] args) {
        CountFactor obj=new CountFactor();
    obj.countFactor(10); 
    obj.countFactor(13); 
    obj.countFactor(100); 
    }
}