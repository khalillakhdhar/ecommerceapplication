package com.hql.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hql.entities.Adresse;

public interface AdresseRepository extends JpaRepository<Adresse, Long> {
List<Adresse> findByCodepostale(int codepostale);
List<Adresse> findByDetaillesContaining(String detailles);
List<Adresse> findByVilleOrPays(String ville,String pays);
List<Adresse> findByMoyenneLocationLessThan(double moyenneLocation);
List<Adresse> findByMoyenneLocationGreaterThan(double moyenneLocation);
}
