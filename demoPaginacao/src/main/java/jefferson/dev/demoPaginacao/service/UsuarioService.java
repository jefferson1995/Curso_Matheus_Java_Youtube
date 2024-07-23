package jefferson.dev.demoPaginacao.service;

import jefferson.dev.demoPaginacao.dto.UsuarioDTO;

import java.util.List;


public interface UsuarioService {
    List<UsuarioDTO> findAllUsurioDTO();

}
