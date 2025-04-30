

# The following is the general syntax of a Python for loop
# for variable in sequence:
#   body of the for loop

# A Python list is an example of sequence.


myList = [10, 20, 30, 40, 50, 80, 70]

total = 0
for item in myList:
    total = total + item

print(total)

# We want the followig loop to add the first n natural numbers.

# We obtain the actual value of n from the user via keyboard.
n = int(input("Enter a number: "))

# The loop runs n times to add the first n natural number using the variable i
total = 0
for i in range(n + 1):
    total = total + i

print(total)


# In Python, we also have while loops.
# Their semantics are the same at what we discussed in Java and in C++
# Below is the general syntac of a Python while
# while condition:
#   <bofy of the while loop>


i = 0

while (i < 10):
    print(i)
    i = i + 1



while (n >= 0):
    print(n);
    n = n - 1;



