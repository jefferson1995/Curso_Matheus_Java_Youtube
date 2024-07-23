package jefferson.dev.demoPaginacao.repository;

import jefferson.dev.demoPaginacao.entity.Pessoa;
import jefferson.dev.demoPaginacao.entity.Usuario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface PessoaRepository extends JpaRepository<Pessoa, UUID> {

    Page<Pessoa> findAll(Pageable pageable);

}
