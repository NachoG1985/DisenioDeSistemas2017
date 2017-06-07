package com.sysad.dominio.operandos;

import com.sysad.dominio.Periodo;
import java.math.BigDecimal;

public interface Operando {
    BigDecimal valor(Periodo periodo);

}
