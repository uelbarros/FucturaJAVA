package br.com.fuctura.projeto.controller;

import br.com.fuctura.projeto.dto.UsuarioDTO;
import br.com.fuctura.projeto.model.Usuario;
import br.com.fuctura.projeto.service.UsuarioService;
import io.swagger.v3.oas.annotations.Operation;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

//    @GetMapping -  end point de buscar
//    @PostMapping - end point de inserir
//    @PutMapping - end poind de atualizar
//    @DeleteMapping - end point de deletar

    @Autowired //injecao de dependencia
    private UsuarioService usuarioService;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping
    @Operation(summary = "Método para listar todos os usuários")
    public ResponseEntity<List<UsuarioDTO>> findAll() {
        List<Usuario> usuList = usuarioService.findAll();
        return ResponseEntity.ok().body(usuList.stream().map(x -> modelMapper.map(x, UsuarioDTO.class))
                .collect(Collectors.toList()));

//        List<Usuario> listUsu = usuarioService.findAll();
//        List<UsuarioDTO> listDTO = new ArrayList<>();
//
//        for (Usuario usu : listUsu){
//            listDTO.add(new UsuarioDTO(usu));
//        }
//        return listDTO;
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioDTO> getById(@PathVariable Integer id){
        Usuario usu = usuarioService.findById(id);
        return ResponseEntity.ok().body(modelMapper.map(usu, UsuarioDTO.class));

//        Usuario usu = usuarioService.findById(id).get();
//        UsuarioDTO usuDTO = new UsuarioDTO(usu);
//        return ResponseEntity.ok().body(usuDTO);
    }

    @GetMapping("/nome/{name}")
    public ResponseEntity<List<UsuarioDTO>> findByNome(@PathVariable String name){
        List<Usuario> usuList = usuarioService.findByName(name);
        return ResponseEntity.ok().body(usuList.stream().map(x -> modelMapper.map(x, UsuarioDTO.class))
                .collect(Collectors.toList()));
    }

    @PostMapping
    public ResponseEntity<UsuarioDTO> save(@Valid @RequestBody UsuarioDTO usuarioDTO){
        Usuario usu = usuarioService.save(usuarioDTO);
        return ResponseEntity.ok().body(modelMapper.map(usu, UsuarioDTO.class));

//        Usuario usu = usuarioService.save(usuarioDTO);
//        UsuarioDTO usuDTO = new UsuarioDTO(usu);
//        return usuDTO;
    }

    @PutMapping("/{id}")
    public ResponseEntity<UsuarioDTO> update(@PathVariable Integer id, @Valid @RequestBody UsuarioDTO usuarioDTO){
        usuarioDTO.setId(id);
        return ResponseEntity.ok().body(modelMapper.map(usuarioService.update(usuarioDTO), UsuarioDTO.class));
    }

//    Usuario usu = usuarioService.findById(id).get();
//    UsuarioDTO usuDTO = new UsuarioDTO(usu);
//    return usuarioService.update(id, usuarioDTO);

    @DeleteMapping("/{id}")
    public ResponseEntity<UsuarioDTO> delete(@PathVariable Integer id){
        usuarioService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
