package com.Tuong.Arena;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class PlayerInfoHolder {
	private Player PLAYER;
	private ItemStack[] ITEM_HOLDER,ARMOR_HOLDER;
	private int LEVEL_HOLDER;
	private float EXP_HOLDER;
	public PlayerInfoHolder(Player PLAYER){
		this.PLAYER = PLAYER;
		this.ITEM_HOLDER = PLAYER.getInventory().getContents();
		this.ARMOR_HOLDER = PLAYER.getInventory().getArmorContents();
		this.LEVEL_HOLDER = PLAYER.getLevel();
		this.EXP_HOLDER = PLAYER.getExp();
		PLAYER.getInventory().clear();
		PLAYER.getInventory().setArmorContents(null);
	}
	public void returnItem(){
		PLAYER.getInventory().setContents(ITEM_HOLDER);
		PLAYER.getInventory().setArmorContents(ARMOR_HOLDER);
		PLAYER.setExp(EXP_HOLDER);
		PLAYER.setLevel(LEVEL_HOLDER);
	}
}
