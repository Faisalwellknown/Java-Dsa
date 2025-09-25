// edited to optimized
import java.util.*;
public class ReversedString {

    
        static String[] reverseArray(String[] input) {
            int n = input.length;
            String[] reversed = new String[n];

            for(int i = 0; i < input.length; i++ ){
                reversed[i] =  input[n - 1 -i];
            }

            return reversed;
        }

        public static void main(String args[]) {

            String[] in ={"Rajaram","Mohan","Roy"};
            String[] out = reverseArray(in);

            System.out.println(Arrays.toString(out));




        }
    }


    

