class phone{
    public void nam(){
        System.out.println("good moring");
    }
    public void onn(){
        System.out.println("hello to the programer");
    }
}
class smartphone extends phone{
    public void nam2(){
        System.out.println("turning on phone");
    }
    public void onn (){
        System.out.println("turning on smart phone ");
    }
    
}
public class dynamicone {
    public static void main(String args[]){
        phone obj=new smartphone();
        obj.nam();
        obj.onn();

    }
    
}
