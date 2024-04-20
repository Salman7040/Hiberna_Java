package org.example.CriteriaExample;

import org.example.student;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class CriteriaEx {
    public static void main(String[] args) {

        Session s = new Configuration().configure().buildSessionFactory().openSession();

        Criteria c = s.createCriteria(student.class);

//      TODO: Criteria Restriction

//        c.add(Restrictions.eq("name", "bbbb"));
        c.add(Restrictions.gt("id", 111));

        List<student> st = c.list();
        for (student st1 : st) {
            System.out.println("Student Detail: " + st1);
        }

        s.close();
    }
}
