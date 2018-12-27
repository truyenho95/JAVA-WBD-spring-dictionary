package com.truyenho.model;

public class Word {
  private String eng;
  private String vi;

  public Word() {
  }

  public Word(String eng, String vi) {
    this.eng = eng;
    this.vi = vi;
  }

  public String getEng() {
    return eng;
  }

  public void setEng(String eng) {
    this.eng = eng;
  }

  public String getVi() {
    return vi;
  }

  public void setVi(String vi) {
    this.vi = vi;
  }
}
