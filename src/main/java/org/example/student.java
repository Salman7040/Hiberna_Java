package org.example;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@Cacheable
@Cache(usage= CacheConcurrencyStrategy.READ_ONLY)
public class student {
    @Id
    private  int id;
    private  String name;
    private  String city;
    private  Cirtificate cirti;

   @Override
    public String toString() {
        return "student [id=" + id + ", name=" + name + ", city=" + city + "]";
    }
}
