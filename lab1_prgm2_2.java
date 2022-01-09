public class lab1_prgm2_2 {
    public static void main(String[] args) {
        int r=5,p=0,count=0,count1=0;
        for(int i=1;i<=r;i++){
            for(int s=1;s<=r-i;++s){
                System.out.print("  ");

                ++count;

            }
            while (p !=2*i-1){
                if (count<=r - 1){
                    System.out.print((i+p)+" ");
                    ++count;
                }
                else {
                    ++count1;
                    System.out.print((i+p -2*count1)+" ");
                }
                ++p;
            }
            count1=count=p=0;
            System.out.println();
        }
    }
}
