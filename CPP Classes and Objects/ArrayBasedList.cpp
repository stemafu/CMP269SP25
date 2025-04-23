#include <iostream>

using namespace std;

class ArrayBasedList{

    private:
     int* nums;
     int count;

     /// @brief 
     public:
     ArrayBasedList(){
        this->nums = new int[10];
        this->count = 0;
     }

     ~ArrayBasedList(){
        delete nums;
     }

     int isEmpty(){
        return (this->count == 0);
     }

     int size(){
        return this->count;
     }

     bool isFull(){
        return (sizeof(this->nums[0]) == this->count);
     }

     void insert(int num){

        if(this->isFull()){
            cout << "The array is full";
           return;
        }

        nums[count] = num;
        count++;
     }

     void display(){

        for(int i = 0; i < this->count; i++){
            cout << this->nums[i] << "\n";
        }
     }

};


int main(){

    ArrayBasedList list;
    
    cout << "is empty: " <<list.isEmpty() << "\n";
    cout << "size: " << list.size() << "\n";

    int n = 10;

    for(int i = 0; i < 5; i++){
        list.insert(n);

        n = n + 20;
    }
    //list.insert(10);
    list.display();

    return 0;
}