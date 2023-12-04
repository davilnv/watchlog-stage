package br.com.uast.watchlog.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.uast.watchlog.domain.orm.Usuario;
import br.com.uast.watchlog.domain.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	private final UsuarioRepository repository;
	
	public UsuarioServiceImpl(UsuarioRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public Usuario salvarUsuario(Usuario usuario) throws Exception {
		Optional<Usuario> usuarioOptional = repository.findByLogin(usuario.getLogin());
		if (usuarioOptional.isPresent()) 
			throw new Exception("Usuário '" + usuario.getLogin() + "'  não existe");
		return repository.save(usuario);
	}

	@Override
	public List<Usuario> listarUsuarios() {
		return repository.findAll();
	}

	@Override
	public Usuario buscarUsuarioPorID(UUID id) throws Exception {
		Optional<Usuario> usuarioOptional = repository.findById(id);
		if (usuarioOptional.isEmpty()) 
			throw new Exception("Usuário '" + id + "'  não existe");
		return usuarioOptional.get();
	}

	@Override
	public Usuario buscarUsuarioPorLogin(String login) throws Exception {
		Optional<Usuario> usuarioOptional = repository.findByLogin(login);
		if (usuarioOptional.isEmpty()) 
			throw new Exception("Usuário '" + login + "'  não existe");
		return usuarioOptional.get();
	}
	
	@Override
	public Usuario atualizarUsuario(Usuario usuario) throws Exception {
		Optional<Usuario> usuarioOptional = repository.findByLogin(usuario.getLogin());
		if (usuarioOptional.isEmpty()) 
			throw new Exception("Usuário '" + usuario.getLogin() + "'  não existe");
		return repository.save(usuario);
	}

	@Override
	public void deletarUsuario(UUID id) throws Exception {
		Optional<Usuario> usuarioOptional = repository.findById(id);
		if (usuarioOptional.isEmpty()) 
			throw new Exception("Usuário '" + id + "'  não existe");
		repository.deleteById(id);
	}

}
