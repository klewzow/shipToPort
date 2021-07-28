
package com.gmail.klewzow;

public class Ship {
	private String name;
	private int cargo;
	

	public Ship(String name) {
		super();
		this.name = name;
		this.cargo = 10;

	}

	public Ship() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCargo() {
		return cargo;
	}

	public void setCargo(int cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return "Ship [name=" + name + ", cargo=" + cargo + "]";
	}

}
