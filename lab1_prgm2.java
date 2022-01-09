public class lab1_prgm2 {
    public static void main(String[] args) {
        int r=5,k=0;

        for (int i=1;i<=r;++i,k=0){
            for(int s=1;s<=r-i;++s){
                System.out.print("  ");

            }
            while (k!=2*i-1){
                System.out.print("* ");
                ++k;
            }
            System.out.println();
        }
    }
}
