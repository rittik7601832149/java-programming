 class ekclass{
    int a;
    public int geta(){
        return a;
    }
    
    ekclass (int a){
        this. a=a;
    }
    public int returnone(){
        return 1;
    }
 }
public class thissuperone { 
    public static void main(String args[]){
        ekclass classe=new ekclass(5);
        System.out.println(classe.geta());

    }
    
}
