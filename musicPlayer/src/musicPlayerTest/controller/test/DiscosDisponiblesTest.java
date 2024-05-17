package musicPlayerTest.controller.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DiscosDisponiblesTest {
	GestorDiscos gestorDiscos = new GestorDiscos();

	@Test
	public void testObtenerDiscosDisponibles() {

		int disk = gestorDiscos.obtenerNumeroDiscos();
		assertEquals(0, disk);

	}

	@Test
	public void testObtenerDiscosCompleja() {

		String disco = gestorDiscos.obtenerDiscosCompleja();
		assertEquals("hola", disco);

	}

	@Test
	public void testObtenerDiscosCreado() {
		GestorDiscos gestorDiscos = new GestorDiscos();
		/*
		 int id = 33; String titulo =("gorka"); int idBand= 2;
		 gestorDiscos.crearDiscos(id, titulo, idBand);
		*/
		int idDisco = 33;
		String name = gestorDiscos.obtenerDiscosCreados(idDisco);
		assertEquals("gorka", name);

	}

	@Test
	public void testObtenerDiscosActualizado() {
		/*
		 int id = 33; String nuevoTitulo =("borja");
		 gestorDiscos.actualizarDiscos(id,nuevoTitulo);
		*/
		int idDisco = 33;
		String title = gestorDiscos.obtenerDiscosCreados(idDisco);
		assertEquals("borja", title);

	}

	@Test
	public void testObtenerDiscosBorrado() {
		/*
		 int id = 33; gestorDiscos.eliminarDisco(id);
		*/
		int idDisco = 33;
		String name = gestorDiscos.obtenerDiscosCreados(idDisco);
		assertNull(name);

	}

}
