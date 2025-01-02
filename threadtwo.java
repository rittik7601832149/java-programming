class mythreadbut implements Runnable {
    public void run(){
        System.out.println("hello runnable thread");
        System.out.println("hello runnable thread");
        System.out.println("hello runnable thread");
        System.out.println("hello runnable thread");
        System.out.println("hello runnable thread");
        System.out.println("hello runnable thread");
        System.out.println("hello runnable thread");
    }

}
class mythreadnot implements Runnable{
    public void run(){
        System.out.println("hello runnable ");
        System.out.println("hello runnable ");
        System.out.println("hello runnable ");
        System.out.println("hello runnable thread");
        System.out.println("hello runnable thread");
        System.out.println("hello runnable thread");
        System.out.println("hello runnable thread");
        System.out.println("hello runnable thread");
        System.out.println("hello runnable thread");
        System.out.println("hello runnable thread");
    }
}
public class threadtwo {
    public static void main (String args[]){
        mythreadbut bullet1=new mythreadbut();
        Thread gun1=new Thread( bullet1);
        mythreadnot bullet2=new mythreadnot();
        Thread gun2=new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
    
}
