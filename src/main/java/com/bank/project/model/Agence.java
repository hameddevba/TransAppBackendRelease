package com.bank.project.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import com.bank.project.model.User;

@Entity
@Table(name = "agence")
public class Agence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AGCODE")
    private int agCode;

    @Column(name = "AGETCODE", nullable = false)
    private int agEtCode;

    @Column(name = "AGUSCODE", nullable = false)
    private int aguscode;

    @Column(name = "AGLIB", length = 50, nullable = false)
    private String agLib;

    @Column(name = "AGTEL", length = 15)
    private String agTel;

    @Column(name = "AGEMAIL", length = 50)
    private String agEmail;

    @Column(name = "AGADD", length = 50)
    private String agAdd;

    @Column(name = "AGDATE", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private LocalDateTime agDate;

    @Column(name = "AGDEST", length = 1, nullable = false)
    private String agDest;

    @Column(name = "AGCPDEP", nullable = false)
    private int agCpDep;

    @Column(name = "AGCPPROD", nullable = false)
    private int agCpProd;

    @Column(name = "AGVALIDLM", length = 1, nullable = false)
    private String agValidLm;

    @Column(name = "AGSANSVALID", length = 1, nullable = false)
    private String agSansValid;

    @Column(name = "AGCPPROV1", nullable = false)
    private int agCpProv1;

    // Relation avec les utilisateurs
//    @OneToMany(mappedBy = "agence", fetch = FetchType.LAZY)
//    private Set<User> users = new HashSet<>();

    // Getters et Setters

    public int getAgCode() {
        return agCode;
    }

    public void setAgCode(int agCode) {
        this.agCode = agCode;
    }

    public int getAgEtCode() {
        return agEtCode;
    }

    public void setAgEtCode(int agEtCode) {
        this.agEtCode = agEtCode;
    }

    public int getAgUsCode() {
        return aguscode;
    }

    public void setAgUsCode(int agUsCode) {
        this.aguscode = agUsCode;
    }

    public String getAgLib() {
        return agLib;
    }

    public void setAgLib(String agLib) {
        this.agLib = agLib;
    }

    public String getAgTel() {
        return agTel;
    }

    public void setAgTel(String agTel) {
        this.agTel = agTel;
    }

    public String getAgEmail() {
        return agEmail;
    }

    public void setAgEmail(String agEmail) {
        this.agEmail = agEmail;
    }

    public String getAgAdd() {
        return agAdd;
    }

    public void setAgAdd(String agAdd) {
        this.agAdd = agAdd;
    }

    public LocalDateTime getAgDate() {
        return agDate;
    }

    public void setAgDate(LocalDateTime agDate) {
        this.agDate = agDate;
    }

    public String getAgDest() {
        return agDest;
    }

    public void setAgDest(String agDest) {
        this.agDest = agDest;
    }

    public int getAgCpDep() {
        return agCpDep;
    }

    public void setAgCpDep(int agCpDep) {
        this.agCpDep = agCpDep;
    }

    public int getAgCpProd() {
        return agCpProd;
    }

    public void setAgCpProd(int agCpProd) {
        this.agCpProd = agCpProd;
    }

    public String getAgValidLm() {
        return agValidLm;
    }

    public void setAgValidLm(String agValidLm) {
        this.agValidLm = agValidLm;
    }

    public String getAgSansValid() {
        return agSansValid;
    }

    public void setAgSansValid(String agSansValid) {
        this.agSansValid = agSansValid;
    }

    public int getAgCpProv1() {
        return agCpProv1;
    }

    public void setAgCpProv1(int agCpProv1) {
        this.agCpProv1 = agCpProv1;
    }

//    public Set<User> getUsers() {
//        return users;
//    }
//
//    public void setUsers(Set<User> users) {
//        this.users = users;
//    }

    // Méthode pour ajouter un utilisateur à l'agence
//    public void addUser(User user) {
//        this.users.add(user);
//        user.setAgence(this);
//    }
}
