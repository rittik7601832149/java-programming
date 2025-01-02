import java.util.Scanner;
public class percen {
   public static void main (String agrs []){
    Scanner scan=new Scanner(System.in);
    System.out.print("enter the english marks ");
    float english =scan.nextFloat();
    System.out.print("enter the marks of physics ");
    float physics=scan.nextFloat();
    System.out.print("enter the marks of hindi ");
    float hindi=scan.nextFloat();
    System.out.print("enter the marks of history");
    float history=scan.nextFloat();
    System.out.print("enter the marks of bengali");
    float bengali=scan.nextFloat();
    float percentage = (( english+physics+hindi+history+bengali )/500)*100;
    System.out.println(" total percentage " +percentage);


    

   }
 
}
