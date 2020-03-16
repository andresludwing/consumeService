/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.serviceBuilderVASS.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.serviceBuilderVASS.service.http.personaServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class personaSoap implements Serializable {

	public static personaSoap toSoapModel(persona model) {
		personaSoap soapModel = new personaSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setCedulaUser(model.getCedulaUser());
		soapModel.setNombreUser(model.getNombreUser());
		soapModel.setFotoUser(model.getFotoUser());

		return soapModel;
	}

	public static personaSoap[] toSoapModels(persona[] models) {
		personaSoap[] soapModels = new personaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static personaSoap[][] toSoapModels(persona[][] models) {
		personaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new personaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new personaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static personaSoap[] toSoapModels(List<persona> models) {
		List<personaSoap> soapModels = new ArrayList<personaSoap>(
			models.size());

		for (persona model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new personaSoap[soapModels.size()]);
	}

	public personaSoap() {
	}

	public long getPrimaryKey() {
		return _cedulaUser;
	}

	public void setPrimaryKey(long pk) {
		setCedulaUser(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getCedulaUser() {
		return _cedulaUser;
	}

	public void setCedulaUser(long cedulaUser) {
		_cedulaUser = cedulaUser;
	}

	public String getNombreUser() {
		return _nombreUser;
	}

	public void setNombreUser(String nombreUser) {
		_nombreUser = nombreUser;
	}

	public String getFotoUser() {
		return _fotoUser;
	}

	public void setFotoUser(String fotoUser) {
		_fotoUser = fotoUser;
	}

	private String _uuid;
	private long _cedulaUser;
	private String _nombreUser;
	private String _fotoUser;

}