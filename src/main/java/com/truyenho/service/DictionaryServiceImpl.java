package com.truyenho.service;

import com.truyenho.model.Word;
import com.truyenho.repository.DictionaryRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DictionaryServiceImpl implements DictionaryService {

  private DictionaryRepository dictionaryRepository;

  public void setDictionaryRepository(DictionaryRepository dictionaryRepository) {
    this.dictionaryRepository = dictionaryRepository;
  }

  @Override
  public String findWord(String wordWhatNeedToFindViMeaning) {
    for (Word w: dictionaryRepository.findAll()) {
      if (wordWhatNeedToFindViMeaning.equals(w.getEng())) return w.getVi();
    }
    return null;
  }
}
