import java.util.Scanner;

public class takinginput {
    public static void main(String  args[]){
        System.out.println("taking two number by your own " );
        Scanner Sc=new Scanner  (System.in );
        System.out.println("enter first number ");
        int a = Sc.nextInt();
        System.out.println("enter the second number");
        int b= Sc. nextInt();
        int sum=(a+b);
        System.out.println("the total sum of your given two number is  ");
        System.out.println(sum);

    }
    
}
