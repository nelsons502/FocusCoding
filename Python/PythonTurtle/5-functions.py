import turtle
t = turtle.Turtle()

# Functions are sections of code that can be activated from somewhere else in our program
# Functions start with `def`, then their name, parenthesis, a colon, then the function body
def move():
    t.forward(100)

# We activate functions by typing their name, then parenthesis
move()

# Another example, a function that draws a square
def square():
    for i in range(4):
        t.forward(50)
        t.right(90)

square()

# TODO: Build functions to move the turtle to a random position 
# and another to change the turtle's color to random



# ... end TODO section ...

turtle.done()