package br.com.fuctura.projeto.service;

import br.com.fuctura.projeto.dto.UsuarioDTO;
import br.com.fuctura.projeto.exceptions.DataIntegrityViolationException;
import br.com.fuctura.projeto.exceptions.ObjectNotFoundException;
import br.com.fuctura.projeto.model.Usuario;
import br.com.fuctura.projeto.repository.UsuarioRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// é a minha camada de tratamento de validacoes, exceçoes

@Service
public class UsuarioService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> findAll () {
        return usuarioRepository.findAll();
    }

    public Usuario save(UsuarioDTO usuarioDTO){
        findByEmail(usuarioDTO);
        return usuarioRepository.save(modelMapper.map(usuarioDTO, Usuario.class));
    }

//    usuario uso = new Usuario(null, usuarioDTO.getgetNome(), usuarioDTO.getEmail(), usuarioDTO.gerContato());
//    usuario.set

    public Usuario update(UsuarioDTO usuarioDTO){
        findById(usuarioDTO.getId()); //primeiro verifica o id pra saber se existe pra depois verificar o email
        findByEmail(usuarioDTO);
        return usuarioRepository.save(modelMapper.map(usuarioDTO, Usuario.class));
    }

    public Usuario findById(Integer id) {
        Optional<Usuario> usu = usuarioRepository.findById(id);
        return usu.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado!"));
    }

    public void delete(Integer id){
        findById(id);
        usuarioRepository.deleteById(id);
    }


    private void findByEmail(UsuarioDTO usuarioDTO) {
        Optional<Usuario> usu = usuarioRepository.findByEmail(usuarioDTO.getEmail());
        if (usu.isPresent() && !usu.get().getId().equals(usuarioDTO.getId())){
            throw new DataIntegrityViolationException("Email já cadastrado na base de dados!");
        }
    }
    public List<Usuario> findByName(String name){
        return usuarioRepository.findByNomeContaining(name);

    }

}
