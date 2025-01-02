import java.util.*;
public class arraylist {
    public static void main(String args[]){
        ArrayList<Integer>li=new ArrayList<>();
        ArrayList<Integer>l2=new ArrayList<>();
        l2.add(34);
        l2.add(45);
        li.add(9);
        li.add(8);
        li.add(4);
    li.add(2);
li.add(0,3);
li.addAll(0,l2);
for(int i=0;i<li.size();i++) {
    System.out.println(li.get(i));
}   }
    
}
