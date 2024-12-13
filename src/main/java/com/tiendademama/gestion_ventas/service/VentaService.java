package com.tiendademama.gestion_ventas.service;

import com.tiendademama.gestion_ventas.model.Venta;
import com.tiendademama.gestion_ventas.repository.VentaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VentaService {

    private final VentaRepository ventaRepository;

    public VentaService(VentaRepository ventaRepository) {
        this.ventaRepository = ventaRepository;
    }

    public List<Venta> obtenerVentas() {
        return ventaRepository.findAll();
    }

    public Venta registrarVenta(Venta venta) {
        return ventaRepository.save(venta);
    }
}
