package features.FightBoss;

import java.awt.*;
import java.awt.event.*;


public class fightBoss {

    public void fightBossAct() throws InterruptedException{

        try{

            Thread.sleep(1000);

            Robot robot = new Robot();

            robot.mouseMove(578,175);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

            Thread.sleep(100);

            


        } catch (AWTException e) {
            System.out.println("AWTException");
        }

    }
    
}