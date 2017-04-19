package com.sysad.resources;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("SistemaDeApoyoADecisiones/user")
public class UserResources {

	@RequestMapping(value="/a", method=RequestMethod.GET)
	public Map<String,String> get(){
		// let say this is user having name=raks
		Map<String,String> map = new HashMap<String,String>();
		map.put("name", "raks");
		return map;
	}
	
	@RequestMapping(value="/b", method=RequestMethod.GET)
	public String getJuli(){
		// let say this is user having name=raks
		Map<String,String> map = new HashMap<String,String>();
		map.put("name", "raks");
		return "Hola Juli";
	}
}
