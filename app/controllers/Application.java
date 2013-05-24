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

public class Application extends Controller {

  public static Result index() {

    // MongoDB Operations
    // API: http://vznet.github.io/mongo-jackson-mapper/apidocs/net/vz/mongodb/jackson/JacksonDBCollection.html
    JacksonDBCollection<Consumer, String> coll = MongoDB.getCollection("consumers", Consumer.class, String.class);
    DBCursor result = coll.find();
    System.out.println("count: " + result.count());
    if (result.hasNext()) {

      // I don't know why it could not change into Consumer automaticly
      Consumer consumer = (Consumer) result.next();
      System.out.println("result: " + consumer.name);
    }

    return ok(index.render("Your new application is ready."));
  }
}
