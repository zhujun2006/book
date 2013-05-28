package models;

import net.vz.mongodb.jackson.ObjectId;
import net.vz.mongodb.jackson.Id;
import org.codehaus.jackson.annotate.JsonProperty;

public class Shop {

  @ObjectId @Id public String id;

  @JsonProperty("name") public String name;

  @JsonProperty("address") public String address;

  @JsonProperty("phone") public String phone;

  @JsonProperty("tel") public String tel;

  @JsonProperty("latitude") public String latitude;

  @JsonProperty("longitude") public String longitude;

  @JsonProperty("sales_mount") public String sales_mount;

  @JsonProperty("take_out_price") public String take_out_price;

  @JsonProperty("open_time") public String open_time;

  @JsonProperty("close_time") public String close_time;
}
