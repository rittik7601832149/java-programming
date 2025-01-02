class myth extends Thread{
    public myth(String name){
        super(name);

    }
    
        public void run(){
            while(true){
                System.out.println("hello riwitick");
            
        }
    }
}
public class mythreadconstructior {
    public static void main(String args[]){
        myth my=new myth("naman");
        my.start();
        }
    
}
