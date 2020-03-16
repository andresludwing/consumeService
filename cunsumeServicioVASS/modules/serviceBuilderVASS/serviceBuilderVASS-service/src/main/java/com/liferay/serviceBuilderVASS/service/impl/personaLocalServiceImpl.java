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

package com.liferay.serviceBuilderVASS.service.impl;


import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.serviceBuilderVASS.model.persona;
import com.liferay.serviceBuilderVASS.model.personaModel;
import com.liferay.serviceBuilderVASS.service.base.personaLocalServiceBaseImpl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.io.IOUtils;
import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the persona local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.liferay.serviceBuilderVASS.service.personaLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see personaLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=com.liferay.serviceBuilderVASS.model.persona",
	service = AopService.class
)
public class personaLocalServiceImpl extends personaLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>com.liferay.serviceBuilderVASS.service.personaLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.liferay.serviceBuilderVASS.service.personaLocalServiceUtil</code>.
	 */

	
	private static final String ENCODING = "UTF-8";
	public List<persona> consumeServiceRestDos(Long cedulaService, String urlService, String tokenService, String timeOuts){
		List<persona> personaServicio = new ArrayList<persona>();
		
		int timeOut = Integer.parseInt(timeOuts);		
		System.out.println("llego a traeDatos");
		System.out.println("cediula :"+cedulaService);
		System.out.println("url :"+urlService);
		System.out.println("token "+tokenService);

		String response = null;
		JSONObject jsonResponse = JSONFactoryUtil.createJSONObject();
		
		try {
			StringBuilder urlServices = new StringBuilder(urlService);
			
			urlServices.append(cedulaService);
			URL urlCall = new URL(urlServices.toString());
			HttpURLConnection conn = (HttpURLConnection) urlCall.openConnection();
			
			conn.setConnectTimeout(timeOut);
			conn.setReadTimeout(timeOut);
			
			conn.addRequestProperty("Autorization", tokenService);
			conn.setRequestMethod("GET");
			
			if (conn.getResponseCode() != HttpStatus.SC_OK) {
				response = IOUtils.toString(conn.getErrorStream(), ENCODING);
				
			}else {
				response = IOUtils.toString(conn.getInputStream(), ENCODING);
				
				
			}
			
			
			
			
			
		} catch (Exception e) {
			System.out.println("entra a el cath :"+e.getMessage());
		}
		
		
		return personaServicio;
		
	}
	
	
}