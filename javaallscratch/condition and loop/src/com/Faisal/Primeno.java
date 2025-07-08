package com.Faisal;

public class Primeno {
        public static boolean checkPrime(int x) {

            if(x <=1){
                return false;
            }

            int i = 2;

            while(i < x){
                if (x % i == 0){
                    return false;
                }

                i = i+1;
            }
            return true;

        }

        public static void main(String args[]) {
            int n = 3;
            boolean check = checkPrime(n);

            System.out.println(check);
        }
}



