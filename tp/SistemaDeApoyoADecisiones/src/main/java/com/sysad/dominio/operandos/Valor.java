package com.sysad.dominio.operandos;

import com.sysad.dominio.Periodo;
import org.apache.commons.lang.math.NumberUtils;
import java.math.BigDecimal;

public class Valor implements Operando {

    private BigDecimal valor;

    public Valor(String valor) {
        this.valor = NumberUtils.createBigDecimal(valor);;
    }

   
    public BigDecimal valor(Periodo periodo) {
        return valor;
    }

}
