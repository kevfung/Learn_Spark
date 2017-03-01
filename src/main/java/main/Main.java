package main;

import static spark.Spark.*;

import hello.HelloRoute;
import spark.template.velocity.VelocityTemplateEngine;

public class Main {

	private static final String PUBLIC = "/public";

	public static void main(String[] args) {
		port(8989);
		
		staticFiles.location(PUBLIC);
		staticFiles.expireTime(3600);
		
		get("/hello", HelloRoute.HELLO_ROUTE_GET, new VelocityTemplateEngine());
	}

}
