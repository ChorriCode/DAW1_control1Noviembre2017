package principal;

import java.time.LocalDate;

import accesoDatos.Operaciones;
import modelo.Vehiculo;

public class Principal {

	public static void main(String[] args) {
	
		
		Vehiculo vehiculo0 = new Vehiculo();  // creo varios objetos de tipo Vehiculo con ambos constructores.
		Vehiculo vehiculo2 = new Vehiculo("0123ABC", "TOYOTA", 't', 150, false, LocalDate.of(2017, 11, 01));
		Vehiculo vehiculo3 = new Vehiculo("4567ABC", "BMW", 't', 175, false, LocalDate.of(2017, 10, 10));
		Vehiculo [] listadoVehiculos = new Vehiculo [4]; // creo un listado que contenga los objetos creados y una posicion sin datos.
		
		//A continuci�n al objeto vehiculo0 le asigno una serie de valores que inicialmente en algunos atributos no ten�a pues he usado
		//el constructor sin par�metros, y de esta manera lo defino como un coche de segunda mano con una fecha de matriculaci�n m�s antigua
		//y de paso hago uso de algunos m�todos setter de la clase Coche.
		vehiculo0.setMatricula("0001ZZZ");
		vehiculo0.setSegundaMano(true);
		vehiculo0.setFechaMatriculacion(LocalDate.of(2015, 8, 1));
		
		
		listadoVehiculos[0] = vehiculo0;
		listadoVehiculos[2] = vehiculo2;
		listadoVehiculos[3] = vehiculo3;
		
		Operaciones miOperacion = new Operaciones(); // creo un objeto de tipo Operaciones para poder llamar al metodo compactarArray();
		
		//a continuaci�n llamo al m�todo compactarArray envi�ndole por parametro un array con elementos nulos y devolviendome un array
		//con s�lo elementos con datos, posteriormente lo asigno a a otro array para manejarlo con un nombre que tenga m�s coherencia.
		Vehiculo [] listadoCompactadoVehiculos = miOperacion.compactarArray(listadoVehiculos);
																							  
		miOperacion.mostrarObjetosArray(listadoCompactadoVehiculos); //por ultimo el nuevo array ya compactado lo env�o a un m�todo para
																	 //que me imprima por consola los atributos y valores de cada elemento
																	 //del array compactado.

	}

}
