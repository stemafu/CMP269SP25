

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
    examScore = int(input("Enter a number: "))
    print(toLetterGrade(examScore))


main()
