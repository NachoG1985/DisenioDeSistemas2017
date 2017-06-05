package com.sysad.utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sysad.dominio.Empresa;

import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;

public class JsonParser {

	List<Empresa> jsonAEmpresa(FileReader jsonString) {
            Gson gson = new Gson();
            Type tipoListaEmpresas = new TypeToken<List<Empresa>>(){}.getType();
            return gson.fromJson(jsonString, tipoListaEmpresas);
    }

}
