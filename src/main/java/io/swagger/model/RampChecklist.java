package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RampChecklist
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-01T19:16:46.028037-04:00[America/New_York]")


public class RampChecklist   {
  @JsonProperty("list_id")
  private String listId = null;

  @JsonProperty("date")
  private OffsetDateTime date = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("flight_number")
  private String flightNumber = null;

  @JsonProperty("tail_number")
  private String tailNumber = null;

  @JsonProperty("gate")
  private String gate = null;

  @JsonProperty("standard_clear")
  private String standardClear = null;

  @JsonProperty("safety_clear")
  private String safetyClear = null;

  @JsonProperty("ppe")
  private Boolean ppe = null;

  @JsonProperty("wheel_chocks")
  private Boolean wheelChocks = null;

  @JsonProperty("engines_off")
  private Boolean enginesOff = null;

  @JsonProperty("no_leak")
  private Boolean noLeak = null;

  @JsonProperty("cargo_damage")
  private Boolean cargoDamage = null;

  @JsonProperty("doors_secure")
  private Boolean doorsSecure = null;

  @JsonProperty("belt_loader_secure")
  private Boolean beltLoaderSecure = null;

  public RampChecklist listId(String listId) {
    this.listId = listId;
    return this;
  }

  /**
   * Get listId
   * @return listId
   **/
  @Schema(description = "")

    public String getListId() {
    return listId;
  }

  public void setListId(String listId) {
    this.listId = listId;
  }

  public RampChecklist date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
   **/
  @Schema(description = "")

    @Valid
    public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public RampChecklist type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  @Schema(description = "")

    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public RampChecklist flightNumber(String flightNumber) {
    this.flightNumber = flightNumber;
    return this;
  }

  /**
   * Get flightNumber
   * @return flightNumber
   **/
  @Schema(description = "")

    public String getFlightNumber() {
    return flightNumber;
  }

  public void setFlightNumber(String flightNumber) {
    this.flightNumber = flightNumber;
  }

  public RampChecklist tailNumber(String tailNumber) {
    this.tailNumber = tailNumber;
    return this;
  }

  /**
   * Get tailNumber
   * @return tailNumber
   **/
  @Schema(description = "")

    public String getTailNumber() {
    return tailNumber;
  }

  public void setTailNumber(String tailNumber) {
    this.tailNumber = tailNumber;
  }

  public RampChecklist gate(String gate) {
    this.gate = gate;
    return this;
  }

  /**
   * Get gate
   * @return gate
   **/
  @Schema(description = "")

    public String getGate() {
    return gate;
  }

  public void setGate(String gate) {
    this.gate = gate;
  }

  public RampChecklist standardClear(String standardClear) {
    this.standardClear = standardClear;
    return this;
  }

  /**
   * Get standardClear
   * @return standardClear
   **/
  @Schema(description = "")

    public String getStandardClear() {
    return standardClear;
  }

  public void setStandardClear(String standardClear) {
    this.standardClear = standardClear;
  }

  public RampChecklist safetyClear(String safetyClear) {
    this.safetyClear = safetyClear;
    return this;
  }

  /**
   * Get safetyClear
   * @return safetyClear
   **/
  @Schema(description = "")

    public String getSafetyClear() {
    return safetyClear;
  }

  public void setSafetyClear(String safetyClear) {
    this.safetyClear = safetyClear;
  }

  /**
   * Get ppe
   * @return ppe
   **/
  @Schema(description = "")
  public Boolean getPpe() {
    return ppe;
  }

  public void setPpe(Boolean ppe) {
    this.ppe = ppe;
  }

  public RampChecklist ppe(Boolean ppe) {
    this.ppe = ppe;
    return this;
  }

  /**
   * Get wheelChocks
   * @return wheelChocks
   **/
  @Schema(description = "")
  public Boolean getWheelChocks() {
    return wheelChocks;
  }

  public void setWheelChocks(Boolean wheelChocks) {
    this.wheelChocks = wheelChocks;
  }

  public RampChecklist wheelChocks(Boolean wheelChocks) {
    this.wheelChocks = wheelChocks;
    return this;
  }

  /**
   * Get enginesOff
   * @return enginesOff
   **/
  @Schema(description = "")
  public Boolean getEnginesOff() {
    return enginesOff;
  }

  public void setEnginesOff(Boolean enginesOff) {
    this.enginesOff = enginesOff;
  }

  public RampChecklist enginesOff(Boolean enginesOff) {
    this.enginesOff = enginesOff;
    return this;
  }

  /**
   * Get noLeak
   * @return noLeak
   **/
  @Schema(description = "")
  public Boolean getNoLeak() {
    return noLeak;
  }

  public void setNoLeak(Boolean noLeak) {
    this.noLeak = noLeak;
  }

  public RampChecklist noLeak(Boolean noLeak) {
    this.noLeak = noLeak;
    return this;
  }

  /**
   * Get cargoDamage
   * @return cargoDamage
   **/
  @Schema(description = "")
  public Boolean getCargoDamage() {
    return cargoDamage;
  }

  public void setCargoDamage(Boolean cargoDamage) {
    this.cargoDamage = cargoDamage;
  }

  public RampChecklist cargoDamage(Boolean cargoDamage) {
    this.cargoDamage = cargoDamage;
    return this;
  }

  /**
   * Get doorsSecure
   * @return doorsSecure
   **/
  @Schema(description = "")
  public Boolean getDoorsSecure() {
    return doorsSecure;
  }

  public void setDoorsSecure(Boolean doorsSecure) {
    this.doorsSecure = doorsSecure;
  }

  public RampChecklist doorsSecure(Boolean doorsSecure) {
    this.doorsSecure = doorsSecure;
    return this;
  }

  /**
   * Get beltLoaderSecure
   * @return beltLoaderSecure
   **/
  @Schema(description = "")
  public Boolean getBeltLoaderSecure() {
    return beltLoaderSecure;
  }

  public void setBeltLoaderSecure(Boolean beltLoaderSecure) {
    this.beltLoaderSecure = beltLoaderSecure;
  }

  public RampChecklist beltLoaderSecure(Boolean beltLoaderSecure) {
    this.beltLoaderSecure = beltLoaderSecure;
    return this;
  }





  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RampChecklist rampChecklist = (RampChecklist) o;
    return Objects.equals(this.listId, rampChecklist.listId) &&
        Objects.equals(this.date, rampChecklist.date) &&
        Objects.equals(this.type, rampChecklist.type) &&
        Objects.equals(this.flightNumber, rampChecklist.flightNumber) &&
        Objects.equals(this.tailNumber, rampChecklist.tailNumber) &&
        Objects.equals(this.gate, rampChecklist.gate) &&
        Objects.equals(this.standardClear, rampChecklist.standardClear) &&
        Objects.equals(this.safetyClear, rampChecklist.safetyClear);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listId, date, type, flightNumber, tailNumber, gate, standardClear, safetyClear);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RampChecklist {\n");

    sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    flightNumber: ").append(toIndentedString(flightNumber)).append("\n");
    sb.append("    tailNumber: ").append(toIndentedString(tailNumber)).append("\n");
    sb.append("    gate: ").append(toIndentedString(gate)).append("\n");
    sb.append("    standardClear: ").append(toIndentedString(standardClear)).append("\n");
    sb.append("    safetyClear: ").append(toIndentedString(safetyClear)).append("\n");
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
