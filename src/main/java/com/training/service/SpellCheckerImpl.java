package com.training.service;

import com.google.inject.Inject;

public class SpellCheckerImpl implements SpellChecker {

    private final DictionaryFinder dictionaryFinder;

    @Inject
    public SpellCheckerImpl(DictionaryFinder dictionaryFinder) {
        this.dictionaryFinder = dictionaryFinder;
    }

    @Override
    public void performSpellCheck(String text) {
        System.out.println("Performing spell check on text: " + text);

        dictionaryFinder.performDictionaryCheck(text);
    }
}
