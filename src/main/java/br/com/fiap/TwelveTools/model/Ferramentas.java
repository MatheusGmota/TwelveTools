package br.com.fiap.TwelveTools.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="TB_FERRAMENTAS")
@SequenceGenerator(name = "ferramenta", sequenceName = "SQ_TB_FERRAMENTA",allocationSize = 1)
@Data
public class Ferramentas {

    @Id
    @Column(name = "id_ferramenta")
    @GeneratedValue(generator = "ferramenta", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    private String nome;

    @Column
    private String tipo;

    @Column
    private String classificacao;

    @Column
    private String tamanho;

    @Column
    private Double preco;

    public Ferramentas(String nome, String tipo, String classificacao, String tamanho, Double preco) {
        this.nome = nome;
        this.tipo = tipo;
        this.classificacao = classificacao;
        this.tamanho = tamanho;
        this.preco = preco;
    }
}
