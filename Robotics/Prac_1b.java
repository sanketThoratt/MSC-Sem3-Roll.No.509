/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author stain
 */
import ch.aplu.robotsim.*;

public class Prac_1b {
    Prac_1b(){
        TurtleRobot t = new TurtleRobot();
        t.forward(100);
        t.left(90);
        t.forward(100);
        t.right(90);
        t.forward(100);
    }
    
    public static void main (String[] args) {
        new Prac_1b();
    }
}
