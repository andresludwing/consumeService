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

package com.liferay.vass.ejer.serviceBuilderListClient.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.vass.ejer.serviceBuilderListClient.service.http.personaServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class personaSoap implements Serializable {

	public static personaSoap toSoapModel(persona model) {
		personaSoap soapModel = new personaSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setCustomerId(model.getCustomerId());
		soapModel.setStoreId(model.getStoreId());
		soapModel.setFirstName(model.getFirstName());
		soapModel.setLastName(model.getLastName());
		soapModel.setEmail(model.getEmail());
		soapModel.setAddressId(model.getAddressId());
		soapModel.setActivebool(model.getActivebool());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setLastUpdate(model.getLastUpdate());
		soapModel.setActive(model.getActive());

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

	public int getPrimaryKey() {
		return _customerId;
	}

	public void setPrimaryKey(int pk) {
		setCustomerId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public int getCustomerId() {
		return _customerId;
	}

	public void setCustomerId(int customerId) {
		_customerId = customerId;
	}

	public int getStoreId() {
		return _storeId;
	}

	public void setStoreId(int storeId) {
		_storeId = storeId;
	}

	public String getFirstName() {
		return _firstName;
	}

	public void setFirstName(String firstName) {
		_firstName = firstName;
	}

	public String getLastName() {
		return _lastName;
	}

	public void setLastName(String lastName) {
		_lastName = lastName;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public int getAddressId() {
		return _addressId;
	}

	public void setAddressId(int addressId) {
		_addressId = addressId;
	}

	public String getActivebool() {
		return _activebool;
	}

	public void setActivebool(String activebool) {
		_activebool = activebool;
	}

	public String getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(String createDate) {
		_createDate = createDate;
	}

	public String getLastUpdate() {
		return _lastUpdate;
	}

	public void setLastUpdate(String lastUpdate) {
		_lastUpdate = lastUpdate;
	}

	public String getActive() {
		return _active;
	}

	public void setActive(String active) {
		_active = active;
	}

	private String _uuid;
	private int _customerId;
	private int _storeId;
	private String _firstName;
	private String _lastName;
	private String _email;
	private int _addressId;
	private String _activebool;
	private String _createDate;
	private String _lastUpdate;
	private String _active;

}