public class Column {
            public static void main(String[]args)
            {
                int i;
                int j;
                int h;
                int [][]a = {{2,3,4} , {5,6,7} };
                int [][]b = {{5,4,5} , {8,5,6} };
                for(i=0; i<3;i++)
                {
                    for(j=0;j<3;j++)
                    {
                        h=a[i][j]+b[i][j];
                        System.out.print(" "+h);
                    }
                    System.out.println(" ");
                }
            }
};
