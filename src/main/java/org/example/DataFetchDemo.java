package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DataFetchDemo {

    public static void main(String[] args) {
        //=============fetching data from database==========

        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

//      TODO: Get() example
//        Address add = (Address) session.get(Address.class, 2);
//        System.out.println(add);
//        System.out.println(add.getMydate());


//      TODO: load() example
        student st = (student) session.load(student.class, 101);
        System.out.println(st);

















        session.close();
        factory.close();
    }
}
