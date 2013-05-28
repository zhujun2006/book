package models;

import net.vz.mongodb.jackson.DBRef;
import net.vz.mongodb.jackson.Id;
import net.vz.mongodb.jackson.ObjectId;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

public class Order {

  @ObjectId @Id public String id;

  @JsonProperty("time") public String time;

  @JsonProperty("price") public double price;

  @JsonProperty("food_count") public int food_count;

  @ObjectId public List<DBRef<Food, String>> foods;

}
