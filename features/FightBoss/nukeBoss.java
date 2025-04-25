package features.FightBoss;

import java.awt.*;
import java.awt.event.*;


public class nukeBoss {

    public void nukeBossAct() throws InterruptedException{

        try{

            Thread.sleep(1000);

            Robot robot = new Robot();

            robot.mouseMove(578,175);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

            Thread.sleep(100);

            robot.mouseMove(1181,323);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        } catch (AWTException e) {
            System.out.println("AWTException");
        }

    }
    
}
