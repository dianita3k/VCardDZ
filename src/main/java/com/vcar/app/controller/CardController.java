package com.vcar.app.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vcar.app.models.domain.VCards;

@Controller
@RequestMapping("/card")
public class CardController {
    @Autowired
    private VCards card;

    @GetMapping("/ver")
    public String index(Model model){
        model.addAttribute("card", card);
        model.addAttribute("titulo", "Card V");
        return "ver";
    }
}
