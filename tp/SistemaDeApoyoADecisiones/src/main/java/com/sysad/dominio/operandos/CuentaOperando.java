package com.sysad.dominio.operandos;

import java.math.BigDecimal;

import com.sysad.dominio.Periodo;

public class CuentaOperando implements Operando{
    private String nombre;
    public CuentaOperando(String nombre) {
        this.nombre= nombre;
    }

    @Override
    public BigDecimal valor(Periodo periodo) {
        return periodo.getMonto(nombre);
    }
}
