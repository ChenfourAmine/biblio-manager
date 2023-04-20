package org.mql.biblio.models;

public class Author {
	private String name;
	private int yearBorn;
	
	
	public Author(String name, int yearBorn) {
		super();
		this.name = name;
		this.yearBorn = yearBorn;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getYearBorn() {
		return yearBorn;
	}


	public void setYearBorn(int yearBorn) {
		this.yearBorn = yearBorn;
	}


	@Override
	public String toString() {
		return "Author [name=" + name + ", yearBorn=" + yearBorn + "]";
	}
	
}
