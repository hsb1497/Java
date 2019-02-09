import java.util.Timer;
import java.util.TimerTask;

public class Lab8_2 {

	    Timer timer;

	    public Lab8_2(int seconds) {
	        timer = new Timer();
	        timer.schedule(new RemindTask(), seconds*1000);
		}

	    class RemindTask extends TimerTask {
	        public void run() {
	            System.out.println("Time's up!");
	            timer.cancel(); //Terminate the timer thread
	        }
	    }

	    public static void main(String args[]) {
	        new Lab8_2(10);
	        System.out.println("Task scheduled.");
	    }
	    
}

