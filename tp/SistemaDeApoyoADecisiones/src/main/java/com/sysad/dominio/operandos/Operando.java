package com.sysad.dominio.operandos;

import java.math.BigDecimal;

import com.sysad.dominio.Periodo;

public interface Operando {
    BigDecimal valor(Periodo periodo);
}
