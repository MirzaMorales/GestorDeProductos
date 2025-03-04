package edu.utng.mx.backend.services;
import java.util.List;

import org.springframework.stereotype.Service;

import edu.utng.mx.backend.documentos.Producto;
import edu.utng.mx.backend.repository.FiltrosCliente;

 @Service
public class FiltrosClienteService {
    private final FiltrosCliente filtrosCliente;

    public FiltrosClienteService(FiltrosCliente filtrosCliente) {
        this.filtrosCliente = filtrosCliente;
    }

    public List<Producto> findByCategoria(String categoria) {
        return filtrosCliente.findByCategoria(categoria);
    }


    public List<Producto> findByNombre(String nombre) {
        return filtrosCliente.findByNombreProducto(nombre);
    }

    public List<Producto> findByCategoriaYNombre(String categoria, String nombre) {
        return filtrosCliente.findByCategoriaYNombre(categoria, nombre);
    }
    public List<Producto> productosClienteDefecto() {
        return filtrosCliente.productosClienteDefecto();
    }

}
