package br.com.fiap.TwelveTools.Controllers;

import br.com.fiap.TwelveTools.Service.FerrarmentasService;
import br.com.fiap.TwelveTools.dtos.FerramentaDTO;
import br.com.fiap.TwelveTools.model.Ferramentas;
import jakarta.validation.Valid;
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
    public Object post(@Valid @RequestBody FerramentaDTO ferramentas) {

        return service.post(ferramentas);
    }

    @PutMapping("/{id}")
    public Object put(@PathVariable Long id, @Valid @RequestBody FerramentaDTO ferramentas) {
        return service.put(id, ferramentas);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Long id){
        return service.delete(id);
    }

}
