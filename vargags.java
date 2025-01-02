public class vargags {
    static int sum (int...arr){
        int result =0;
        for( int a:arr){
            result+=a;

        }
        return result;
        

    }
    static int sum(int a,int b ,int c){
        return a+b+c;

    }
    public static void main(String args[]){
        System.out.println("the sum of digit ");
        System.out.println("the value of 4 and 5 is  "+ sum (4,5));
        System.out.println("the sum of 3 and 4 and 5 is   " +sum(3,4,5));
    }

 
}
