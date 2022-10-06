/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author stain
 */
import ch.aplu.robotsim.*;

public class Prac_2 {
    Prac_2(){
        NxtRobot r = new NxtRobot();
        Motor m1 = new Motor(MotorPort.A);
        Motor m2 = new Motor(MotorPort.B);
        r.addPart(m1);
        r.addPart(m2);
        
        m1.forward();
        Tools.delay(1090);
        m2.forward();

        Tools.delay(1090);
        m1.stop();

        m2.forward();
        Tools.delay(1090);
        m1.forward();
        
        m1.stop();
        m2.stop();
    }
    
    public static void main(String args[]){
        new Prac_2();
    }
}
