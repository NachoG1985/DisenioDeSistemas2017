package com.sysad.dominio;

import java.math.BigDecimal;

public class Cuenta {

	//Constructor
		
	public Cuenta(String nombreCuenta, BigDecimal monto) {
		this.nombre = nombreCuenta;
		this.setMontoCuenta(monto);
	}

	//Atributos
	private String nombre;	
	private BigDecimal monto;
	
	//Metodos
	//Getters and Setters

	public String getNombreCuenta() {
		return nombre;
	}

	public void setNombreCuenta(String nombre) {
		this.nombre = nombre;
	}

	
	public BigDecimal getMontoCuenta() {
		return monto;
	}

	public void setMontoCuenta(BigDecimal monto) {
		this.monto = monto;
	}	
	
	
}
