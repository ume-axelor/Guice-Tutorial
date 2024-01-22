package com.training.request;

import com.google.inject.Inject;
import com.training.service.SpellChecker;
import com.training.service.SynonymFinder;

public class SpellCheckRequest {
    private final SpellChecker spellChecker;
    private final SynonymFinder synonymFinder;

    @Inject
    public SpellCheckRequest(SpellChecker spellChecker, SynonymFinder synonymFinder) {
        this.spellChecker = spellChecker;
        this.synonymFinder = synonymFinder;
    }

    public void requestSpellCheck(String text) {
        spellChecker.performSpellCheck(text);
        synonymFinder.findSynonyms(text);
    }
}
