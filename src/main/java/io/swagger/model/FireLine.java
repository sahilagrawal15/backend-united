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
 * FireLine
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-01T19:16:46.028037-04:00[America/New_York]")


public class FireLine   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("safety_id")
  private String safetyId = null;

  @JsonProperty("fireline_status")
  private Boolean firelineStatus = null;

  @JsonProperty("fireline_img")
  private String firelineImg = null;

  @JsonProperty("tag_img")
  private String tagImg = null;

  @JsonProperty("Type")
  private String type = null;

  @JsonProperty("probability")
  private BigDecimal probability = null;

  @JsonProperty("tag")
  private String tag = null;

  public FireLine id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(description = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FireLine safetyId(String safetyId) {
    this.safetyId = safetyId;
    return this;
  }

  /**
   * Get safetyId
   * @return safetyId
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getSafetyId() {
    return safetyId;
  }

  public void setSafetyId(String safetyId) {
    this.safetyId = safetyId;
  }

  public FireLine firelineStatus(Boolean firelineStatus) {
    this.firelineStatus = firelineStatus;
    return this;
  }

  /**
   * Get firelineStatus
   * @return firelineStatus
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Boolean isFirelineStatus() {
    return firelineStatus;
  }

  public void setFirelineStatus(Boolean firelineStatus) {
    this.firelineStatus = firelineStatus;
  }

  public FireLine firelineImg(String firelineImg) {
    this.firelineImg = firelineImg;
    return this;
  }

  /**
   * Get firelineImg
   * @return firelineImg
   **/
  @Schema(description = "")
  
    public String getFirelineImg() {
    return firelineImg;
  }

  public void setFirelineImg(String firelineImg) {
    this.firelineImg = firelineImg;
  }

  public FireLine tagImg(String tagImg) {
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

  public FireLine type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public FireLine probability(BigDecimal probability) {
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

  public FireLine tag(String tag) {
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
    FireLine fireLine = (FireLine) o;
    return Objects.equals(this.id, fireLine.id) &&
        Objects.equals(this.safetyId, fireLine.safetyId) &&
        Objects.equals(this.firelineStatus, fireLine.firelineStatus) &&
        Objects.equals(this.firelineImg, fireLine.firelineImg) &&
        Objects.equals(this.tagImg, fireLine.tagImg) &&
        Objects.equals(this.type, fireLine.type) &&
        Objects.equals(this.probability, fireLine.probability) &&
        Objects.equals(this.tag, fireLine.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, safetyId, firelineStatus, firelineImg, tagImg, type, probability, tag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FireLine {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    safetyId: ").append(toIndentedString(safetyId)).append("\n");
    sb.append("    firelineStatus: ").append(toIndentedString(firelineStatus)).append("\n");
    sb.append("    firelineImg: ").append(toIndentedString(firelineImg)).append("\n");
    sb.append("    tagImg: ").append(toIndentedString(tagImg)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
