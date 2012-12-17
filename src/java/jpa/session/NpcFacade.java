/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.session;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import jpa.entities.Npc;

/**
 *
 * @author roy
 */
@Stateless
public class NpcFacade extends AbstractFacade<Npc> {
    @PersistenceContext(unitName = "dbx_webPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public NpcFacade() {
        super(Npc.class);
    }
    
}
