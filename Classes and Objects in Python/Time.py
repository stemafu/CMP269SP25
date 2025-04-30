class Time:
    """This is an example of a multi-line comment"""


    """ Python does not support constructor overloading.
    If you try to overload the constructor, the last implementation will be executed each time.
    """
    def __init__(self):
        self.hours = 0
        self.minutes = 0

    # The following gets called 
    def __init__(self, hours, minutes):
        self.hours = hours
        self.minutes = minutes
        

    def setHours(self, hours):
        self.hours = hours

    def setMinutes(self, minutes):
        self.minutes = minutes;

    def getHours(self):
        return self.hours

    def getMinutes(self):
        return self.minutes

    def display(self):
        print("Hours: " + str(self.hours))
        print("Minutes: " + str(self.minutes))
def main():
    """
    myTime = Time()
    myTime.setHours(50)
    myTime.setMinutes(1000)
    myTime.display()



    time1 = Time()
    time1.setHours(3)
    time1.setMinutes(4)
    time1.display()
    """
    time2 = Time(10, 10)
    time2.display()

main()
