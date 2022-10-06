/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author stain
 */
import ch.aplu.robotsim.*;

public class Assignment_2a {
    Assignment_2a(){
        NxtRobot robot = new NxtRobot();
        Gear g = new Gear();
        robot.addPart(g);
        g.setSpeed(100);
        while (true){
            g.forward(800);
            g.left(280);
            g.forward(1500);
            g.left(280);
        }
        
    }
    
    public static void main (String[] args) {
        new Assignment_2a();
    }
}
