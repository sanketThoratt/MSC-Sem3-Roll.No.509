/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author stain
 */
import ch.aplu.robotsim.*;
import java.awt.Color;
import java.awt.Point;

public class Prac_8 {
    Prac_8() {
        LegoRobot robot = new LegoRobot();
        Gear gear = new Gear();
        robot.addPart(gear);
        UltrasonicSensor us = new UltrasonicSensor(SensorPort.S1);
        robot.addPart(us);
        us.setBeamAreaColor(Color.green);
        us.setProximityCircleColor(Color.lightGray);

        double arc = 0.5;
        gear.setSpeed(50);
        gear.rightArc(arc);
        boolean isRightArc = true;

        int oldDistance = 0;
        while (true)
        {
          Tools.delay(100);
          int distance = us.getDistance();
          if (distance == -1)
            continue;
          if (distance < oldDistance)
          {
            if (isRightArc)
            {
              gear.leftArc(arc);
              isRightArc = false;
            }
            else
            {
              gear.rightArc(arc);
              isRightArc = true;
            }
          }
          oldDistance = distance;
        }
      }

      static{
        Point[] mesh_bar =
        {
          new Point(10, 200), new Point(-10, 200),
          new Point(-10, -200), new Point(10, -200)
        };
        RobotContext.useTarget("sprites/bar1.gif", mesh_bar, 200, 250);
        RobotContext.useTarget("sprites/bar1.gif", mesh_bar, 300, 250);

        RobotContext.setStartPosition(250, 460);
      }

    public static void main(String[] args) {
        new Prac_8();
    }
}
