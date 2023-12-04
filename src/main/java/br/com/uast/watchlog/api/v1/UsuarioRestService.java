package br.com.uast.watchlog.api.v1;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.uast.watchlog.api.dto.UsuarioRegisterDto;
import br.com.uast.watchlog.domain.orm.Usuario;
import br.com.uast.watchlog.service.UsuarioService;

@RestController
@RequestMapping("/v1/usuario")
public class UsuarioRestService {
	
	private final UsuarioService usuarioService;
	
	public UsuarioRestService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
	
	@PostMapping
	public ResponseEntity<?> salvarUsuario(@RequestBody UsuarioRegisterDto usuario) {
		try {
			return new ResponseEntity<>(usuarioService.salvarUsuario(new Usuario(usuario)), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> buscarUsuario(@PathVariable String id) {
		try {
			return new ResponseEntity<>(usuarioService.buscarUsuarioPorID(UUID.fromString(id)), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
	
}
