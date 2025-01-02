public class fianlller {
    public static int fresn (){
        try{
            int a=50;
            int b=2;
            int c=a/b;
            return c;

        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("it the end of the program");
        }
        return 0;
    }
    public static void main(String args[]){
        int k=fresn();
        System.out.println(k);

    }
}
