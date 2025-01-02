class a{
    public int ab;
    public int cla(){
        return 4;
    }
    public void method1(){
        System.out.println("i am method two guys");
    }
}
class a2 extends a{
    public void method1(){
        System.out.println("this is new method of method one ");
    }
    public void method2(){
        System.out.println("this is our second method ");
    }


}


public class overriding {
    public static void main (String args[]){
        a newa=new a();
       newa.method1();
       a2 newb=new a2();
       newb.method2();
       a2 bb=new a2();
       bb.method1();

    }
}
