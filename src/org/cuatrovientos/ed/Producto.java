package org.cuatrovientos.ed;

public class Producto {
	private String name;

	public Producto(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Producto [name=" + name + "]";
	}
	
}
