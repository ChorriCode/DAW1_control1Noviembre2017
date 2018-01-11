package modelo;

import java.time.LocalDate;

public class Vehiculo {
	
	private String matricula;
	private String marca;
	private char tipoVehiculo; // t = turismo, c = camion, m = moto
	private int velocidadMaxima; // en kilometros por hora
	private boolean segundaMano; // false = vehículo nuevo
	private LocalDate fechaMatriculacion; //fecha cuando se metriculó y está habilitado para circilar
	
	public Vehiculo() {  //Contructor sin paramentros para vehiculos aún no matriculados
		matricula = "";
		marca = "SEAT";
		tipoVehiculo = 't';
		velocidadMaxima = 100;
		segundaMano = false;
	}

	public Vehiculo(String matricula, String marca, char tipoVehiculo, int velocidadMaxima, boolean segundaMano,
			LocalDate fechaMatriculacion) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.tipoVehiculo = tipoVehiculo;
		this.velocidadMaxima = velocidadMaxima;
		this.segundaMano = segundaMano;
		this.fechaMatriculacion = fechaMatriculacion;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public char getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(char tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public boolean isSegundaMano() {
		return segundaMano;
	}

	public void setSegundaMano(boolean segundaMano) {
		this.segundaMano = segundaMano;
	}

	public LocalDate getFechaMatriculacion() {
		return fechaMatriculacion;
	}

	public void setFechaMatriculacion(LocalDate fechaMatriculacion) {
		this.fechaMatriculacion = fechaMatriculacion;
	}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", tipoVehiculo=" + tipoVehiculo
				+ ", velocidadMaxima=" + velocidadMaxima + ", segundaMano=" + segundaMano + ", fechaMatriculacion="
				+ fechaMatriculacion + "]";
	}


	
	
	
}
