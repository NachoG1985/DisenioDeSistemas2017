package com.sysad.utils;

import org.apache.commons.lang.math.NumberUtils;

import com.sysad.dominio.Indicador;
import com.sysad.dominio.operandos.CuentaOperando;
import com.sysad.dominio.operandos.Valor;
import com.sysad.javacc.ArithmeticParser;
import com.sysad.javacc.Token;

import java.io.StringReader;
import java.util.Iterator;

/**
 * Parser que recibe un string con la informacion de
 * el indicador, y devuelve un indicador construido.
 */
public class IndicadorParser {
    private Indicador indicador = new Indicador();
    public Indicador generarIndicador(String nombre, String formula){
        StringReader sr = new StringReader(formula);
        ArithmeticParser arithmeticParser = new ArithmeticParser(sr);

        indicador.setNombre(nombre);
        indicador.setFormula(formula);
//        Token token = arithmeticParser.getNextToken();

        //Con alguna hermosa estructura como un for

        this.agregarAIndicador(arithmeticParser.getNextToken());
        this.agregarAIndicador(arithmeticParser.getNextToken());
        this.agregarAIndicador(arithmeticParser.getNextToken());
        this.llenarOperandos();
        return indicador;
    }

    private void agregarAIndicador(Token token) {
        if(token.kind == 9){
            indicador.setSimbolo(token.toString());
        }else if(token.kind == 11){
            indicador.addOperandos(new Valor(NumberUtils.createBigDecimal(token.toString())));
        }else if(token.kind == 12){
            indicador.addOperandos(new CuentaOperando(token.toString()));
        }
    }

    private void llenarOperandos(){
        indicador.setPrimerOperando(indicador.getOperandos().get(0));
        indicador.setSegundoOperando(indicador.getOperandos().get(1));
    }
}
