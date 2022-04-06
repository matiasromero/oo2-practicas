/**
 * 
 */
package ar.edu.unlp.oo2.p3_ej1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ToDoItemsTest {
	
	ToDoItem i1;
	ToDoItem i2;
	ToDoItem i3;
	
	@BeforeEach
	void setUp() throws Exception {
		i1 = new ToDoItem("Item 1");
		i2 = new ToDoItem("Item 1");
		i3 = new ToDoItem("Item 1");
	}
	
    @Test
    public void testToItemInitialStatus() {
        assertEquals(PendingState.class, i1.getState().getClass());
    }
    
    @Test
    public void changeStatusShouldWork() {
    	i1.start();
        assertEquals(InProgressState.class, i1.getState().getClass());
        
        i1.togglePause();
        assertEquals(PausedState.class, i1.getState().getClass());
        
        i1.togglePause();
        assertEquals(InProgressState.class, i1.getState().getClass());
        
        i1.finish();        
        assertEquals(FinishedState.class, i1.getState().getClass());
    }
    
    @Test
    public void addCommentShouldWork() {
    	i1.start();
    	
        assertEquals(0, i1.getCommentsSize());
        
        i1.addComment("Comentario 1");
        i1.addComment("Comentario 2");
        i1.addComment("Comentario 3");
        
        assertEquals(3, i1.getCommentsSize());
    }
    
    @Test
    public void shouldReturnWorkedTime() throws InterruptedException {
    	i1.start();
    	Thread.sleep(2000);
    	
    	long workedTime1 = i1.workedTime().toMillis();
        assertTrue(workedTime1 > 0);
        
        Thread.sleep(2000);
        i1.finish();
        
        long workedTime2 = i1.workedTime().toMillis();
        assertTrue(workedTime2 > workedTime1);
    }
    
    @Test
    public void callWrongActionsShouldThrowAnException() {
    	RuntimeException exception = assertThrows(RuntimeException.class, () -> {
    		i1.finish();
        });
    	assertEquals(exception.getMessage(), "El objeto ToDoItem no se puede finalizar ya que no se encuentra en estado Paused o In Progress");
    }
}
