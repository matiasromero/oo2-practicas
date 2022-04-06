package ar.edu.unlp.oo2.p3_ej1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;

public abstract class ToDoItemState {
	ToDoItem context;
	
	public ToDoItemState(ToDoItem context) {
		this.context = context;
	}
	
	public abstract void togglePause();
	public abstract void start();
	public abstract void finish();
	public abstract void addComment(String comment, ArrayList<String> comments);
	public abstract Duration workedTime();
	
	public Duration calculateElapsedTime() {
		Date now = new Date(System.currentTimeMillis());
        return Duration.ofMillis(now.getTime() - context.getStartedDate().getTime());
	}
}
