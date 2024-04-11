package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Check
 */
@Validated
@Entity
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-01T19:16:46.028037-04:00[America/New_York]")


public class Check   {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @JsonProperty("check_id")
  private String checkId = null;

  @JsonProperty("attribute1")
  private String attribute1 = null;

  @JsonProperty("attribute2")
  private String attribute2 = null;

  @JsonProperty("attribute3")
  private String attribute3 = null;

  public Check checkId(String checkId) {
    this.checkId = checkId;
    return this;
  }

  /**
   * Get checkId
   * @return checkId
   **/
  @Schema(description = "")
  
    public String getCheckId() {
    return checkId;
  }

  public void setCheckId(String checkId) {
    this.checkId = checkId;
  }

  public Check attribute1(String attribute1) {
    this.attribute1 = attribute1;
    return this;
  }

  /**
   * Get attribute1
   * @return attribute1
   **/
  @Schema(description = "")
  
    public String getAttribute1() {
    return attribute1;
  }

  public void setAttribute1(String attribute1) {
    this.attribute1 = attribute1;
  }

  public Check attribute2(String attribute2) {
    this.attribute2 = attribute2;
    return this;
  }

  /**
   * Get attribute2
   * @return attribute2
   **/
  @Schema(description = "")
  
    public String getAttribute2() {
    return attribute2;
  }

  public void setAttribute2(String attribute2) {
    this.attribute2 = attribute2;
  }

  public Check attribute3(String attribute3) {
    this.attribute3 = attribute3;
    return this;
  }

  /**
   * Get attribute3
   * @return attribute3
   **/
  @Schema(description = "")
  
    public String getAttribute3() {
    return attribute3;
  }

  public void setAttribute3(String attribute3) {
    this.attribute3 = attribute3;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Check check = (Check) o;
    return Objects.equals(this.checkId, check.checkId) &&
        Objects.equals(this.attribute1, check.attribute1) &&
        Objects.equals(this.attribute2, check.attribute2) &&
        Objects.equals(this.attribute3, check.attribute3);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkId, attribute1, attribute2, attribute3);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Check {\n");
    
    sb.append("    checkId: ").append(toIndentedString(checkId)).append("\n");
    sb.append("    attribute1: ").append(toIndentedString(attribute1)).append("\n");
    sb.append("    attribute2: ").append(toIndentedString(attribute2)).append("\n");
    sb.append("    attribute3: ").append(toIndentedString(attribute3)).append("\n");
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
