package br.com.fuctura.projeto.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "endereco_id")
    private Integer id;

    private String rua;

    private Integer numero;

    private String cidade;

    public Endereco(Integer id, String rua, Integer numero, String cidade) {
        id = id;
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
    }
}
