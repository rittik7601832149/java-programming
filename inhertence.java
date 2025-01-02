class base{
    public int x;
    public int getx(){
        return x;

    }
    public void setx(int x){
        System.out.println("are getting value of x this thing is below");
        this.x=x;
    }
    public void printme(){
        System.out.println("this is your value");
    }

}
class derive extends base{
    public int y;
    public int gety(){
        return y;
    
    }
 public void sety(int y){
    this.y=y;
 }

    
}
public class inhertence {
    public static void main(String args[]){
        base sase=new base();
    sase.setx(34); 
    System.out.println(sase.getx());
    derive rive=new derive();
    rive.sety(45);
    System.out.println(rive.gety());
    sase.printme();


    
    

}
    
}
