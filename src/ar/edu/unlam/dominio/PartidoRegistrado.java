package ar.edu.unlam.dominio;

import java.util.ArrayList;

public class PartidoRegistrado {

	private ArrayList<Gol> golesHechos;
	private ArrayList<Amonestados> jugadoresAmonestados;
	private ArrayList<Expulsados> jugadoresExpulsados;
	private int indice;
	
	
	public PartidoRegistrado(int cantidadDeGolesRealizadosEnTotal, int cantidadDeJugadoresAmonestadosEnTotal, int cantidadDeJugadoresExpulsadosEnTotal, int indice) {
		this.golesHechos=new ArrayList<>();
		this.jugadoresAmonestados=new ArrayList<>(); 
		this.jugadoresExpulsados=new ArrayList<>(); 
		this.indice=indice;
	}


	public boolean registrarGol(Gol gol, int cantidadDeGolesRealizadosEnTotal) {
		
		if (this.golesHechos.size()<cantidadDeGolesRealizadosEnTotal) {
			this.golesHechos.add(gol);
			return true;
		}
		
		
		return false;
	}


	public boolean registrarAmonestacion(Amonestados amonestados, int cantidadDeJugadoresAmonestadosEnTotal) {
		if (this.jugadoresAmonestados.size()<cantidadDeJugadoresAmonestadosEnTotal) {
			this.jugadoresAmonestados.add(amonestados);
			return true;
		}
		return false;
	}


	public boolean registrarExpulsion(Expulsados expulsados, int cantidadDeJugadoresExpulsadosEnTotal) {
		if (this.jugadoresExpulsados.size()<cantidadDeJugadoresExpulsadosEnTotal) {
			this.jugadoresExpulsados.add(expulsados);
			return true;
		}
		return false;
	}
	
	
}
