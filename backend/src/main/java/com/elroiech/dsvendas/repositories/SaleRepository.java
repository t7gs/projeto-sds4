package com.elroiech.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elroiech.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
