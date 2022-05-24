package fr.formation.entity;

import javax.persistence.*;

@Entity
public class Adresse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "cp", nullable = false, length = 5)
    private String codePostal;

    @Column(name = "ville", nullable = false)
    private String ville;

    public Adresse() {
    }

    public Adresse(String codePostal, String ville) {
        this.codePostal = codePostal;
        this.ville = ville;
    }

    public Adresse(int id, String codePostal, String ville) {
        this.id = id;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Adresse{");
        sb.append("id=").append(id);
        sb.append(", codePostal='").append(codePostal).append('\'');
        sb.append(", ville='").append(ville).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
