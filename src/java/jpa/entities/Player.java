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
@Table(name = "player")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Player.findAll", query = "SELECT p FROM Player p"),
    @NamedQuery(name = "Player.findById", query = "SELECT p FROM Player p WHERE p.id = :id"),
    @NamedQuery(name = "Player.findByName", query = "SELECT p FROM Player p WHERE p.name = :name"),
    @NamedQuery(name = "Player.findByHealth", query = "SELECT p FROM Player p WHERE p.health = :health"),
    @NamedQuery(name = "Player.findBySkillLevel", query = "SELECT p FROM Player p WHERE p.skillLevel = :skillLevel"),
    @NamedQuery(name = "Player.findByBirthDate", query = "SELECT p FROM Player p WHERE p.birthDate = :birthDate"),
    @NamedQuery(name = "Player.findByPosX", query = "SELECT p FROM Player p WHERE p.posX = :posX"),
    @NamedQuery(name = "Player.findByPosY", query = "SELECT p FROM Player p WHERE p.posY = :posY"),
    @NamedQuery(name = "Player.findByLoginName", query = "SELECT p FROM Player p WHERE p.loginName = :loginName"),
    @NamedQuery(name = "Player.findByLoginPassword", query = "SELECT p FROM Player p WHERE p.loginPassword = :loginPassword"),
    @NamedQuery(name = "Player.findByRegionId", query = "SELECT p FROM Player p WHERE p.regionId = :regionId")})
public class Player implements Serializable {
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
    @Column(name = "health")
    private float health;
    @Basic(optional = false)
    @NotNull
    @Column(name = "skill_level")
    private float skillLevel;
    @Basic(optional = false)
    @NotNull
    @Column(name = "birth_date")
    private int birthDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pos_x")
    private int posX;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pos_y")
    private int posY;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "login_name")
    private String loginName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "login_password")
    private String loginPassword;
    @Basic(optional = false)
    @NotNull
    @Column(name = "region_id")
    private int regionId;

    public Player() {
    }

    public Player(Integer id) {
        this.id = id;
    }

    public Player(Integer id, String name, float health, float skillLevel, int birthDate, int posX, int posY, String loginName, String loginPassword, int regionId) {
        this.id = id;
        this.name = name;
        this.health = health;
        this.skillLevel = skillLevel;
        this.birthDate = birthDate;
        this.posX = posX;
        this.posY = posY;
        this.loginName = loginName;
        this.loginPassword = loginPassword;
        this.regionId = regionId;
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

    public float getHealth() {
        return health;
    }

    public void setHealth(float health) {
        this.health = health;
    }

    public float getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(float skillLevel) {
        this.skillLevel = skillLevel;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public int getRegionId() {
        return regionId;
    }

    public void setRegionId(int regionId) {
        this.regionId = regionId;
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
        if (!(object instanceof Player)) {
            return false;
        }
        Player other = (Player) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.entities.Player[ id=" + id + " ]";
    }
    
}
