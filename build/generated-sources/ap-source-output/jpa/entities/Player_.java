package jpa.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2012-12-16T23:54:57")
@StaticMetamodel(Player.class)
public class Player_ { 

    public static volatile SingularAttribute<Player, Integer> id;
    public static volatile SingularAttribute<Player, Float> skillLevel;
    public static volatile SingularAttribute<Player, Integer> posY;
    public static volatile SingularAttribute<Player, Integer> posX;
    public static volatile SingularAttribute<Player, String> name;
    public static volatile SingularAttribute<Player, Integer> birthDate;
    public static volatile SingularAttribute<Player, Float> health;
    public static volatile SingularAttribute<Player, String> loginPassword;
    public static volatile SingularAttribute<Player, String> loginName;
    public static volatile SingularAttribute<Player, Integer> regionId;

}