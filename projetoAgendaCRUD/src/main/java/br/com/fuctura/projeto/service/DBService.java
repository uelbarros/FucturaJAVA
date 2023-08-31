package br.com.fuctura.projeto.service;

import br.com.fuctura.projeto.enuns.Estatura;
import br.com.fuctura.projeto.model.Endereco;
import br.com.fuctura.projeto.model.Usuario;
import br.com.fuctura.projeto.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public void instanciaDB (){
        Endereco end1 = new Endereco(null, "Rua Ernesto Nazareth", 578, "Recife");
        Endereco end2 = new Endereco(null, "Av Conselheiro Aguiar", 3231, "Recife");
        Endereco end3 = new Endereco(null, "Av Rui Barbosa", 704, "Recife");

        Usuario usu1 = new Usuario(null, "Ruan Victor" , "ruanvictor@gmail.com" , "988889999" , Estatura.MEDIA, end1);
        Usuario usu2 = new Usuario(null, "Emmanuel Barros" , "emmanuelb@gmail.com" , "999998888" , Estatura.ALTA, end2);
        Usuario usu3 = new Usuario(null, "Marga Barros" , "margabarros@gmail.com" , "912345678" , Estatura.BAIXA, end3);
        Usuario usu4 = new Usuario(null, "Uel" , "uel@gmail.com" , "987878787" , Estatura.ALTA, end1);

        usuarioRepository.saveAll(Arrays.asList(usu1, usu2, usu3, usu4));

    }

}
