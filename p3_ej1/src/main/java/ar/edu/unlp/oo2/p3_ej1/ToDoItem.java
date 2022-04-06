package ar.edu.unlp.oo2.p3_ej1;

import java.time.Duration;
import java.util.Date;

public class ToDoItem {
	private ToDoItemState state;
	private String name;
	private Date startedDate;
	private Duration workedTime;
	public void changeState(ToDoItemState state) {
        this.state = state;
    }

    public ToDoItemState getState() {
        return state;
    }
/**
* Instancia un ToDoItem nuevo en estado pending con <name> como nombre.
*/
	public ToDoItem(String name) {
		this.name = name;
		this.state = new PendingState(this);
		this.workedTime = Duration.ofHours(0);
	}
	
	public void setStartedDate(Date date) {
		this.startedDate = date;
	}
	
	public Date getStartedDate() {
		return this.startedDate;
	}
	
	public void setWorkedTime(Duration duration) {
		this.workedTime = duration;
	}
	

   	/**
* Pasa el ToDoItem a in-progress (siempre y cuando su estado actual sea
* pending, si se encuentra en otro estado, no hace nada)
*/
        public void start() {
        	this.state.start();
        }

	/**
* Pasa la tarea a paused si su estado es in-progress, o a in-progress si su
* estado es paused. Caso contrario (pending o finished) genera un error
* informando la causa específica del mismo
*/
        public void togglePause() {
        	this.state.togglePause();
        }


	/**
* Pasa el ToDoItem a finished (siempre y cuando su estado actual sea 
* in-progress o pausada, si se encuentra en otro estado, no hace nada)
*/
        public void finish() {
        	this.state.finish();
        }


	/**
* Retorna el tiempo que transcurrió desde que se inició la tarea (start)
* hasta que se finalizó. En caso de que no esté finalizada, el tiempo que
* haya transcurrido hasta el momento actual. Si la tarea no se inició,
* genera un error informando la causa específica del mismo.
*/
        public Duration workedTime() {
        	return this.state.workedTime();
        }


/**
* Agrega un comentario a la tarea siempre y cuando no haya finalizado. Caso
* contrario no hace nada."
*/
        public void addComment(String comment) {
        	this.state.addComment(comment);
        }      
}

