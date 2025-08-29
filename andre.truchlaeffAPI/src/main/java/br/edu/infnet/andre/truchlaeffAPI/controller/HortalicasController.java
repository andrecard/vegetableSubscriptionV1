package br.edu.infnet.andre.truchlaeffAPI.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/hortalica")
public class HortalicasController {
    @GetMapping("/nome")
    public String obterNome(){
        return alface;
    }
}
