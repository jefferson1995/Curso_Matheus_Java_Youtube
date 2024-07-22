package jefferson.dev.demoPaginacao.service;

import jefferson.dev.demoPaginacao.entity.Pessoa;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface PessoaService {
    List<Pessoa> findAll(int pagina, int itens);

}
