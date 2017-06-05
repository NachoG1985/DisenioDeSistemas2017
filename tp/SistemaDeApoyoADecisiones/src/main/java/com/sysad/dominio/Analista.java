package com.sysad.dominio;
import java.util.*;

import com.sysad.utils.EmpresasUpload;

public class Analista {
		
	//Atributos
	private String ruta;  //Ruta donde se va a buscar el archivo a procesar
	private List<Empresa> empresas;

	//Metodos
	 
	public void cargarEmpresas(String ruta){
 		final EmpresasUpload empresasUpload = new EmpresasUpload();
 		List<Empresa> empresas = empresasUpload.procesarArchivo(ruta);
 		this.agregarEmpresas(empresas);
 		}
	
	public void agregarEmpresas(List<Empresa> empresasAAgregar) {
        empresas.addAll(empresasAAgregar);
    }

	public Empresa filtrarEmpresas (String nombre) {
        for (Empresa empresa : empresas) {
            if (empresa.getNombre().equalsIgnoreCase(nombre)){
                return empresa;
            }
        }
        return null;
    }
	public List<Cuenta> consultarCuentasPorEmpresaYPerdiodo(String nombreEmpresa, int periodo) {
		List<Cuenta> cuentas;
		cuentas = filtrarEmpresas(nombreEmpresa).getPeriodo(periodo).getCuentas();
		return cuentas;
	}
	//Getters and Setters

	public List<Empresa> getEmpresas () {
		return this.empresas;
	}
	public void setEmpresas (List<Empresa> empresas) {
		this.empresas = empresas;
	}
	 public String getRuta() {
	        return ruta;
	}

	public void setRuta(String ruta) {
	        this.ruta = ruta;
	}
}