package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.model.source.spi.EmbeddableMapping;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class App {

    public static void main(String[] args) {
//===============sending Data to database============

        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory fact = cfg.buildSessionFactory();
        Session session = fact.openSession();
        Transaction tx = session.beginTransaction();


//      TODO: Example of @Embeddable mapping from Cirtificate to Student

        Cirtificate cirtificate=new Cirtificate();
        cirtificate.setCourseName("B-Tech");
        cirtificate.setCourseDuration("4 year");

        student st = new student();
        st.setId(110);
        st.setName("abcdXyz");
        st.setCity("Andheri");
        st.setCirti(cirtificate);

//        Address add = new Address();
//        add.setCity("karnataka");
//        add.setStreet("xyz");
//        add.setMydate(new Date());
//        add.setOpen(false);

        session.save(st);
        tx.commit();
        session.close();
        System.out.println(st);



    }
}
