package br.com.uast.watchlog.domain.orm;



import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Genero {
@Id
@GeneratedValue(strategy = GenerationType.UUID)
private UUID Id;
@Column (length = 100, nullable = false)
private String nome;

public Genero() {
	super();
}

public Genero(UUID id, String nome) {
	super();
	Id = id;
	this.nome = nome;
}

public UUID getId() {
	return Id;
}

public void setId(UUID id) {
	Id = id;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}



}
