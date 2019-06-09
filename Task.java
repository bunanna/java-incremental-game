package sushi;
import java.util.TimerTask;

public class Task extends TimerTask {

	private float multiplier = 1;
	private float trackerValue = 1;
	
	public Task (float multiplierInput) {
		this.multiplier = multiplierInput;
	}
	
    public void run() { 
    	this.trackerValue = this.trackerValue + this.multiplier;
    }
    
    public float returnTracker() {
    	return this.trackerValue;
    }
    
}
