
  abstract class pen{
    abstract void write();
    abstract void refil();
 }
 class fountainpen extends pen{
    void write(){
        System.out.println("wrting pen ");
    }
    void refil(){
        System.out.println("pls refil the pen ");
    }
    void changenib(){
        System.out.println("wait its chamging the nib");
    }
 }
 class monkey{ 
    
    void jump(){
        System.out.println("hii jumping");

    }
    void bite(){
        System.out.println(" i wan to eat the banana");
    }
    
 }
 interface humanbasic {
    void eat();
    void sleep();
}
 
 class humannji extends monkey implements humanbasic {
    void admi(){
        System.out.println("heyy manunsai");
    }
    public void eat(){
        System.out.println("bring some banana");
    }
    public void sleep(){
        System.out.println("i am sleepimg pls dont disturb");
    }



 }


 public class abstarctpractise {
    public static void main(String args[]){
        fountainpen pencil=new fountainpen();
        pencil.write();
    }
    
}
