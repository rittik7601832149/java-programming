import java.util.Scanner;
public class ifelsestatemanet {
    public static void main(String args []){
        int age=18;
        Scanner sc=new Scanner(System.in);
        System.out.println("what is your age");
        int but=sc.nextInt();
        if(age>20){
            System.out.println( "yes u can drive");
        }
        else if(age<14){
            System.out.println("you will drive soon");
        }
        
        else{
        System.out.println("no boy u are nit capable yet");
        

        }
    }
}
