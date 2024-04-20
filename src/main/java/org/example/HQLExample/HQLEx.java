package org.example.HQLExample;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class HQLEx {

    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory fact = cfg.buildSessionFactory();
        Session session = fact.openSession();

//  ==============TODO:Select Query=============
//        String query = "from Emp where eId=:x";
//        Query q = session.createQuery(query);


//      TODO:👆 we can use dynamic where clause

//        q.setParameter("x", 111);
//        List<Emp> list = q.list();
//        for (Emp res : list) {
//            System.out.println(res.getEName());
//        }

//        =============TODO:Delete Query===============
//        Transaction tx = session.beginTransaction();
//        Query q2 = session.createQuery("delete from Emp where eId=111 ");
//        int row=q2.executeUpdate();
//        System.out.println(row);
//        tx.commit();


//      =============TODO:Select Query===============
        Transaction tx = session.beginTransaction();
        Query q3 = session.createQuery("Update  Emp set eName='salman' where eId=222");
        int row=q3.executeUpdate();
        System.out.println(row);
        tx.commit();
        session.close();
        fact.close();
    }
}
