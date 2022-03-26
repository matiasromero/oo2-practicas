package ar.edu.unlp.info.oo2.biblioteca;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BibliotecaTest {
	
	private Biblioteca biblioteca;
	private Socio socio;

	@BeforeEach
	void setUp() throws Exception {
		biblioteca = new Biblioteca();
		socio = new Socio("Matias", "matias6787@gmail.com", "8218/7");
		biblioteca.agregarSocio(socio);
	}
	
    @Test
    public void exportShouldReturnCorrectString_VoorheesExporter() {
    	String result = biblioteca.exportarSocios();
    	assertNotNull(result);
        assertTrue(result.contains("Matias"));
        assertTrue(result.contains("matias6787@gmail.com"));
        assertTrue(result.contains("8218/7"));
    }
    
    @Test
    public void exportShouldReturnCorrectString_JSONSimple() {
    	biblioteca.setExporter(new JsonSimpleExporterAdapter());
    	String result = biblioteca.exportarSocios();
    	assertNotNull(result);
        assertTrue(result.contains("Matias"));
        assertTrue(result.contains("matias6787@gmail.com"));
        assertTrue(result.contains("8218/7"));
    }
    
    @Test
    public void exportShouldReturnCorrectString_Jackson() {
    	biblioteca.setExporter(new JacksonExporterAdapter());
    	String result = biblioteca.exportarSocios();
    	assertNotNull(result);
        assertTrue(result.contains("Matias"));
        assertTrue(result.contains("matias6787@gmail.com"));
        assertTrue(result.contains("8218/7"));
    }
}
