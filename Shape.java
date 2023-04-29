abstract class Shape {

	float pi= 3.14f;
	int w=5;
	int l=6;
	int c=22;
	abstract void read();

	

}
class Rectangle extends Shape {
	void read()
	{
		System.out.println("rectangle:"+l*w);
	}

	void show()
	{
		System.out.println("show class ()");
	}
}
class circle extends Rectangle {

	void totel(){
	System.out.println("circle:"+c*c*pi);

	}
	public static void main(String args[])
	{

		
		Shape b = new Rectangle();
		b.read();
		circle c= new circle();
		c.totel();
		
	}
}
