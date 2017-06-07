package com.sysad.dominio.operandos;

import com.sysad.dominio.Periodo;
import com.sysad.dominio.operaciones.Operacion;
import java.math.BigDecimal;

public class Bodoque implements Operando{

    private Operando primerOperando;
    private Operando segundoOperando;
    private Operacion operacion;

    
    public BigDecimal valor(Periodo periodo) {
        return operacion.operar(primerOperando.valor(periodo), segundoOperando.valor(periodo));
    }

    public Operando getPrimerOperando() {
        return primerOperando;
    }

    public void setPrimerOperando(Operando primerOperando) {
        this.primerOperando = primerOperando;
    }

    public Operando getSegundoOperando() {
        return segundoOperando;
    }

    public void setSegundoOperando(Operando segundoOperando) {
        this.segundoOperando = segundoOperando;
    }

    public void setOperacion(Operacion operacion) {
        this.operacion = operacion;
    }

}
