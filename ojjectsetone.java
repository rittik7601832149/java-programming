 class imployee{
 int salary;
String name;
public int getsalary(){
    return salary;
}
public String getname(){
    return name;

}
public void setname(String  n){
    name=n;
}
 }
public class ojjectsetone {
    public static void main(String args []){
    imployee sun=new imployee();
    sun.salary=12333;
    sun.setname("well come ritik");
    System.out.println(sun.getname());
    System.out.println(sun.getsalary());
    
    
}
}