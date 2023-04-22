public class player {

    void Batsman(){

    
        System.out.println("this is a Batsman Class");
    


    }
    
    void bowler(){
        
        System.out.println("this is a Bowler  Class");

    }
    class cricketplayer extends player{

        void inherit(){

            System.out.println("Inherit Betsman class And Bowler class");

        }

    


    }
    public static void main(String[] args) {
        
    player p = new player();

    p.Batsman();
    p.Batsman();


    }

    










    
}
