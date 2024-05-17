package musicPlayer.controller;

import java.util.List;

import musicPlayer.bbdd.gestor.GestorGroup;

import musicPlayer.bbdd.pojo.GroupPojo;

public class ControladorGrupos {

	public List<GroupPojo> getGroup() {

		GestorGroup gestorGroup = new GestorGroup();

		List<GroupPojo> groups = gestorGroup.getAllGroup();

		return groups;
	}

}