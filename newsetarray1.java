public class newsetarray1 {
    public static void main(String args[]){
        int[][]mat1={{1,2,2},
                     {3,4,5}};
        int[][]mat2={{2,3,5},
                    {3,4,4}};
        int[][] result={{0,0,0},
                        {0,0,0}};
        for( int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++) {
              System.out.print(result[i][j]+" ");
              result[i][j]=mat1[i][j]+mat2[i][j];

            }
            System.out.println(" ");
        }
       }         
    }
