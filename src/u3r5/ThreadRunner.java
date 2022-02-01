package u3r5;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eduardo
 */
public class ThreadRunner extends Thread{

    Runner runner;
    public ThreadRunner(Runner runner) {
        this.runner=runner;
    }
    
    public String toString(){
        return(runner.name);
    }

    @Override
    public void run() {
        try {
            super.run();
            sleep(runner.speed*1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadRunner.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
