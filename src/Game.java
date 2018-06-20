
import static java.lang.Thread.sleep;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Cristian
 */
public class Game implements Runnable {

    private boolean state = true;
    private JLabel output;

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public Game(JLabel output) {
        this.output = output;
    }

    public JLabel getOutput() {
        return output;
    }

    public void setOutput(JLabel output) {
        this.output = output;
    }

    public void stopThread() {
        state = false;
    }

    public void startThread() {
        state = true;
    }

    @Override
    public void run() {
        while (state) {
            int a = new Random().nextInt(10) + 1;
            output.setText(String.valueOf(a));
            try {
                sleep(250);
            } catch (InterruptedException ex) {
                Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
