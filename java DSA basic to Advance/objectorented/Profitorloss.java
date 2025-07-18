
    public class Profitorloss {

    private int numberofBeetsSold;
    private int costPriceperBeet;
    private int sellingPricePerBeet;

    public Profitorloss(int x,int y,int z){
        this.numberofBeetsSold = x;
        this.costPriceperBeet = y;
        this.sellingPricePerBeet = z;
    }
    public int Profit(){
        return (sellingPricePerBeet - costPriceperBeet) * numberofBeetsSold;
    }

    public static void main(String[] args) {

        Profitorloss seller = new Profitorloss(2,3,4);
        System.out.println(seller.Profit());
    }

}



