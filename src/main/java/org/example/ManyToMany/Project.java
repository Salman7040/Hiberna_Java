package org.example.ManyToMany;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Getter
@Setter
@Entity
public class Project {
    @Id
    private int pId;
    private String pName;

    @ManyToMany(mappedBy = "projects")
    private List<Emp> emps;


    @Override
    public String toString() {
        return "Project{" +
                "pId=" + pId +
                ", pName='" + pName + '\'' +
                ", Employee=" + emps +
                '}';
    }
}
