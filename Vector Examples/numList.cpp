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
    
    
    void add(int element){

    }

    int get(int index){

        return -1;
    }

    bool isEmpty(){

    }

    void clear(){

    }


};

int main(){


 return 0;
}

