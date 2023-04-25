package ar.edu.unlam.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.dominio.Equipo;
import ar.edu.unlam.dominio.EquiposDeAfa;
import ar.edu.unlam.dominio.Jugador;
import ar.edu.unlam.dominio.SoftwareAfa;

public class SoftwareAfaTest {
	
	
	@Test
	public void evaluarAgregarEquipoAlSistema() {
		SoftwareAfa sa=new SoftwareAfa("SOFTWARE DE AFA");
		
		Equipo eq=null;
		boolean evaluarAgregarEquipoAlSistema=false;
		
		String nombreDelEquipo="RIVER PLATE";
		Double valorDelEquipo=0.0;
		Double edadPromedioDelEquipo=0.0;
		
		eq=new Equipo("RIVER_PLATE",0.0,0.0);
		evaluarAgregarEquipoAlSistema=sa.agregarEquipoAlSistema(eq);
		assertTrue(evaluarAgregarEquipoAlSistema);
		
		eq=new Equipo("SAN_LORENZO",0.0,0.0);
		evaluarAgregarEquipoAlSistema=sa.agregarEquipoAlSistema(eq);
		assertTrue(evaluarAgregarEquipoAlSistema);
		
		eq=new Equipo("DEFENSA_Y_JUSTICIA",0.0,0.0);
		evaluarAgregarEquipoAlSistema=sa.agregarEquipoAlSistema(eq);
		assertTrue(evaluarAgregarEquipoAlSistema);
		
		eq=new Equipo("BELGRANO",0.0,0.0);
		evaluarAgregarEquipoAlSistema=sa.agregarEquipoAlSistema(eq);
		assertTrue(evaluarAgregarEquipoAlSistema);
		
		eq=new Equipo("ROSARIO_CENTRAL",0.0,0.0);
		evaluarAgregarEquipoAlSistema=sa.agregarEquipoAlSistema(eq);
		assertTrue(evaluarAgregarEquipoAlSistema);
		
		eq=new Equipo("LANUS",0.0,0.0);
		evaluarAgregarEquipoAlSistema=sa.agregarEquipoAlSistema(eq);
		assertTrue(evaluarAgregarEquipoAlSistema);
		
		eq=new Equipo("TALLERES",0.0,0.0);
		evaluarAgregarEquipoAlSistema=sa.agregarEquipoAlSistema(eq);
		assertTrue(evaluarAgregarEquipoAlSistema);
		
		eq=new Equipo("ESTUDIANTES",0.0,0.0);
		evaluarAgregarEquipoAlSistema=sa.agregarEquipoAlSistema(eq);
		assertTrue(evaluarAgregarEquipoAlSistema);
		
		eq=new Equipo("GODOY_CRUZ",0.0,0.0);
		evaluarAgregarEquipoAlSistema=sa.agregarEquipoAlSistema(eq);
		assertTrue(evaluarAgregarEquipoAlSistema);
		
		eq=new Equipo("ARGENTINOS_JUNIORS",0.0,0.0);
		evaluarAgregarEquipoAlSistema=sa.agregarEquipoAlSistema(eq);
		assertTrue(evaluarAgregarEquipoAlSistema);
		
		eq=new Equipo("RACING_CLUB",0.0,0.0);
		evaluarAgregarEquipoAlSistema=sa.agregarEquipoAlSistema(eq);
		assertTrue(evaluarAgregarEquipoAlSistema);
		
		eq=new Equipo("NEWELL",0.0,0.0);
		evaluarAgregarEquipoAlSistema=sa.agregarEquipoAlSistema(eq);
		assertTrue(evaluarAgregarEquipoAlSistema);
		
		eq=new Equipo("PLATENSE",0.0,0.0);
		evaluarAgregarEquipoAlSistema=sa.agregarEquipoAlSistema(eq);
		assertTrue(evaluarAgregarEquipoAlSistema);
		
		eq=new Equipo("INSTITUTO",0.0,0.0);
		evaluarAgregarEquipoAlSistema=sa.agregarEquipoAlSistema(eq);
		assertTrue(evaluarAgregarEquipoAlSistema);
		
		eq=new Equipo("TIGRE",0.0,0.0);
		evaluarAgregarEquipoAlSistema=sa.agregarEquipoAlSistema(eq);
		assertTrue(evaluarAgregarEquipoAlSistema);
		
		eq=new Equipo("VELEZ",0.0,0.0);
		evaluarAgregarEquipoAlSistema=sa.agregarEquipoAlSistema(eq);
		assertTrue(evaluarAgregarEquipoAlSistema);
		
		eq=new Equipo("BOCA_JUNIORS",0.0,0.0);
		evaluarAgregarEquipoAlSistema=sa.agregarEquipoAlSistema(eq);
		assertTrue(evaluarAgregarEquipoAlSistema);
		
		eq=new Equipo("SARMIENTO",0.0,0.0);
		evaluarAgregarEquipoAlSistema=sa.agregarEquipoAlSistema(eq);
		assertTrue(evaluarAgregarEquipoAlSistema);
		
		eq=new Equipo("CENTRAL_CORDOBA",0.0,0.0);
		evaluarAgregarEquipoAlSistema=sa.agregarEquipoAlSistema(eq);
		assertTrue(evaluarAgregarEquipoAlSistema);
		
		eq=new Equipo("COLON",0.0,0.0);
		evaluarAgregarEquipoAlSistema=sa.agregarEquipoAlSistema(eq);
		assertTrue(evaluarAgregarEquipoAlSistema);
		
		eq=new Equipo("BANFIELD",0.0,0.0);
		evaluarAgregarEquipoAlSistema=sa.agregarEquipoAlSistema(eq);
		assertTrue(evaluarAgregarEquipoAlSistema);
		
		eq=new Equipo("GIMNASIA",0.0,0.0);
		evaluarAgregarEquipoAlSistema=sa.agregarEquipoAlSistema(eq);
		assertTrue(evaluarAgregarEquipoAlSistema);
		
		eq=new Equipo("HURACAN",0.0,0.0);
		evaluarAgregarEquipoAlSistema=sa.agregarEquipoAlSistema(eq);
		assertTrue(evaluarAgregarEquipoAlSistema);
		
		eq=new Equipo("ATLETICO_TUCUMAN",0.0,0.0);
		evaluarAgregarEquipoAlSistema=sa.agregarEquipoAlSistema(eq);
		assertTrue(evaluarAgregarEquipoAlSistema);
		
		eq=new Equipo("BARRACAS_CENTRAL",0.0,0.0);
		evaluarAgregarEquipoAlSistema=sa.agregarEquipoAlSistema(eq);
		assertTrue(evaluarAgregarEquipoAlSistema);
		
		//_AGREGAR UN EQUIPO 26_
		eq=new Equipo("EQUIPO EXTRA",0.0,0.0);
		evaluarAgregarEquipoAlSistema=sa.agregarEquipoAlSistema(eq);
		assertFalse(evaluarAgregarEquipoAlSistema);
		
	}
	
	
	@Test
	public void evaluarAgregarJugadores() {
		
		SoftwareAfa sa=new SoftwareAfa("SOFTWARE DE AFA");
		Jugador ju=null;
		boolean validarAgregarJugador=false;
		
		String nombreDeljugador="Messi";
		Double precioDelJugador=10000.0;
		Integer edadDeJugador=35;
		EquiposDeAfa equipoSeleccionado=EquiposDeAfa.SAN_LORENZO;
		
		
		
		Equipo eq=new Equipo("SAN_LORENZO",0.0,0.0);
		boolean evaluarAgregarEquipoAlSistema=sa.agregarEquipoAlSistema(eq);
		assertTrue(evaluarAgregarEquipoAlSistema);
		
		
		
		ju=new Jugador("Messi",10000.0,35,EquiposDeAfa.SAN_LORENZO);
		validarAgregarJugador=sa.agregarJugador(ju);
		assertTrue(validarAgregarJugador);
		
		ju=new Jugador("Pepi",54100.0,28,EquiposDeAfa.SAN_LORENZO);
		validarAgregarJugador=sa.agregarJugador(ju);
		assertTrue(validarAgregarJugador);
		
		ju=new Jugador("Raul",700.0,19,EquiposDeAfa.SAN_LORENZO);
		validarAgregarJugador=sa.agregarJugador(ju);
		assertTrue(validarAgregarJugador);
		
		ju=new Jugador("Alberto",45.0,90,EquiposDeAfa.SAN_LORENZO);
		validarAgregarJugador=sa.agregarJugador(ju);
		assertTrue(validarAgregarJugador);
		
		ju=new Jugador("Lola",46200.0,25,EquiposDeAfa.SAN_LORENZO);
		validarAgregarJugador=sa.agregarJugador(ju);
		assertTrue(validarAgregarJugador);
		
		
		//_AGREGAR A UN SEXTO JUGADOR_
		ju=new Jugador("Sexto jugador",46200.0,25,EquiposDeAfa.SAN_LORENZO);
		validarAgregarJugador=sa.agregarJugador(ju);
		assertFalse(validarAgregarJugador);
	}

	
	@Test
	public void evaluarValorDelEquipo() {
		
		SoftwareAfa sa=new SoftwareAfa("SOFTWARE DE AFA");
		Double valorTotalDeEquipo=0.0;
		
		Equipo eq=new Equipo("SAN_LORENZO",0.0,0.0);
		boolean evaluarAgregarEquipoAlSistema=sa.agregarEquipoAlSistema(eq);
		assertTrue(evaluarAgregarEquipoAlSistema);
		
		jugador ju=new Jugador("Messi",10000.0,35,EquiposDeAfa.SAN_LORENZO);
		boolean validarAgregarJugador=sa.agregarJugador(ju);
		assertTrue(validarAgregarJugador);
		
		
	}
	
	
}
 