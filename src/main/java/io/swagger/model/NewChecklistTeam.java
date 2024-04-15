package io.swagger.model;

import java.math.BigDecimal;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;

/**
 * New Checklist Team
 */

public class NewChecklistTeam {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("employee_id")
    private Employee employeeId;

    @JsonProperty("list_id")
    private RampChecklist listId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Employee getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Employee employeeId) {
        this.employeeId = employeeId;
    }

    public RampChecklist getListId() {
        return listId;
    }

    public void setListId(RampChecklist listId) {
        this.listId = listId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NewChecklistTeam checklistTeam = (NewChecklistTeam) o;
        return Objects.equals(this.id, checklistTeam.id) &&
                Objects.equals(this.employeeId, checklistTeam.employeeId) &&
                Objects.equals(this.listId, checklistTeam.listId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, listId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NewChecklistTeam {\n");
        sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
        sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
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

//    public NewChecklistTeam(String employeeId, Long listId) {
//        this.listId = listId;
//        this.employeeId = employeeId;
//
//    }
//
//    public NewChecklistTeam() {
//    }
}

