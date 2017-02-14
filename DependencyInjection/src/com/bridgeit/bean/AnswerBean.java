package com.bridgeit.bean;

import java.util.Date;

/**
 * @author bridgeit Ssatyendra Singh.
 * This class has three properties id, name and by/postedDate with constructor and toString() method.
 */
public class AnswerBean 
{
	private int id ;
	private String answer;
	//private String by;
	private Date postedDate;
	public AnswerBean(int id, String answer, Date postedDate) {
		super();
		this.id = id;
		this.answer = answer;
		this.postedDate = postedDate;
	}
	/*@Override
	public String toString() {
		return "AnswerBean [id=" + id + ", answer=" + name + ", by=" + by + "]";
	}
	*/
	@Override
	public String toString() {
		return "Answer[id=" + id + ", answer=" + answer + ", postedDate=" + postedDate + "]";
	}
	
}
