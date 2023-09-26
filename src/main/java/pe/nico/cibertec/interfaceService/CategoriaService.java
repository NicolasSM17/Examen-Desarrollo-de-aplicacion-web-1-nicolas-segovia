package pe.nico.cibertec.interfaceService;

import java.util.List;
import java.util.Optional;

import pe.nico.cibertec.entity.Categoria;

public interface CategoriaService {
	public List<Categoria> listar();
	public Optional<Categoria> buscar(int id);
	public Categoria agregar(Categoria categoria);
}
