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


    @GetMapping("/contato")
    public String main(Model model) {
        model.addAttribute("contato", formService.listar());

        return "form";
    }

    @PostMapping("/send-form")
    public String msg(Contato contato, Model model) {
        formService.salvar(contato);
        model.addAttribute("contato", formService.listar());
        LOGGER.log(Level.WARNING, contato.toString());
        return "index";
    }

}
