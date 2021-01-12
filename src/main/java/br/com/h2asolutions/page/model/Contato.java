package br.com.h2asolutions.page.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;


@Document
public class Contato {

    @Id
    private String id;
    private String name;
    private String mail;
    private String message;

    public Contato(String id, String name, String mail, String message) {
        this.id = id;
        this.name = name;
        this.mail = mail;
        this.message = message;
    }

    public Contato() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
        if (!(o instanceof Contato)) return false;
        Contato contato = (Contato) o;
        return Objects.equals(id, contato.id) && Objects.equals(name, contato.name) && Objects.equals(mail, contato.mail) && Objects.equals(message, contato.message);
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
