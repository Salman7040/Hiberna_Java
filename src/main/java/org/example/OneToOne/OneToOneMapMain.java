package org.example.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneMapMain {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory fact = cfg.buildSessionFactory();
        Session session = fact.openSession();
        Transaction tx = session.beginTransaction();

//      creating question obj
        Question q1 = new Question();
        q1.setQuestionId(22);
        q1.setQuestionName("API Stand For...?");


//      creating answer obj
        Answer a1 = new Answer();
        a1.setAnswerId(20);
        a1.setAnswerName("Application Programming Interface.");
        q1.setAns(a1);


        session.save(q1);
        session.save(a1);
        tx.commit();
        session.close();
        fact.close();

        System.out.println(q1);
    }
}
