public class arrayset {
    public static void main(String args[]){
        int[]arry={1,2,3,4,5,6,};
        int l=arry.length;
        int n=Math.floorDiv(l,2);
        int temp;
        for( int i=0;i<n;i++){
        temp=arry[i];
        arry[i]= arry[l-i-1];
        arry[l-i-1]=temp; 
        }
        for(int element:arry){
            System.out.println(element);
        }
    } 

}
