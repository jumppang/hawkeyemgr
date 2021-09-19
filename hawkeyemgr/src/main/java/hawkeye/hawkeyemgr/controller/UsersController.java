package hawkeye.hawkeyemgr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import hawkeye.common.core.hawkeyMgrBase;
import reactor.core.Exceptions;
import java.util.Map;

@RestController
public class UsersController extends hawkeyMgrBase {

	@GetMapping("/resource/users") 
	public String getUsers() throws Exception	{
		return "get Users";
	}
	
	@PostMapping("/resource/users") 
	public Object postUsers(@RequestBody String pBody) throws Exception {
		
		ObjectMapper mapper = new ObjectMapper();
		Map map = mapper.readValue(pBody, new TypeReference<Map<String,Object>>() {});
		Map<String, Object> userRequest = (Map<String, Object>)map.get("userRequest");
		
		return userRequest.get("utterance");
	}
}
