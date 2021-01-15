package br.com.h2asolutions.page.controller;

import br.com.h2asolutions.page.model.Contato;
import br.com.h2asolutions.page.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class MainController {

    @Autowired
    private FormService formService;

    private static Logger LOGGER = Logger.getLogger(MainController.class.getName());

    @GetMapping("/")
    public String index() {
        return "index";
    }

    /*
     Pensar no caso da página de login. Faz o usuário pensar que deve cadastrar seus dados, não sendo para este fim.
     Pode ser planejado nesta página uma consulta de cpf que já deve existir na base de dados
     Fazendo com que só entre quem já estiver registrado, assim sendo, apenas Admin.
     */
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/sobre")
    public String sobre(Model model) {
        return "sobre";
    }

    @GetMapping("/contato")
    public String contato() {
        return "contato";
    }

    @GetMapping("/admin/home")
    public String admin(Model model) {
        model.addAttribute("contato", formService.listar());
        return "messages";
    }

    @PostMapping("/message")
    public String msg(Contato contato, Model model) {

        model.addAttribute("contato", formService.listar());
        LOGGER.info(contato.toString());
        formService.salvar(contato);

        return "index";
    }
}
