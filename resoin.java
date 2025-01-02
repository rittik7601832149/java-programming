public class resoin {

        static int logic (int a, int b){
            int c;
            if( b>a){
                c=b-a;
                
            }
            else{
                c=(a+b)*5;
            }
            return c;
        }
        public static  void main (String args[]){
            int x=3;
            int y=4;
            int z;
            z=logic(x,y);
    
            int a1=4;
            int b1=8;
            int c1;
            c1= logic (a1,b1);
    
            System.out.println(z);
            System.out.println(c1);
        }
    }
            
    
    

