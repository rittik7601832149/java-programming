public class memory {
    public static void main(String args[]){
        int[][]sol;
         sol=new int[3][2];
         sol[1][2]=293;
         sol[1][3]=293;
         sol[2][2]=293;
         sol[2][3]=293;
         sol[3][2]=293;
         sol[3][3]=344;
         System.out.println("welcome to the array game");
         for(int i=0;i<sol.length;i++){
            for(int j=0;j<sol[i].length;j++){
                System.out.print(sol[i][j]);
                System.out.print(" ");
            }
            System.out.print(" ");
         }




    

    }
}
