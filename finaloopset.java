class human{
    private int radius ;
    private int height;

    public int getradius(){
        return radius;

    }
    public void setradius( int radius){
        this.radius=radius;

    }
    public int getheight(){
        return height;
    }
    public void setheight (int height){
        this.height=height;
    }
    
}
public class finaloopset {
    public static void main(String args[]){
        human sumn=new human();
        sumn.setheight(12);
        int h=sumn.getheight();
        System.out.println(h);
        sumn.setradius(52);
        int r=sumn.getradius();
        System.out.println(r);
    }
    
}
