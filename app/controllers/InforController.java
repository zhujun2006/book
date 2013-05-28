package controllers;

import play.*;
import play.mvc.*;
import play.modules.mongodb.jackson.MongoDB;
import net.vz.mongodb.jackson.MongoCollection;
import net.vz.mongodb.jackson.JacksonDBCollection;
import net.vz.mongodb.jackson.DBCursor;
import com.mongodb.DBObject;

import views.html.*;

import models.*;

public class InforController extends Controller {

  public static Result index() {

    Consumer consumer = new Consumer();
    consumer.name = "kaleo211";
    consumer.email = "hexuebin@gmail.com";
    Consumer.save(consumer);

    DBCursor<Consumer> consumers = Consumer.find();
    while (consumers.hasNext()) {
      Logger.info("consumer: " + consumers.next());
    }

    return ok(index.render("Your new application is ready."));
  }
}
