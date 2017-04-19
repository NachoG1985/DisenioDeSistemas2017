package com.sysad.common.entities;
import java.util.List;

public class Analista {
	private List<Cuenta> cuentas;
	
	public void cargarCuentas(){
		//cargar archivo
	}
	
	public void cargarCuentaNueva(Cuenta cuenta){
		//cargar en archivo cuenta nueva
	}
	
	public List<Cuenta> consultarCuentas(String empresa, Integer periodo){
		List<Cuenta> cuentas = null;
		//devolver lista de cuentas que correspondan a la peticion
		
		return cuentas;
	}
	
}
