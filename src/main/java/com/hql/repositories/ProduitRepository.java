package com.hql.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hql.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
// recherche du produit par: 
	/*
	 * titre ,titre et quantité
	 * contenu de description
	 * quantité > 5
	 * prix <2000
	 */
	List<Produit> findByNom(String nom);
	//List<Produit> findByNomAndQuantite(String nom,int quantite);
	List<Produit> findByPrixLessThan(double prix);
	List<Produit> findByDescriptionContaining(String description);
}
