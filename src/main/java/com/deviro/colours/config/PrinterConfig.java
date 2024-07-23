package com.deviro.colours.config;

import com.deviro.colours.services.BluePrinter;
import com.deviro.colours.services.ColourPrinter;
import com.deviro.colours.services.GreenPrinter;
import com.deviro.colours.services.RedPrinter;
import com.deviro.colours.services.lmpl.ColourPrinterlmpl;
import com.deviro.colours.services.lmpl.SpanisBluePrinter;
import com.deviro.colours.services.lmpl.SpanisGreenPrinter;
import com.deviro.colours.services.lmpl.SpanisRedPrinter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrinterConfig {
  @Bean
  public BluePrinter bluePrinter() {
    return new SpanisBluePrinter();
  }

  @Bean
  public RedPrinter redPrinter() {
    return new SpanisRedPrinter();
  }

  @Bean
  public GreenPrinter greenPrinter() {
    return new SpanisGreenPrinter();
  }

  @Bean
  public ColourPrinter colourPrinter(
      BluePrinter bluePrinter, RedPrinter redPrinter, GreenPrinter greenPrinter) {
    return new ColourPrinterlmpl(redPrinter, bluePrinter, greenPrinter);
  }
}
