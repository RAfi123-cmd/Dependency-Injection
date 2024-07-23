package com.deviro.colours.services.lmpl;

import com.deviro.colours.services.RedPrinter;
import org.springframework.stereotype.Component;

@Component
public class EnglishRedPrinter implements RedPrinter {

  @Override
  public String print() {
    // TODO Auto-generated method stub
    return "red";
  }
}
