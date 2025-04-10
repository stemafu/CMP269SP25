#include <iostream>

using namespace std;

/*
returnType functionName(parameterlist){
 body of the function
}
*/

int sum(int num1, int num2){
    return num1 + num2;
}

int main(){

    int count = 0;

    int num;

    do{
        cout << "Enter a number to use with this loop.\n";
        cin >> num;
    }while(num <= 0);

    /*if(num <= 0){
        cout << "Please enter a positive number\n";
        return 0;
    }*/




    while(count <= num){
        cout << count << "\n";
        count++;
    }

    cout << "Below we have used a for loop to print the number.\n";

    int total = 0;
    for(int i = 0; i <= num; i++){
        cout << i << "\n";

        total = sum(total, i);
    }

    cout << total << "\n";

}