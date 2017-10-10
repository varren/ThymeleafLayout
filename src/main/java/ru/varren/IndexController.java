package ru.varren;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController {
    @RequestMapping("/")
    public ModelAndView get() throws IOException {
        ModelAndView model = new ModelAndView("index");
        model.addObject("indexTitle", "Title From Index Controller");
        return model;

    }
}
