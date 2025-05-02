class Person:

    def __init__(self, name, age):
        self.name = name
        self.age = age

    #def __str__(self):

    def setName(self, name):
        self.name = name
    
    def getName(self):
        return self.name
    
    def setAge(self, age):
        self.age = age
    
    def getAge(self):
        return self.age
    

def main():

    person1 = Person("Jorge", 20)
    person2 = Person("Seyiti", 21)
    person3 = Person("Alphons", 22)

