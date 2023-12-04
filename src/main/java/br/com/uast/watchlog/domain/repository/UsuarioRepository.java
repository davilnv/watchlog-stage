package br.com.uast.watchlog.domain.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.uast.watchlog.domain.orm.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, UUID> {
	Optional<Usuario> findByLogin(String login);
}
