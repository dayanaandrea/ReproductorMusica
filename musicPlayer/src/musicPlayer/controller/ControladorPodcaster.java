package musicPlayer.controller;

import java.util.List;

import musicPlayer.bbdd.gestor.GestorPodcaster;
import musicPlayer.bbdd.pojo.PodcasterPojo;

public class ControladorPodcaster {
	
	public List<PodcasterPojo> getPodcaster() {
		GestorPodcaster gestorGroup = new GestorPodcaster();

		List<PodcasterPojo> podcasters = gestorGroup.getAllGroup();

		return podcasters;
	}

}