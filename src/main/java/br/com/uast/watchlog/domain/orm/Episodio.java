package br.com.uast.watchlog.domain.orm;



import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "episodios")
public class Episodio {
@Id
@GeneratedValue(strategy = GenerationType.UUID)
private UUID id;

@ManyToOne
@JoinColumn(name = "temporada_id", nullable = false)
private Temporada temporadaId;

@Column (length = 100, nullable = false)
private int numero_episodio;
@Column (length = 100, nullable = false)
private String nome;
@Column (length = 100, nullable = false)
private String  sinopse;
@Column (length = 100, nullable = false)
private String data_lancamento;
@Column (length = 100, nullable = false)
private int duracao;

public Episodio() {
	super();
}

public Episodio(UUID id, Temporada temporadaId, int numero_episodio, String nome, String sinopse,
		String data_lancamento, int duracao) {
	super();
	this.id = id;
	this.temporadaId = temporadaId;
	this.numero_episodio = numero_episodio;
	this.nome = nome;
	this.sinopse = sinopse;
	this.data_lancamento = data_lancamento;
	this.duracao = duracao;
}

public UUID getId() {
	return id;
}

public void setId(UUID id) {
	this.id = id;
}

public Temporada getTemporadaId() {
	return temporadaId;
}

public void setTemporadaId(Temporada temporadaId) {
	this.temporadaId = temporadaId;
}

public int getNumero_episodio() {
	return numero_episodio;
}

public void setNumero_episodio(int numero_episodio) {
	this.numero_episodio = numero_episodio;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getSinopse() {
	return sinopse;
}

public void setSinopse(String sinopse) {
	this.sinopse = sinopse;
}

public String getData_lancamento() {
	return data_lancamento;
}

public void setData_lancamento(String data_lancamento) {
	this.data_lancamento = data_lancamento;
}

public int getDuracao() {
	return duracao;
}

public void setDuracao(int duracao) {
	this.duracao = duracao;
}



}
