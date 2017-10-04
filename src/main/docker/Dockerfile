FROM vertx/vertx3
ENV VERTICLE_NAME com.iqmsoft.docker.rest.vertx.RESTService
ENV VERTICLE_HOME /usr/verticles
ENV VERTX_OPTIONS ""
COPY ./verticles $VERTICLE_HOME
ENTRYPOINT ["sh", "-c"]
CMD ["vertx run $VERTICLE_NAME -cp $VERTICLE_HOME/* $VERTX_OPTIONS"]
 