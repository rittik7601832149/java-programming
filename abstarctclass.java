 abstract class parent12{
    public parent12(){
        System.out.println("mai constructor hu  parent2 hu is class ka ");
    }
    public void sayhello(){
        System.out.println("say hello of mehtod of parent 2 ");
    }
    abstract public void greet();
    abstract public void greet2();
}
class child extends parent12{
    public void greet(){
        System.out.println("good morning  from greet1 ");
    }
    public void greet2(){
        System.out.println("hello world from greet2");
    }
}
abstract class child3 extends parent12{
    public void base(){
        System.out.println("hello from child 3");
    }

}
public class abstarctclass {
    public static void main(String args []){
        child baby=new child();
    
    }    
}
