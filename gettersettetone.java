class geter{
    private int id;
    private String name;
    public String getname(){
        return name;

    }
    public void  setname(String n){
        name=n;

    }
    public void setid( int i){
        id=i;
    }
    public int getid(){
        return id;
    }


}
public class gettersettetone {
    public static void main (String args[]){
        geter seter=new geter();
        seter.setname("hellojava");
        seter.setid(12);
    
        System.out.println(seter.getname());
        System.out.println(seter.getid());
    }
    
}
