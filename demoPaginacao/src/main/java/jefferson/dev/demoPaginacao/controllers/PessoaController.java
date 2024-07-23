package jefferson.dev.demoPaginacao.controllers;

import jefferson.dev.demoPaginacao.service.PessoaService;
import jefferson.dev.demoPaginacao.service.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
        return ResponseEntity.status(HttpStatus.OK).body(usuarioService.findAllUsuarioDTO());
    }

    @GetMapping("/paginacao/usuario/projections")
    public ResponseEntity<?> buscarNomesUsuariosProjections() {
        return ResponseEntity.status(HttpStatus.OK).body(usuarioService.buscarNomesUsuariosProjections());
    }

    @GetMapping("/paginacao/usuario/ignoreCase/{name}")
    public ResponseEntity<?> findByNomeIgnoreCase(@PathVariable String name) {
        return ResponseEntity.status(HttpStatus.OK).body(usuarioService.findByNomeIgnoreCase(name));
    }

    @GetMapping("/paginacao/usuario/top2")
    public ResponseEntity<?> findTop2By() {
        return ResponseEntity.status(HttpStatus.OK).body(usuarioService.findTop2By());
    }

    @GetMapping("/paginacao/usuario/contains/{name}")
    public ResponseEntity<?> findByNomeContains(@PathVariable String name) {
        return ResponseEntity.status(HttpStatus.OK).body(usuarioService.findByNomeContains(name));
    }

    @GetMapping("/paginacao/usuario/containsIgnoreCase/{name}")
    public ResponseEntity<?> findByNomeContainsIgnoreCase(@PathVariable String name) {
        return ResponseEntity.status(HttpStatus.OK).body(usuarioService.findByNomeContainsIgnoreCase(name));
    }







}
