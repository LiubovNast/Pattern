package org.example;

import org.example.color.Blue;
import org.example.color.Green;
import org.example.color.Red;
import org.example.figure.Ball;
import org.example.figure.Cube;
import org.example.figure.Pyramid;
import org.example.material.Iron;
import org.example.material.Rubber;
import org.example.material.Wood;

/**
 * Bridge pattern
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Ball ball = new Ball(new Red(), new Rubber());
        ball.howColored();
        ball.fromWhatMaterial();

        System.out.println();

        Cube cube = new Cube(new Blue(), new Iron());
        cube.fromWhatMaterial();
        cube.howColored();

        System.out.println();

        Pyramid pyramid = new Pyramid(new Green(), new Wood());
        pyramid.howColored();
        pyramid.fromWhatMaterial();
    }
}
