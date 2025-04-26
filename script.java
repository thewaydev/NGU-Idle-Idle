import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;

import features.BasicTraining.skillOneCap;
import features.BasicTraining.skillTwoCap;
import features.FightBoss.fightBoss;
import features.FightBoss.nukeBoss;

public class script{
    

    public void runScript(int waitTime) throws InterruptedException {


        try {
            GlobalScreen.registerNativeHook();
        }
        catch (NativeHookException ex) {
            System.err.println("There was a problem registering the native hook.");
            System.err.println(ex.getMessage());

            System.exit(1);
        }

        GlobalScreen.addNativeKeyListener(new EmergencyExit());


        while(true) {
            skillOneCap skillOneCapObj = new skillOneCap();
            skillTwoCap skillTwoCapObj = new skillTwoCap();
            nukeBoss nukeBossObj = new nukeBoss();
            fightBoss fightBossObj = new fightBoss();

            //The script itself.

            skillOneCapObj.skillOneCapAct();

            Thread.sleep(waitTime);

            skillTwoCapObj.skillTwoCapAct();

            Thread.sleep(waitTime);

            nukeBossObj.nukeBossAct();

            Thread.sleep(waitTime / 2);

            fightBossObj.fightBossAct();

        }
    }


}
