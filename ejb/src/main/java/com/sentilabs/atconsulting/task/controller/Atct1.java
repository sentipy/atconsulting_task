package com.sentilabs.atconsulting.task.controller;

import com.sentilabs.atconsulting.task.common.CommonClass;
import com.sentilabs.atconsulting.task.entity.Atct1Entity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by sentipy on 06/07/14.
 */
@Stateless
public class Atct1 {

    @PersistenceContext(name = "persistenceUnit")
    EntityManager em;

    public List<Atct1Entity> getAll(){
        final TypedQuery<Atct1Entity> query = em.createQuery("select a from Atct1Entity a", Atct1Entity.class);
        return query.getResultList();
    }

    /*public String getAll(){
        return "8";
    }*/
}
