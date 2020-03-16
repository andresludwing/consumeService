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

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the persona service. Represents a row in the &quot;VASS_persona&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see personaModel
 * @generated
 */
@ImplementationClassName(
	"com.liferay.vass.ejer.serviceBuilderListClient.model.impl.personaImpl"
)
@ProviderType
public interface persona extends PersistedModel, personaModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.liferay.vass.ejer.serviceBuilderListClient.model.impl.personaImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<persona, Integer> CUSTOMER_ID_ACCESSOR =
		new Accessor<persona, Integer>() {

			@Override
			public Integer get(persona persona) {
				return persona.getCustomerId();
			}

			@Override
			public Class<Integer> getAttributeClass() {
				return Integer.class;
			}

			@Override
			public Class<persona> getTypeClass() {
				return persona.class;
			}

		};

}