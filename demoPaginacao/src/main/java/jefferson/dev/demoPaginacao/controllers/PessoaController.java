package jefferson.dev.demoPaginacao.controllers;

import jefferson.dev.demoPaginacao.entity.Pessoa;
import jefferson.dev.demoPaginacao.service.PessoaService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/pessoa")
@RestController
public class PessoaController {

    final
    PessoaService pessoaService;

    PessoaController(PessoaService pessoaService){
        this.pessoaService = pessoaService;
    }

    @GetMapping("/paginacao")
    public ResponseEntity<?> findAll(@RequestParam("pagina") int pagina, @RequestParam("itens") int itens){
        return ResponseEntity.status(HttpStatus.OK).body(pessoaService.findAll(pagina, itens));
    }


}
