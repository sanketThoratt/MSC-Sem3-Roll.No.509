/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author stain
 */
import ch.aplu.robotsim.*;

public class Miniproject {
    Miniproject(){
        LegoRobot r=new LegoRobot();
        Gear g = new Gear();
        LightSensor ls= new LightSensor(SensorPort.S3);
        r.addPart(g);
        r.addPart(ls);
        g.forward();
        g.setSpeed(100);
        while(true){
        int v =ls.getValue();

        if(v >= 1000)
        g.forward();
        if(v < 1000)
        g.left();
        if(v < 100)
        g.stop();

    }
    }
    static {
        RobotContext.setStartPosition(430,230);
        RobotContext.useBackground("sprites/yellowpath.gif");
    }
    public static void main (String args[]){
        new Miniproject();
    }
    
}
