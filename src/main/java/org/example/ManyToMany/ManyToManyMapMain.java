package org.example.ManyToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class ManyToManyMapMain {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory fact = cfg.buildSessionFactory();
        Session session = fact.openSession();
        Transaction tx = session.beginTransaction();

//      Employee obj
        Emp e1 = new Emp();
        e1.setEId(111);
        e1.setEName("aaaa");

        Emp e2 = new Emp();
        e2.setEId(222);
        e2.setEName("bbbb");

//      Project Obj
        Project p1 = new Project();
        p1.setPId(101);
        p1.setPName("abcd");

        Project p2 = new Project();
        p2.setPId(102);
        p2.setPName("wxyz");


        List<Emp> list1=new ArrayList<Emp>();
        List<Project> list2=new ArrayList<Project>();


        list1.add(e1);
        list1.add(e2);

        list2.add(p1);
        list2.add(p2);


        System.out.println("List Value: "+list1);

        e1.setProjects(list2);
        p1.setEmps(list1);




        session.save(e1);
        session.save(e2);
        session.save(p1);
        session.save(p2);

        tx.commit();
        session.close();
        fact.close();
    }
}
