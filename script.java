import features.BasicTraining.skillOneCap;
import features.FightBoss.nukeBoss;

public class script {
    

    public void runScript(int waitTime) throws InterruptedException{

        //Object declaration.

        skillOneCap skillOneCapObj = new skillOneCap();
        nukeBoss nukeBossObj = new nukeBoss();

        //The script itself.

        skillOneCapObj.skillOneCapAct();

        Thread.sleep(1000);

        nukeBossObj.nukeBossAct();

    }
}
