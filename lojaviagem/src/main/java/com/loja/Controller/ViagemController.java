package com.loja.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.info.ProjectInfoProperties.Build;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loja.Model.Viagem;
import com.loja.repository.ViagemRepository;
 
@RestController
@RequestMapping("/Viagem")
public class ViagemController {
	
	@Autowired
	private ViagemRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Viagem>> getAll() {
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Object> getByid(@PathVariable int id) {
		
		Optional<Viagem> viagemExist = repository.findById(id);
		
		if (viagemExist.isEmpty())
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			
		return ResponseEntity.ok(viagemExist.get());
	}
	
	@PostMapping
	public ResponseEntity<Viagem> post(@RequestBody Viagem viagem) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(viagem));
	}
	
	@PutMapping
	public ResponseEntity<Viagem> put(@PathVariable Viagem ViagemAtualzado) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(ViagemAtualzado));
	}
	
	@DeleteMapping("/{id}")
	
	public ResponseEntity<?> delete(@PathVariable int id) {
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}
	

}