package com.idat.SetiembreIIIE.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.idat.SetiembreIIIE.model.Producto;
import com.idat.SetiembreIIIE.repository.ProductoRepository;


@Service
public class ProductoServiceImpl implements ProductoService {
	
	
	private ProductoRepository repositorio;

	@Override
	public void guardar(Producto producto) {
		// TODO Auto-generated method stub
		repositorio.save(producto);

	}

	@Override
	public void actualizar(Producto producto) {
		// TODO Auto-generated method stub
		repositorio.saveAndFlush(producto);

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repositorio.deleteById(id);

	}

	@Override
	public List<Producto> listar() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public Producto obtener(Integer id) {
		// TODO Auto-generated method stub
		return repositorio.findById(id).orElse(null);
	}

}
