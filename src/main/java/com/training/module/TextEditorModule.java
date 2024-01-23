package com.training.module;

import com.google.inject.AbstractModule;
import com.training.service.DictionaryFinder;
import com.training.service.DictionaryFinderImpl;
import com.training.service.SpellChecker;
import com.training.service.SpellCheckerImpl;
import com.training.service.SynonymFinder;
import com.training.service.SynonymFinderImpl;

public class TextEditorModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(SynonymFinder.class).to(SynonymFinderImpl.class);
        bind(SpellChecker.class).to(SpellCheckerImpl.class);
        bind(DictionaryFinder.class).to(DictionaryFinderImpl.class);
    }
}
