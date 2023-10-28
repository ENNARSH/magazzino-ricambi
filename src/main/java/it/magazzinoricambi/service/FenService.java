package it.magazzinoricambi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import it.magazzinoricambi.entities.Fendinebbia;
import it.magazzinoricambi.entities.Modello;
import it.magazzinoricambi.entities.custom.FendinebbiaConCodModello;
import it.magazzinoricambi.repository.FenRepo;

@Service
public class FenService {
 
    @Autowired
    private FenRepo repo;
     
    public List<Fendinebbia> listAll() {
        List<Fendinebbia> lista = repo.findAll();
        return lista;
    }
    
//    public List<FendinebbiaConCodModello> listAllConCodModello() {
//        List<FendinebbiaConCodModello> lista = repo.findAllConCodModello();
//        return lista;
//    }
     
    public void save(Fendinebbia product) {
        repo.save(product);
    }
     
    public Fendinebbia get(long id) {
        return repo.findById(id).get();
    }
     
    public void delete(long id) {
        repo.deleteById(id);
    }
	public Modello getIdModello() {
		return getIdModello();
	}

    
    public List<Fendinebbia> findByIdModello(Modello idModello) {
    	return repo.findByIdModello(idModello);
    }
	

}

