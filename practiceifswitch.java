import java.util.Scanner;
public class practiceifswitch {
    public static void main (String args []){
        byte m1,m2,m3;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter your physics marks");
      m1=sc.nextByte();
     System.out.println("enter your english marks");
     m2=sc.nextByte();
     System.out.println("enter your hindi marks ");
     m3=sc.nextByte();
     float avg=(m1+m2+m3)/30.f;
     System.out.println("your over all perecntage is "+avg);
     if(avg>=40  && m1>=33 && m2>=33 && m3>=33){
     System.out.println("congratulation we are ahead in success");
     }
      else
      {
        System.out.println("try again keep practising");
      }

    
    }
}
