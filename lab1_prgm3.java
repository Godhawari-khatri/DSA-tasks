import java.util.Scanner;
public class lab1_prgm3 {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("enter num");
        int num= sc.nextInt();
        System.out.println("enter starting num");
        int start= sc.nextInt();
        System.out.println("enter ending num");
        int end =sc.nextInt();
        for(int i=start;i<=end;i++){
            System.out.println(num+"*"+i+"="+num*i);
        }


    }
}
