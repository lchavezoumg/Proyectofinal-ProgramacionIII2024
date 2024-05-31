package com.cursojava.curso.models;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "usuarios")
@ToString @EqualsAndHashCode
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter @Column(name= "id")
    private Long id;
    @Getter @Setter @Column(name= "nombre")
    private String nombre;
    @Getter @Setter @Column(name= "apellido")
    private String apellido;
    @Getter @Setter @Column(name= "email")
    private String email;
    @Getter @Setter @Column(name= "telefono")
    private String telefono;
    @Getter @Setter @Column(name= "password")
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}