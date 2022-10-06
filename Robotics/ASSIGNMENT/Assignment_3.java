/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author stain
 */
import ch.aplu.robotsim.*;
import java.util.*;

public class Assignment_3 {
    Assignment_3(){
        Scanner sc = new Scanner(System.in);
        NxtRobot r = new NxtRobot();
        Motor m1 = new Motor(MotorPort.A);
        Motor m2 = new Motor(MotorPort.B);
        r.addPart(m1);
        r.addPart(m2);
        
        System.out.println("Enter 1 for left and 2 for right:");
        int direction = sc.nextInt();
        
        switch(direction) {
            case 1:
                for (int i=0; i<4; i++){
                    m1.forward();
                    Tools.delay(1090);
                    m2.forward();

                    Tools.delay(1090);
                    m1.stop();
                    m2.stop();
                }
            break;
            
            case 2:
                for (int i=0; i<4; i++){
                    m2.forward();
                    Tools.delay(1090);
                    m1.forward();

                    Tools.delay(1090);
                    m1.stop();
                    m2.stop();
                }
            break;
        }
    }
    
    public static void main(String args[]){
        new Assignment_3();
    }
}
