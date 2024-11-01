package com.bank.project.dao;

import com.bank.project.model.Agence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AgenceDao extends JpaRepository<Agence,Long> {
    Optional<Agence> findByAguscode(int aguscode);
}
