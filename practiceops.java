class mom{
    int salary;
    String name;
    public int getsalary(){
        return salary;
    }
    public String getname(){
        return name;
    }
    public void setname(String n){
        name=n;
    }
    
}
public class practiceops {
    public static void main(String args[]){
        mom dad=new mom();
        dad.salary=12334;
        dad.setname("hello world to the world of coding");
        System.out.println(dad.getname());
        System.out.println(dad.getsalary());
        
    }
    
}
