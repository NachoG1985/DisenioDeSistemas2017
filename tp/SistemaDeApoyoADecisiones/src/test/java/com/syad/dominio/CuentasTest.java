package com.syad.dominio;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.*;
import com.sysad.dominio.Analista;


public class CuentasTest {
	
	//Atributo
	private Analista analista;
	//Metodos
	
	@Before
	public void init() {		
		this.analista = new Analista();
		this.analista.setEmpresas(new ArrayList<>());
		analista.cargarEmpresas("json.txt");
		
	}
	
	@Test
	//Probar si se cargaron las cuentas
	public void deberiaColeccionTenerDosEmpresas() {
		assertEquals(analista.getEmpresas().size(),2);
	}
	
	@Test
	//Muestra las cuentas que cumplen las condiciones, deberian ser dos
	public void deberiaEncontrarDosCuentas() {
		assertEquals(analista.consultarCuentasPorEmpresaYPerdiodo("Facebook",2017).size(),2);
	}
	
}
