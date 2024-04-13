package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;

/**
 * Checklist Team
 */

@Entity
@Table(name = "checklist_team")
public class ChecklistTeam   {
    @JsonProperty("id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id = null;

    @Column(name = "employee_id")
    private String employeeId = null;

    @Column(name = "list_id")
    private Long listId = null;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public Long getListId() {
        return listId;
    }

    public void setListId(Long listId) {
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
        ChecklistTeam checklistTeam = (ChecklistTeam) o;
        return Objects.equals(this.id, checklistTeam.id) &&
                Objects.equals(this.employeeId, checklistTeam.employeeId) &&
                Objects.equals(this.listId, checklistTeam.listId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, employeeId, listId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChecklistTeam {\n");
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
}
