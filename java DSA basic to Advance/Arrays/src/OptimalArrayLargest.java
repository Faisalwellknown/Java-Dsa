// edited code by faisal

public class OptimalArrayLargest {
    

    public static void main(String[] args) {
        int[] array = {4,2,3,8,1};
        int asumeelement = array[0];
        for(int i = 1;i < array.length;i++){
            if (array[i] > asumeelement  ){
                asumeelement = array[i];
            }
        }
        System.out.println(asumeelement);
    }

}



