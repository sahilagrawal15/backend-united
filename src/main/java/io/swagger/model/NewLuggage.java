package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NewLuggage
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-01T19:16:46.028037-04:00[America/New_York]")


public class NewLuggage   {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("weight_kg")
  private Integer weightKg = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("container_id")
  private String containerId = null;

  public NewLuggage description(String description) {
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

  public NewLuggage weightKg(Integer weightKg) {
    this.weightKg = weightKg;
    return this;
  }

  /**
   * Get weightKg
   * @return weightKg
   **/
  @Schema(description = "")
  
    public Integer getWeightKg() {
    return weightKg;
  }

  public void setWeightKg(Integer weightKg) {
    this.weightKg = weightKg;
  }

  public NewLuggage status(String status) {
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

  public NewLuggage containerId(String containerId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewLuggage newLuggage = (NewLuggage) o;
    return Objects.equals(this.description, newLuggage.description) &&
        Objects.equals(this.weightKg, newLuggage.weightKg) &&
        Objects.equals(this.status, newLuggage.status) &&
        Objects.equals(this.containerId, newLuggage.containerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, weightKg, status, containerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewLuggage {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    weightKg: ").append(toIndentedString(weightKg)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    containerId: ").append(toIndentedString(containerId)).append("\n");
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
