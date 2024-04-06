package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CargoContainer
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-01T19:16:46.028037-04:00[America/New_York]")

@Entity
public class CargoContainer   {
  @JsonProperty("container_id")
  @Id
  private String containerId = null;

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

  public CargoContainer containerId(String containerId) {
    this.containerId = containerId;
    return this;
  }

  /**
   * Get containerId
   * @return containerId
   **/
  @Schema(description = "")
  
    public String getContainerId() {
    return containerId;
  }

  public void setContainerId(String containerId) {
    this.containerId = containerId;
  }

  public CargoContainer description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   **/
  @Schema(description = "")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CargoContainer capacityKg(Integer capacityKg) {
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

  public void setCapacityKg(Integer capacityKg) {
    this.capacityKg = capacityKg;
  }

  public CargoContainer status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @Schema(description = "")
  
    public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public CargoContainer lockStatus(String lockStatus) {
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

  public CargoContainer lockImg(String lockImg) {
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

  public CargoContainer tagImg(String tagImg) {
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

  public CargoContainer probability(BigDecimal probability) {
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

  public CargoContainer tag(String tag) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CargoContainer cargoContainer = (CargoContainer) o;
    return Objects.equals(this.containerId, cargoContainer.containerId) &&
        Objects.equals(this.description, cargoContainer.description) &&
        Objects.equals(this.capacityKg, cargoContainer.capacityKg) &&
        Objects.equals(this.status, cargoContainer.status) &&
        Objects.equals(this.lockStatus, cargoContainer.lockStatus) &&
        Objects.equals(this.lockImg, cargoContainer.lockImg) &&
        Objects.equals(this.tagImg, cargoContainer.tagImg) &&
        Objects.equals(this.probability, cargoContainer.probability) &&
        Objects.equals(this.tag, cargoContainer.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerId, description, capacityKg, status, lockStatus, lockImg, tagImg, probability, tag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CargoContainer {\n");
    
    sb.append("    containerId: ").append(toIndentedString(containerId)).append("\n");
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
