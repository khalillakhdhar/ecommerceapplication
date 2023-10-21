package com.hql.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Produit extends Audit{
	@NotBlank
	@Column(nullable = false)
	private String nom,description;
	@Min(value = 1)
	private double prix;
	@Min(value = 0)
	private int quantite;
	private String photo;
	public Produit(@NotBlank String nom, @NotBlank String description, @Min(1) double prix, @Min(0) int quantite,
			String photo) {
		super();
		this.nom = nom;
		this.description = description;
		this.prix = prix;
		this.quantite = quantite;
		this.photo = photo;
	}
	

}
