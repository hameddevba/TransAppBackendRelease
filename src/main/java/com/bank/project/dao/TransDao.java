package com.bank.project.dao;


import com.bank.project.dto.TransDto;
import com.bank.project.model.Trans;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface TransDao extends JpaRepository<Trans, Long> {

    List<Trans> findByEnvoyeur_EntelAndEnvoyeur_Enagcode(String number, int agence);
//    List<Trans> findByEnvoyeur_EntelOrderByTrcodeDesc(String number);
    Optional<Trans> findFirstByTruscode(int number);
    List<Trans> findFirst20ByTragenOrderByTrcodeDesc(int number);
    List<Trans> findFirst20ByTragbnOrderByTrcodeDesc(int number);
}