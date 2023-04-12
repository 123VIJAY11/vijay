import java.util.Scanner;
public class Num {
    public static void main(String[]args)
    {

        Scanner sc = new Scanner(System.in);


        int num=0;
        System.out.println("Enter value A :- ");
        num=sc.nextInt();
        if(num>0)
        {
            System.out.println("It's positive!");
        }
        else if(num<0)
        {
            System.out.println("It's Nagetive!");
        }
        else 
        {
            System.out.println("It's zero!");
        }
    }  
};
