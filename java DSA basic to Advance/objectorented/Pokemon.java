
    public class Pokemon {


    String name;
    int level;

    Pokemon(){
        level = 1;
    }
    Pokemon(String pName,int plevel){
        name = pName;
        level= plevel;
    }


    void attack(){
        System.out.println(name+ "     attack! ");
    }


}



