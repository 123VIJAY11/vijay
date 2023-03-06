#include <iostream> 
#include<string.h> 
using namespace std;  
class Employee {  
   public:  
       int id;      
       string name;
       float salary;  
       Employee(int id, string name, float salary)    
        {    
             this->id = id;    
            this->name = name;    
            this->salary = salary;   
        }    
       void setDeta()    
        {    
            cout<<id<<"  "<<name<<"  "<<salary<<endl;    
        }    
};  
int main()
{
 
      
    Employee e1 ;

    e1.setData();    
    e2.setData();    
    return 0; 
    
}
