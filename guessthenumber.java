import java.util.Random;
import java.util.Scanner;
class game{
    public int number;
    public int inputnumber;
    public int noofguess;
    public int getnoofguess(){
        return noofguess;
    
    }
    public void setnoofguess(int noofguess){
        this. noofguess=noofguess;
    }
     game(){
        Random rand=new Random();
        this .number=rand.nextInt(100);


    }
    void takeuserinput(){
        System.out.println("guess the number");
        Scanner sc=new Scanner(System.in);
        inputnumber= sc.nextInt();
        
 
    }
    boolean  iscorrectnumber(){
        noofguess++;
        if ( inputnumber ==number ){
            System.out.format("yess its the correct number",noofguess);
            return true;
        }
        else if(inputnumber<number){
            System.out.println("the number is two low");

        }
        else if (inputnumber>number ){
            System.out.println("the number is two high");
        }
        return false;
    }
}
public class guessthenumber {
    public static void main(String args[]){
        game g=new game();
        boolean h=false;
        while (!h){
        g.takeuserinput();
         h=g.iscorrectnumber();
        System.out.println(h);
        }
    }
    
}
