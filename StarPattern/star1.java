public class star1 {
    public static void main(String[] args) {
        for(int s=1;s<=3;s++){
            int a=1;
            if(s!=1){
                a=2;
            }
            for(int i=a;i<=3;i++){
                for(int sp=0;sp<=i;sp++){
                    System.out.print(" ");
                }
                for(int j=1;j<=1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i=2;i>=1;i--){
                for(int sp=0;sp<=i;sp++){
                    System.out.print(" ");
                }
                for(int j=1;j<=1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        
    }
}
