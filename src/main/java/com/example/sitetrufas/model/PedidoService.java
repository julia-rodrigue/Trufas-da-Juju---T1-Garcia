package com.example.sitetrufas.model;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    @Autowired
    PedidoDAO pedidoDAO;

    public void inserirPedido(Pedido pedido){
        pedidoDAO.inserirPedido(pedido);
    }

    public ArrayList<Pedido> listarPedidos(){
        return pedidoDAO.listarPedidos();
    }
}