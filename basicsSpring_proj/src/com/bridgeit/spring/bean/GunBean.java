package com.bridgeit.spring.bean;

public class GunBean
{
	private String type;
	private int no;

	public GunBean(String type, int no) {
		this.type = type;
		this.no=no;
		System.out.println(this.getClass().getSimpleName()+" Created");
	}

	public String getType() {
		return type;
	}
	
	public int getNo()
	{
		return no;
	}
	
}
