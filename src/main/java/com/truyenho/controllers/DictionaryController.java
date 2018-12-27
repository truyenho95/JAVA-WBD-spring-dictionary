package com.truyenho.controllers;

import com.truyenho.service.DictionaryService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DictionaryController {
  @GetMapping("/")
  public ModelAndView index() {
    return new ModelAndView("index");
  }

  @PostMapping("/dictionary")
  public ModelAndView findWord(@RequestParam String search) {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    DictionaryService service = applicationContext.getBean("dictionaryService", DictionaryService.class);
    String result = service.findWord(search);
    ModelAndView modelAndView;
    if (result != null) {
      modelAndView = new ModelAndView("dictionary");
      modelAndView.addObject("search", search);
      modelAndView.addObject("result", result);
    } else
      modelAndView = new ModelAndView("error-404");
    return modelAndView;
  }

  @GetMapping("/dictionary")
  public ModelAndView redirectDictionary() {
    return new ModelAndView("redirect:/");
  }
}
