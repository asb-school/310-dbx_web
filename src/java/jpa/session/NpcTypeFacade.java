/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.session;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import jpa.entities.NpcType;

/**
 *
 * @author roy
 */
@Stateless
public class NpcTypeFacade extends AbstractFacade<NpcType> {
    @PersistenceContext(unitName = "dbx_webPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public NpcTypeFacade() {
        super(NpcType.class);
    }
    
}
