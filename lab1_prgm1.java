import java.util.*;

public class lab1_prgm1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter total units:");
        int user=sc.nextInt();

        if(user<=50){
            System.out.println(user*10);
        }
        else if (user>50&&user<=100){
            System.out.println(user*15);
        }
        else if (user>100&&user<=200){
            System.out.println(user*20);
        }
        else if(user>200&&user<=300){
            System.out.println(user*25);
        }
        else if (user>300){
            System.out.println(user*30);
        }
    }
}
