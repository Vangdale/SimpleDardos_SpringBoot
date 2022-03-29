package dardos.dardos.controller;


import dardos.dardos.model.Player;
import dardos.dardos.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class PlayerController {

    @Autowired
    private PlayerService Service;

    @GetMapping("/")
    public ModelAndView welcome(){

        return new ModelAndView("index").addObject("Player", new Player());
    }

    @PostMapping("/PlayerList")
    public ModelAndView PostForm (Player player){
        Service.PlayerList.add(player);
        ModelAndView modelAndView = new ModelAndView("PlayerList");

        modelAndView.addObject("ListaJugadores", Service.PlayerList);
        return modelAndView;
    }

    @PostMapping("/Round")
    public ModelAndView Throwing (Player player){

        ModelAndView modelAndView = new ModelAndView("PlayerList");
        modelAndView.addObject("ListaJugadores", Service.Tirada());
        modelAndView.addObject("Round", Service.Ronda);

        return modelAndView;

    }
}
