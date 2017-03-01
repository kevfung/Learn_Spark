package hello;

import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.TemplateViewRoute;

public class HelloRoute {
	
	private static final String GET_HELLO = "/velocity/hello/hello.vm";
	
	public static TemplateViewRoute HELLO_ROUTE_GET = (Request request, Response response) -> {
		Map<String, Object> model = new HashMap<>();
		model.put("text", "World!");
		
		return new ModelAndView(model, GET_HELLO);
	}; 

}
