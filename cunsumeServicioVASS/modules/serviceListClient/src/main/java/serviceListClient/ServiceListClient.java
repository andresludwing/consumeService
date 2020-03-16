package serviceListClient;

import com.liferay.vass.ejer.apiListClient.api.ApiListClient;
import com.liferay.vass.ejer.apiListClient.model.Persona;

import java.util.ArrayList;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author ludwing.jaimes
 */
@Component(
	immediate = true,
	property = {
		// TODO enter required service properties
	},
	service = ApiListClient.class
)
public class ServiceListClient implements ApiListClient {
	List<Persona> listJson = new ArrayList<Persona>();
	
	
	@Override
	public List<Persona> bringList(String urlService){
		
		
	
		
		return listJson;
	}

}