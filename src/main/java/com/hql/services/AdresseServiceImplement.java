package com.hql.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hql.entities.Adresse;
import com.hql.repositories.AdresseRepository;

@Service
public class AdresseServiceImplement implements AdresseService {

	@Autowired
	private AdresseRepository adresseRepository;
	
	
	@Override
	public Adresse saveOneAdresse(Adresse adresse) {
		// TODO Auto-generated method stub
		return adresseRepository.save(adresse);
	}

	@Override
	public Adresse updateOneAdresse(Adresse adresse, long id) {
		// TODO Auto-generated method stub
		if(adresseRepository.findById(adresse.getId())!=null)
		return adresseRepository.save(adresse);
		else 
			return null;
	}

	@Override
	public void deleteOneAdresse(long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAllAdresse() {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Adresse> findAdresses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Adresse> findOneAdresses(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Adresse> findAdressesByVilleOrPays(String ville, String pays) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Adresse> findAdressewithBudget(double budget) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Adresse> findAdressewithCodepostale(int code) {
		// TODO Auto-generated method stub
		return null;
	}

}
