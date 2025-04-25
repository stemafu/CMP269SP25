#include <iostream>

using namespace std;

class NumList{
    private:
    int* nums;
    int count = 0;
    int maxArraySize = 10;


    public:
    NumList(){
        nums = new int[maxArraySize];
        this->count = 0;
    }

    NumList(int maxArraySize){
        this->maxArraySize = maxArraySize;
        nums = new int[maxArraySize];
        this->count = 0;
    } 

    ~NumList(){
        delete [] nums;
    }
    
    /*
    This method is used to add the given element
    to the back of the list

    */
    void add(int element){

        this->nums[this->count] = element;
        this->count++;

    }

    /* 
    Add to the front of the list.
    */
    void addFront(int element){

    }

    /*
    This method is used to get an element at the given index
    */
    int get(int index){

        if(index < 0 || index >= this->count){
            return -1;
        }

        return this->nums[index];
    }

    /*
    This method returns true if the list is empty. Otherwise, returns false.
    */
    bool isEmpty(){

        /*if(this->count == 0){
            return true;
        }else{
            return false;
        }
       return false;*/

       return (this->count == 0);
    }

    void clear(){
        this->count = 0;
    }


};

int main(){
    
    cout << "List of numbers. \n";

   
    NumList myList;
    cout << myList.isEmpty() << "\n";
    int number = 1;
    for(int i = 0; i < 1000; i++){
        myList.add(number);
        number = number + 10;
    }

    for(int i = 0; i < 1000; i++){
        cout << myList.get(i) << "\n";
    }
    
    cout << myList.isEmpty() << "\n";


    return 0;
}

