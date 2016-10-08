package com.Tuong.Arena;

public enum ArenaState {
	WAITING(true),IN_GAME(false),COOL_DOWN(true);
	private Boolean canJoin;
	private ArenaState(Boolean canJoin){
		this.canJoin = canJoin;
	}
	public Boolean canJoin(){
		return this.canJoin;
	}
}
