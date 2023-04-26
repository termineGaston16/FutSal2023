package ar.edu.unlam.dominio;

public class Gol {

	private String nombreDelAutorDelGol;
	private String minutoDelGol;

	public Gol(String nombreDelAutorDelGol, String minutoDelGol) {
		this.nombreDelAutorDelGol=nombreDelAutorDelGol;
		this.minutoDelGol=minutoDelGol;
	}

	public String getNombreDelAutorDelGol() {
		return nombreDelAutorDelGol;
	}

	public void setNombreDelAutorDelGol(String nombreDelAutorDelGol) {
		this.nombreDelAutorDelGol = nombreDelAutorDelGol;
	}

	public String getMinutoDelGol() {
		return minutoDelGol;
	}

	public void setMinutoDelGol(String minutoDelGol) {
		this.minutoDelGol = minutoDelGol;
	}

}
