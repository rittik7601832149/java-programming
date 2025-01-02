import java.util.Scanner;
public class setthree {
    public static void main(String args[]){
        
        System.out.println("enter your marks please ");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your pysics marks");
        float physics=sc.nextFloat();
        System.out.println("enter your english marks");
        float english=sc.nextFloat();
        System.out.println("enter your hinid marks");
        float hindi =sc.nextFloat();
        System.out.println("enter your maths marks");
        float maths=sc.nextFloat();
        float percentage=((physics+english+hindi+maths)/500)*100;
        System.out.println("total percentage"  +percentage);


    }
}
