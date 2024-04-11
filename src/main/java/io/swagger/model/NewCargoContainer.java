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

  private String description;
  private Integer capacity;
  private Status status;
  private LockStatus lockStatus;
  private String lockImg;
  private String tagImg;
  private BigDecimal probability;
  private String tag;

  // Constructor


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

  public NewCargoContainer(String description, Integer capacity, Status status, LockStatus lockStatus, String lockImg, String tagImg, BigDecimal probability, String tag) {
    this.description = description;
    this.capacity = capacity;
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
