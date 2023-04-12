public class Sum {
            public static void main(String[]args)
            {
                int i;
                int j;
                int sum=0;
                int [][]a = {{2,3,4} , {5,6,7} , {8,9,6}};
                for(i=0; i<3;i++)
                {
                    for(j=0;j<3;j++)
                    {
                        if(i+j==2)
                        {
                            sum+=a[i][j];
                         
                        }
                
                    }
                    System.out.println(" ");
                }
                System.out.print(" Sum : " +sum);
            }  
};
