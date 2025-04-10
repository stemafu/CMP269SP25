
#include <iostream>

using namespace std;

int main(){

    /*
    To create an array in C++, you need to follow the syntax below. 
    data_type arrayName[number, which is the array size];
    */
   int size = 5;
    int numbers[size];

    /* How do we assign values to an array index in
    C++? 
    
    Syntax: arrayName[index] = value;
    
    */
   numbers[0] = 60;
   numbers[1] = 20;
   numbers[2] = 10;
   numbers[3] = 30;
   numbers[4] = 40;



   /*
   How do you access values from an array index in C++?

   Syntax: arrayName[index]
   */

   cout << numbers[0] << "\n";


   for(int i = size - 1; i >= 0; i-- ){
    cout << "Enter a number:\n";
    cin >> numbers[i] ;
   } 


   for(int i = size - 1; i >= 0; i-- ){
    cout << numbers[i] << "\n";
   }

    return 0;
}
