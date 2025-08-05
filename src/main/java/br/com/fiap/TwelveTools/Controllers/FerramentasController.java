package br.com.fiap.TwelveTools.Controllers;

import br.com.fiap.TwelveTools.FerrarmentasService;
import br.com.fiap.TwelveTools.model.Ferramentas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/ferramentas")
public class FerramentasController {

    @Autowired
    private FerrarmentasService service;

    @GetMapping()
    public List<Ferramentas> get() {
        return service.getAll();
    }
}
