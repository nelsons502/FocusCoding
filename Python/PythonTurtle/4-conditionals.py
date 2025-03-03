import turtle
t = turtle.Turtle()

'''
In this project, we learn how to create conditionals, 
which are sections of code that only run if certain conditions are met.
A condition is always either True or False (boolean).
'''

if True:
    t.forward(100)

if False:
    t.right(90)
    t.forward(100)

# We usually use booelan expressions or `conditionals` in our if statements
x = 10
if x > 0:
    t.color("red")

if x < 10:
    t.forward(50)

if x == 10:
    t.left(90)
    t.forward(20)

'''
The most common boolean operations used in conditionals are
    == equals
    < less than
    > greater than
    <= less than or equal to
    >= greater than or equal to
    != not equals
'''

# TODO: Make a random variable between 0 and 3
# if 0, draw a blue square 
# if 1 draw a green triangle 
# if 2 draw a red circle 
# if 3 draw a shape of your choosing



# ... end TODO section ...

turtle.done()