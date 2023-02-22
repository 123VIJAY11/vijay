#include <iostream>


using namespace std;

 main() {
	string str;
    cout<<"Enter the string ";
    cin>>str;

	for(int i=0;i<str.length();i++)
		str[i]=toupper(str[i]);

    cout<<"\n The  case:"<<str<<"\n";

	for(int j=0;j<str.length();j++)
		str[j]=tolower(str[j]);

    cout<<"The string: "<<str<<"\n";
}
