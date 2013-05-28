package models;

import net.vz.mongodb.jackson.ObjectId;
import net.vz.mongodb.jackson.Id;
import org.codehaus.jackson.annotate.JsonProperty;

public class Company {

  @ObjectId @Id public String id;

  @JsonProperty("name") public String name;

  @JsonProperty("address") public String address;

  @JsonProperty("phone") public String phone;

  @JsonProperty("tel") public String tel;

  @ObjectId public List<DBRef<Shop, String>> shops;

}
