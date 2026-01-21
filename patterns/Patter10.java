public class Patter10 {
     public static void main(String[] args) {
        int n=3;
        char ch='A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                
                System.out.print((char)(ch+i+j-2));
               
            }
           
            System.out.println("");
     
        }   
    }
}
