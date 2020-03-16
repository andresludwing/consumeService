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

package com.liferay.vass.ejer.serviceBuilderListClient.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.vass.ejer.serviceBuilderListClient.model.persona;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The cache model class for representing persona in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class personaCacheModel implements CacheModel<persona>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof personaCacheModel)) {
			return false;
		}

		personaCacheModel personaCacheModel = (personaCacheModel)obj;

		if (customerId == personaCacheModel.customerId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, customerId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", customerId=");
		sb.append(customerId);
		sb.append(", storeId=");
		sb.append(storeId);
		sb.append(", firstName=");
		sb.append(firstName);
		sb.append(", lastName=");
		sb.append(lastName);
		sb.append(", email=");
		sb.append(email);
		sb.append(", addressId=");
		sb.append(addressId);
		sb.append(", activebool=");
		sb.append(activebool);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", lastUpdate=");
		sb.append(lastUpdate);
		sb.append(", active=");
		sb.append(active);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public persona toEntityModel() {
		personaImpl personaImpl = new personaImpl();

		if (uuid == null) {
			personaImpl.setUuid("");
		}
		else {
			personaImpl.setUuid(uuid);
		}

		personaImpl.setCustomerId(customerId);
		personaImpl.setStoreId(storeId);

		if (firstName == null) {
			personaImpl.setFirstName("");
		}
		else {
			personaImpl.setFirstName(firstName);
		}

		if (lastName == null) {
			personaImpl.setLastName("");
		}
		else {
			personaImpl.setLastName(lastName);
		}

		if (email == null) {
			personaImpl.setEmail("");
		}
		else {
			personaImpl.setEmail(email);
		}

		personaImpl.setAddressId(addressId);

		if (activebool == null) {
			personaImpl.setActivebool("");
		}
		else {
			personaImpl.setActivebool(activebool);
		}

		if (createDate == null) {
			personaImpl.setCreateDate("");
		}
		else {
			personaImpl.setCreateDate(createDate);
		}

		if (lastUpdate == null) {
			personaImpl.setLastUpdate("");
		}
		else {
			personaImpl.setLastUpdate(lastUpdate);
		}

		if (active == null) {
			personaImpl.setActive("");
		}
		else {
			personaImpl.setActive(active);
		}

		personaImpl.resetOriginalValues();

		return personaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		customerId = objectInput.readInt();

		storeId = objectInput.readInt();
		firstName = objectInput.readUTF();
		lastName = objectInput.readUTF();
		email = objectInput.readUTF();

		addressId = objectInput.readInt();
		activebool = objectInput.readUTF();
		createDate = objectInput.readUTF();
		lastUpdate = objectInput.readUTF();
		active = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeInt(customerId);

		objectOutput.writeInt(storeId);

		if (firstName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(firstName);
		}

		if (lastName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(lastName);
		}

		if (email == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(email);
		}

		objectOutput.writeInt(addressId);

		if (activebool == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(activebool);
		}

		if (createDate == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(createDate);
		}

		if (lastUpdate == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(lastUpdate);
		}

		if (active == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(active);
		}
	}

	public String uuid;
	public int customerId;
	public int storeId;
	public String firstName;
	public String lastName;
	public String email;
	public int addressId;
	public String activebool;
	public String createDate;
	public String lastUpdate;
	public String active;

}