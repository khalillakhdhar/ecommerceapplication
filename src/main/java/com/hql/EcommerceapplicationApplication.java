package com.hql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hql.entities.Produit;
import com.hql.repositories.ProduitRepository;

@SpringBootApplication
public class EcommerceapplicationApplication implements CommandLineRunner {

	// DAO data acces object
	@Autowired
	ProduitRepository produitRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(EcommerceapplicationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Produit pr1=new Produit("toshiba LCD", "ecran LCD toshiba full HD", 1180, 8, null);
		Produit pr2=new Produit("Dell Insprion", "Dell i5 11G", 4280, 3, "photo");
		Produit pr3=new Produit("Samsung s20", "S20 avec ecran ", 2080, 13, "oui");
		//ajout
		Produit produit1=produitRepository.save(pr1);
		produitRepository.save(pr2);
		Produit produit3=produitRepository.save(pr3);
		// update
		produit3.setPrix(1880);
		produit3.setQuantite(2);
		produitRepository.save(produit3);
		// liste full HD
		System.out.println("LISTE HD");
		showList(produitRepository.findByDescriptionContaining("full HD"));
		System.out.println("prix <2500");

		showList(produitRepository.findByPrixLessThan(2500));
	}
	public void showList(List<Produit> produits)
	{
		produits.forEach(System.out::println);
	}

}
