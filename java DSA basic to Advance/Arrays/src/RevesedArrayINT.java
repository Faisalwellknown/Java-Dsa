
import java.util.*;
public class RevesedArrayINT {


    public static int[] reversed(int[] input) {
        int n = input.length;
        int[] rev = new int[n];
        for (int i = 0; i < input.length; i++) {
            rev[i] = input[n - 1 - i];

        }

        return rev;

    }

    public static void main(String[] args) {

        int[] in ={4,3,2,1,0};
        int[] out = reversed(in);
        
        System.out.println(Arrays.toString(out));

    }
}


