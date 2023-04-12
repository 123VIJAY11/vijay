import java.util.Scanner;
public class Small {
    public static void main(String[]args)
    {
        Scanner sc =new Scanner(System.in);
        int a;
        int b;
        int c;

        System.out.println("Enter the value of A :- ");
        a = sc.nextInt();

        System.out.println("Enter the value of B :- ");
        b = sc.nextInt();

        System.out.println("Enter the value of C :- ");
        c = sc.nextInt();

        if(a<b)
        {
                if(a>c)
                {
                        System.out.println("C is small!");
                }
                else 
                {
                        System.out.println("A is small!");
                }
        }
        else 
        {
                if(b<c)
                {
                        System.out.println("B is small!");
                }
                else 
                {
                        System.out.println("C is small--1!");
                }
        }

    }
};
