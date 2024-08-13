package com.com;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

public class Dao {
     private HibernateTemplate hibernatetemplate;

	public HibernateTemplate getHibernatetemplate() {
		return hibernatetemplate;
	}

	public void setHibernatetemplate(HibernateTemplate hibernatetemplate) {
		this.hibernatetemplate = hibernatetemplate;
	}
	@Transactional
     public void insertuser(model m) {
    	 this.hibernatetemplate.save(m);
     }
     public model getmodelbyid(int id) {
    	 model m = this.hibernatetemplate.load(model.class, id);
		return m;
    	 
     }
     public List<model> grtallmodel(){
    	List<model> list = this.hibernatetemplate.loadAll(model.class);
    	return list;
     }
     @Transactional
     public void updatemodel(model m) {
    	 this.hibernatetemplate.update(m);
     }
     @Transactional
     public void deletemodel(model m) {
    	 this.hibernatetemplate.delete(m);
     }
}
