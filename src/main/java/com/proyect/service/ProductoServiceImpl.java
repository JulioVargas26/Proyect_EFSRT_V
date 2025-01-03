package com.proyect.service;

import com.proyect.entity.Producto;
import com.proyect.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private ProductoRepository productoRepository;

	/*@Override
	public Producto insertar(Producto p) {
		return productoRepository.save(p);
	}*/

	@Override
	public Producto insertar(Producto jp) {
		return productoRepository.save(jp);
	}

	@Override
	public Producto actualizar(Producto p) {
		return productoRepository.save(p);
	}

	@Override
	public Optional<Producto> buscarPorId(Long id) {
		return productoRepository.findById(id);
	}

	@Override
	public List<Producto> listarRegistrosActivoTrue() {
		return productoRepository.listarRegistrosActivoTrue();
	}

	/*@Override
	public Page<DTOProductoList> listarRegistrosActivoTrue(@PageableDefault(size = 10) Pageable paginacion) {
		System.out.println("Listar Libros");
		return productoRepository.listarRegistrosActivoTrue(paginacion).map(DTOProductoList::new);

	}*/

	/*@Override
	public List<Producto> buscarPorNombre(String nombre_producto) {
		return productoRepository.buscarPorNombre(nombre_producto);
	}*/

	@Override
	public List<Producto> buscarPorFiltrosGestionProducto(String cod_prod, String des_prod) {
		return productoRepository.buscarPorFiltrosGestionProducto(cod_prod, des_prod);
	}

}