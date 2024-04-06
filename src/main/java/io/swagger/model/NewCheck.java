package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NewCheck
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-01T19:16:46.028037-04:00[America/New_York]")


public class NewCheck   {
  @JsonProperty("attribute1")
  private String attribute1 = null;

  @JsonProperty("attribute2")
  private String attribute2 = null;

  @JsonProperty("attribute3")
  private String attribute3 = null;

  public NewCheck attribute1(String attribute1) {
    this.attribute1 = attribute1;
    return this;
  }

  /**
   * Get attribute1
   * @return attribute1
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getAttribute1() {
    return attribute1;
  }

  public void setAttribute1(String attribute1) {
    this.attribute1 = attribute1;
  }

  public NewCheck attribute2(String attribute2) {
    this.attribute2 = attribute2;
    return this;
  }

  /**
   * Get attribute2
   * @return attribute2
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getAttribute2() {
    return attribute2;
  }

  public void setAttribute2(String attribute2) {
    this.attribute2 = attribute2;
  }

  public NewCheck attribute3(String attribute3) {
    this.attribute3 = attribute3;
    return this;
  }

  /**
   * Get attribute3
   * @return attribute3
   **/
  @Schema(required = true, description = "")
      @NotNull

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
    NewCheck newCheck = (NewCheck) o;
    return Objects.equals(this.attribute1, newCheck.attribute1) &&
        Objects.equals(this.attribute2, newCheck.attribute2) &&
        Objects.equals(this.attribute3, newCheck.attribute3);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attribute1, attribute2, attribute3);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewCheck {\n");
    
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
