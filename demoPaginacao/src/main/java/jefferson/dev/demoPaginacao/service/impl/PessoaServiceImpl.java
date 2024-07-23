package jefferson.dev.demoPaginacao.service.impl;

import jefferson.dev.demoPaginacao.entity.Pessoa;
import jefferson.dev.demoPaginacao.repository.PessoaRepository;
import jefferson.dev.demoPaginacao.service.PessoaService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PessoaServiceImpl implements PessoaService {

    final
    PessoaRepository pessoaRepository;

    PessoaServiceImpl(PessoaRepository pessoaRepository){
        this.pessoaRepository = pessoaRepository;
    }

    @Override
    public List<Pessoa> findAll(int pagina, int itens) {
        return pessoaRepository.findAll(PageRequest.of(pagina, itens)).getContent();
    }
}
