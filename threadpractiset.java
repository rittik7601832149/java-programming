class practiser extends Thread{
    public void run(){
        while(true){
        System.out.println("good morning");
    }
}

}
class practiseone extends Thread{
    public void run(){
        while(true){
            try{
            Thread.sleep(200);
            }
            catch(Exception e){
                System.out.println(e);
            }
        System.out.println("hello");
    }
}
}
public class threadpractiset {
    public static void main(String args[]){
        practiser p1= new practiser();
        practiseone p2=new practiseone();
        p1.start();
        p2.start()

    }
    
}
