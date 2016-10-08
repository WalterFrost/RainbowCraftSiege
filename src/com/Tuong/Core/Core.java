package com.Tuong.Core;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import com.Tuong.Fancy.MessageCore;

public class Core extends JavaPlugin implements Listener{
	//Plugin created by Nguyen Lam Tuong
	public static MessageCore MESSAGE_CORE;
	public void onEnable(){
		MESSAGE_CORE = new MessageCore(this);
	}
}
