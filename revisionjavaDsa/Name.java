public class Name {

    public static String logic( String a ,String b){

        String fullname = a + b;
        
        return fullname ;

    }



    public static void main(String[] args) {

        String Fname = "Faisal ";
        String Lname = "Shaikh ";
        String Name = logic(Fname ,Lname);

        System.out.println(Name);

        
    }
    
}
