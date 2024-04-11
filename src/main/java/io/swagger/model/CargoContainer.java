package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.service.LockStatusConverter;
import io.swagger.service.StatusConverter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CargoContainer
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-01T19:16:46.028037-04:00[America/New_York]")

@Entity
@Table(name = "cargo_container")
public class CargoContainer {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @JsonProperty("container_id")
  private String containerId;

  @Column(columnDefinition = "text") // Define the length for VARCHAR
  @JsonProperty("description")
  private String description;

  @JsonProperty("capacity")
  private Integer capacity;

  @Convert(converter = StatusConverter.class)
  @JsonProperty("status")
  private Status status;

  @Convert(converter = LockStatusConverter.class)
  @JsonProperty("lock_status")
  private LockStatus lockStatus;


  @JsonProperty("lock_img")
  private String lockImg;

  @JsonProperty("tag_img")
  private String tagImg;

  @JsonProperty("probability")
  private BigDecimal probability;

  @JsonProperty("tag")
  private String tag;

  // Getters and setters
  public String getContainerId() {
    return containerId;
  }

  public void setContainerId(String containerId) {
    this.containerId = containerId;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Integer getCapacity() {
    return capacity;
  }

  public void setCapacity(Integer capacity) {
    this.capacity = capacity;
  }

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public LockStatus getLockStatus() {
    return lockStatus;
  }

  public void setLockStatus(LockStatus lockStatus) {
    this.lockStatus = lockStatus;
  }

  public String getLockImg() {
    return lockImg;
  }

  public void setLockImg(String lockImg) {
    this.lockImg = lockImg;
  }

  public String getTagImg() {
    return tagImg;
  }

  public void setTagImg(String tagImg) {
    this.tagImg = tagImg;
  }

  public BigDecimal getProbability() {
    return probability;
  }

  public void setProbability(BigDecimal probability) {
    this.probability = probability;
  }

  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }
}





