package com.bean;

import java.util.Set;


import javax.persistence.*;





import com.sun.istack.internal.NotNull;

@Entity
@Table(name = "user_role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @NotNull
    @Column(name="name")
    private String roleName;
    
    @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinTable(name="user_role_aciton",joinColumns={ @JoinColumn(name="role_id")},
    inverseJoinColumns=@JoinColumn(name="action_id")
          )
    private Set<Action> action;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Set<Action> getAction() {
        return action;
    }

    public void setAction(Set<Action> action) {
        this.action = action;
    }
    
    
    
    
    
}
