package com.sysad.dominio.operaciones;

import java.math.BigDecimal;

public class Suma implements Operacion{

    
    public BigDecimal operar(BigDecimal lOperando, BigDecimal rOperando) {
        return lOperando.add(rOperando);
    }
}
