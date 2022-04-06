package ar.edu.unlp.oo2.p3_ej1;

import java.sql.Date;
import java.time.Duration;

public class PendingState extends ToDoItemState {
	
	public PendingState(ToDoItem context) {
        super(context);
    }

	@Override
	public void togglePause() {
		throw new RuntimeException("El objeto ToDoItem no se puede pausar/continuar ya que no se encuentra en estado InProgress o Pending");
		
	}

	@Override
	public void start() {
		this.context.changeState(new InProgressState(context));
		this.context.setStartedDate(new Date(System.currentTimeMillis()));
	}

	@Override
	public void finish() {
		throw new RuntimeException("El objeto ToDoItem no se puede finalizar ya que no se encuentra en estado Paused o In Progress");
	}

	@Override
	public void addComment(String comment) {
		this.context.addComment(comment);
	}

	@Override
	public Duration workedTime() {
		throw new RuntimeException("El objeto ToDoItem no puede retornar el tiempo transcurrido porque aun no se inicio");
	}

}
