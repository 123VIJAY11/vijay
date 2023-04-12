public class Negative {
            public static void main(String[]args)
            {
              int i;
              int n;
                int[] a ={-3,-2,-1,0,1,2,3};
                for(i=0;i<7;i++)
                {
                     System.out.println("\n all negative element in array are : ");
                    for(i=0;i<7;i++)
                     {
                            if(a[i]<0)
                            {
                                   System.out.println("\t"+a[i]);
                            }
                     }
                }
            }  
};
