import turtle
t = turtle.Turtle()

# With functions, we can build what are called Event Listeners
# These let us sense when the user does something on the keyboard while the program is running
# Creating Event Listeners has 5 steps

#1. create a screen object
screen = turtle.Screen()

#2. send the turtle to (0,0)
t.goto(0,0)

#3. create a function to do an action
def move_and_turn():
    t.forward(10)
    t.left(10)

#4. connect the function to a key with the `.onkey` command
screen.onkey(move_and_turn, "space")

#5. include a screen.listen() command to make sure the program listens for the event(s)
screen.listen()

turtle.done()