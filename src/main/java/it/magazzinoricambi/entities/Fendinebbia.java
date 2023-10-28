package it.magazzinoricambi.entities;



import java.util.List;

//import org.hibernate.mapping.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity  //Questa classe corrisponde a una tabella
@Table(name="fendinebbia") //corrisponde al nome della tabella (entità)
public class Fendinebbia {
	
	@Id  // Obbligatorio
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //ID incrementale su tutta la tabella
	@Column(name = "id")  //corrisponde al nome della colonna (attributo)
	private Long idFendinebbia;
	
	@Column(name = "lato")
    private String lato;

    @Column(name = "anno")
    private String anno;

    @ManyToOne (targetEntity = Modello.class)
    @JoinColumn(name = "id_modello")
    private Modello idModello; 

    @Column(name = "modelli_compatibili")
    private String modelliCompatibili; 
    
    @Column(name = "codici")
    private String codici; 
    
    @Column(name = "restyling")
    private String restyling; 
    
    @Column(name = "cod_modello") //nisqasmk1
    private String codModello; 
    
    @Column(name = "cod_fendinebbia") //fen12
    private String codFendinebbia; 
    
    

	public Fendinebbia() {
		super();
	}
	
    // Getters e Setters
	

	public Long getIdFendinebbia() {
		return idFendinebbia;
	}

	public String getCodModello() {
		return codModello;
	}

	public void setCodModello(String codModello) {
		this.codModello = codModello;
	}

	public void setIdFendinebbia(Long idFendinebbia) {
		this.idFendinebbia = idFendinebbia;
	}

	public String getLato() {
		return lato;
	}

	public void setLato(String lato) {
		this.lato = lato;
	}

	public String getAnno() {
		return anno;
	}

	public void setAnno(String anno) {
		this.anno = anno;
	}

	public String getCodici() {
		return codici;
	}

	public void setCodici(String codici) {
		this.codici = codici;
	}

	public String getRestyling() {
		return restyling;
	}

	public void setRestyling(String restyling) {
		this.restyling = restyling;
	}

	public Modello getIdModello() {
		return idModello;
	}

	public void setIdModello(Modello idModello) {
		this.idModello = idModello;
	}

	public String getModelliCompatibili() {
		return modelliCompatibili;
	}

	public void setModelliCompatibili(String modelliCompatibili) {
		this.modelliCompatibili = modelliCompatibili;
	}

}
	

