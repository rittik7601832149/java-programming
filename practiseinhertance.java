class circle{
    public int radius;
    circle(){
        System.out.println("i am a non paramter constructor");

    }
    circle (int r){
        System.out.println("i am a cricle parameter");
        this.radius=r;
    }

    
    public double area(){
        return Math.PI*this.radius*this.radius;

    }
}
class cylnder extends circle{
    cylnder(int r, int h){
       
     super(r);
     System.out.println("i ama cylinder parameteconstructor");
     this.height=h;
    }

    public int height;
    public double volume(){
        return  Math.PI*this.radius*this.radius*this.height;
    }
    
}
public class practiseinhertance {
    public static void main(String args[]){
        cylnder bv=new cylnder(2,3);
        
    }
    
}
