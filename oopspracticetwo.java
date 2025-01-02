class cellphone{
    
    public void ring(){
        System.out.println("ringing");
    }
    public void vibrate(){
        System.out.println("vibrating");
    }
    public void numbercalling( ){
        System.out.println("numner calling broo");
    }
}
public class oopspracticetwo {
    public static void main (String args[]){
        cellphone phone=new cellphone();
        phone.ring();
        phone.vibrate();
        phone.numbercalling();

    }
    
}
