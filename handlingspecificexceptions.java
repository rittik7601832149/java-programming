import java.util.Scanner;
public class handlingspecificexceptions {
    public static void  main(String args[]){
    int [] marks=new int[5];
    marks[0]=7;
    marks[1]=56;
    marks[2]=6;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the array index");
    int ind =sc.nextInt();
System.out.println("enter the number");
int number =sc.nextInt();
try{
    System.out.println("the value of array index entered is" +marks[ind]);
    System.out.println("the value number enter for diving the array "  +marks[ind]/number);
}
catch(Exception e){
    System.out.println("some Exception occurs");

}

    }
}
