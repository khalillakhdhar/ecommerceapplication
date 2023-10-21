package com.hql.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hql.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
