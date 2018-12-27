package com.truyenho.repository;

import com.truyenho.model.Word;

import java.util.List;

public interface DictionaryRepository {
  List<Word> findAll();
}
