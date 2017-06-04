package com.sysad.dominio.operandos;

import java.math.BigDecimal;

import com.sysad.dominio.Periodo;

public class Valor implements Operando {
    private final BigDecimal valor;

    public Valor(BigDecimal valor) {
        this.valor = valor;
    }

    @Override
    public BigDecimal valor(Periodo periodo) {
        return getValor();
    }

    public BigDecimal getValor() {
        return valor;
    }

}
