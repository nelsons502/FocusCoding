# Tell the program we are going to use turtle
import turtle
# Create a turtle. You can use whatever name you want (not just t)
t = turtle.Turtle()

# Use commands like .forward(s), .right(d) and .left(d) to tell the turtle how to move
t.forward(100)
t.right(90)
t.forward(100)
t.left(90)
t.forward(100)


# .penup() and .pendown() make the turtle start and stop drawing
# .goto(x,y) moves the turtle to a certain x and y coordinate on the screen
t.penup()
t.goto(-100,100)
t.pendown()

# This draws a triangle
t.forward(150)
t.left(90)
t.forward(150)
t.left(90)
t.forward(150)
t.left(90)
t.forward(150)
t.right(90)

# Use the .color("color") command to change the turtle to a different color
t.color("red")

# You can fill in a shape by putting .begin_fill() before drawing the shape and .end_fill() after drawing the shape
t.begin_fill()
t.forward(50)
t.right(120)
t.forward(50)
t.right(120)
t.forward(50)
t.right(120)
t.end_fill()

# TODO: Make the turtle draw a green, filled-in square at (-50,-150). 
# There should be no line leading to the square



# ... end TODO section ...

# This final command lets the program know we are done. 
# It is technically optional, but will let the graphics window stay open
turtle.done()