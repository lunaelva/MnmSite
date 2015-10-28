package com.mnm.site.model;

public enum GenderModel {
	MALE(1),FEMALE(2),NONE(3);
	public int value;
	
	private GenderModel(int value){
		this.value = value;
	}
	
	public int getValue(){
		return value;
	}
	
}
