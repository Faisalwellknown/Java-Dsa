public class Surfaceareaobj {

    private int width;
    private int length;
    private int height;

    public Surfaceareaobj(int[] dimensions){
        this.width  = dimensions[0];
        this.height = dimensions[1];
        this.length = dimensions[2];

    }

    public int getWidth(){
        return width;
    }

    public int getLength(){
        return length;
    }

    public int getHeight(){
        return height;
    }

    public int getVolume(){
        return width * length * height;

    }

    public int getSurfaceArea(){
        return 2*(length * width + length * height + width * height );
    }

    public static void main(String[] args) {
        Surfaceareaobj block = new Surfaceareaobj(new int[]{3,4,2});

        assert block.getLength()==4:"expect length = 4";
        assert block.getWidth()==3:"expert";
        assert block.getHeight()==2:"expert";
        assert block.getVolume()==3:"expert";
        assert block.getSurfaceArea()==52:"expert";
        System.out.println("All test case in main funtion passed");

    }


}
