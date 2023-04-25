package ar.edu.unlam.dominio;

import java.util.ArrayList;
import java.util.LinkedList;

public class SoftwareAfa {

	private String nombreDelSoftware;
	private ArrayList<Equipo> equiposDeAfa;
	

	public SoftwareAfa(String string) {
		this.nombreDelSoftware=string;
		this.equiposDeAfa=new ArrayList<>();
	}

	public boolean agregarEquipoAlSistema(Equipo eq) {
		if (equiposDeAfa.size()<25) {
			this.equiposDeAfa.add(eq);
			return true;
		}
		return false;
	}

	public boolean agregarJugador(Jugador ju) {
		
		for (Equipo equipo : equiposDeAfa) {
			if (equipo.getNombreDelEquipo().equals(ju.getEquipoSeleccionado().toString())) {
				
				if (equipo.getJugadores().size()<5) {
					equipo.getJugadores().add(ju);
					return true;
				}

			}
		}

		return false;
	}

	public Double calcularElValorDelEquipo(EquiposDeAfa sanLorenzo) {
		Double valorDelEquipo=0.0;
		
		for (Equipo equipo : equiposDeAfa) {
			if (equipo.getNombreDelEquipo().equals(sanLorenzo.toString())) {
				
				for (int i = 0; i < equipo.getJugadores().size(); i++) {
					valorDelEquipo+=equipo.getJugadores().get(i).getPrecioDelJugador();
				}
				
			}
		}
		
		return valorDelEquipo;
	}

	public Double evaluarEdadPromedioDelEquipo(EquiposDeAfa sanLorenzo) {
		Double promedioDelEdad=0.0;
		
		for (Equipo equipo : equiposDeAfa) {
			if (equipo.getNombreDelEquipo().equals(sanLorenzo.toString())) {
				
				for (int i = 0; i < equipo.getJugadores().size(); i++) {
					promedioDelEdad+=equipo.getJugadores().get(i).getEdadDeJugador();
				}
				
				promedioDelEdad=(promedioDelEdad/equipo.getJugadores().size());
			}
		}
		
			
		return promedioDelEdad;
	}

	
	
	
}
