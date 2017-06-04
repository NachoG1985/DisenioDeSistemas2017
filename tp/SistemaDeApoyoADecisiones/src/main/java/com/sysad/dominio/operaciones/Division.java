package com.sysad.dominio.operaciones;

import java.math.BigDecimal;

public class Division implements Operacion{

    @Override
    public BigDecimal operar(BigDecimal lOperando, BigDecimal rOperando) {
            return lOperando.divide(rOperando);
    }
}
