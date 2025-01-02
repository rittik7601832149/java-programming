import java.util.Scanner;
public class practisesetofexcdeption {
    public static void main(String arg[]){
        boolean flag =true;
        int[]marks=new int[3];
        marks[0]=45;
        marks[1]=22;
        marks[2]=43;
        Scanner sc =new Scanner(System.in);
        int index;
        int i=0;
        while(flag && i<5){
        try{
            
            System.out.println("enter the value of index");
        index=sc.nextInt();
        
            System.out.println("the value of index is="+ marks[index]);
        
            break;}
        
            catch(Exception e){
                System.out.println("this is invalid index sir ");
                i++;
            }}
        
        }}
    

