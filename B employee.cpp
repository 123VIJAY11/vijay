 #include<iostream>
 #include<string.h>
 using namespace std;
 class Employee
 {
     public:
         int id;
         char name[20];
         int salary;
         int number;
         int exprience;
         char email[50];
         char address[50];
   
         void GetData();
         void SetData();
 };
 void Employee::GetData()
 {
 	cout<<"employee detail"<<endl;
     cout<<"Enter employee id: ";
     cin>>id;
     cout<<"Enter  employee name: ";
     cin>>name;
     cout<<"Enter  employee number: ";
     cin>>number;
     cout<<"Enter employee exprince: ";
     cin>>exprience;
     cout<<"Enter employee email: ";
     cin>>email;
     cout<<"Enter employee address: ";
     cin>>address;
     cout<<"Enter employee number : ";
     cin>>number;
 }
 void Employee::SetData()
 {
     cout<<endl<<id<<endl<<name<<endl<<salary<<endl<<number<<email<<endl<<exprience<<endl<<address<<endl;
 }
 int main()
 {
     Employee e;
     cout<<"Enter the employee information:"<<endl;
    
         e.GetData();
         e.SetData();
    
 }
