package com.training.service;

public class SpellCheckerImpl implements SpellChecker {
    @Override
    public void performSpellCheck(String text) {
        System.out.println("Performing spell check on text: " + text);
    }
}
