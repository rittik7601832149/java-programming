public class practicesetarray {
    public static void main(String args[]){
        float[]data={ 24.4f,34.4f,34.4f,};
         float num=34.4f;
         boolean indark=false;
         for(float element:data){
            if(num==element){
                indark=true;
                break;
            }
         }if(indark){
            System.out.println("the value is presnet in the array");
         }
         else{
          System.out.println("sry u cna not procced for further process");
         }
    
    }
}
