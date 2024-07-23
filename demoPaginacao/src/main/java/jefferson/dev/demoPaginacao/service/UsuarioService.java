package jefferson.dev.demoPaginacao.service;

import jefferson.dev.demoPaginacao.dto.UsuarioDTO;
import jefferson.dev.demoPaginacao.projections.UsuarioProjections;

import java.util.List;


public interface UsuarioService {

    List<UsuarioDTO> findAllUsuarioDTO();

    List<UsuarioProjections> buscarNomesUsuariosProjections();



}
