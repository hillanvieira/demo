package br.com.h2asolutions.page.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Contato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String mail;

    @Column
    private String message;

    public Contato(Long id, String name, String mail, String message) {
        this.id = id;
        this.name = name;
        this.mail = mail;
        this.message = message;
    }

    public Contato() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return id == contato.id && name.equals(contato.name) && mail.equals(contato.mail) && message.equals(contato.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, mail, message);
    }

    @Override
    public String toString() {
        return "Contato{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
