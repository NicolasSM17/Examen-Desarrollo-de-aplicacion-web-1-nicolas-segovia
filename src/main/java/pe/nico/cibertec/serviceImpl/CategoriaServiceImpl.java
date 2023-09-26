package pe.nico.cibertec.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.nico.cibertec.entity.Categoria;
import pe.nico.cibertec.interfaceService.CategoriaService;
import pe.nico.cibertec.repository.CategoriaRepository;

@Service
public class CategoriaServiceImpl implements CategoriaService{
	
	@Autowired
	private CategoriaRepository categoriaRepository;

	@Override
	public List<Categoria> listar() {
		
		return categoriaRepository.findAll();
	}

	@Override
	public Optional<Categoria> buscar(int id) {
		
		return categoriaRepository.findById(id);
	}

	@Override
	public Categoria agregar(Categoria categoria) {
		
		return categoriaRepository.save(categoria);
	}
}
