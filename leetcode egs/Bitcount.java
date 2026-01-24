public class Bitcount {
 
    public int hammingWeight(int n) {
         int rem,count=0;
        while(n!=0){
            rem=n%2;
            n=n/2;
            
            if(rem==1){
            count++;
            }
        }
      return count;
    }
     public static void main(String[] args) {
        int n = 11;
        Bitcount s1=new Bitcount();   
        int result = s1.hammingWeight(n);
        System.out.println(result);
    
    
    }
}


