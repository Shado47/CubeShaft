/*
 * This file is part of Cubeshaft
 * Copyright Naronco 2013
 * Sharing and using is only allowed with written permission of Naronco
 */

package com.naronco.cubeshaft.player;

import java.util.ArrayList;
import java.util.List;

import com.naronco.cubeshaft.level.tile.Tile;

public class Inventory {
	public List<Tile> items = new ArrayList<Tile>();
	public int selectedSlot = 0;

	public Inventory() {
		add(Tile.stone.id);
		add(Tile.dirt.id);
		add(Tile.rock.id);
		add(Tile.planks.id);
		add(Tile.sand.id);
		add(Tile.hellStone.id);
		add(Tile.wood.id);
		add(Tile.leaves.id);
		add(Tile.sapling.id);
		add(Tile.grass.id);
		add(Tile.glass.id);
		add(Tile.brick.id);
		add(Tile.fence.id);
	}

	public void add(int tile) {
		items.add(Tile.tiles[tile]);
	}

	public Tile getSelectedTile() {
		return items.get(selectedSlot);
	}

	public int getMaxSpeedSlots() {
		return items.size();
	}
}
