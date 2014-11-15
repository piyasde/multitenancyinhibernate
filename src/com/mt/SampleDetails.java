package com.mt;

public class SampleDetails{
	private int id;
	private String name;
	
	SampleDetails(){
	}

	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("name : ").append(name);
		sb.append(" ,id : ").append(id);
		return sb.toString();
	}
}

