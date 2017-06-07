package com.sysad.dominio.operandos;

import com.sysad.dominio.Cuenta;
import com.sysad.dominio.Periodo;
import java.math.BigDecimal;
import java.util.List;

public class CuentaOperando implements Operando{
    private String nombreCuenta;
    private boolean estado;

    public String getNombreCuenta() {
		return nombreCuenta;
	}

	public void setNombreCuenta(String nombreCuenta) {
		this.nombreCuenta = nombreCuenta;
	}

	public CuentaOperando(String nombre){
        nombreCuenta= nombre;
    }

    
    //De alguna manera tambien le tengo que hacer llegar la empresa

    //ojo que esta no es la misma cuenta que esta cargada
    //enttonces al devolver un valor, tiene que ir al repo buscar por nombre y traer el valor
    public BigDecimal valor(Periodo periodo){
        //EmpresasRepository.getInstance(); -- mme aprece que tmb necesito saber la empresa..
        return periodo.getMonto(nombreCuenta);
    }

    public boolean existe(List<Cuenta> cuentas){
    	cuentas.forEach(cuentaItem -> {
    		if(cuentaItem.getNombreCuenta().equals(nombreCuenta)){
    			estado = true;
    		}
    		else{
    			estado = false;
    		}
    	});
    	return estado;
    }

}
