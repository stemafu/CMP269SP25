

def toLetterGrade(score):
    letter = "F"

    if(score >= 92):
        letter = "A"
    elif ((score > 90) and (score < 92)):
        letter = "A-"
    elif(score >= 88):
        letter = "B+"
    elif(score >= 85):
        letter = "B"
    elif(score >= 80):
        letter = "B-"
    elif(score >= 78):
        letter = "C+"
    elif(score >= 75):
        letter = "C"
    elif(score >= 70):
        letter = "C-"
    elif(score >= 68):
        letter = "D+"
    elif(score >= 65):
        letter = "D"
    elif(score >= 60):
        letter = "D-"
    else:
        letter = "F"

    return letter

def main():
    #examScore = int(input("Enter a number: "))
    #print(toLetterGrade(examScore))

    #  Open a file that contains students scores
    inputFile = open("data.csv", "r")
    count  = 0
    # sum  is a variable that will contain the sum of all scores
    sum = 0;
    for line in inputFile:
        # let us take the line and convert it into a list(array)
        lineValues = line.split(",")
        if(count > 0):
            score = int(lineValues[1])
            sum = sum + score
            print(lineValues[0] + " " + lineValues[1]  + " " +  toLetterGrade(score))
        
        count = count + 1
    
    average = sum / (count - 1) 
    print ("The average score is " + str(average ))
    # close the opened file
    inputFile.close()


main()
