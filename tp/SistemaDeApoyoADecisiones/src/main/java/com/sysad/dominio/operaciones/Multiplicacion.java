package com.sysad.dominio.operaciones;

import java.math.BigDecimal;

public class Multiplicacion implements Operacion{
   
    public BigDecimal operar(BigDecimal lOperando, BigDecimal rOperando) {
        return lOperando.multiply(rOperando);
    }
}
