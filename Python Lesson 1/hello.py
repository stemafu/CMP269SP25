
x = 8
x = x + 10
print(x)

x = "Lehman College"
print(x)


age = 2;
if age >= 18:
    print("According to your age you can be able to vote.")
else:
    print("According to your age you are not allowed to vote.")
    



score = 100;
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

print(toLetterGrade(90));


    
