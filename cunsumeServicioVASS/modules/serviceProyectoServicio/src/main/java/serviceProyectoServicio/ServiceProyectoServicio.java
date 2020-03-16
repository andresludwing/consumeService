package serviceProyectoServicio;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.vass.apiProyectoService.model.Persona;
import com.liferay.vass.apiProyectoServicio.api.ApiProyectoServicio;

import java.io.InputStreamReader;
import java.net.URL;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.io.IOUtils;
import org.osgi.service.component.annotations.Component;



/**
 * @author ludwing.jaimes
 */
@Component(
	immediate = true,
	property = {
		// TODO enter required service properties
	},
	service = ApiProyectoServicio.class
)
public class ServiceProyectoServicio implements ApiProyectoServicio {
	
	private static final String ENCODING = "UTF-8";
	
	@Override
	public Object consumeServicio(Long cedula, String url, String token, String timeOut) {

		//List<Persona> personaServicio = new ArrayList<Persona>();
		
		int timeOout = Integer.parseInt(timeOut);		
		//System.out.println("llego a traeDatos");
		//System.out.println("cediula :"+cedula);
		//System.out.println("url :"+url);
		//System.out.println("token "+token);

		String response = null;
		JSONObject jsonResponse = JSONFactoryUtil.createJSONObject();
		
		try {
			
			TrustManager[] trustAllCerts = new TrustManager[] {new X509TrustManager() {
                public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                    return null;
                }
                public void checkClientTrusted(X509Certificate[] certs, String authType) {
                }
                public void checkServerTrusted(X509Certificate[] certs, String authType) {
                }
            }
        };
 
        // Install the all-trusting trust manager
        SSLContext sc = SSLContext.getInstance("SSL");
        sc.init(null, trustAllCerts, new java.security.SecureRandom());
        HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
 
        // Create all-trusting host name verifier
        HostnameVerifier allHostsValid = new HostnameVerifier() {
            public boolean verify(String hostname, SSLSession session) {
                return true;
            }
        };
        HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);
			
			StringBuilder urlServices = new StringBuilder(url);
			
			urlServices.append(cedula);
			URL urlCall = new URL(urlServices.toString());
			HttpsURLConnection conn = (HttpsURLConnection) urlCall.openConnection();

			
			//conn.setConnectTimeout(timeOout);
			//conn.setReadTimeout(timeOout);
			
			conn.addRequestProperty("Authorization", token);
			conn.setRequestMethod("GET");
			//System.out.println("el conn.getResponseCode() :"+conn.getResponseCode());
			if (conn.getResponseCode() != HttpStatus.SC_OK) {
				response = IOUtils.toString(conn.getErrorStream(), ENCODING);
				
			}else {
				response = IOUtils.toString(conn.getInputStream(), ENCODING);
				
				
			}
			
			
		} catch (Exception e) {
			System.out.println("entra a el cath :"+e.getMessage());
		}
		
		
		return response;
	}

	// TODO enter required service methods

}