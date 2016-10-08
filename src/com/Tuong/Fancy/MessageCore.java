package com.Tuong.Fancy;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import com.Tuong.Arena.Arena;

public class MessageCore {
	private String[] MESSAGE;
	private final String[] DEFAULT_MESSAGE = {"&e%PLAYER% joined %ARENA% arena","&e%PLAYER% left %ARENA% arena"};
	private final int LENGTH = DEFAULT_MESSAGE.length;
	public MessageCore(Plugin PLUGIN){
		//LOAD MESSAGE
		PLUGIN.getConfig().options().copyDefaults(true);
		for(int i = 0; i < LENGTH; i++)	PLUGIN.getConfig().addDefault("Message."+i, DEFAULT_MESSAGE[i]);
		PLUGIN.saveConfig();
		for(int i = 0; i < LENGTH; i++)	MESSAGE[i] = PLUGIN.getConfig().getString("Message."+i);		
	}
	public String getJoinMessage(Player PLAYER, Arena ARENA){
		return ChatColor.translateAlternateColorCodes('&', MESSAGE[0].replace("%PLAYER%", PLAYER.getName()).replace("%ARENA%", ARENA.getName()));
	}
	public String getLeaveMessage(Player PLAYER, Arena ARENA){
		return ChatColor.translateAlternateColorCodes('&', MESSAGE[1].replace("%PLAYER%", PLAYER.getName()).replace("%ARENA%", ARENA.getName()));
	}
}
