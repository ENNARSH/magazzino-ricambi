package it.magazzinoricambi.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "modelli")
public class Modello {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true) 
    private Long id;
    
    @Column(name = "cod_modello")
    private String codModello;

    @Column(name = "nome")
    private String nome;

    @Column(name = "costruttore")
    private String costruttore;

    @Column(name = "serie")
    private String serie;
    
    @Column(name = "Cod_serie")
    private String codSerie;
    
    @Column(name = "restyling_dates")
    private String restylingDates;
    
	// get e set

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodModello() {
		return codModello;
	}


	public void setCodmodello(String codModello) {
		this.codModello = codModello;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCostruttore() {
		return costruttore;
	}

	public void setCostruttore(String costruttore) {
		this.costruttore = costruttore;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getCodSerie() {
		return codSerie;
	}

	public void setCodSerie(String codSerie) {
		this.codSerie = codSerie;
	}

	public String getRestylingDates() {
		return restylingDates;
	}

	public void setRestylingDates(String restylingDates) {
		this.restylingDates = restylingDates;
	}
    





    
}