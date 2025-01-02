interface  one{
    void meth1();
    void meth2();
}
interface two extends one{
    void meth4();
    void meth5();
}
class three implements two{
    public void meth4(){
        System.out.println("hello meth4");
    }
    public void meth5(){
        System.out.println("hello meht5");
    }
    public void meth1(){
        System.out.println("hello meth1");
    }
    public void meth2(){
        System.out.println("hello meth2");
    }

}

public class inhertanceinterface {
    public static void main(String args[]){
        three tree=new three();
        tree.meth1();
        tree.meth2();
        tree.meth5();
        tree.meth4();
        
        
        
        

        

        

    }
    
}
