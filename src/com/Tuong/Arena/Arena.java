package com.Tuong.Arena;

import java.util.ArrayList;
import java.util.HashMap;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public class Arena {
	/*
	 * Arena name
	 */
	private String NAME;
	private Location[] LOCATION_LIST;
	private int[] NUMBERIC_LIST;
	private ArenaState ARENA_STATE;
	private ArrayList<Player> PLAYER_LIST;
	private HashMap<Player,PlayerInfoHolder> ITEM_STORE;
	public Arena(String NAME, Location[] LOCATION_LIST, int[] NUMBERIC_LIST){
		this.NAME = NAME;
		this.LOCATION_LIST = LOCATION_LIST;
		this.NUMBERIC_LIST = NUMBERIC_LIST;
		reload(true);
	}
	private void reload(boolean a){	
		
		if(a) return;
		this.PLAYER_LIST = new ArrayList<Player>();
		this.ITEM_STORE = new HashMap<Player,PlayerInfoHolder>();
		this.ARENA_STATE = ArenaState.WAITING;
	}
	public void addPlayer(Player p){
		PLAYER_LIST.add(p);
		ITEM_STORE.put(p, new PlayerInfoHolder(p));
	}
}
