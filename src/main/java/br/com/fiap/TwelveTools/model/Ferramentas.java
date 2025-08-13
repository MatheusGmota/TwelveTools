package br.com.fiap.TwelveTools.model;

import br.com.fiap.TwelveTools.dtos.FerramentaDTO;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="TB_FERRAMENTAS")
@SequenceGenerator(name = "ferramenta", sequenceName = "SQ_TB_FERRAMENTA",allocationSize = 1)
@NoArgsConstructor
@Getter @Setter
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
}
