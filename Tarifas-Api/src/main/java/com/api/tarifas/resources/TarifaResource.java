package com.api.tarifas.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.tarifas.domain.Tarifa;
import com.api.tarifas.repository.TarifaRepository;

@RestController
@RequestMapping("/tarifas")
public class TarifaResource {
	
	@Autowired
	private TarifaRepository tarifaRepository;
	
	@GetMapping
	public List<Tarifa> listarTodas(){
		return tarifaRepository.findAll();
	}
	
	@GetMapping("/{codigo}")
	public Tarifa buscarPeloCodigo(@PathVariable Long codigo) {
		return tarifaRepository.findById(codigo).orElse(null);
	}
	
	@DeleteMapping("/{codigo}")
	public void remover(@PathVariable Long codigo) {
		tarifaRepository.deleteById(codigo);
	}
	
	@PostMapping("/insert")
	public Tarifa cadastrar(@RequestBody Tarifa tarifa) {
		return tarifaRepository.save(tarifa);
	}
	
	@PutMapping("/tarifa")
	public Tarifa atualizar(@RequestBody Tarifa tarifa) {
		return tarifaRepository.save(tarifa);
	}

}
