package fr.formation.model;


import javax.persistence.*;

@Entity
public class Realisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Prenom", length = 50)
    private String firstName;

    @Column(name = "Nom", length = 50)
    private String lastName;


    public Realisateur() {
    }

    public Realisateur(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Realisateur(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
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

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Realisateur : ");
        sb.append("\n Nom : ").append(firstName).append(", ");
        sb.append(" Prénom : ").append(lastName);
        sb.append('\n');
        return sb.toString();
    }
}
