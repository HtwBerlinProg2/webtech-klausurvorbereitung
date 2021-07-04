package de.chucknorris.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class QuotesWebController {

  @RequestMapping(path = "/")
  public ModelAndView showIndexPage() {
    return new ModelAndView("index");
  }
}
