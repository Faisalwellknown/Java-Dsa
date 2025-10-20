public class Findlargestoutoftwo {

    public static int logic(int a,int b){
        int z;

        if(a > b){
            z = a;
        }
        else{
            z=b;
        }

        return z;

    }

    public static void main (String [] args){

        int i = 5;
        int j = 10;
        int what = logic(i,j);

        System.out.println(what);


    }
    
}
