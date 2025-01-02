import java.util.Scanner;
public class conditionswitch {
    public static void main (String args []){
        Scanner sc=new Scanner(System.in);
        System.out.println("pls give input number");
        int age=sc.nextInt();
        switch(age){
            case 1:
            System.out.println("welcome to your webstie");
            break;
            case 2:
            System.out.println("how can we help u sir");
            break;
            case 3: 
            System.out.println("thanku for u input sir !");
            break;
            default:
            System.out.println("we will connect you soon");
            
        }
    }
    
    
}
