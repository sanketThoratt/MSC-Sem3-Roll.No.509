/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author stain
 */
import ch.aplu.robotsim.*;

public class Prac_1a {
    Prac_1a(){
        NxtRobot robot = new NxtRobot();
        Gear g = new Gear();
        robot.addPart(g);
        g.setSpeed(100);
        g.forward(500);
        g.left(250);
        g.forward(500);
        g.right(250);
        g.forward(500);
    }
    
    public static void main (String[] args) {
        new Prac_1a();
    }
}
