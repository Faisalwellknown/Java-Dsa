public class Gotmain {


    public static void main(String[] args) {

        // classname variable = new classname()
        Pokemon p1 = new Pokemon();
        Pokemon p2 = new Pokemon();

        Pokemon p3= new Pokemon("chalmander",150);

        p1.name =" pikachu";
        p1.level = 100;

        p2.name = "squturl";
        p2.level = 50;




        System.out.println(p1.name  +"      "+  p1.level);
        System.out.println(p2.name +"       "+ p2.level);
        System.out.println(p3.level);


        p2.attack();
        p3.attack();
    }
}



