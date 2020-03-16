package com.liferay.vass.ejer.portletserviceListClient.portlet;

import com.liferay.vass.ejer.portletserviceListClient.constants.PortletserviceListClientPortletKeys;

import java.io.IOException;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author ludwing.jaimes
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=PortletserviceListClient",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + PortletserviceListClientPortletKeys.PORTLETSERVICELISTCLIENT,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class PortletserviceListClientPortlet extends MVCPortlet {
	
	@Override
	 public void render(RenderRequest request, RenderResponse response)
			   throws PortletException, IOException {
		System.out.println("listo llego a el controlador");
			 
			 }
	
}