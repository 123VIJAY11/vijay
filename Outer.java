 class Outer {

    class Iner{
        int a=45;
    }
    
        public static void main(String[]args)
        {
                Outer o1 = new Outer();
                Outer.Iner o2 = o1.new Iner();
                System.out.println(o2.a);
        }
    
    
};
