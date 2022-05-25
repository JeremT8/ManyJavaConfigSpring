package fr.formation.model;

import javax.persistence.*;

@Entity
public class Acteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Prenom", length = 50)
    private String firstName;

    @Column(name = "Nom", length = 50)
    private String lastName;

    @Column(name = "Role", length = 50)
    private String roles;

    public Acteur() {
    }

    public Acteur(String firstName, String lastName, String roles) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.roles = roles;
    }

    public Acteur(int id, String firstName, String lastName, String roles) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.roles = roles;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Acteur(s) : ");
        sb.append("\n Nom : ").append(firstName).append(", ");
        sb.append(" Prénom : ").append(lastName);
        sb.append('\n');
        return sb.toString();
    }
}
