package com.iqmsoft.docker.rest.vertx;

import io.vertx.core.AbstractVerticle;
import io.vertx.ext.web.Router;

public class RESTService extends AbstractVerticle {

	@Override
	public void start() throws Exception {
		final Router router = Router.router(vertx);
		final RESTServiceHandler handler = new RESTServiceHandler();
		router.get("/contacts").handler(handler::handleGetContacts);
		vertx.createHttpServer().requestHandler(router::accept).listen(8080);
	}

}
