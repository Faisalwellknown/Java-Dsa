// Edited find samllest array num 

package Arrays.src;

public class FindsmallestnuminArray {




        static int smallestValueInArray(int[] numbers) {
            int asumesmall = numbers[0];

            for(int i = 1; i < numbers.length; i++  ){
                if(numbers[i] < asumesmall){
                    asumesmall = numbers[i];
                }
            }
            return asumesmall;


        }

        public static void main(String args[]) {

            int[] A = {4,2,3,1,5};
            int out = smallestValueInArray(A);



            System.out.println("The smallest number in an array is : " + out);

        }
    }



