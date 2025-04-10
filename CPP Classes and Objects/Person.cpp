#include <iostream>

using namespace std;

class Person{

    private:
    string name;
    int age;

    public:
    Person(string newName, int newAge){
        name = newName;
        age = newAge;
    }

    string getName(){
        return name;
    }

    void setName(string newName){
        this->name = newName;
    }

    int getAge(){
        return age;
    }

    void setAge(int age){
        this->age = age;
    }

    void display(){
        cout << "Name is " << this->getName() << "\n";
        cout << "Age is " << this->getAge() << "\n";
    }

    void displayName();

    void displayAge();

};

void Person::displayName(){
    cout << this->name << "\n";
}

void Person::displayAge(){
    cout <<  this->age << "\n";
}


int main(){

    Person p1("One", 10);
    
    p1.display();  // display(p1)
    p1.displayName();

    //cout << "Name is " << p1.getName() << "\n";
    //cout << "Age is " << p1.getAge() << "\n";

    //p1.age = 10;

    return 0;
}