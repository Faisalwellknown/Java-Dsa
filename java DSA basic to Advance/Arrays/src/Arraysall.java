

import java.util.*;
public class Arraysall {





        public static void main(String args[]) {
            // Creating an array
            int[] MyArray = {100,200,300,400,500};
            System.out.println(Arrays.toString(MyArray));

            // Length of an array
            System.out.println(MyArray.length);

            // Inserting into an array
            int[] arr = new int[5];
            int valueinsert = 10;
            arr[0] = valueinsert;
            System.out.println(Arrays.toString(arr));



            // Searching in an array
            System.out.println(MyArray[3]);

            // Sorting an array using sort method
            int[] A = {5,3,4,2,6,1};
            System.out.println("Before " + Arrays.toString(A));
            Arrays.sort(A);
            System.out.println("After Sort" + Arrays.toString(A));
        }
    }



