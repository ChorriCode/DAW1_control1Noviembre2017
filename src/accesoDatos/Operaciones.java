package accesoDatos;

import modelo.Vehiculo;

public class Operaciones {
		private Vehiculo [] vehiculos;
		
		public void mostrarObjetosArray(Object [] array) {  //Método que recibi un array de objetos e imprime los atributos de cada uno de ellos.
			for (int i = 0; i < array.length; i++) { // los atributos y valores de cada uno de los objetos que contine el array.
				System.out.println(array[i].toString()); 			
			}			
		}
		
		public Vehiculo [] compactarArray(Vehiculo [] datos) {
			int j = 0; // indice del array vehiculos[]
			for (int i = 0; i < datos.length; i++) {
				if (datos[i] != null) {
					j++;
				}
			}
			vehiculos = new Vehiculo[j];
			j = 0;
			for (int k = 0; k < datos.length; k++) {
				if (datos[k] != null) {
					vehiculos[j++] = datos[k];
				}
			}
			
			return vehiculos;
		}



}
