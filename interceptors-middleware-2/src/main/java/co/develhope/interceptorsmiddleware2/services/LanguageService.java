package co.develhope.interceptorsmiddleware2.services;

import co.develhope.interceptorsmiddleware2.entities.Language;
import co.develhope.interceptorsmiddleware2.enumerations.LanguageEnumeration;
import co.develhope.interceptorsmiddleware2.repositories.LanguageRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.List;

@Service
public class LanguageService {
    private LanguageRepository languageRepository;
    public List<Language> getAllLanguages(){
        return languageRepository.findAll();
    }
    public String getWelcome(Language language) {
        for (Language languages : languageRepository.findAll()) {
            if (languages.getName() == language.getName()) {
                return languages.getName().message;
            }
        }
        if (languageRepository.findAll().contains(language) == false){
            return "good morning";
        }
        return null;
    }




    public Language createLanguage( Language language) {
        return languageRepository.save(language);
    }

    public List<Language> getAllLanguage() {
        return languageRepository.findAll();
    }

    public Language getOneById( Long id) {
        return languageRepository.existsById(id) ? languageRepository.getById(id) : new Language();
    }

    public Language updateLanguage( long id ,  Language language){
        language.setId(id);
        return languageRepository.saveAndFlush(language);
    }

    public void deleteLanguageById( long id , HttpServletResponse response){
        if(languageRepository.existsById(id)){
            languageRepository.deleteById(id);
        }
        else
            response.setStatus(404);
    }

    public void deleteAllLanguages(){
        languageRepository.deleteAll();
    }
}
