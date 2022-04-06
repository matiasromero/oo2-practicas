package ar.edu.unlp.oo2.p3_ej1;

import java.time.Duration;
import java.util.ArrayList;

public class InProgressState extends ToDoItemState {
	public InProgressState(ToDoItem context) {
        super(context);
    }

	@Override
	public void togglePause() {
		this.context.changeState(new PausedState(context));
	}

	@Override
	public void start() {
		throw new RuntimeException("El objeto ToDoItem no se puede comenzar ya que no se encuentra en estado Pending");
	}

	@Override
	public void finish() {
		this.context.changeState(new FinishedState(context));
	}

	@Override
	public void addComment(String comment, ArrayList<String> comments) {
		comments.add(comment);
	}

	@Override
	public Duration workedTime() {
		return this.calculateElapsedTime();
	}
}
