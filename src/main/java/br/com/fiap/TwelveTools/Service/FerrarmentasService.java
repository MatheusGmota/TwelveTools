package br.com.fiap.TwelveTools.Service;

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

    public Object getById(Long id) {
        if(id == null) {
            return "Id da ferramenta não encontrado!";
        } else {
            return repository.findById(id).orElse(null);
        }
    }

    public Object post(Ferramentas ferramentas) {
        if(ferramentas != null) {
            return repository.save(ferramentas);
        } else {
            return "Erro ao tentar salvar a ferramenta!";
        }
    }

    public Object put(Ferramentas ferramenta) {
        if(ferramenta != null) {
            return repository.saveAndFlush(ferramenta);
        } else {
            return "Erro ao tentar atualizar a ferramenta!";
        }
    }

    public String delete(Long id) {
        Ferramentas ferramenta = repository.findById(id).orElse(null);
        if(ferramenta != null) {
            repository.delete(ferramenta);
            return "Ferramenta deletada com sucesso!";
        } else {
            return "Não foi possível deletar a ferramenta!";
        }
    }
}
