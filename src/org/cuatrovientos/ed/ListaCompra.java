package org.cuatrovientos.ed;

public class ListaCompra {
	
	Producto[] listaProductos = new Producto[4];

	public ListaCompra(int num) {
		this.listaProductos = new Producto[num];
	}
	
	public boolean add(Producto p) {
		if (this.listaProductos[this.listaProductos.length] == null) {
			//La lista no esta llena
			//Agregar el elemento en la última posicion vacía.
			for (int i = 0; i < listaProductos.length; i++) {
				if (this.listaProductos[i] == null) {
					// Agregar aquí
					this.listaProductos[i] = p;
					return true;
				}
			}
		}else {
			// La lista esta llena, no se puede agregar.
		}
		return true;
	}
	public String ShowAll() {
		// TODO Recorrer lista y mostrar elementos
		String result = "";
		for (int i = 0; i < listaProductos.length; i++){
			if (listaProductos[i] != null)
				result += listaProductos[i].toString()+"\n";
		}
		return "";
	}
}
