package jefferson.dev.demoPaginacao.service.impl;

import jefferson.dev.demoPaginacao.dto.UsuarioDTO;
import jefferson.dev.demoPaginacao.entity.Usuario;
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

    @Override
    public List<Usuario> findByNomeIgnoreCase(String name) {
        return usuarioRepository.findByNameIgnoreCase(name);
    }

    @Override
    public List<Usuario> findTop2By() {
        return usuarioRepository.findTop2By();
    }

    @Override
    public List<Usuario> findByNomeContains(String name) {
        return usuarioRepository.findByNameContains(name);
    }

    @Override
    public List<Usuario> findByNomeContainsIgnoreCase(String name) {
        return usuarioRepository.findByNameContainsIgnoreCase(name);
    }
}
