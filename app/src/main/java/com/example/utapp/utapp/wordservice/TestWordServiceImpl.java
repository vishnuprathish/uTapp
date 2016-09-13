package com.example.utapp.utapp.wordservice;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by smrithisukesh on 16-09-09.
 */
public class TestWordServiceImpl implements WordService {

    private static int curPosition = 0;

    private static List<TabooWord> wordsCache = new ArrayList<>();


    @Override
    public TabooWord getNext() {
        TabooWord tabooWord = new TabooWord();
        tabooWord.setWordName("Vishnu" + curPosition);
        curPosition++;
        List<String> tabooWords = new ArrayList<>();
        tabooWords.add("word1");
        tabooWords.add("word2");
        tabooWords.add("word3");
        tabooWord.setTabooWords(tabooWords);
        return tabooWord;
    }

    @Override
    public TabooWord getPrevious() {
        TabooWord tabooWord = new TabooWord();
        tabooWord.setWordName("Shinzy" + curPosition);
        curPosition--;
        List<String> tabooWords = new ArrayList<>();
        tabooWords.add("word4");
        tabooWords.add("word5");
        tabooWords.add("word6");
        tabooWord.setTabooWords(tabooWords);
        return tabooWord;
    }
}
