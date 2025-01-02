class news{
    int a;
public int geta(){
    return a;

}
news(int a){
    this.a=a;
}
public int returnone (){
    return 1;
}

}
class res extends news{
res(int c){
    super (c);
System.out.println("hello world namste");
}
}
public class newthissuprr {
    public static void main(String args[]){
        news wes=new news(45);
        System.out.println(wes.geta());
        res ces=new res(38);
        
        
    }
    
}
