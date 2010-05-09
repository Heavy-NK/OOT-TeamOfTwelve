package de.hsm.oot.werwars.rooms;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Point;

import de.hsm.oot.werwars.Game;
import de.hsm.oot.werwars.animals.Animal;
import de.hsm.oot.werwars.forages.Forage;
import de.hsm.oot.werwars.gui.RoomContainer;
import de.hsm.oot.werwars.suspects.Chest;

public class Stable extends Room implements IsMagical {


	public Stable(Game game, Animal animal, Forage forage, Chest chest) {
		super(game, animal, forage, chest);
		// TODO Auto-generated constructor stub
	}

	public RoomContainer getComponent() {
		return new RoomContainer(this,new Point(540,290),new Dimension(220,140));
	}
}
