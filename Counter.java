package sushi;
import java.util.Timer;

public class Counter {
	
	private float multiplier = 1;
	private Timer clock;
	private Task counterTask;
	private float test;
	
	public Counter (){
		this.clock = new Timer();
		this.counterTask = new Task(multiplier);
	}
	
	public void startClock() {
		clock.schedule(counterTask, 0, 1000);
		test = counterTask.returnTracker();
	}
	
	public void incrementMultiplier (float increment) {
		this.multiplier = this.multiplier + increment;
	}
	
	public void decrementMultiplier (float decrement) {
		this.multiplier = this.multiplier - decrement;
	}
	
	public float returnTest () {
		return this.test;
	}
	
}
