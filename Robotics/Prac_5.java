/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author stain
 */
import ch.aplu.robotsim.*;

public class Prac_5 {
    Prac_5() {
        NxtRobot r = new NxtRobot();
        Motor A = new Motor(MotorPort.A);
        Motor B = new Motor(MotorPort.B);
        r.addPart(B);
        r.addPart(A);
        A.setSpeed(100);
        B.setSpeed(100);
        A.forward();
        B.forward();
        while (true){
            Tools.delay(200);
            A.stop();
            Tools.delay(200);
            A.forward();
        }
    }

    public static void main(String arg[]) {
        new Prac_5();
    }

}
