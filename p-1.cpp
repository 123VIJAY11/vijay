#include<iostream>
using namespace std;
class feet
{
	public:
		int feet,inch;
};
int main()
{
	feet f1,f2,sum;
	
	cout<<"enter 1st"<<endl;
	cout<<"enter feet:";
	cin>>f1.feet;
	cout<<"enter inch:";
	cin>>f1.inch;
	
	cout<<"\nenter 2nd"<<endl;
	cout<<"enter feet:";
	cin>>f2.feet;
	cout<<"enter inch:";
	cin>>f2.inch;
	
	sum.feet=f1.feet+f2.feet;
	sum.inch=f2.inch+f2.inch;
	
	cout<<endl<<"sum of feet="<<sum.feet<<"feet"<<sum.inch<<"inch";
	return 0;
	
}
