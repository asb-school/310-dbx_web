/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author roy
 */
@Entity
@Table(name = "npc_type")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NpcType.findAll", query = "SELECT n FROM NpcType n"),
    @NamedQuery(name = "NpcType.findById", query = "SELECT n FROM NpcType n WHERE n.id = :id"),
    @NamedQuery(name = "NpcType.findByName", query = "SELECT n FROM NpcType n WHERE n.name = :name"),
    @NamedQuery(name = "NpcType.findByAggressiveness", query = "SELECT n FROM NpcType n WHERE n.aggressiveness = :aggressiveness"),
    @NamedQuery(name = "NpcType.findByBenevolence", query = "SELECT n FROM NpcType n WHERE n.benevolence = :benevolence")})
public class NpcType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "aggressiveness")
    private float aggressiveness;
    @Basic(optional = false)
    @NotNull
    @Column(name = "benevolence")
    private float benevolence;

    public NpcType() {
    }

    public NpcType(Integer id) {
        this.id = id;
    }

    public NpcType(Integer id, String name, float aggressiveness, float benevolence) {
        this.id = id;
        this.name = name;
        this.aggressiveness = aggressiveness;
        this.benevolence = benevolence;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAggressiveness() {
        return aggressiveness;
    }

    public void setAggressiveness(float aggressiveness) {
        this.aggressiveness = aggressiveness;
    }

    public float getBenevolence() {
        return benevolence;
    }

    public void setBenevolence(float benevolence) {
        this.benevolence = benevolence;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NpcType)) {
            return false;
        }
        NpcType other = (NpcType) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.entities.NpcType[ id=" + id + " ]";
    }
    
}
