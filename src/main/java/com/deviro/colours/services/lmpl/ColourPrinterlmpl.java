package com.deviro.colours.services.lmpl;

import com.deviro.colours.services.BluePrinter;
import com.deviro.colours.services.ColourPrinter;
import com.deviro.colours.services.GreenPrinter;
import com.deviro.colours.services.RedPrinter;
import org.springframework.stereotype.Component;

@Component
public class ColourPrinterlmpl implements ColourPrinter {

  private RedPrinter redPrinter;
  private BluePrinter bluePrinter;
  private GreenPrinter greenPrinter;

  // public ColourPrinterlmpl() {
  // this.redPrinter = new EnglishRedPrinter();
  // this.bluePrinter = new EnglishBluePrinter();
  // this.greenPrinter = new EnglishGreenPrinter();
  // }

  public ColourPrinterlmpl(
      RedPrinter redPrinter, BluePrinter bluePrinter, GreenPrinter greenPrinter) {
    this.redPrinter = redPrinter;
    this.bluePrinter = bluePrinter;
    this.greenPrinter = greenPrinter;
  }

  @Override
  public String print() {
    return String.join(" , ", redPrinter.print(), bluePrinter.print(), greenPrinter.print());
  }
}
