public class Pattern11 {
    public static void main(String[] args) {
        int n=3;
        char count='A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)(count+j+i-2));
                
            }
            
            System.out.println("");
        }

    }
}
