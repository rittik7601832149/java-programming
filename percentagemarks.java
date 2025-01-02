import java.util. Scanner ;

public class percentagemarks {
    public static void main(String args []){
        float total =0;
System.out.println("welcome to the cbse percentange of student result ");
Scanner input =new Scanner(System.in);
System.out.println("enter the totla marks of the the subject (eg 100:80) ");
int total_marks =  input. nextInt();
System.out.println( "enter the mark of  1 subject ");
float s1=input.nextFloat();
total=total+s1;
System.out.println("enter the marks of 2nd subejct " );
float s2=input.nextFloat();
total =total+s2;
System.out.println("enter the marks of 3rd subject");
float s3=input.nextFloat();
total =total+s3;
System.out.println("enter the marks of 4th subject");
float s4=input.nextFloat();
total=total+s4;
System.out.println("enter the marks of 5th subject");
float s5= input.nextFloat();
total =total+s5;
float grandtotal =total*100/( total_marks *5 );
System.out.println("your total percentage ="+grandtotal+"percent");



    }
}
