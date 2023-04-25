package ar.edu.unlam.dominio;

import java.util.LinkedList;

public class Equipo {

	private LinkedList<Jugador> jugadores;
	private String nombreDelEquipo;
	private Double valorDelEquipo;
	private Double edadPromedioDelEquipo;

	public Equipo(String nombreDelEquipo, Double valorDelEquipo, Double edadPromedioDelEquipo) {
		this.nombreDelEquipo=nombreDelEquipo;
		this.valorDelEquipo=valorDelEquipo;
		this.edadPromedioDelEquipo=edadPromedioDelEquipo;
		this.jugadores=new LinkedList<>();
	}

	public LinkedList<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(LinkedList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	public String getNombreDelEquipo() {
		return nombreDelEquipo;
	}

	public void setNombreDelEquipo(String nombreDelEquipo) {
		this.nombreDelEquipo = nombreDelEquipo;
	}

	public Double getValorDelEquipo() {
		return valorDelEquipo;
	}

	public void setValorDelEquipo(Double valorDelEquipo) {
		this.valorDelEquipo = valorDelEquipo;
	}

	public Double getEdadPromedioDelEquipo() {
		return edadPromedioDelEquipo;
	}

	public void setEdadPromedioDelEquipo(Double edadPromedioDelEquipo) {
		this.edadPromedioDelEquipo = edadPromedioDelEquipo;
	}

}
