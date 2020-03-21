package com.uatx.inventarios.service.impl;

public class ProductoServiceImpl {
import com.uatx.inventarios.dto.ProductoDTO;
import com.uatx.inventarios.model.Producto;
import com.uatx.inventarios.repository.ProductoRepository;
import com.uatx.inventarios.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;





    @Service
    public class ProductoServiceImpl implements ProductoService {

        @Autowired
        private ProductoRepository productoRepository;

        @Override
        public Long store(ProductoDTO productoDTO) {
            Producto producto = new Producto();
            producto.setNombre(productoDTO.getNombre());

            productoRepository.save(producto);

            return producto.getId();
        }
    }