package br.com.fuctura.projeto.model;

import br.com.fuctura.projeto.enuns.Estatura;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data //cria construtores com parametros os getters e setters, to string, hashcode, equals.
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TB_usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usuario_id")
    private Integer id;

    @Column (name = "nome_usuario")
    private String nome;

    @Column (name = "email_usuario")
    private String email;

    @Column (name = "contato_usuario")
    private String contato;

    @Column (name = "estatura_usuario")
    private Estatura estatura;

    @OneToOne(cascade = CascadeType.PERSIST)
    //o primeiro ONE diz respeito ao USUARIO e o segundo ONE diz respeito ao ENDERECO - um usuario tem um endereco
    private Endereco endereco;

}
