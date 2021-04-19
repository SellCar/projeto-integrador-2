package br.com.usj.projetointegrador2.sellcar;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class MenuPrincipalController {
    @GetMapping("/menu-principal")
    public ModelAndView getMenu() {
        ModelAndView mv = new ModelAndView("menu-principal");
        return mv;
    }

    @GetMapping("/index")
    public ModelAndView getIndex() {
        ModelAndView mvindex = new ModelAndView("index");
        return mvindex;
    }
}