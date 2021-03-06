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

package com.liferay.vass.ejer.serviceBuilderListClient.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.vass.ejer.serviceBuilderListClient.service.base.personaServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the persona remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.liferay.vass.ejer.serviceBuilderListClient.service.personaService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see personaServiceBaseImpl
 */
@Component(
	property = {
		"json.web.service.context.name=vass",
		"json.web.service.context.path=persona"
	},
	service = AopService.class
)
public class personaServiceImpl extends personaServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use <code>com.liferay.vass.ejer.serviceBuilderListClient.service.personaServiceUtil</code> to access the persona remote service.
	 */
}