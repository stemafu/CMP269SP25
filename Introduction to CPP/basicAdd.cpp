#include <iostream>

using namespace std;

/* Multi-line comments in C++ are done just like in Java. 
 * This is an example of a multi-line comment. 
 * This program will accept two numbers from the keyboard, 
 * add them and print the result of the summation.
*/

// This an example of a single comment
int main(){

    /* Variables are declared the same how you declare variables in Java.
    * Syntax: dataType variableName;

    * Variable initalization statement. It is also done just as you do in Java.
    * Syntax: dataType variableName = expression;
    * 
    * Variable Assignment Statement is also done like you do in Java.
    * variableName = expression;
    * 
    * A variable must be declared before it is used.
    */

    int num1, num2, total;

    cout << "Enter your first number:\n";
    cin >> num1;

    cout << "Enter your second number:\n";
    cin >> num2;

    total = num1 + num2;

    cout << "The sum of the two numbers is " << total << "\n";



    return 0;
}