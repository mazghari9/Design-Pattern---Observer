import java.util.Observable;

public class Compteur extends Observable implements Runnable {
    private int state;
    
     public Compteur(int val) {
    	 this.setState(val);
	 }

	 public int getState() {
	    return state;
	 }
	
	 public void setState(int state) {
	    this.state = state;
	    setChanged();
	    notifyObservers(state);
	 }
	
	 public void run() {
		 try {
			while (!Thread.currentThread().isInterrupted()) {
				this.setState((this.getState() + 1) % 60);
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
		}
	 }
	 
}


