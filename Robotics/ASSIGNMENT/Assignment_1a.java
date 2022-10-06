/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author stain
 */
import ch.aplu.robotsim.*;

public class Assignment_1a {
    Assignment_1a(){
            TurtleRobot t = new TurtleRobot();
            t.setTurtleSpeed(100);
            while (true){
                t.forward(200);
                t.left(90);
            }
        }
    
    public static void main (String[] args) {
        new Assignment_1a();
    }
}
