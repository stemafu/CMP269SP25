
#include <iostream>
#include <vector>

using namespace std;

int main(){

    vector<int> scores;

    scores.push_back(90);
    scores.push_back(100);

    cout << scores.at(0) << "\n";

    cout << "Print all values inside the vector \n";

    for(int i = 0; i < scores.size(); i++){
        cout << scores.at(i) << "\n" ;
    }

    return 0; 
}