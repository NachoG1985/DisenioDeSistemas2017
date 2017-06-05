package com.sysad.utils;

import com.sysad.dominio.Empresa;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.uqbar.commons.model.UserException;
import org.json.simple.parser.ParseException;

public class EmpresasUpload {

    /*public List<Empresa> procesarArchivo(String ruta) {
        List<Empresa> empresas = new ArrayList<>();
        JSONParser parser = new JSONParser();
        ParserJson jsonParser = new ParserJson();
        Object obj;
        try {
            obj = parser.parse(new FileReader(ruta));
            JSONArray jsonArray = (JSONArray) obj;
            jsonArray.forEach(item -> {
                JSONObject json = (JSONObject) item;
                empresas.add(jsonParser.jsonAEmpresa(json));
            });
        } catch (IOException e) {
            throw new UserException("No se encontro el archivo");
        } catch (ParseException e) {
            throw new ExcepcionParseo("El archivo no se pudo cargar, por favor verifique que el formato sea el correcto");
        }
        return empresas;
    }*/
	public List<Empresa> procesarArchivo(String ruta){ 
		List<Empresa> empresas = new ArrayList<>();
		JsonParser jsonParser = new JsonParser();
		try {
		empresas = jsonParser.jsonAEmpresa(new FileReader(ruta));
		} catch (IOException e) {
            throw new UserException("No se encontro el archivo");
		}
		return empresas;
	}
}