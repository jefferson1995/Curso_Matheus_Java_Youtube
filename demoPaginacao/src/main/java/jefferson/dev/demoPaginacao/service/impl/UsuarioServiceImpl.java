package jefferson.dev.demoPaginacao.service.impl;

import jefferson.dev.demoPaginacao.dto.UsuarioDTO;
import jefferson.dev.demoPaginacao.projections.UsuarioProjections;
import jefferson.dev.demoPaginacao.repository.UsuarioRepository;
import jefferson.dev.demoPaginacao.service.UsuarioService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UsuarioServiceImpl implements UsuarioService {

    final
    UsuarioRepository usuarioRepository;

    UsuarioServiceImpl(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }


    @Override
    public List<UsuarioDTO> findAllUsuarioDTO() {
        return usuarioRepository.findAllUsuarioDTO();
    }

    @Override
    public List<UsuarioProjections> buscarNomesUsuariosProjections() {
        return usuarioRepository.buscarNomesUsuariosProjections();
    }
}
