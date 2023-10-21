package com.hql.services;

import java.util.List;

import com.hql.entities.Adresse;

public interface AdresseService {
	public Adresse saveOneAdresse(Adresse adresse);
	public Adresse updateOneAdresse(Adresse adresse,long id);
	public void deleteOneAdresse(long id);
	public void deleteAllAdresse();
	public List<Adresse> findAdresses();
	public List<Adresse> findOneAdresses(long id);
	public List<Adresse> findAdressesByVilleOrPays(String ville,String pays);
	public List<Adresse> findAdressewithBudget(double budget);
	public List<Adresse> findAdressewithCodepostale(int code);

}
