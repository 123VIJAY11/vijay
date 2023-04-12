public class Array {
            public static void main(String[]args)
            {

                int i;
                int [] c = new int[20];
                int [] a={1,2,3,4,5};
                int [] b={3,4,5,6,7};
                int sum=0;

                for(i=0;i<b.length;i++)
                {
                    c[i]= a[i]+b[i];
                    
                }

                for( i=0;i<a.length;i++)
                {
                    System.out.println(" "+c[i]);
                }
               
              


                
            }
};
