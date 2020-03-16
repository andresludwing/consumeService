package com.liferay.vass.apiProyectoServicio.api;

import com.liferay.vass.apiProyectoService.model.Persona;

import java.util.List;

/**
 * @author ludwing.jaimes
 */
public interface ApiProyectoServicio {
	
	public Object consumeServicio(Long cedula, String url, String token, String timeout); 
	
}