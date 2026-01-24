class Sum {

    public int subtractProductAndSum(int n) {
       int product =1;
       int sum =0;
       int result,digit;
        while(n!=0){
            digit=n % 10;
            product=product*digit;
            sum= sum+digit; 
              n=n/10;      
        }
        result=product-sum;    
        return result;

    }
      
     public static void main(String[] args) {
        int n = 234;
        Sum s1=new Sum();   
        int result = s1.subtractProductAndSum(n);
        System.out.println("Result = " + result);
    
    
    }
}
