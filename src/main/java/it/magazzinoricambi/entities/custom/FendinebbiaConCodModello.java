package it.magazzinoricambi.entities.custom;

import jakarta.persistence.Column;

public class FendinebbiaConCodModello {
	
	@Column(name = "idfendinebbia")
	private Long idFendinebbia;
	
	@Column(name = "lato")
    private String lato;
	
	@Column(name = "anno")
    private String anno;
	
	@Column(name = "idmodello") //fk
    private Long idModello;
	
    @Column(name = "modelli_compatibili")
    private String modelliCompatibili; 
    
	@Column(name = "codici")
    private String codici; 
	
	@Column(name = "restyling")
    private String restyling;
	
	@Column(name = "codmodello")
    private String codModello;
	
	@Column(name = "nome")
    private String nome;
	
	@Column(name = "costruttore")
    private String costruttore;
	
	@Column(name = "serie")
    private String serie;
	
	@Column(name = "idserie")
    private String idserie;
	
	@Column(name = "restyling_dates")
    private String restylingDates;

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

	public String getIdserie() {
		return idserie;
	}

	public void setIdserie(String idserie) {
		this.idserie = idserie;
	}

	public String getRestylingDates() {
		return restylingDates;
	}

	public void setRestylingDates(String restylingDates) {
		this.restylingDates = restylingDates;
	}

	public FendinebbiaConCodModello() {
		super();
	}
	
    // Getters e Setters

	public Long getIdFendinebbia() {
		return idFendinebbia;
	}

	public void setidFendinebbia(Long idFendinebbia) {
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

	public Long getIdModello() {
		return idModello;
	}

	public void setIdModello(Long idModello) {
		this.idModello = idModello;
	}

	public String getModelliCompatibili() {
		return modelliCompatibili;
	}

	public void setModelliCompatibili(String modelliCompatibili) {
		this.modelliCompatibili = modelliCompatibili;
	}
	
	public String getCodModello() {
		return codModello;
	}

	public void setCodModello(String codModello) {
		this.codModello = codModello;
	}

}
	

