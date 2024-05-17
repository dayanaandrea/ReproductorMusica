package musicPlayerTest.controller.test2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CancionesDisponiblesTest {

	GestorCanciones gestorCanciones = new GestorCanciones();

	@Test
	public void testObtenerCancionesDisponibles() {

		String cancion = gestorCanciones.obtenerNombreCanciones();
		assertEquals("hola", cancion);

	}

	@Test
	public void testObtenerCancionesCompleja() {

		String cancion = gestorCanciones.obtenerCancionesCompleja();
		assertEquals("hola", cancion);

	}

	@Test
	public void testObtenerCancionesCreado() {
		/*
		 * int id = 33; String titulo =("gorka"); int idDisc= 2;
		 * gestorCanciones.crearCanciones(id, titulo, idDisc);
		 */
		int idAudio = 33;
		String name = gestorCanciones.obtenerCancionesCreados(idAudio);
		assertEquals("hola", name);

	}

	@Test
	public void testObtenerDiscosActualizado() {
		/*
		 * int id = 33; String nuevoTitulo = ("borja");
		 * gestorCanciones.actualizarCanciones(id, nuevoTitulo);
		 */
		int idAudio = 33;
		String title = gestorCanciones.obtenerCancionesCreados(idAudio);
		assertEquals("gorka", title);

	}

	@Test
	public void testObtenerDiscosBorrado() {
		/*
		 * int id = 33; gestorCanciones.eliminarDisco(id);
		 */

		int idAudio = 33;
		String name = gestorCanciones.obtenerCancionesCreados(idAudio);
		assertNull(name);

	}

}
