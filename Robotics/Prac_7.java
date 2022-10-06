/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author stain
 */
import ch.aplu.robotsim.*;

public class Prac_7 {
    Prac_7(){
        LegoRobot r=new LegoRobot();
        Gear g = new Gear();
        TouchSensor t1= new TouchSensor(SensorPort.S1);
        TouchSensor t2 = new TouchSensor(SensorPort.S2);
        r.addPart(g);
        r.addPart(t1);
        r.addPart(t2);
        g.forward();
        g.setSpeed(50);
        
        while(true){
            Boolean b1 = t1.isPressed();
            Boolean b2 = t2.isPressed();
            
            if(b1 && b2){
                g.backward(150);
                g.right(400);
                g.forward();
            }
            
            if(b1){
                g.backward(150);
                g.left(200);
                g.forward();
            }
                
            if(b2){
                g.backward(150);
                g.right(200);
                g.forward();
            }
        }  
    }
    
    static { 
        RobotContext.setStartPosition(100,250);
        RobotContext.useObstacle(RobotContext.channel);
     }
    
    public static void main(String args[]){
        new Prac_7();   
    }
}
