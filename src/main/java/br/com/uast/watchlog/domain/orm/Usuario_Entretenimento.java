package br.com.uast.watchlog.domain.orm;


import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import jakarta.persistence.OneToOne;

@Entity
public class Usuario_Entretenimento {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;

	@OneToOne
	@JoinColumn(name = "entretenimento_id")
	private Entretenimento entretenimentoId;
	@OneToOne
	@JoinColumn(name = "usuario_id")
	private Usuario usuarioId;
	@OneToOne
	@JoinColumn(name = "temporada_id")
	private Temporada temporadaId;
	@OneToOne
	@JoinColumn(name = "episodio_id")
	private Episodio episodioId;

	@Column(length = 100, nullable = false)
	private double nota_avaliacao;
	@Column(length = 100, nullable = false)
	private String comentario;
	@Column(length = 100, nullable = false)
	private boolean assistido;

	public Usuario_Entretenimento() {
		super();
	}

	public Usuario_Entretenimento(UUID id, Entretenimento entretenimentoId, Usuario usuarioId, Temporada temporadaId,
			Episodio episodioId, double nota_avaliacao, String comentario, boolean assistido) {
		super();
		this.id = id;
		this.entretenimentoId = entretenimentoId;
		this.usuarioId = usuarioId;
		this.temporadaId = temporadaId;
		this.episodioId = episodioId;
		this.nota_avaliacao = nota_avaliacao;
		this.comentario = comentario;
		this.assistido = assistido;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public Entretenimento getEntretenimentoId() {
		return entretenimentoId;
	}

	public void setEntretenimentoId(Entretenimento entretenimentoId) {
		this.entretenimentoId = entretenimentoId;
	}

	public Usuario getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Usuario usuarioId) {
		this.usuarioId = usuarioId;
	}

	public Temporada getTemporadaId() {
		return temporadaId;
	}

	public void setTemporadaId(Temporada temporadaId) {
		this.temporadaId = temporadaId;
	}

	public Episodio getEpisodioId() {
		return episodioId;
	}

	public void setEpisodioId(Episodio episodioId) {
		this.episodioId = episodioId;
	}

	public double getNota_avaliacao() {
		return nota_avaliacao;
	}

	public void setNota_avaliacao(double nota_avaliacao) {
		this.nota_avaliacao = nota_avaliacao;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public boolean isAssistido() {
		return assistido;
	}

	public void setAssistido(boolean assistido) {
		this.assistido = assistido;
	}

}
