package io.vertx.example;

import io.vertx.core.Vertx;


/**
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
public class HelloWorldEmbedded {

  public static void main(String[] args) {
    // Create an HTTP server which simply returns "Hello World!" to each request.
    Vertx.vertx().createHttpServer().requestHandler(req -> req.response().end("Hello OS World 5!")).listen(8080);
    Vertx.
  }

}
