interface camera{
    void takesnap();
    void recordvideo();

}
interface wifi{
    String[]wifireset();
    void connectnetwork(String network);
}
class cellphone{
    public void callme( int phonenumber){
        System.out.println("its ringning"+phonenumber);
    }
    public void msgme( ){
        System.out.println("thsi msg notification ");
    }
}
    class MyCc extends cellphone implements wifi,camera{
     public void takesnap(){
        System.out.println("snapchat");
    }
    public void recordvideo(){
        System.out.println("video is uploading");
    }
    public String[]wifireset(){
        System.out.println("well come to the wifi reset");
        String[]networklist={"harry","suraj","ritik"};
        return networklist;

    }
}
 
public class interfacedeafalut {
    public static void main(String args[]){
        MyCc rec=MyCc();
        String []ar=rec.wifireset();
        for(String item:ar)
           
        {
            System.out.println(item);
        }
    
    }
    
}
