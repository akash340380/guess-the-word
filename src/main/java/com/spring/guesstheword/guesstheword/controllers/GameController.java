package com.spring.guesstheword.guesstheword.controllers;

import com.spring.guesstheword.guesstheword.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GameController
{
    @Autowired
    GameService gameService;

    @GetMapping("/game-home")
    public String showHomePage(@RequestParam(value = "gussedChar", required = false) String gussedChar, Model model)
    {
        System.out.println("Captured guessed word is : "+gussedChar);
        String randomWord = gameService.toString();
        model.addAttribute("wordToDisplay",randomWord);

        return "game-home-page";
    }

}
