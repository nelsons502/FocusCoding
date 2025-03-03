import turtle
t = turtle.Turtle()

# Variables are labeled values in our code
num = 5
print(num)

# We can save values to specific combinations of letters/numbers (variables)
col = "orange" # a color variable to track the color we want to change to
degrees = 45 # a degrees variale to track the number of degrees we will turn
steps = 75 # a steps variable to track the number of steps we will move

'''
Variables can be several different styles, known as "data types". The most common are...
    int -> whole number
    string -> word/phrase, always has quotes around it
    float -> decimal number
    boolean -> True/False value
'''

# Now we can use these variables in code
t.color(col)
t.right(degrees)
t.forward(steps)

# We can use the variables multiple times, change their values, or modify them when using them
col = "blue"
t.color(col)
t.left(degrees * 2)
t.forward(steps + 50)

# We can also create random numbers in Python!
import random # usually do this at the start of the program

# Make a random integer value and turn that many degrees
degrees = random.randint(30,180)
t.right(degrees)

'''
We can change colors based on r, g, b values (red, green, blue)
Each number can be any int between 0 and 255. First, we need to say turtle.colormode(255)
For example:
    t.color(255,0,0) # this would change the color to red
    t.color(200,0,200) # this would change the color to purple
    t.color(0,0,0) # this would make the color black
    t.color(0,180,100) # this would be some color that is mostly green with some blue
'''

# Make the turtle a random color using r,g,b values
turtle.colormode(255) # this line is required to make the turtle able to recognize r,g,b colors
r = random.randint(0,255)
g = random.randint(0,255)
b = random.randint(0,255)
t.color(r,g,b)

# Make a random numebr of steps and move forward that many degrees
steps = random.randint(20,200)
t.forward(steps)

t.color("blue")

turtle.done()