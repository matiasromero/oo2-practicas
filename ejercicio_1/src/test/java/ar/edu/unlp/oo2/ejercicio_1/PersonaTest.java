/**
 * 
 */
package ar.edu.unlp.oo2.ejercicio_1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonaTest {
	
	Persona james;
	Persona guido;
	
	@BeforeEach
	void setUp() throws Exception {
		james = new Persona("James", "Glossing");
		guido = new Persona("Guido", "van Rossum");
	}
    @Test
    public void testNombreCompleto() {
        assertEquals("Glossing, Jamesa", james.getNombreCompleto());
        assertEquals("van Rossum, Guido", guido.getNombreCompleto());
        
    }
}
