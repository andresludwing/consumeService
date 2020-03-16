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

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <p>
 * This class is a wrapper for {@link persona}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see persona
 * @generated
 */
@ProviderType
public class personaWrapper
	extends BaseModelWrapper<persona>
	implements persona, ModelWrapper<persona> {

	public personaWrapper(persona persona) {
		super(persona);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("cedulaUser", getCedulaUser());
		attributes.put("nombreUser", getNombreUser());
		attributes.put("fotoUser", getFotoUser());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long cedulaUser = (Long)attributes.get("cedulaUser");

		if (cedulaUser != null) {
			setCedulaUser(cedulaUser);
		}

		String nombreUser = (String)attributes.get("nombreUser");

		if (nombreUser != null) {
			setNombreUser(nombreUser);
		}

		String fotoUser = (String)attributes.get("fotoUser");

		if (fotoUser != null) {
			setFotoUser(fotoUser);
		}
	}

	/**
	 * Returns the cedula user of this persona.
	 *
	 * @return the cedula user of this persona
	 */
	@Override
	public long getCedulaUser() {
		return model.getCedulaUser();
	}

	/**
	 * Returns the foto user of this persona.
	 *
	 * @return the foto user of this persona
	 */
	@Override
	public String getFotoUser() {
		return model.getFotoUser();
	}

	/**
	 * Returns the nombre user of this persona.
	 *
	 * @return the nombre user of this persona
	 */
	@Override
	public String getNombreUser() {
		return model.getNombreUser();
	}

	/**
	 * Returns the primary key of this persona.
	 *
	 * @return the primary key of this persona
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the uuid of this persona.
	 *
	 * @return the uuid of this persona
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the cedula user of this persona.
	 *
	 * @param cedulaUser the cedula user of this persona
	 */
	@Override
	public void setCedulaUser(long cedulaUser) {
		model.setCedulaUser(cedulaUser);
	}

	/**
	 * Sets the foto user of this persona.
	 *
	 * @param fotoUser the foto user of this persona
	 */
	@Override
	public void setFotoUser(String fotoUser) {
		model.setFotoUser(fotoUser);
	}

	/**
	 * Sets the nombre user of this persona.
	 *
	 * @param nombreUser the nombre user of this persona
	 */
	@Override
	public void setNombreUser(String nombreUser) {
		model.setNombreUser(nombreUser);
	}

	/**
	 * Sets the primary key of this persona.
	 *
	 * @param primaryKey the primary key of this persona
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the uuid of this persona.
	 *
	 * @param uuid the uuid of this persona
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	protected personaWrapper wrap(persona persona) {
		return new personaWrapper(persona);
	}

}