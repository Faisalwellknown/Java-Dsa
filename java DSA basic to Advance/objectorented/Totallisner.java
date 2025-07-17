public class Totallisner {

    private String title;
    private String  artist;
    private int totalListeners;

    public Totallisner(String title,String artist ){
        this.title = title;
        this.artist = artist;
        this.totalListeners = 0;
    }

    public String getTitle(){
        return this.title;
    }
    public String getArtist(){
        return this.artist;
    }
    public int howMany(int listnercount){
        this.totalListeners = totalListeners + listnercount;
        return this.totalListeners;

    }

    public static void main(String[] args) {

        Totallisner hikaruNara = new Totallisner("Hikaru Nara", "Goose House");

        assert hikaruNara.getArtist().equals("Goose House") : "Expect \"Goose House\" for getArtist() when Solution = [\"Hikaru Nara\", \"Goose House\"]";
        assert hikaruNara.getTitle().equals("Hikaru Nara") : "Expect \"Hikaru Nara\" for getTitle() when Solution = [\"Hikaru Nara\", \"Goose House\"]";
        assert hikaruNara.howMany(5) == 5 : "howMany for Hikaru Nara => 5";
        assert hikaruNara.howMany(22) == 27 : "howMany for Hikaru Nara => 27";

        System.out.println("All test cases in main function passed");
    }




}
