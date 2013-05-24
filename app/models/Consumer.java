package models;

import net.vz.mongodb.jackson.ObjectId;
import net.vz.mongodb.jackson.Id;
import org.codehaus.jackson.annotate.JsonProperty;

public class Consumer {

  @ObjectId
  @Id
  private String id;

  @ObjectId
  @Id
  public String getId() {
    return id;
  }

  @JsonProperty("name")
  public String name;

}
