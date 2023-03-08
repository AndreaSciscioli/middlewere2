package co.develhope.interceptorsmiddleware2.controllers;

import co.develhope.interceptorsmiddleware2.entities.Language;
import co.develhope.interceptorsmiddleware2.repositories.LanguageRepository;
import co.develhope.interceptorsmiddleware2.services.LanguageService;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;


    @RestController
    @RequestMapping("/language")
    public class LanguageController{
        private LanguageService languageService;
        private final LanguageRepository languageRepository;

        public LanguageController(LanguageRepository languageRepository) {
            this.languageRepository = languageRepository;
        }

        @PostMapping("/create")
        public Language createLanguage(@RequestBody Language language) {
            return languageService.createLanguage(language);
        }

        @GetMapping("/get_all")
        public List<Language> getAllLanguage() {
            return languageService.getAllLanguages();
        }

        @GetMapping("/get_one_by_id/{id}")
        public Language getOneById(@PathVariable Long id) {return languageService.getOneById(id);
        }
        @PutMapping("/update/{id}")
        public Language updateLanguage(@PathVariable long id , @RequestBody Language language){
            return languageService.updateLanguage(id, language);
        }

        @DeleteMapping("/delete_by_id/{id}")
        public void deleteLanguageById(@PathVariable long id , HttpServletResponse response){
            languageService.deleteLanguageById(id,response);
        }
        @DeleteMapping("/delete_all")
        public void deleteAllLanguages(){
            languageService.deleteAllLanguages();
        }

    }

