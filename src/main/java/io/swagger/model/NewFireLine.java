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
 * NewFireLine
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-01T19:16:46.028037-04:00[America/New_York]")


public class NewFireLine   {
  @JsonProperty("list_id")
  private RampChecklist listId = null;

  @JsonProperty("fireline_status")
  private Boolean firelineStatus = null;

  @JsonProperty("fireline_img")
  private String firelineImg = null;

  @JsonProperty("tag_img")
  private String tagImg = null;

  @JsonProperty("probability")
  private BigDecimal probability = null;

  @JsonProperty("tag")
  private String tag = null;

  public NewFireLine listId(RampChecklist listId) {
    this.listId = listId;
    return this;
  }

  /**
   * Get listId
   * @return listId
   **/
  @Schema(required = true, description = "")
      @NotNull

    public RampChecklist getlistId() {
    return listId;
  }

  public void setlistId(RampChecklist listId) {
    this.listId = listId;
  }

  public NewFireLine firelineStatus(Boolean firelineStatus) {
    this.firelineStatus = firelineStatus;
    return this;
  }

  /**
   * Get firelineStatus
   * @return firelineStatus
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Boolean getFirelineStatus() {
    return firelineStatus;
  }

  public void setFirelineStatus(Boolean firelineStatus) {
    this.firelineStatus = firelineStatus;
  }

  public NewFireLine firelineImg(String firelineImg) {
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

  public NewFireLine tagImg(String tagImg) {
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

  public NewFireLine probability(BigDecimal probability) {
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

  public NewFireLine tag(String tag) {
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
    NewFireLine newFireLine = (NewFireLine) o;
    return Objects.equals(this.listId, newFireLine.listId) &&
        Objects.equals(this.firelineStatus, newFireLine.firelineStatus) &&
        Objects.equals(this.firelineImg, newFireLine.firelineImg) &&
        Objects.equals(this.tagImg, newFireLine.tagImg) &&
        Objects.equals(this.probability, newFireLine.probability) &&
        Objects.equals(this.tag, newFireLine.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listId, firelineStatus, firelineImg, tagImg, probability, tag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewFireLine {\n");

    sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
    sb.append("    firelineStatus: ").append(toIndentedString(firelineStatus)).append("\n");
    sb.append("    firelineImg: ").append(toIndentedString(firelineImg)).append("\n");
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
