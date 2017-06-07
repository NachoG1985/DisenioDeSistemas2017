package com.sysad.dominio.operaciones;

import java.math.BigDecimal;

public class Resta implements Operacion{
    
    public BigDecimal operar(BigDecimal lOperando, BigDecimal rOperando) {
        return lOperando.subtract(rOperando);
    }
}
