package com.com.ifood.ifood_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping ("/mercados")
public class mercadosControler {

   @Autowired
   private MercadoService mercadoService;

    @GetMapping
    public List<Mercado> listarMercados() {
        return this.mercadoService.listar();
    }
    @GetMapping("/{index}")
    public ResponseEntity<Mercado> buscar(@PathVariable Integer index){
        Mercado mercado = this.mercadoService.buscar(index);

       if (mercado == null){
           return ResponseEntity.notFound().build();
       }
       return ResponseEntity.ok(mercado);
    }




    @PostMapping
    public ResponseEntity<Void> inserir(@RequestBody Mercado mercado){
            this.mercadoService.salvar(mercado);
            return ResponseEntity.status(HttpStatus.CREATED).build();
            //ResponseEntity constroe resposta status HTTP
    }
}



