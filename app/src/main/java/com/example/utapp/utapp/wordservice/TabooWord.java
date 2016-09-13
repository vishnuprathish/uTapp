package com.example.utapp.utapp.wordservice;

import java.util.List;

/**
 * Created by smrithisukesh on 16-09-09.
 */
public class TabooWord {
    private int wordId;

    private String wordName;

    private List<String> tabooWords;

    public int getWordId() {
        return wordId;
    }

    public void setWordId(int wordId) {
        this.wordId = wordId;
    }

    public String getWordName() {
        return wordName;
    }

    public void setWordName(String wordName) {
        this.wordName = wordName;
    }

    public List<String> getTabooWords() {
        return tabooWords;
    }

    public void setTabooWords(List<String> tabooWords) {
        this.tabooWords = tabooWords;
    }
}
