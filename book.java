public class book {
       
           int id;
            String title;
            String author;
            book(int i, String t, String a)
            {
                id= i;
                title= t;
                author= a;
            }
         
        void Display ()
        {
            System.out.println("id :- "+id);
            System.out.println("Title :- "+title);
            System.out.println("Author :- "+author);
        }
        public static void main(String[]args)
        {
            book b1 = new book(34 , "xyz" , "afcg");
           // book b2 = new book(54 , "aiwgt" , "iutg");
            b1.Display();
           // b2.Display();
        }
        
};

