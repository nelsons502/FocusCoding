import turtle

thing=turtle.Turtle()

thing.goto(0,0)
thing.penup()
thing.shape("turtle")

screen=turtle.Screen()
def right():
    thing.right(5)

screen.onkey(right,"Right")

screen.listen()

while True:
    thing.forward(1)
