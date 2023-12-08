package br.com.uast.watchlog.domain.orm;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;


@Entity(name = "entretenimento")
public class Entretenimento {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	@Column(length = 100, nullable = false)
	private String nome;
	@Column(name = "ano_lancamento", length = 100, nullable = false)
	private int anoLancamento;
	@Column(length = 100, nullable = false)
	private int duracao;
	@Column(length = 100, nullable = false)
	private int classificacao;
	@Column(length = 100, nullable = false)
	private String sinopse;
	@Column(length = 100, nullable = false)
	private double avaliacao;
	
	

	@OneToOne
	@JoinColumn(name = "categoria_id")
	private Categoria categoriaId;
	
	@OneToOne
	@JoinColumn(name = "genero_id")
	private Genero generoId;

	@OneToMany(mappedBy = "entretenimentoId", fetch = FetchType.EAGER)
	private List<Temporada> temporadas = new ArrayList<>();

	public Entretenimento() {
		super();
	}

	public Entretenimento(UUID id, String nome, Categoria categoriaId, Genero generoId, int anoLancamento, int duracao,
			int classificacao, String sinopse, double avaliacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.categoriaId = categoriaId;
		this.generoId = generoId;
		this.anoLancamento = anoLancamento;
		this.duracao = duracao;
		this.classificacao = classificacao;
		this.sinopse = sinopse;
		this.avaliacao = avaliacao;
		
		
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public Categoria getCategoriaId() {
		return categoriaId;
	}

	public void setCategoriaId(Categoria categoriaId) {
		this.categoriaId = categoriaId;
	}

	public Genero getGeneroId() {
		return generoId;
	}

	public void setGeneroId(Genero generoId) {
		this.generoId = generoId;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public int getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public double getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(double avaliacao) {
		this.avaliacao = avaliacao;
	}

	
	

}
