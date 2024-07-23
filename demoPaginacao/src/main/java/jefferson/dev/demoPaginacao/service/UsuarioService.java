package jefferson.dev.demoPaginacao.service;

import jefferson.dev.demoPaginacao.dto.UsuarioDTO;
import jefferson.dev.demoPaginacao.entity.Usuario;
import jefferson.dev.demoPaginacao.projections.UsuarioProjections;

import java.util.List;


public interface UsuarioService {

    List<UsuarioDTO> findAllUsuarioDTO();

    List<UsuarioProjections> buscarNomesUsuariosProjections();


    List<Usuario> findByNomeIgnoreCase(String name);

    List<Usuario> findTop2By();


    List<Usuario> findByNomeContains(String name);

    List<Usuario> findByNomeContainsIgnoreCase(String name);



}
