package com.deviro.colours.services.lmpl;

import com.deviro.colours.services.GreenPrinter;
import org.springframework.stereotype.Service;

// @Component
@Service
public class SpanisGreenPrinter implements GreenPrinter {

  @Override
  public String print() {
    // TODO Auto-generated method stub
    return "verde";
  }
}
