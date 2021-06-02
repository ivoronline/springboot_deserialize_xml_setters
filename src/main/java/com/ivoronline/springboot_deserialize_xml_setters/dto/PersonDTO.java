package com.ivoronline.springboot_deserialize_xml_setters.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PersonDTO {

  //PROPERTIES
  private String  name;
  private Integer age;

  //SETTERS (Used by JAXB for Unmarshaling)
  public void setName(String  name) { this.name = "Setter " + name; }
  public void setAge (Integer age ) { this.age  = age;  }

  //GETTERS (Used by us to read Properties)
  public String  getName() { return name; }
  public Integer getAge () { return age;  }

}
