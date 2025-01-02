class square{
    int side;
    public int area(){
        return side*side;
    }
    public int premeter(){
        return 4*side;
    }
}
public class oopssetthreeset {
    public static void main(String args []){
        square sq=new square();
        sq.side=4;
       System.out.println( sq.area());
       System.out.println( sq.premeter());
    }
    
}
