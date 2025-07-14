public class Array2Dsumoftotal {

   

    public static void main(String[] args) {
        int[][] array1 = {{1,2,3,4}
                        ,{3,5,2,6}};
        int total = 0;
        for(int i = 0; i < array1.length;i++){
            for(int j = 0; j < array1[i].length;j++) {
                total = total + array1[i][j];
            }

        }
        System.out.println(total);
    }
}



