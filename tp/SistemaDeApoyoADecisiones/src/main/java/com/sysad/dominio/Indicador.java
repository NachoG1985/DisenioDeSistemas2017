package com.sysad.dominio;

import com.sysad.dominio.operandos.Bodoque;


public class Indicador{

	private String nombre;
	private Bodoque bodoque;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Bodoque getBodoque() {
		return bodoque;
	}

	public void setBodoque(Bodoque bodoque) {
		this.bodoque = bodoque;
	}
}
