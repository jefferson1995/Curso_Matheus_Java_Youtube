package jefferson.dev.demoPaginacao.repository;

import jefferson.dev.demoPaginacao.dto.UsuarioDTO;
import jefferson.dev.demoPaginacao.entity.Usuario;
import jefferson.dev.demoPaginacao.projections.UsuarioProjections;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface UsuarioRepository extends JpaRepository<Usuario, UUID> {


    @Query("select new jefferson.dev.demoPaginacao.dto.UsuarioDTO(u.name, u.login) from Usuario u")
    List<UsuarioDTO> findAllUsuarioDTO();

    @Query("select u.name as nome from Usuario u")
    List<UsuarioProjections> buscarNomesUsuariosProjections();

}
