package models;

import net.vz.mongodb.jackson.ObjectId;
import net.vz.mongodb.jackson.Id;
import net.vz.mongodb.jackson.DBCursor;
import net.vz.mongodb.jackson.WriteResult;
import play.modules.mongodb.jackson.MongoDB;
import net.vz.mongodb.jackson.JacksonDBCollection;
import org.codehaus.jackson.annotate.JsonProperty;

public class Consumer {

  @ObjectId @Id public String id;

  @JsonProperty("name") public String name;

  @JsonProperty("phone") public String phone;

  @JsonProperty("email") public String email;

  @JsonProperty("address") public String address;

  @JsonProperty("ip") public String ip;

  private static JacksonDBCollection<Consumer, String> getCollection() {
    JacksonDBCollection<Consumer, String> coll =
        MongoDB.getCollection("consumers", Consumer.class, String.class);
    return coll;
  }

  public static WriteResult<Consumer, String> save(Consumer consumer) {
    JacksonDBCollection<Consumer, String> coll = Consumer.getCollection();
    return coll.save(consumer);
  }

  public static DBCursor<Consumer> find() {
    JacksonDBCollection<Consumer, String> coll = Consumer.getCollection();
    return coll.find();
  }
}
