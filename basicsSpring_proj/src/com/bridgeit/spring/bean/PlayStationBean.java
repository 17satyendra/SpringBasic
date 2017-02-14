package com.bridgeit.spring.bean;

public class PlayStationBean 
{
	private int version;
	
	public PlayStationBean() {
		System.out.println(this.getClass().getSimpleName()+" created...");
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
}
