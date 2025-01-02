class solve{
    int er;
    char c;
    float b;
    int salary;
    public void printdetails(){
        System.out.println("my age is "+er);
        System.out.println("me"+c);
        System.out.println("my float number is "+b);
    }
    public int getsalary(){
        return salary;
    }

}
public class oopssetone {
    public static void main(String args []) {
        solve ban=new solve();
        ban.er=12;
        ban.c='m';
        ban.b=12.3f;
        ban.salary=23;
       
        System.out.println("well come to the revision point ");
         ban.printdetails();
         solve jhon=new solve();
         jhon.er=26;
         jhon.c='n';
         jhon.b=2.3f;
         jhon.salary=45;
         jhon.printdetails();
         int salary=jhon.getsalary();
         System.out.println(salary);
    }
    
}
