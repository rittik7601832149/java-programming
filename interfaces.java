interface bike {
    void applybreak( int decrement);
    void accelerate(int increase);


}
class avon implements bike {
    public void applybreak( int decrement){
        System.out.println("speed become slow");
    }
    public void accelerate(int increase){
        System.out.println("the speed of bike increase");
    }
}
public class interfaces {
    
}
