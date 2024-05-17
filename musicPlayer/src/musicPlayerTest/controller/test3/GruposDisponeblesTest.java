package musicPlayerTest.controller.test3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GruposDisponeblesTest {

	GestorGrupos gestorGrupos = new GestorGrupos();

	@Test
	public void testObtenerGruposDisponibles() {

		String grupos = gestorGrupos.obtenerNombreGrupos();
		assertEquals("hola", grupos);

	}

	@Test
	public void testObtenerGruposDisponiblesCompleja() {

		String grupos = gestorGrupos.obtenerNombreGruposCompleja();
		assertEquals("hola", grupos);

	}

	@Test
	public void testObtenerGruposCreado() {
		/*
		 * int id = 33; String titulo =("gorka"); 
		 * gestorGrupos.crearGrupos(id, titulo);
		 */
		int idGrupo = 33;
		String name = gestorGrupos.obtenerGrupoCreados(idGrupo);
		assertEquals("gorka", name);
	}

	@Test
	public void testObtenerGruposActualizado() {
		/*
		 int id = 33; String nuevoTitulo =("borja");
		 gestorGrupos.actualizarGrupos(id,nuevoTitulo);
		*/
		int idGrupo = 33;
		String title = gestorGrupos.obtenerGrupoCreados(idGrupo);
		assertEquals("borja", title);
	}
	
	@Test
	public void testObtenerGruposBorrado() {
		/*
		 int id = 33; 
		 gestorGrupos.eliminarGrupos(id);
		*/
		int idDisco = 33;
		String name = gestorGrupos.obtenerGrupoCreados(idDisco);
		assertNull(name);

	}
	
}
