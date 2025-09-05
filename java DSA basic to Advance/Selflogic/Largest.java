// largest

public class Largest {
    public static void main(String[] args) {
        int a= 10;
        int b= 20;
        int c= 30;
        int max ;

        if(a>b && a>c){
            max = a;
            System.out.println(a);
        }
        else if(b>a && b>c){
            max = b;
            System.out.println(b);
        }
        else{
            max = c;
            System.out.println(max);
        }
    }

}
