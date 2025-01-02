class mythreadnew implements Runnable{
    public void run(){
        System.out.println("heading one point ");
    }

}
class mythreadset implements Runnable{
    public void run(){
        System.out.println("heading two point");
    }}

 public class javarunablethread {
    public static void main(String args[]){
        mythreadnew bullet1=new mythreadnew();
        Thread gun1=new Thread(bullet1);
        mythreadset bullet2=new mythreadset();
        Thread gun2=new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
    
}
