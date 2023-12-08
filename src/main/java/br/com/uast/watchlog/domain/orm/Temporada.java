package br.com.uast.watchlog.domain.orm;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "temporadas")
public class Temporada {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID Id;

	@ManyToOne
	@JoinColumn(name = "entretenimento_id", nullable = false)
	private Entretenimento entretenimentoId;

	@Column(length = 100, nullable = false)
	private int numero_temporada;

	@OneToMany(mappedBy = "temporadaId")
	private List<Episodio> episodios = new ArrayList<>();

	public Temporada() {
		super();
	}

	public Temporada(UUID id, Entretenimento entretenimentoId, int numero_temporada) {
		super();
		Id = id;
		this.entretenimentoId = entretenimentoId;
		this.numero_temporada = numero_temporada;
	}

	public UUID getId() {
		return Id;
	}

	public void setId(UUID id) {
		Id = id;
	}

	public Entretenimento getEntretenimentoId() {
		return entretenimentoId;
	}

	public void setEntretenimentoId(Entretenimento entretenimentoId) {
		this.entretenimentoId = entretenimentoId;
	}

	public int getNumero_temporada() {
		return numero_temporada;
	}

	public void setNumero_temporada(int numero_temporada) {
		this.numero_temporada = numero_temporada;
	}

}
