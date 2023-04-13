public class Area {

    int length=5;
    int width=10;


    public void GetData(int i, int w){

     length = i;
     width = w;

    }
    public Area(){

        System.out.println("length"+length);
        System.out.println("width"+width);

        System.out.println("Area is "+length*width);
                                    
    
    } 
    public static void main(String[] args) {

        Area a = new Area();
        
    }
    
}
