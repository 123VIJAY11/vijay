public class  Wrapper{
        public static void main(String[]args)
        {
                String a="20";
                String b="10";
                int c=Integer.parseInt(a);
                int d=Integer.parseInt(b); 
               // System.out.println(" Int :- "+c+d);
                switch(+c+d)
                {
                        case 1:
                        System.out.println("Addition of a and b is :- "+(c+d));
                        break;

                        case 2:
                        System.out.println("Subtraction of a and b is :-"+(c-d));
                        break;

                        case 3:
                        System.out.println("Multiplication of a and b is :-"+(c*d));
                        break;

                        case 4:
                        System.out.println("Division of a and b is :-"+(c/d));
                        break;

                        case 5:
                        System.out.println("Modul of a and b is :-"+(c%d));
                        break;
                } 
                  
                
                System.out.println("Addition :- "+(c+d));
                System.out.println("Subtraction :- "+(c-d));
                System.out.println("Multiplication :- "+(c*d));
                System.out.println("Division :- "+(c/d));
                System.out.println("Modul :- "+(c%d));
        }
};