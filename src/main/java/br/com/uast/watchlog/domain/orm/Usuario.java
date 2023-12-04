package br.com.uast.watchlog.domain.orm;

import java.util.UUID;

import br.com.uast.watchlog.api.dto.UsuarioRegisterDto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	@Column(length = 100, nullable = false)
	private String nome;
	@Column(length = 50, nullable = false)
	private String login;
	@Column(length = 100, nullable = false)
	private String senha;
	@Column(length = 100, nullable = false)
	private String email;

	public Usuario() {}

	public Usuario(UsuarioRegisterDto dto) {
		this.nome = dto.nome();
		this.login = dto.login();
		this.senha = dto.senha();
		this.email = dto.email();
	}

	public Usuario(UUID id, String nome, String login, String senha, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.email = email;
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

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
