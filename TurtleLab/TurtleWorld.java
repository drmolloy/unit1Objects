import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        Turtle turtle2 = new Turtle(turtleWorld);
        turtle.penUp();
        turtle.forward(200);
        turtle.turn(270);
        turtle.forward(300);
        turtle.turn(180);
        turtle.penDown();
        turtle.forward(50);
        turtle.backward(25);
        turtle.turn(90);
        turtle.forward(75);
        turtle.turn(270);
        turtle.backward(25);
        turtle.forward(50);
        turtle.penUp();
        turtle.forward(50);
        turtle.penDown();
        turtle.turn(270);
        turtle.forward(75);
        turtle.backward(75);
        turtle.turn(90);
        turtle.forward(50);
        turtle.penUp();
        turtle.forward(25);
        turtle.penDown();
        turtle.turn(270);
        turtle.forward(75);
        turtle.turn(90);
        turtle.forward(50);
        turtle.turn(90);
        turtle.forward(75);
        turtle.turn(270);
        turtle.backward(50);
        turtle.forward(50);
        turtle.penUp();
        turtle.turn(270);
        turtle.forward(75);
        turtle.turn(90);
        turtle.forward(25);
        turtle.penDown();
        turtle.turn(60);
        turtle.forward(90);
        turtle.turn(240);
        turtle.forward(90);
        turtle.turn(60);
        turtle.penUp();
        turtle.forward(25);
        turtle.penDown
        turtle2.penUp();
        turtle2.backward(200);
        turtle2.turn(270);
        turtle2.forward(300);
    }
}