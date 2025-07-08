package com.Faisal;

public class Naturalnosum {



        public static int naturalSum(int n){
            int sum = 0;

            for(int i = 1;i <=n;i++){
                sum = sum + i;
            }

            return sum;

        }

        public static void main(String [] args){
            int num = 10;
            int output = naturalSum(num);
            System.out.println(output);

        }

    }

