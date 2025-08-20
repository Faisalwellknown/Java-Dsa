// all the 2 d array
public class Array2DDigonalsum {
   

    public static int digosum(int[][] mat){
        //check if matrix is emty
        if(mat == null || mat.length == 0 || mat[0].length == 0){
            return 0;


        }
        int size = mat.length;
        System.out.println(size);
        int total = 0;

        for(int i = 0;i < size;i++){
            total = total + mat[i][i];
            total = total + mat[i][size -1 - i];
        }

        if(size % 2 ==1){
            total = total - mat[size/2][size/2];
        }

        return total;




    }

    public static void main(String[] args) {

        int[][] array = {{1,2,3},
                         {4,5,6},
                         {7,8,9}};

        int result = digosum(array);
        System.out.println(result);

    }
}



