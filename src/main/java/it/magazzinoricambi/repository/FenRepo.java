package it.magazzinoricambi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import it.magazzinoricambi.entities.Fendinebbia;
import it.magazzinoricambi.entities.Modello;
import it.magazzinoricambi.entities.custom.FendinebbiaConCodModello;

@Repository
public interface FenRepo extends JpaRepository<Fendinebbia, Long>{

	
	 List<Fendinebbia> findByIdModello(Modello idModello);
	
//	@Query("SELECT f.idFendinebbia, f.lato, f.anno, f.modelli_compatibili, f.codici, f.restyling, f.idmodello, m.codmodello, m.nome, m.costruttore, m.serie, m.idserie, m.restyling_dates FROM magazzinoricambi.fendinebbia as f inner join magazzinoricambi.modelli as m on f.idmodello = m.idmodello")
//	List<FendinebbiaConCodModello> findAllConCodModello();
	
//	FendinebbiaConCodModello findFendinebbiaConCodModelloById(Long idModello);

	
}


//public interface FareRepository extends JpaRepository<Fare, Long> {
//    @Query("SELECT f FROM Fare f WHERE f.price >= :minPrice AND f.price <= :maxPrice")
//    List<Fare> findFaresByPriceRange(@Param("minPrice") double minPrice, @Param("maxPrice") double maxPrice);
//}