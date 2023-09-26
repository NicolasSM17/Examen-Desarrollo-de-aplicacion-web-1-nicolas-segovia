package pe.nico.cibertec.interfaceService;

import java.util.List;

import pe.nico.cibertec.entity.Cliente;

public interface ClienteService {
	public List<Cliente> listar();
	public Cliente grabar(Cliente cliente);
}
