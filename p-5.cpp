#include<iostream>
using namespace std;
class circle
{
	public:
		double radius;
		double area()
		{
			return 3.14*radius*radius;
		}
};
int main()
{
	circle obj;
	obj.radius=2.2;
	cout<<"radius is:"<<obj.radius<<"\n";
	cout<<"area is:"<<obj.area();
	return 0;
}
