import turtle
t = turtle.Turtle()

# We often have code that needs to repeat
# It can be a pain to copy and paste, and it makes the code hard to read.
# We can use Loops to make certain lines of code happen multiple times automatically!

# Draws a square
for i in range(4):
    t.forward(100)
    t.left(90)

# The line `for i in range(n):` starts off the loop
# Any code that is indented (tabbed-over) right after the loop will get repeated n times


# Draws a triangle
for i in range(3):
    t.forward(150)
    t.right(120)


# We can draw lots of shapes this way!
# Draws a circle by drawing a 36 sided shape
for i in range(36):
    t.forward(10)
    t.right(10)

'''
NOTICE that 360 / numSides = numDegrees that we turn!
    360 / 3 = 120 degrees to turn when drawing a triangle
    360 / 4 = 90 degrees to turn when drawing a square
    360 / 36 = 10 degrees to turn when drawing a circle
'''


# TODO: Draw a hexagon or a pentagon somewhere on the screen



# ... end TODO section ...

turtle.done()