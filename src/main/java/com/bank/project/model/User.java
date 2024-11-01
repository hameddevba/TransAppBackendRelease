package com.bank.project.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "user",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "USMDP"),
                @UniqueConstraint(columnNames = "USTEL")
        })
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int uscode;

    @NotBlank
    @Size(max = 15)
    private String USMDP;

    @NotBlank
    @Size(max = 50)
    private String usnom;

    @NotBlank
    @Size(max = 50)
    private String USPRE;

    @NotBlank
    @Size(max = 15)
    private String USTEL;

    @NotBlank
    @Size(max = 50)
    private String USPI;

    @NotBlank
    @Size(max = 1)
    private String USPROF;

    @NotBlank
    @Size(max = 1)
    private String USPOUV;

    @NotBlank
    @Size(max = 40)
    private String us_admacd;

    @NotBlank
    @Size(max = 40)
    private String us_admacc;

    @Size(max = 120)
    private String password;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn(name = "user_code"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "AGCODE")  // La clé étrangère sera stockée ici
//    private Agence agence;

    // Constructeurs

    public User() {
    }

    public User(int USCODE, String password){
        this.uscode = USCODE;
        this.password = password;
    }

    public User(int USCODE, String USMDP, String USNOM, String USPRE, String USTEL, String USPI,
                String USPROF, String USPOUV, String us_admacd, String us_admacc, 
                String password, Set<Role> roles) {
        this.uscode = USCODE;
        this.USMDP = USMDP;
        this.usnom = USNOM;
        this.USPRE = USPRE;
        this.USTEL = USTEL;
        this.USPI = USPI;
        this.USPROF = USPROF;
        this.USPOUV = USPOUV;
        this.us_admacd = us_admacd;
        this.us_admacc = us_admacc;
        this.password = password;
        this.roles = roles;
    }

    public User(String USMDP, String USNOM, String USPRE, String USTEL, String USPI, 
                String USPROF, String USPOUV, String us_admacd, String us_admacc, 
                String password, Set<Role> roles) {
        this.USMDP = USMDP;
        this.usnom = USNOM;
        this.USPRE = USPRE;
        this.USTEL = USTEL;
        this.USPI = USPI;
        this.USPROF = USPROF;
        this.USPOUV = USPOUV;
        this.us_admacd = us_admacd;
        this.us_admacc = us_admacc;
        this.password = password;
        this.roles = roles;
    }

    // Getters et Setters

    public int getUscode() {
        return uscode;
    }

    public void setUscode(int USCODE) {
        this.uscode = USCODE;
    }

    public String getUsmdp() {
        return USMDP;
    }

    public void setUsmdp(String USMDP) {
        this.USMDP = USMDP;
    }

    public String getUsername() {
        return usnom;
    }

    public void setUsername(String USNOM) {
        this.usnom = USNOM;
    }

    public String getUspre() {
        return USPRE;
    }

    public void setUspre(String USPRE) {
        this.USPRE = USPRE;
    }

    public String getUstel() {
        return USTEL;
    }

    public void setUstel(String USTEL) {
        this.USTEL = USTEL;
    }

    public String getUspi() {
        return USPI;
    }

    public void setUspi(String USPI) {
        this.USPI = USPI;
    }

    public String getUsprof() {
        return USPROF;
    }

    public void setUsprof(String USPROF) {
        this.USPROF = USPROF;
    }

    public String getUspouv() {
        return USPOUV;
    }

    public void setUspouv(String USPOUV) {
        this.USPOUV = USPOUV;
    }

    public String getUsadmacd() {
        return us_admacd;
    }

    public void setUsadmacd(String us_admacd) {
        this.us_admacd = us_admacd;
    }

    public String getUsadmacc() {
        return us_admacc;
    }

    public void setUsadmacc(String us_admacc) {
        this.us_admacc = us_admacc;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

//    public Agence getAgence() {
//        return agence;
//    }
//
//    public void setAgence(Agence agence) {
//        this.agence = agence;
//    }

    // Méthode pour ajouter un rôle à l'utilisateur
    public void addRole(Role role) {
        this.roles.add(role);
    }

//    public void setAgence(Agence agence2) {
//        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'setAgence'");
//    }
}
