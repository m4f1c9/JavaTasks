package task07;

import javax.swing.JProgressBar;

public class Worker implements Runnable {
int mod;
    JProgressBar progressBar;
    
    public Worker(JProgressBar progressBar, int mod) {
        this.progressBar = progressBar;
        this.mod = mod;
    }
    
    @Override
    public void run() {
        for (int i = 0; i < 400; i++) {
            try {
                Thread.sleep((long) (Math.random() * mod));
            } catch (InterruptedException ex) {
            } finally {
                progressBar.setValue(i);
            }
        }
    }
    
}
