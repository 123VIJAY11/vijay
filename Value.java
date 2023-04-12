import java.util.Scanner;
public class Value
{
        public static void main(String []args)
        {
            Scanner sc = new Scanner(System.in);
            int a;
            float b;
            double c;
            long d;
            char e;
            String f;
           

            System.out.println("Enter the value of A :-  ");
            a=sc.nextInt();

            System.out.println("Enter the value of B :-  ");
            b=sc.nextFloat();

            System.out.println("Enter the value of C :-  ");
            c=sc.nextDouble();

            System.out.println("Enter the value of D :-  ");
            d=sc.nextLong();

            System.out.println("Enter the value of G :- ");
            e=sc.next().charAt(0);
           
            System.out.println("Enter the value of F :-  ");
            f=sc.nextLine();

            
        }
};