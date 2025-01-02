public class practicearray {
    public static void main (String args[]){
     int[]arry={1,2,3,4,5,6,7,};
     int max=0;
     for( int element:arry){
        if(element >max){
            max =element;

        }


     }
     System.out.println("the value of the maximum "+max);
    }
}
