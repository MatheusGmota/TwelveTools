package br.com.fiap.TwelveTools.Service;

import br.com.fiap.TwelveTools.dtos.FerramentaDTO;
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
        }
        Ferramentas ferramentas = repository.findById(id).orElse(null);
        if(ferramentas == null) {
            return "Ferramenta não encontrada.";
        }
        return ferramentas;
    }

    public Object post(FerramentaDTO objeto) {
        if(objeto != null) {
            Ferramentas ferramenta = new Ferramentas();
            ferramenta.setNome(objeto.getNome());
            ferramenta.setTipo(objeto.getTipo());
            ferramenta.setClassificacao(objeto.getClassificacao());
            ferramenta.setTamanho(objeto.getTamanho());
            ferramenta.setPreco(objeto.getPreco());
            repository.save(ferramenta);
            return ferramenta;
        } else {
            return "Erro ao tentar salvar a ferramenta!";
        }
    }

    public Object put(Long id, FerramentaDTO objeto) {
        if (id == null) {
            return "Id da ferramenta é obrigatório para atualização!";
        }

        Ferramentas existente = repository.findById(id).orElse(null);
        if (existente == null) {
            return "Ferramenta não encontrada para o ID informado!";
        }

        existente.setNome(objeto.getNome());
        existente.setTipo(objeto.getTipo());
        existente.setClassificacao(objeto.getClassificacao());
        existente.setTamanho(objeto.getTamanho());
        existente.setPreco(objeto.getPreco());

        repository.saveAndFlush(existente);
        return existente;
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
