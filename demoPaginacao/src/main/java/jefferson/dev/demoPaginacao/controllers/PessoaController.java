package jefferson.dev.demoPaginacao.controllers;

import jefferson.dev.demoPaginacao.service.PessoaService;
import jefferson.dev.demoPaginacao.service.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/pessoa")
@RestController
public class PessoaController {

    final
    PessoaService pessoaService;

    final UsuarioService usuarioService;

    PessoaController(PessoaService pessoaService, UsuarioService usuarioService) {
        this.pessoaService = pessoaService;
        this.usuarioService = usuarioService;
    }


    @GetMapping("/paginacao")
    public ResponseEntity<?> findAll(@RequestParam("pagina") int pagina, @RequestParam("itens") int itens) {
        return ResponseEntity.status(HttpStatus.OK).body(pessoaService.findAll(pagina, itens));
    }

    @GetMapping("/paginacao/usuario")
    public ResponseEntity<?> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(usuarioService.findAllUsurioDTO());
    }


}
