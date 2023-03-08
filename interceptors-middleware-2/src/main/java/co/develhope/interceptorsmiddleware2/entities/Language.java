package co.develhope.interceptorsmiddleware2.entities;

import co.develhope.interceptorsmiddleware2.enumerations.LanguageEnumeration;

import javax.persistence.*;
@Table(name = "Language")
@Entity
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "name", nullable = false)
    private LanguageEnumeration name;

    public Language(){}

    public Language(Long id, LanguageEnumeration name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public LanguageEnumeration getName() {
        return name;
    }

    public void setName(LanguageEnumeration name) {
        this.name = name;
    }




}
