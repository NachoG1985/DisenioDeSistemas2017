package com.sysad.dominio;

import java.util.List;

public class Empresa {

	//Constructor
		
	public Empresa(String nombreCuenta, String nombreEmpresa, String periodo, Double valor) {
		this.nombre = nombreEmpresa;
	}

	//Atributos
	private String nombre;
	private List<Periodo> periodos;
	
	
	
	//Metodos
	public List<Cuenta> cuentasPorPeriodo (int periodo){
        for (Periodo p : periodos) {
            if (p.getPeriodo()==periodo){
                return p.getCuentas();
            }
        }
        return null;
    }
	
	public Periodo getPeriodo(int periodoFilter) {
	    for (Periodo p : periodos) {
	         if (p.getPeriodo()==periodoFilter){
	             return p;
	            }
	        }
	        return null;
	    }
		
	//Getters and Setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String empresa) {
		this.nombre = empresa;
	}

	public List<Periodo> getPeriodos() {
		return periodos;
	}

	public void setPeriodos(List<Periodo> periodos) {
		this.periodos = periodos;
	}	
	
	
}
