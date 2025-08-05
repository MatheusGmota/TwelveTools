package br.com.fiap.TwelveTools;

import br.com.fiap.TwelveTools.model.Ferramentas;
import br.com.fiap.TwelveTools.repository.FerramentasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FerrarmentasService {

    @Autowired
    private FerramentasRepository repository;

    public List<Ferramentas> getAll() {
        return repository.findAll();
    }
}
