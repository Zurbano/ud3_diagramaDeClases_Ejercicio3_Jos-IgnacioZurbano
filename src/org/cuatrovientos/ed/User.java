package org.cuatrovientos.ed;

public class User {
	ListaCompra lista;
	public User(int num) {
		lista = new ListaCompra(5);
		Producto p = new Producto("leche");
		lista.add(p);
		System.out.println(lista.ShowAll());
	}
}
