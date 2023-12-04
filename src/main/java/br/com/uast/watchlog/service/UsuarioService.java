package br.com.uast.watchlog.service;

import java.util.List;
import java.util.UUID;

import br.com.uast.watchlog.domain.orm.Usuario;

public interface UsuarioService {
	Usuario salvarUsuario(Usuario usuario) throws Exception;
	List<Usuario> listarUsuarios();
	Usuario buscarUsuarioPorID(UUID id) throws Exception;
	Usuario buscarUsuarioPorLogin(String login) throws Exception;
	Usuario atualizarUsuario(Usuario usuario) throws Exception;
	void deletarUsuario(UUID id) throws Exception;
}
