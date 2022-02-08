package eu.bcvsolutions.freeipa.post.group;

import java.util.Map;

import com.google.gson.Gson;
import eu.bcvsolutions.freeipa.connector.FreeIPAConfiguration;
import eu.bcvsolutions.freeipa.service.response.GenericJSONResponse;
import eu.bcvsolutions.freeipa.service.response.JSONResponse;

public class UpdateGroupServicePost extends
		GroupServicePost<Map<String, Object>> {

	public UpdateGroupServicePost(String groupName, Map<String, Object> params,
			boolean debug, FreeIPAConfiguration config) {
		super(groupName, params, debug, config);
	}

	@Override
	protected String getMethod() {
		return "group_mod";
	}

	@Override
	protected JSONResponse<Map<String, Object>> parse(String responseString) {
		Gson gson = new Gson();
		return gson.fromJson(responseString, GenericJSONResponse.class);
	}

}
