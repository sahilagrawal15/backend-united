package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.service.LockStatusConverter;
import io.swagger.service.StatusConverter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NewCargoContainer
 */
import java.math.BigDecimal;

public class NewCargoContainer {

  @JsonProperty("list_id")
  private RampChecklist listId;

  @JsonProperty("description")
  private String description;

  @JsonProperty("capacity")
  private Integer capacity;

  @JsonProperty("damage")
  private Boolean damage;


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
  // Constructor


  public RampChecklist getListId() {
    return listId;
  }

  public void setListId(RampChecklist listId) {
    this.listId = listId;
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

  public Boolean getDamage() {
    return damage;
  }

  public void setDamage(Boolean damage) {
    this.damage = damage;
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

  public NewCargoContainer(RampChecklist listId, String description, Integer capacity, Boolean damage, Status status, LockStatus lockStatus, String lockImg, String tagImg, BigDecimal probability, String tag) {
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
  }

  public NewCargoContainer() {
  }
}
