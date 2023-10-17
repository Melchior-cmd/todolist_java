package br.com.lucasmelchior.todolist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/primeiraRota")
public class MinhaPrimeiraController {

  @GetMapping("/primeiroMetodo")
  public String primeiraMensagem() {
    return "FUNCIONOU CARALHO";
  }
}
