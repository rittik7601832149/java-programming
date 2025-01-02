public class practiceaaray {
    public static void main (String args[]){
        boolean sorted=true;
int[]art={2,3,4,5,9,7,8,9};
 for(int i=0;i<art.length -1;i++){
    if(art[i]>art[i+1]){
        sorted=false;
        break;
    }
 }
      if(sorted){
        System.out.println("the array is sorted");
      }
      else{
        System.out.println("the array is not sorted");
      }
    }
    }

