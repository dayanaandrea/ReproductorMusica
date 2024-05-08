package musicPlayer.controller;
import java.util.List;
import java.util.Random;
import musicPlayer.bbdd.gestor.GestorDisk;
import musicPlayer.bbdd.gestor.GestorGroup;
import musicPlayer.bbdd.pojo.DiskPojo;
import musicPlayer.bbdd.pojo.GroupPojo;

public class ControladorRandom {

public DiskPojo getRandomDisk() {
		
	GestorDisk gestorDisk = new GestorDisk();
	GestorGroup gestorGroup = new GestorGroup();
	
	int id = gestorDisk.obtenerNumeroDiscos();
	System.out.println(id);

	int numeroAleatorio = new Random().ints(0, id).findAny().getAsInt();
	System.out.println(numeroAleatorio);
		
	List <DiskPojo> disks = gestorDisk.getAllDisks(numeroAleatorio);
	System.out.println(disks);
	
	DiskPojo disk = disks.get(numeroAleatorio);
	
	GroupPojo groupPojo = gestorGroup.getGroupByDisk(disk);
	disk.setGroup(groupPojo);
	
	return disk;
	}
}