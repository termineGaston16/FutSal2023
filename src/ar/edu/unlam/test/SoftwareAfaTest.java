package ar.edu.unlam.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.dominio.Amonestados;
import ar.edu.unlam.dominio.Equipo;
import ar.edu.unlam.dominio.EquiposDeAfa;
import ar.edu.unlam.dominio.Expulsados;
import ar.edu.unlam.dominio.Gol;
import ar.edu.unlam.dominio.Jugador;
import ar.edu.unlam.dominio.PartidoRegistrado;
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
		
		eq=new Equipo("COLON",0.0,0.0);
		evaluarAgregarEquipoAlSistema=sa.agregarEquipoAlSistema(eq);
		assertTrue(evaluarAgregarEquipoAlSistema);
		
		
		Jugador ju=new Jugador("Messi",10000.0,35,EquiposDeAfa.SAN_LORENZO);
		boolean validarAgregarJugador=sa.agregarJugador(ju);
		assertTrue(validarAgregarJugador);
		
		ju=new Jugador("Pepi",54100.0,28,EquiposDeAfa.SAN_LORENZO);
		validarAgregarJugador=sa.agregarJugador(ju);
		assertTrue(validarAgregarJugador);
		
		ju=new Jugador("Raul",700.0,19,EquiposDeAfa.SAN_LORENZO);
		validarAgregarJugador=sa.agregarJugador(ju);
		assertTrue(validarAgregarJugador);
		
		ju=new Jugador("Alberto",450.0,90,EquiposDeAfa.SAN_LORENZO);
		validarAgregarJugador=sa.agregarJugador(ju);
		assertTrue(validarAgregarJugador);
		
		ju=new Jugador("Lola",600.0,25,EquiposDeAfa.SAN_LORENZO);
		validarAgregarJugador=sa.agregarJugador(ju);
		assertTrue(validarAgregarJugador);
		
		
		ju=new Jugador("Kun",850.0,25,EquiposDeAfa.COLON);
		validarAgregarJugador=sa.agregarJugador(ju);
		assertTrue(validarAgregarJugador);
		ju=new Jugador("Ren",1200.0,25,EquiposDeAfa.COLON);
		validarAgregarJugador=sa.agregarJugador(ju);
		assertTrue(validarAgregarJugador);
		
		
		valorTotalDeEquipo=sa.calcularElValorDelEquipo(EquiposDeAfa.SAN_LORENZO);
		assertEquals(65850, valorTotalDeEquipo,0.01);
		
		valorTotalDeEquipo=0.0;
		
		valorTotalDeEquipo=sa.calcularElValorDelEquipo(EquiposDeAfa.COLON);
		assertEquals(2050, valorTotalDeEquipo,0.01);
		
		
		
	}
	
	
	@Test 
	public void evaluarPromedioDeEdadDelEquipo() {
		
		SoftwareAfa sa=new SoftwareAfa("SOFTWARE DE AFA");
		Double edadPromedioDelEquipo=0.0;
		
		Equipo eq=new Equipo("SAN_LORENZO",0.0,0.0);
		boolean evaluarAgregarEquipoAlSistema=sa.agregarEquipoAlSistema(eq);
		assertTrue(evaluarAgregarEquipoAlSistema);
		
		Jugador ju=new Jugador("Messi",10000.0,35,EquiposDeAfa.SAN_LORENZO);
		boolean validarAgregarJugador=sa.agregarJugador(ju);
		assertTrue(validarAgregarJugador);
		
		ju=new Jugador("Pepi",54100.0,28,EquiposDeAfa.SAN_LORENZO);
		validarAgregarJugador=sa.agregarJugador(ju);
		assertTrue(validarAgregarJugador);
		
		ju=new Jugador("Raul",700.0,19,EquiposDeAfa.SAN_LORENZO);
		validarAgregarJugador=sa.agregarJugador(ju);
		assertTrue(validarAgregarJugador);
		
		ju=new Jugador("Alberto",450.0,90,EquiposDeAfa.SAN_LORENZO);
		validarAgregarJugador=sa.agregarJugador(ju);
		assertTrue(validarAgregarJugador);
		
		ju=new Jugador("Lola",600.0,25,EquiposDeAfa.SAN_LORENZO);
		validarAgregarJugador=sa.agregarJugador(ju);
		assertTrue(validarAgregarJugador);
		
		
		edadPromedioDelEquipo=sa.evaluarEdadPromedioDelEquipo(EquiposDeAfa.SAN_LORENZO);
		assertEquals(39.4, edadPromedioDelEquipo,0.01);
		
		
	}
	
	@Test
	public void evaluarAgregarGol() {
		
		int cantidadDeGolesRealizadosEnTotal=3;
		int cantidadDeJugadoresAmonestadosEnTotal=5;
		int cantidadDeJugadoresExpulsadosEnTotal=2;
		PartidoRegistrado pr=new PartidoRegistrado(0,cantidadDeGolesRealizadosEnTotal,cantidadDeJugadoresAmonestadosEnTotal,cantidadDeJugadoresExpulsadosEnTotal);
		boolean evaluarSiRegistrarGol=false;
		
		SoftwareAfa sa=new SoftwareAfa("SOFTWARE DE AFA");
		Gol gol=null;
		
		String nombreDelAutorDelGol="Messi";
		String minutoDelGol="(25:36)";
		
		gol=new Gol(nombreDelAutorDelGol,minutoDelGol);
		evaluarSiRegistrarGol=pr.registrarGol(gol,cantidadDeGolesRealizadosEnTotal);
		assertTrue(evaluarSiRegistrarGol);
		
		gol=new Gol(nombreDelAutorDelGol,minutoDelGol);
		evaluarSiRegistrarGol=pr.registrarGol(gol,cantidadDeGolesRealizadosEnTotal);
		assertTrue(evaluarSiRegistrarGol);
		
		gol=new Gol(nombreDelAutorDelGol,minutoDelGol);
		evaluarSiRegistrarGol=pr.registrarGol(gol,cantidadDeGolesRealizadosEnTotal);
		assertTrue(evaluarSiRegistrarGol);
		
		//_AGREGA UN CUARTO GOL_
		gol=new Gol(nombreDelAutorDelGol,minutoDelGol);
		evaluarSiRegistrarGol=pr.registrarGol(gol,cantidadDeGolesRealizadosEnTotal);
		assertFalse(evaluarSiRegistrarGol);
		
	}
	
	@Test
	public void evaluarAgregarAmonestados() {
		
		int cantidadDeGolesRealizadosEnTotal=3;
		int cantidadDeJugadoresAmonestadosEnTotal=5;
		int cantidadDeJugadoresExpulsadosEnTotal=2;
		PartidoRegistrado pr=new PartidoRegistrado(0,cantidadDeGolesRealizadosEnTotal,cantidadDeJugadoresAmonestadosEnTotal,cantidadDeJugadoresExpulsadosEnTotal);
		boolean evaluarSiRegistrarAmonestacion=false;
		
		SoftwareAfa sa=new SoftwareAfa("SOFTWARE DE AFA");
		Amonestados amonestados=null;
		
		String nombreDelAmonestado="Pepe";
		String minuto="(14:02)";
		Integer cantidadDeAmonestaciones=2;
		Boolean jugadorExpulsado=true;
		
		amonestados=new Amonestados(nombreDelAmonestado,minuto,cantidadDeAmonestaciones,jugadorExpulsado);
		evaluarSiRegistrarAmonestacion=pr.registrarAmonestacion(amonestados,cantidadDeJugadoresAmonestadosEnTotal);
		assertTrue(evaluarSiRegistrarAmonestacion);
		
		
	}
	
	@Test
	public void evaluarAgregarExpulsados() {
		
		int cantidadDeGolesRealizadosEnTotal=3;
		int cantidadDeJugadoresAmonestadosEnTotal=5;
		int cantidadDeJugadoresExpulsadosEnTotal=2;
		PartidoRegistrado pr=new PartidoRegistrado(0,cantidadDeGolesRealizadosEnTotal,cantidadDeJugadoresAmonestadosEnTotal,cantidadDeJugadoresExpulsadosEnTotal);
		boolean evaluarSiRegistrarExpulsacion=false;
		
		SoftwareAfa sa=new SoftwareAfa("SOFTWARE DE AFA");
		Expulsados expulsados=null;
		
		String nombreDelExpulsados="Pepe";
		Boolean expulsadoPorDobleAmonestacion=false;
		
		expulsados=new Expulsados(nombreDelExpulsados,expulsadoPorDobleAmonestacion);
		evaluarSiRegistrarExpulsacion=pr.registrarExpulsion(expulsados,cantidadDeJugadoresExpulsadosEnTotal);
		assertTrue(evaluarSiRegistrarExpulsacion);
		
		
	}
	
	
	@Test
	public void evaluarRegistrarPartido() {
		
		SoftwareAfa sa=new SoftwareAfa("SOFTWARE DE AFA");
		Equipo equipoLocal=null;
		Equipo equipoVisitante=null;
		Equipo equipoInexistente=null;
		
		//_SE AGREGAN LOS EQUIPOS_
		Equipo eq=new Equipo("RIVER_PLATE",0.0,0.0);
		boolean evaluarAgregarEquipoAlSistema=sa.agregarEquipoAlSistema(eq);
		assertTrue(evaluarAgregarEquipoAlSistema);
		
		eq=new Equipo("BOCA",0.0,0.0);
		evaluarAgregarEquipoAlSistema=sa.agregarEquipoAlSistema(eq);
		assertTrue(evaluarAgregarEquipoAlSistema);
		
		
		//_SE DEFINE EL EQUIPO LOCAL Y VISITANTE
		equipoLocal=sa.obtenerEquipoConNombre("RIVER_PLATE");
		equipoVisitante=sa.obtenerEquipoConNombre("BOCA");
		equipoInexistente=sa.obtenerEquipoConNombre("EQUIPO INEXISTENTE");
		
		assertNotNull(equipoLocal);
		assertNotNull(equipoVisitante);
		assertNull(equipoInexistente);
		
		
		//_SE REGISTRA UN PARTIDO_
		int cantidadDeGolesRealizadosEnTotal=3;
		int cantidadDeJugadoresAmonestadosEnTotal=5;
		int cantidadDeJugadoresExpulsadosEnTotal=2;
		int indiceDePartidoRegistrado=1;
		PartidoRegistrado pr=new PartidoRegistrado(indiceDePartidoRegistrado,cantidadDeGolesRealizadosEnTotal,cantidadDeJugadoresAmonestadosEnTotal,cantidadDeJugadoresExpulsadosEnTotal);
		Boolean verificarRegistrarPartido=false;
		
			//GOL_
			String nombreDelAutorDelGol="Messi";
			String minutoDelGol="(25:36)";
		
			Gol gol=new Gol("Lucho","(46:07)");
			Boolean evaluarSiRegistrarGol=pr.registrarGol(gol,cantidadDeGolesRealizadosEnTotal);
			assertTrue(evaluarSiRegistrarGol);
		
		
			//_AMONESTADOS_
			Amonestados amonestados=new Amonestados("Rojo","(12:58)",1,false);
			Boolean evaluarSiRegistrarAmonestacion=pr.registrarAmonestacion(amonestados,cantidadDeJugadoresAmonestadosEnTotal);
			assertTrue(evaluarSiRegistrarAmonestacion);
			
			amonestados=new Amonestados("Kike","(40:14)",2,true);
			evaluarSiRegistrarAmonestacion=pr.registrarAmonestacion(amonestados,cantidadDeJugadoresAmonestadosEnTotal);
			assertTrue(evaluarSiRegistrarAmonestacion);
			
			//_EXPULSADOS_
			Expulsados expulsados=new Expulsados("Ándres",true);
			Boolean evaluarSiRegistrarExpulsacion=pr.registrarExpulsion(expulsados,cantidadDeJugadoresExpulsadosEnTotal);
			assertTrue(evaluarSiRegistrarExpulsacion);
		
			
		verificarRegistrarPartido=sa.registrarPartido(pr);
		assertTrue(verificarRegistrarPartido);
			
			
	}

	
	
	
}
 