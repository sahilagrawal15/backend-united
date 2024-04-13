package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NewCargoContainer
 */
<<<<<<< Updated upstream
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-01T19:16:46.028037-04:00[America/New_York]")


public class NewCargoContainer   {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("capacity_kg")
  private Integer capacityKg = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("lock_status")
  private String lockStatus = null;

  @JsonProperty("lock_img")
  private String lockImg = null;

  @JsonProperty("tag_img")
  private String tagImg = null;

  @JsonProperty("probability")
  private BigDecimal probability = null;

  @JsonProperty("tag")
  private String tag = null;

  public NewCargoContainer description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   **/
  @Schema(description = "")
  
    public String getDescription() {
=======
import java.math.BigDecimal;

public class NewCargoContainer {

  private Long listId;
  private String description;
  private Integer capacity;
  private Boolean damage;
  private Status status;
  private LockStatus lockStatus;
  private String lockImg;
  private String tagImg;
  private BigDecimal probability;
  private String tag;

  // Constructor


  public Long getListId() {
    return listId;
  }

  public void setListId(Long listId) {
    this.listId = listId;
  }

  public String getDescription() {
>>>>>>> Stashed changes
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public NewCargoContainer capacityKg(Integer capacityKg) {
    this.capacityKg = capacityKg;
    return this;
  }

  /**
   * Get capacityKg
   * @return capacityKg
   **/
  @Schema(description = "")
  
    public Integer getCapacityKg() {
    return capacityKg;
  }

<<<<<<< Updated upstream
  public void setCapacityKg(Integer capacityKg) {
    this.capacityKg = capacityKg;
  }

  public NewCargoContainer status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @Schema(description = "")
  
    public String getStatus() {
=======

  public Boolean getDamage() {
    return damage;
  }

  public void setDamage(Boolean damage) {
    this.damage = damage;
  }

  public Status getStatus() {
>>>>>>> Stashed changes
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public NewCargoContainer lockStatus(String lockStatus) {
    this.lockStatus = lockStatus;
    return this;
  }

  /**
   * Get lockStatus
   * @return lockStatus
   **/
  @Schema(description = "")
  
    public String getLockStatus() {
    return lockStatus;
  }

  public void setLockStatus(String lockStatus) {
    this.lockStatus = lockStatus;
  }

  public NewCargoContainer lockImg(String lockImg) {
    this.lockImg = lockImg;
    return this;
  }

  /**
   * Get lockImg
   * @return lockImg
   **/
  @Schema(description = "")
  
    public String getLockImg() {
    return lockImg;
  }

  public void setLockImg(String lockImg) {
    this.lockImg = lockImg;
  }

  public NewCargoContainer tagImg(String tagImg) {
    this.tagImg = tagImg;
    return this;
  }

  /**
   * Get tagImg
   * @return tagImg
   **/
  @Schema(description = "")
  
    public String getTagImg() {
    return tagImg;
  }

  public void setTagImg(String tagImg) {
    this.tagImg = tagImg;
  }

  public NewCargoContainer probability(BigDecimal probability) {
    this.probability = probability;
    return this;
  }

  /**
   * Get probability
   * @return probability
   **/
  @Schema(description = "")
  
    @Valid
    public BigDecimal getProbability() {
    return probability;
  }

  public void setProbability(BigDecimal probability) {
    this.probability = probability;
  }

  public NewCargoContainer tag(String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * Get tag
   * @return tag
   **/
  @Schema(description = "")
  
    public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

<<<<<<< Updated upstream

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewCargoContainer newCargoContainer = (NewCargoContainer) o;
    return Objects.equals(this.description, newCargoContainer.description) &&
        Objects.equals(this.capacityKg, newCargoContainer.capacityKg) &&
        Objects.equals(this.status, newCargoContainer.status) &&
        Objects.equals(this.lockStatus, newCargoContainer.lockStatus) &&
        Objects.equals(this.lockImg, newCargoContainer.lockImg) &&
        Objects.equals(this.tagImg, newCargoContainer.tagImg) &&
        Objects.equals(this.probability, newCargoContainer.probability) &&
        Objects.equals(this.tag, newCargoContainer.tag);
=======
  public NewCargoContainer(Long listId, String description, Integer capacity, Boolean damage, Status status, LockStatus lockStatus, String lockImg, String tagImg, BigDecimal probability, String tag) {
    this.listId = listId;
    this.description = description;
    this.capacity = capacity;
    this.damage = damage;
    this.status = status;
    this.lockStatus = lockStatus;
    this.lockImg = lockImg;
    this.tagImg = tagImg;
    this.probability = probability;
    this.tag = tag;
>>>>>>> Stashed changes
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, capacityKg, status, lockStatus, lockImg, tagImg, probability, tag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewCargoContainer {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    capacityKg: ").append(toIndentedString(capacityKg)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    lockStatus: ").append(toIndentedString(lockStatus)).append("\n");
    sb.append("    lockImg: ").append(toIndentedString(lockImg)).append("\n");
    sb.append("    tagImg: ").append(toIndentedString(tagImg)).append("\n");
    sb.append("    probability: ").append(toIndentedString(probability)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
