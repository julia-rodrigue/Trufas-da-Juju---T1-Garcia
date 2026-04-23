package com.example.sitetrufas.controller;

import com.example.sitetrufas.model.Pedido;
import com.example.sitetrufas.model.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PaginaController {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/produtos")
    public String produtos() {
        return "produtos";
    }

    @GetMapping("/pedidos")
    public String pedidos() {
        return "pedidos";
    }

    @PostMapping("/pedidos")
    public String salvarPedido(Pedido pedido) {
        pedidoService.inserirPedido(pedido);
        return "redirect:/historico";
    }

    @GetMapping("/historico")
    public String historico(Model model) {
        model.addAttribute("pedidos", pedidoService.listarPedidos());
        return "historico";
    }
}
