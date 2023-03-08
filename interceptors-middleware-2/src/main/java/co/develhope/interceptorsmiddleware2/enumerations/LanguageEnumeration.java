package co.develhope.interceptorsmiddleware2.enumerations;

public enum LanguageEnumeration {
    ITALIAN("buongiorno"),
    FRENCH("bonjour"),
    PORTUGUESE("bon dia"),
    ENGLISH("good morning"),
    SPANISH("buen dia");

    public final String message;
    LanguageEnumeration(String message) {
        this.message = message;
    }
}
