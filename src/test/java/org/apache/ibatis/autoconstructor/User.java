
package org.apache.ibatis.autoconstructor;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Setter
@Getter
@ToString
public class User {
  private int id;
  private String username;
  private int age;
  private String phone;
  private String description;
  private Date createTime;
  private Date updateTime;


}
