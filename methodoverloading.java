public class methodoverloading {
    static int sum(int...arr){
        int result=0;
        for(int a:arr){
            result +=a;
        }
        return result;
    }
    public static void main(String agrs[]){
        System.out.println("out of all the sun of integer");
        System.out.println("the sum of 4 and 5 is "+sum(4,5));
        System.out.println("the sum of 4 and 5 and 6is "+sum(4,5,6));
    

    }
}
