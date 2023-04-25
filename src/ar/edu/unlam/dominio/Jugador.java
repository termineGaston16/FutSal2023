package ar.edu.unlam.dominio;

public class Jugador {

	private String nombreDeljugador;
	private Double precioDelJugador;
	private Integer edadDeJugador;
	private EquiposDeAfa equipoSeleccionado;

	public Jugador(String nombreDeljugador, Double precioDelJugador, Integer edadDeJugador,
			EquiposDeAfa equipoSeleccionado) {
		this.nombreDeljugador=nombreDeljugador;
		this.precioDelJugador=precioDelJugador;
		this.edadDeJugador=edadDeJugador;
		this.equipoSeleccionado=equipoSeleccionado;
	}

	public String getNombreDeljugador() {
		return nombreDeljugador;
	}

	public void setNombreDeljugador(String nombreDeljugador) {
		this.nombreDeljugador = nombreDeljugador;
	}

	public Double getPrecioDelJugador() {
		return precioDelJugador;
	}

	public void setPrecioDelJugador(Double precioDelJugador) {
		this.precioDelJugador = precioDelJugador;
	}

	public Integer getEdadDeJugador() {
		return edadDeJugador;
	}

	public void setEdadDeJugador(Integer edadDeJugador) {
		this.edadDeJugador = edadDeJugador;
	}

	public EquiposDeAfa getEquipoSeleccionado() {
		return equipoSeleccionado;
	}

	public void setEquipoSeleccionado(EquiposDeAfa equipoSeleccionado) {
		this.equipoSeleccionado = equipoSeleccionado;
	}

}
