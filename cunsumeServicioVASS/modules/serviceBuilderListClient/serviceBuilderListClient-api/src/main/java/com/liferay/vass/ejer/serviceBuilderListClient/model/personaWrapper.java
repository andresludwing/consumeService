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
		attributes.put("customerId", getCustomerId());
		attributes.put("storeId", getStoreId());
		attributes.put("firstName", getFirstName());
		attributes.put("lastName", getLastName());
		attributes.put("email", getEmail());
		attributes.put("addressId", getAddressId());
		attributes.put("activebool", getActivebool());
		attributes.put("createDate", getCreateDate());
		attributes.put("lastUpdate", getLastUpdate());
		attributes.put("active", getActive());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Integer customerId = (Integer)attributes.get("customerId");

		if (customerId != null) {
			setCustomerId(customerId);
		}

		Integer storeId = (Integer)attributes.get("storeId");

		if (storeId != null) {
			setStoreId(storeId);
		}

		String firstName = (String)attributes.get("firstName");

		if (firstName != null) {
			setFirstName(firstName);
		}

		String lastName = (String)attributes.get("lastName");

		if (lastName != null) {
			setLastName(lastName);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		Integer addressId = (Integer)attributes.get("addressId");

		if (addressId != null) {
			setAddressId(addressId);
		}

		String activebool = (String)attributes.get("activebool");

		if (activebool != null) {
			setActivebool(activebool);
		}

		String createDate = (String)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		String lastUpdate = (String)attributes.get("lastUpdate");

		if (lastUpdate != null) {
			setLastUpdate(lastUpdate);
		}

		String active = (String)attributes.get("active");

		if (active != null) {
			setActive(active);
		}
	}

	/**
	 * Returns the active of this persona.
	 *
	 * @return the active of this persona
	 */
	@Override
	public String getActive() {
		return model.getActive();
	}

	/**
	 * Returns the activebool of this persona.
	 *
	 * @return the activebool of this persona
	 */
	@Override
	public String getActivebool() {
		return model.getActivebool();
	}

	/**
	 * Returns the address ID of this persona.
	 *
	 * @return the address ID of this persona
	 */
	@Override
	public int getAddressId() {
		return model.getAddressId();
	}

	/**
	 * Returns the create date of this persona.
	 *
	 * @return the create date of this persona
	 */
	@Override
	public String getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the customer ID of this persona.
	 *
	 * @return the customer ID of this persona
	 */
	@Override
	public int getCustomerId() {
		return model.getCustomerId();
	}

	/**
	 * Returns the email of this persona.
	 *
	 * @return the email of this persona
	 */
	@Override
	public String getEmail() {
		return model.getEmail();
	}

	/**
	 * Returns the first name of this persona.
	 *
	 * @return the first name of this persona
	 */
	@Override
	public String getFirstName() {
		return model.getFirstName();
	}

	/**
	 * Returns the last name of this persona.
	 *
	 * @return the last name of this persona
	 */
	@Override
	public String getLastName() {
		return model.getLastName();
	}

	/**
	 * Returns the last update of this persona.
	 *
	 * @return the last update of this persona
	 */
	@Override
	public String getLastUpdate() {
		return model.getLastUpdate();
	}

	/**
	 * Returns the primary key of this persona.
	 *
	 * @return the primary key of this persona
	 */
	@Override
	public int getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the store ID of this persona.
	 *
	 * @return the store ID of this persona
	 */
	@Override
	public int getStoreId() {
		return model.getStoreId();
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
	 * Sets the active of this persona.
	 *
	 * @param active the active of this persona
	 */
	@Override
	public void setActive(String active) {
		model.setActive(active);
	}

	/**
	 * Sets the activebool of this persona.
	 *
	 * @param activebool the activebool of this persona
	 */
	@Override
	public void setActivebool(String activebool) {
		model.setActivebool(activebool);
	}

	/**
	 * Sets the address ID of this persona.
	 *
	 * @param addressId the address ID of this persona
	 */
	@Override
	public void setAddressId(int addressId) {
		model.setAddressId(addressId);
	}

	/**
	 * Sets the create date of this persona.
	 *
	 * @param createDate the create date of this persona
	 */
	@Override
	public void setCreateDate(String createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the customer ID of this persona.
	 *
	 * @param customerId the customer ID of this persona
	 */
	@Override
	public void setCustomerId(int customerId) {
		model.setCustomerId(customerId);
	}

	/**
	 * Sets the email of this persona.
	 *
	 * @param email the email of this persona
	 */
	@Override
	public void setEmail(String email) {
		model.setEmail(email);
	}

	/**
	 * Sets the first name of this persona.
	 *
	 * @param firstName the first name of this persona
	 */
	@Override
	public void setFirstName(String firstName) {
		model.setFirstName(firstName);
	}

	/**
	 * Sets the last name of this persona.
	 *
	 * @param lastName the last name of this persona
	 */
	@Override
	public void setLastName(String lastName) {
		model.setLastName(lastName);
	}

	/**
	 * Sets the last update of this persona.
	 *
	 * @param lastUpdate the last update of this persona
	 */
	@Override
	public void setLastUpdate(String lastUpdate) {
		model.setLastUpdate(lastUpdate);
	}

	/**
	 * Sets the primary key of this persona.
	 *
	 * @param primaryKey the primary key of this persona
	 */
	@Override
	public void setPrimaryKey(int primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the store ID of this persona.
	 *
	 * @param storeId the store ID of this persona
	 */
	@Override
	public void setStoreId(int storeId) {
		model.setStoreId(storeId);
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