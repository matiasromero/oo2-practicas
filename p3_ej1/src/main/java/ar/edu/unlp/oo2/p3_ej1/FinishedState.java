package ar.edu.unlp.oo2.p3_ej1;

import java.time.Duration;
import java.util.ArrayList;

public class FinishedState extends ToDoItemState {
	public FinishedState(ToDoItem context) {
        super(context);
        context.setWorkedTime(this.calculateElapsedTime());
    }

	@Override
	public void togglePause() {
		throw new RuntimeException("El objeto ToDoItem no se puede pausar/continuar ya que no se encuentra en estado InProgress o Pending");
		
	}

	@Override
	public void start() {
		throw new RuntimeException("El objeto ToDoItem no se puede comenzar ya que no se encuentra en estado Pending");
	}

	@Override
	public void finish() {
		throw new RuntimeException("El objeto ToDoItem no se puede finalizar ya que no se encuentra en estado Paused o In Progress");
		
	}

	@Override
	public void addComment(String comment, ArrayList<String> comments) {
		throw new RuntimeException("El objeto ToDoItem no puede agregar un comentnario ya que se encuentra en estado Finalized");
		
	}

	@Override
	public Duration workedTime() {
		return context.getWorkedTime();
	}
}
