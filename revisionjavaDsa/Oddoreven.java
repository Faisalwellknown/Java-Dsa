public class Oddoreven {
    public static String logic(int n){

        String z;
        if(n % 2 == 0){
            z = "Even";
        }
        else{
            z = "Odd";
        }

        return z;


    }
    public static void main(String [] args){

        int i = 0;
        String output = logic(i);

        System.out.println(output);




    }
    
}
