package br.com.fiap.TwelveTools.Controllers;

import br.com.fiap.TwelveTools.Service.FerrarmentasService;
import br.com.fiap.TwelveTools.model.Ferramentas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    public Object getById(@PathVariable("id") Long id) {
        return service.getById(id);
    }

    @PostMapping()
    public Object post(@RequestBody Ferramentas ferramentas) {
        return service.post(ferramentas);
    }

    @PutMapping()
    public Object put(@RequestBody Ferramentas ferramentas) {
        return service.put(ferramentas);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Long id){
        return service.delete(id);
    }

}
