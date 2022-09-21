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
		repositorio.guardar(producto);

	}

	@Override
	public void actualizar(Producto producto) {
		// TODO Auto-generated method stub
		repositorio.actualizar(producto);

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repositorio.eliminar(id);

	}

	@Override
	public List<Producto> listar() {
		// TODO Auto-generated method stub
		repositorio.listar();
	}

	@Override
	public Producto obtener(Integer id) {
		// TODO Auto-generated method stub
		repositorio.obtener(id);
	}

}
