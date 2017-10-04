package com.iqmsoft.docker.rest.vertx;

import java.util.HashMap;
import java.util.Map;

import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.RoutingContext;

public class RESTServiceHandler {

	private final Map<String, JsonObject> contacts = new HashMap<>();

	public RESTServiceHandler() {
		setupData();
	}

	public void handleGetContacts(RoutingContext routingContext) {
		final JsonArray arr = new JsonArray();
		contacts.forEach((k, v) -> arr.add(v));
		routingContext.response().putHeader("content-type", "application/json").end(arr.encodePrettily());
	}

	private void setupData() {
		contacts.put("001", new JsonObject().put("id", "001").put("name", "John Doe").put("email", "john@doe.com"));
	}

}
