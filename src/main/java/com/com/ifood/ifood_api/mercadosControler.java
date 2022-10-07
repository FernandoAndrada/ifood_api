package com.com.ifood.ifood_api;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping ("/mercados")
public class mercadosControler {


    List<Mercado> mercados = new ArrayList();

    @GetMapping
    public List<Mercado> listarMercados() {
        return this.mercados;
    }
    @GetMapping("/{index}")
    public Mercado buscar(@PathVariable Integer index){
        return this.mercados.get(index);
            }




    @PostMapping
    public void inserir(@RequestBody Mercado mercado){
        this.mercados.add(mercado);
    }
}



