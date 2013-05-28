package models;

import net.vz.mongodb.jackson.MongoCollection;
import net.vz.mongodb.jackson.Id;
import net.vz.mongodb.jackson.ObjectId;
import org.codehaus.jackson.annotate.JsonProperty;

public class Food {

  @ObjectId @Id public String id;

  @JsonProperty("name") public String name;

  @JsonProperty("price") public double price;

  @JsonProperty("flavor") public String flavor;

  @JsonProperty("sales_mount") public String sales_mount;
}
