package com.liferay.portletConsumeServicioVASS.portlet;

import com.liferay.portletConsumeServicioVASS.constants.PortletConsumeServicioVASSPortletKeys;
import com.liferay.vass.apiProyectoService.model.Persona;
import com.liferay.vass.apiProyectoServicio.api.ApiProyectoServicio;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.configuration.ConfigurationFactoryUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author ludwing.jaimes
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.VASS",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=false",
		"javax.portlet.display-name=PortletConsumeServicioVASS",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + PortletConsumeServicioVASSPortletKeys.PORTLETCONSUMESERVICIOVASS,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class PortletConsumeServicioVASSPortlet extends MVCPortlet {
	
List<Persona> listPersona = new ArrayList<Persona>();
	
	private static final Configuration configuracion = ConfigurationFactoryUtil
			   .getConfiguration(PortalClassLoaderUtil.getClassLoader(), "portlet");

		
	
	
		public void buscarCedula(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortletException {
			
			Long cedula = ParamUtil.getLong(actionRequest, "cedula");
			String urlService = configuracion.get("urlService");
			String tokenService = configuracion.get("tokenService");
			String timeOuts = configuracion.get("timeOut");
			
			
			
			try {
				
				Object jsonPersona = apiProyectoServicio.consumeServicio(cedula, urlService, tokenService, timeOuts);
				
				//pasar de json a list persona
				
				System.out.println("la lista " + jsonPersona.toString());
				
				JSONObject aaa = JSONFactoryUtil.createJSONObject(jsonPersona.toString());
				String image = "firstname";
				System.out.println("como queda el aaa :" + aaa.getString(image));
				System.out.println("como queda el bbb :" + aaa.hashCode());
				
				ArrayList<String> list = new ArrayList<String>();     
				if (aaa != null) { 
				   int len = aaa.hashCode();
				   
				   
				}
				
				
				
			} catch (Exception e) {
				System.out.println("cath del portlet " +e.getMessage());
			}
		}
		
		@Reference
		ApiProyectoServicio apiProyectoServicio;
		
		
		public void prueba() {
			System.out.println("entra a el metodo");
			final String json = "{\"cedula\":46555,\"nombre\":\"Miguel\",\"foto\":\"kjhashdgjhasdfjbjfhbjhd\"}";
			final Gson gson = new Gson();
			final Persona empleado = gson.fromJson(json, Persona.class);
			System.out.println("lo del json :"+empleado.getFoto().toString());
			System.out.println("lo del json :"+empleado.getNombre().toString());
			System.out.println("lo del json :"+empleado.getCedula().toString());
			
		}
		
}