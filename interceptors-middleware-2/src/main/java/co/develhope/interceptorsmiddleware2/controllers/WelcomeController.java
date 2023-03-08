package co.develhope.interceptorsmiddleware2.controllers;

import co.develhope.interceptorsmiddleware2.entities.Language;
import co.develhope.interceptorsmiddleware2.services.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/get_all_languages")
@RestController
public class WelcomeController {
    @Autowired
    LanguageService languageService;

    @GetMapping("")
    public List<Language> listOfLanguages(){
        return languageService.getAllLanguages();
    }

    @PostMapping("/get_message")
    public String createMessage( @RequestBody String name, @RequestBody Language language){
                return languageService.getWelcome(language) + name;
    }
}


