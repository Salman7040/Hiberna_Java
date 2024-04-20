package org.example.ManyToMany;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Cache;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class Emp {
    @Id
    private int eId;
    private String eName;

    @ManyToMany
    @JoinTable(
            name = "Emp_Or_Project",
            joinColumns = {@JoinColumn(name="Employee_Id")},
            inverseJoinColumns = {@JoinColumn(name="Project_Id")}
    )
    private List<Project> projects;

    @Override
    public String toString() {
        return "Emp{" +
                "eId=" + eId +
                ", eName='" + eName + '\'' +
                ", Project=" + projects +
                '}';
    }
}
