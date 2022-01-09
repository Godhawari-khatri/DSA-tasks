import java.util.Scanner;
public class lab1_prgm4 {
    public static void main(String[] args) {
        int firstTerm=0,secondTerm=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num");
        int n=sc.nextInt();
        System.out.println("fabonacci series till "+n+" terms");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + ", ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

    }
}
