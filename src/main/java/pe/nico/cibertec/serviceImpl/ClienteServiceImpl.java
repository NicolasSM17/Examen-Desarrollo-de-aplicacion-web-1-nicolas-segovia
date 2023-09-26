package pe.nico.cibertec.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.nico.cibertec.entity.Cliente;
import pe.nico.cibertec.interfaceService.ClienteService;
import pe.nico.cibertec.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService{

	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public List<Cliente> listar() {
		
		return clienteRepository.findAll();
	}

	@Override
	public Cliente grabar(Cliente cliente) {
		
		return clienteRepository.save(cliente);
	}
}
