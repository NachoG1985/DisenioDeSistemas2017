package com.sysad.utils;

import com.sysad.javacc.ArithmeticParser;
import com.sysad.javacc.ParseException;
import com.sysad.dominio.Indicador;
import org.uqbar.commons.model.UserException;

import java.io.StringReader;

/**
 * Parser que recibe un string con la informacion de
 * el indicador, y devuelve un indicador construido.
 */
public class IndicadorParser {

    private Indicador indicador;
    public Indicador generarIndicador(String nombre, String formula){
        StringReader sr = new StringReader(formula);
        ArithmeticParser arithmeticParser = new ArithmeticParser(sr);

        try {
             arithmeticParser.Start();
             final Indicador indicador = new Indicador();
             indicador.setBodoque(arithmeticParser.getBodoqueDevolver());
             //IndicadoresRepository.getInstance().update(indicador);
             return indicador;
        }catch(ParseException e){
            throw new UserException("La formula que ingreso no es valida, por favor intente de nuevo");
        }
    }
}
