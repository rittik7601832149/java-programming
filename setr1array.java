public class setr1array {
    public static void main (String args[]){
        float[]marks={34.3f,34.3f,44.4f,34.3f,};
        float sum=0;
        for(float element:marks){
            sum=sum+element;

        }
        System.out.println("this is the averga marks of all student"  +sum/marks.length);
    }
}
