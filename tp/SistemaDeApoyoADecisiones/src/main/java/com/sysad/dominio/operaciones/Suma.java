package com.sysad.dominio.operaciones;

import java.math.BigDecimal;

public class Suma implements Operacion{

    @Override
    public BigDecimal operar(BigDecimal lOperando, BigDecimal rOperando) {
        return lOperando.add(rOperando);
    }
}
