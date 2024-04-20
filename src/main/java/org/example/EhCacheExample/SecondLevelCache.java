package org.example.EhCacheExample;


import org.example.student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SecondLevelCache {
    public static void main(String[] args) {


        SessionFactory fact = new Configuration().configure().buildSessionFactory();

        //Second level cache

        Session session1 = fact.openSession();
        student st1 =session1.get(student.class,111);
        System.out.println(st1);
        session1.close();

        Session session2 = fact.openSession();
        student st2 =session2.get(student.class,111);
        System.out.println(st2);



        fact.close();


    }
}
