# original code base for this project from Arhaan Aman

import turtle
DEBUG = False

if DEBUG: print("turtle imported")

screen = turtle.Screen()
ball = turtle.Turtle()
pad1= turtle.Turtle()
pad2 = turtle.Turtle()
if DEBUG: print("turtles created")

rect = ((-5, -50), (5, -50), (5, 50), (-5, 50))
turtle.register_shape("rectangle", rect)
# not sure if the .register_shape is called on turtle or on turtle.Screen()...

pad1.shape("rectangle")
pad2.shape("rectangle")
pad1.penup()
pad1.color("red")
pad2.penup()
pad2.color("red")
pad1.goto(-100,0)
pad2.goto(100, 0)
pad1.left(90)
pad2.left(90)
def up1():
  pad1.forward(10)
def up2():
  pad2.forward(10)
def down1():
  pad1.backward(10)
def down2():
  pad2.backward(10)
def done():
  screen.bye()
screen.onkey(up1, "w")
screen.onkey(down1, "s")
screen.onkey( up2, "Up")
screen.onkey(down2, "Down")
screen.onkey(done, "q")
screen.listen()




turtle.done()