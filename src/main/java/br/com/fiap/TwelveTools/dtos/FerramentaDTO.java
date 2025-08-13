package br.com.fiap.TwelveTools.dtos;

import lombok.*;


@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor
@Getter @Setter
public class FerramentaDTO {

    private @NonNull String nome;

    private @NonNull String tipo;

    private @NonNull String classificacao;

    private @NonNull String tamanho;

    private @NonNull Double preco;

}
