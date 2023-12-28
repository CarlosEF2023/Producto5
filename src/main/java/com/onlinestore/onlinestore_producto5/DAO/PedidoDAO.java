package com.onlinestore.onlinestore_producto5.DAO;

import com.onlinestore.onlinestore_producto5.modelo.Pedido;

import java.util.ArrayList;

public interface PedidoDAO extends DAO <Pedido,Integer>{
    ArrayList<Pedido> obtenerPorCriterio(Integer columna, String criterio);

    ArrayList<Pedido> obtenerPorCriterio(String columna, String criterio);
}
