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

package com.liferay.serviceBuilderVASS.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.serviceBuilderVASS.model.persona;

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

		if (cedulaUser == personaCacheModel.cedulaUser) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, cedulaUser);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", cedulaUser=");
		sb.append(cedulaUser);
		sb.append(", nombreUser=");
		sb.append(nombreUser);
		sb.append(", fotoUser=");
		sb.append(fotoUser);
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

		personaImpl.setCedulaUser(cedulaUser);

		if (nombreUser == null) {
			personaImpl.setNombreUser("");
		}
		else {
			personaImpl.setNombreUser(nombreUser);
		}

		if (fotoUser == null) {
			personaImpl.setFotoUser("");
		}
		else {
			personaImpl.setFotoUser(fotoUser);
		}

		personaImpl.resetOriginalValues();

		return personaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		cedulaUser = objectInput.readLong();
		nombreUser = objectInput.readUTF();
		fotoUser = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(cedulaUser);

		if (nombreUser == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nombreUser);
		}

		if (fotoUser == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fotoUser);
		}
	}

	public String uuid;
	public long cedulaUser;
	public String nombreUser;
	public String fotoUser;

}