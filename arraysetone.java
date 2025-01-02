public class arraysetone {
    public static void main(String args[]){
        
        int [][]flats;
        flats=new int[2][3];
        flats[0][0]=12;
        flats[0][1]=123;
        flats[0][2]=124;
        flats[1][0]=1244;
        flats[1][1]=1255;
        flats[1][2]=1255;
        System.out.println("printing the arrays ir the for loop");
        for(int i=0; i<flats.length;i++){
            for(int j=0;j<flats[i].length;j++){
            System.out.print(flats[i][j]);
            System.out.print("  ");

        }
        System.out.println("\n ");
    }
}
}