package com.liferay.vass.ejer.apiListClient.api;

import com.liferay.vass.ejer.apiListClient.model.Persona;

import java.util.List;

/**
 * @author ludwing.jaimes
 */
public interface ApiListClient {
	public List<Persona> bringList (String urlService);
}