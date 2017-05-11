package io.swagger.model;

import io.swagger.model.PetTags;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class InlineResponse2001  {
  
  @ApiModelProperty(example = "null", value = "")
  private Long id = null;
  @ApiModelProperty(example = "null", value = "")
  private PetTags category = null;
  @ApiModelProperty(example = "doggie", required = true, value = "")
  private String name = null;
  @ApiModelProperty(example = "null", required = true, value = "")
  private List<String> photoUrls = new ArrayList<String>();
  @ApiModelProperty(example = "null", value = "")
  private List<PetTags> tags = new ArrayList<PetTags>();

@XmlType(name="StatusEnum")
@XmlEnum(String.class)
public enum StatusEnum {

@XmlEnumValue("available") AVAILABLE(String.valueOf("available")), @XmlEnumValue("pending") PENDING(String.valueOf("pending")), @XmlEnumValue("sold") SOLD(String.valueOf("sold"));


    private String value;

    StatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StatusEnum fromValue(String v) {
        for (StatusEnum b : StatusEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", value = "pet status in the store")
  private StatusEnum status = null;

 /**
   * Get id
   * @return id
  **/
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public InlineResponse2001 id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Get category
   * @return category
  **/
  public PetTags getCategory() {
    return category;
  }

  public void setCategory(PetTags category) {
    this.category = category;
  }

  public InlineResponse2001 category(PetTags category) {
    this.category = category;
    return this;
  }

 /**
   * Get name
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InlineResponse2001 name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get photoUrls
   * @return photoUrls
  **/
  public List<String> getPhotoUrls() {
    return photoUrls;
  }

  public void setPhotoUrls(List<String> photoUrls) {
    this.photoUrls = photoUrls;
  }

  public InlineResponse2001 photoUrls(List<String> photoUrls) {
    this.photoUrls = photoUrls;
    return this;
  }

  public InlineResponse2001 addPhotoUrlsItem(String photoUrlsItem) {
    this.photoUrls.add(photoUrlsItem);
    return this;
  }

 /**
   * Get tags
   * @return tags
  **/
  public List<PetTags> getTags() {
    return tags;
  }

  public void setTags(List<PetTags> tags) {
    this.tags = tags;
  }

  public InlineResponse2001 tags(List<PetTags> tags) {
    this.tags = tags;
    return this;
  }

  public InlineResponse2001 addTagsItem(PetTags tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

 /**
   * pet status in the store
   * @return status
  **/
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public InlineResponse2001 status(StatusEnum status) {
    this.status = status;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001 {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    photoUrls: ").append(toIndentedString(photoUrls)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
