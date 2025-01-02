class mythread1 extends thread{
public void run (){
    while (true){
    System.out.println("hello thread 1");
    System.out.println("hello thread one done");
    }
}
}
class mythread2 extends thread{
    public void run(){
        while(true){
        System.out.println("hello thread 2");
        System.out.println("hello thread two ");
    }
    }
}
public class thread {
    public static void main (String args[]){
        mythread1 t1=new mythread1();
        mythread2 t2=new mythread2();
         t1.run();
         t2.run();

    }
    
}
