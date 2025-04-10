#include <iostream>
using namespace std;

#include "AnimalH.h"



void AnimalH::setName(string name){
    this->name = name;
}

void AnimalH::setAge(int age){
    this->age = age;
}

string AnimalH::getName(){
    return this->name;
}

int AnimalH::getAge(){
    return this->age;
}


