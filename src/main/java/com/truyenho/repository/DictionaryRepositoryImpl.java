package com.truyenho.repository;

import com.truyenho.model.Word;

import java.util.ArrayList;
import java.util.List;

public class DictionaryRepositoryImpl implements DictionaryRepository {
  @Override
  public List<Word> findAll() {
    List<Word> words = new ArrayList<>();

    Word word1 = new Word("hello", "Xin chào");
    words.add(word1);
    Word word2 = new Word("how", "Thế nào");
    words.add(word2);
    Word word3 = new Word("book", "Quyển sách");
    words.add(word3);
    Word word4 = new Word("computer", "Máy tính");
    words.add(word4);

    return words;
  }
}
