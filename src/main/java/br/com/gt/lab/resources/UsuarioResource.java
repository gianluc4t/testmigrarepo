package br.com.gt.lab.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="usuarios/")
public class UsuarioResource {
	
	@RequestMapping(value="/find", method=RequestMethod.GET)
	public ResponseEntity<String> find(){
		return ResponseEntity.ok().body("autenticato");
	}
	
	@RequestMapping(value="/hulp", method=RequestMethod.GET)
	public ResponseEntity<String> hulp(){
		return ResponseEntity.ok().body("bravo");
	}
	
}
