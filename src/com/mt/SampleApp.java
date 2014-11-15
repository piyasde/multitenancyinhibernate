package com.mt;

import java.util.List;
import java.util.Iterator;
import org.hibernate.Session;
import org.hibernate.Query;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
public class SampleApp{
	public static void main(String args[]){
		SampleAppMethods bm = new SampleAppMethods();

		//Listing 
		//bm.listBooks();
		bm.getSampleDetails("sampleschema1");
		bm.getSampleDetails("sampleschema2");
	}
}

class SampleAppMethods{
	
	
	public void getSampleDetails(String schemaname){
		//Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Session session = HibernateUtil.getSessionFactory().withOptions().tenantIdentifier( schemaname ).openSession();
		
		
		session.beginTransaction();
		Query q = session.createQuery("from SampleDetails");
		List list = q.list();
		System.out.println("Getting 1. Details using HQL. \n"+list);

		//The above query can also be achieved with Criteria & Restrictions API.
		Criteria cri = session.createCriteria(SampleDetails.class);
		list = cri.list();
		System.out.println("Getting 2. Details using HQL. \n"+list);

		session.getTransaction().commit();
		System.out.println("End of Result");
		session.close();
	}

	
	//Native SQL Query
	public void listBooks(){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		List list = session.createSQLQuery("select * from sampleschema1.sampletable").addEntity(SampleDetails.class).list();
		Iterator itr = list.iterator();
		while(itr.hasNext()){
			SampleDetails sd = (SampleDetails)itr.next();
			System.out.println(sd);
		}
		session.getTransaction().commit();

	}
}

