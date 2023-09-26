package pe.nico.cibertec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.nico.cibertec.entity.Cliente;
import pe.nico.cibertec.interfaceService.CategoriaService;
import pe.nico.cibertec.interfaceService.ClienteService;

@Controller
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@Autowired
	private CategoriaService categoriaService;
	
	@GetMapping("/listar")
	public String listadoClientes(Model model) {
		List<Cliente> lista = clienteService.listar();
		model.addAttribute("listado", lista);
		
		return "listadoClientes";
	}
	
	@GetMapping("/nuevo")
	public String agregar(Model model) {
		model.addAttribute("idcliente", new Cliente());
		
		return "agregarForm";
	}
	
	@PostMapping("/salvar")
	public String salvar(@Validated Cliente cliente) {
		clienteService.grabar(cliente);
		
		return "redirect:/listar";
	}
}
