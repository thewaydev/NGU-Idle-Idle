package features.BasicTraining;

import java.awt.*;
import java.awt.event.*;

public class skillOneCap {
 
    
    public void skillOneCapAct() throws InterruptedException{

        try{

            Thread.sleep(1000);

            Robot robot = new Robot();

            robot.mouseMove(578,137);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

            Thread.sleep(100);

            robot.mouseMove(1610,315);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

            Thread.sleep(100);

            robot.mouseMove(1610,683);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

    
        } catch (AWTException e) {
            System.out.println("AWTException");
        }

    }
}
