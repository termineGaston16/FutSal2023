package ar.edu.unlam.dominio;

public class Amonestados {

	private String nombreDelAmonestado;
	private String minuto;
	private Integer cantidadDeAmonestaciones;
	private Boolean jugadorExpulsado;

	public Amonestados(String nombreDelAmonestado, String minuto, Integer cantidadDeAmonestaciones,
			Boolean jugadorExpulsado) {
		this.nombreDelAmonestado=nombreDelAmonestado;
		this.minuto=minuto;
		this.cantidadDeAmonestaciones=cantidadDeAmonestaciones;
		this.jugadorExpulsado=jugadorExpulsado;
	}

	public String getNombreDelAmonestado() {
		return nombreDelAmonestado;
	}

	public void setNombreDelAmonestado(String nombreDelAmonestado) {
		this.nombreDelAmonestado = nombreDelAmonestado;
	}

	public String getMinuto() {
		return minuto;
	}

	public void setMinuto(String minuto) {
		this.minuto = minuto;
	}

	public Integer getCantidadDeAmonestaciones() {
		return cantidadDeAmonestaciones;
	}

	public void setCantidadDeAmonestaciones(Integer cantidadDeAmonestaciones) {
		this.cantidadDeAmonestaciones = cantidadDeAmonestaciones;
	}

	public Boolean getJugadorExpulsado() {
		return jugadorExpulsado;
	}

	public void setJugadorExpulsado(Boolean jugadorExpulsado) {
		this.jugadorExpulsado = jugadorExpulsado;
	}

}
