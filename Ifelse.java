import java.util.Scanner;
public class Ifelse {
        public static void main(String [] args)
        {
            Scanner sc = new Scanner(System.in);
            int a;
            int b;
            System.out.println("Enter the value of A :- ");
            a=sc.nextInt();
            System.out.println("Enter the value of B :- ");
            b=sc.nextInt();


            if(a>b)
            {
                    System.out.println("A is large!!!");
            }
            else 
            {
                    System.out.println("B is large!!!");
            }
        }  
};
