/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fcastillo.facsoftservice.ejb;

import com.fcastillo.facsoftservice.entity.Prestamos;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author fcastillo
 */
@Stateless
public class PrestamosFacade extends AbstractFacade<Prestamos> implements PrestamosFacadeLocal {

    @PersistenceContext(unitName = "com.fcastillo_facsoftservice_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PrestamosFacade() {
        super(Prestamos.class);
    }
    
}
