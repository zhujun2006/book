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

public class OrderController extends Controller {

  public static Result index() {

    return ok(index.render("Your new application is ready."));
  }
}
