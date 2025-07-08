package com.Faisal;

public class Methodfuntion2 {

//    static int logic(int x, int y){
//        int z ;
//        if(x>y){
//            System.out.println("the largest number is " + x);
//        }
//        else{
//            System.out.println("the largest number is " + y);
//        }
//        return z;
//    }

    // crio solution
//     import java.util.*;
//
//    public class Solution {
//
//        public static int findLargest(int a, int b) {
//            if(a > b)
//                return a;
//            return b;
//            // This can also solved by using max function
//            //    return Math.max(a, b);
//
//        }
//
//        public static void main(String args[]) {
//            assert (findLargest(1, 9) == 9) : "Expect 9 for a = 1, b = 9";
//            System.out.println("All test cases in main function passed");
//
//        }
//    }
    // my solution
//    import java.util.*;
//
//    public class Solution {
//
//        public static int findLargest (int x, int y) {
//
//            int z ;
//
//            if(x>y){
//                z=x;
//            }
//            else{
//                z=y;
//            }
//            return z;
//
//
//        }
//
//        public static void main(String args[]) {
//
//            int a = 1;
//            int b = 9;
//            int c = findLargest(a,b);
//
//
//            System.out.println("The largest of two  number  " + c);
//
//        }
//    }



    static int logic (int x,int y ){
        int z;
        if(x>y){
            z=x;
        }
        else{
            z = y;
        }
        System.out.println("the largest number is " + z);
        return z;
    }

    public static void main(String[] args) {

        int a = 15;
        int b = 10;
        int c = logic(a,b);
        System.out.println("the largest of two number is " + c);




    }
}
