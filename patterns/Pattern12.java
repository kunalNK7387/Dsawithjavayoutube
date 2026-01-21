public class Pattern12 {
    public static void main(String[] args) {
        int n=3;

        for(int i=1;i<=n;i++){
            int count='A'+n-i;
            for(int j=1;j<=i;j++){
                System.out.print((char)count+"");
               count++;  
                
            }
           
            System.out.println("");
        }

    }
}

