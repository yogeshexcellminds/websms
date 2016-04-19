/**
 * Apr 19, 2016
 */
package com.yogi.master.models;

/**
 * @author y.somvanshi
 *
 */
public class Country {

	private int id;
	private String name;
	
	
	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Country(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	
	@Override
	public String toString() {
		return "Country [id=" + id + ", name=" + name + "]";
	}
	
	
}
