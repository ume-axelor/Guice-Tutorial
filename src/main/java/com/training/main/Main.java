package com.training.main;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.training.module.TextEditorModule;
import com.training.request.SpellCheckRequest;

public class Main {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new TextEditorModule());
        SpellCheckRequest spellCheckRequest = injector.getInstance(SpellCheckRequest.class);
        spellCheckRequest.requestSpellCheck("Hello");
    }
}

