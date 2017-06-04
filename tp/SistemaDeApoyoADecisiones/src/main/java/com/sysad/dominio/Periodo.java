package com.sysad.dominio;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class Periodo {

	public Periodo (int anio){
		this.anio = anio;
	}
	
	//Atributos
	
	 private List<Cuenta> cuentas = new ArrayList<>();
	 private int anio;

	//Metodos
	
	//Getters and Setters
	public int getPeriodo (){
        return anio;
    }
	public List<Cuenta> getCuentas() {
        return cuentas;
    }
	public void setCuentas(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
	public Cuenta findCuenta(String nombre) {
	    return cuentas.stream().filter(cuenta -> cuenta.getNombreCuenta() == nombre).findFirst().orElse(null);
	}

	public BigDecimal getMonto(String nombre) {
	        return findCuenta(nombre).getMontoCuenta();
	}
	
}
