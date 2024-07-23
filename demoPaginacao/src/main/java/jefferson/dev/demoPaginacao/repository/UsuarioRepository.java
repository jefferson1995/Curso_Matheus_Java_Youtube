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

    //Query derivadas

    // buscando por nome e  ignorando maiuscula e minusculas
    List<Usuario> findByNameIgnoreCase(String name);

    // limitando registro em tres consultas
    List<Usuario> findTop2By();

    //Buscando por nome que contenha um determinado trecho

    List<Usuario> findByNameContains(String name);

    //Buscando por nome que contenha um determinado trecho ignorando case

    List<Usuario> findByNameContainsIgnoreCase(String name);


}
