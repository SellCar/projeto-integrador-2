package br.com.usj.projetointegrador2.sellcar;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FuncionarioController {

    @Autowired
    FuncionarioRepository funcionarioRepository;

    @GetMapping(value = "/index-funcionario")
    ModelAndView getListarFuncionario() {
        List<Funcionario> listaFuncionario = funcionarioRepository.findAll();
        ModelAndView modelAndView = new ModelAndView("index-funcionario");
        modelAndView.addObject("listaFuncionario", listaFuncionario);
        return modelAndView;
    }

    @GetMapping(value = "/mostrar-funcionario/{id}")
    ModelAndView getMostrarFuncionario(@PathVariable Long id) {
        Funcionario funcionario = funcionarioRepository.findById(id).get();
        ModelAndView modelAndView = new ModelAndView("mostrar-funcionario");
        modelAndView.addObject("funcionario", funcionario);
        return modelAndView;
    }

    @GetMapping(value = "/cadastrar-funcionario")
    ModelAndView getCadastrarFuncionario() {
        Funcionario funcionario = new Funcionario();
        ModelAndView modelAndView = new ModelAndView("cadastrar-funcionario");
        modelAndView.addObject("funcionario", funcionario);
        return modelAndView;
    }

    @PostMapping(value = "/cadastrar-funcionario")
    ModelAndView postCadastrarFuncionario(Funcionario funcionario) {
        Funcionario cadastrarFuncionario = funcionarioRepository.save(funcionario);
        ModelAndView modelAndView = new ModelAndView("mostrar-funcionario");
        modelAndView.addObject("funcionario", cadastrarFuncionario);
        return modelAndView;
    }

    @GetMapping(value = "/deletar-funcionario/{id}")
    String getDeletarFuncionario(@PathVariable Long id) {
        funcionarioRepository.deleteById(id);
        return "redirect:/index-funcionario";

        // List<Produto> lista = produtoRepository.findAll();
        // ModelAndView modelAndView = new ModelAndView("index");
        // modelAndView.addObject("lista", lista);
        // return modelAndView;
    }

    @GetMapping(value = "/editar-funcionario/{id}")
    ModelAndView getEditarFuncionario(@PathVariable Long id) {
        Funcionario funcionario = funcionarioRepository.findById(id).get();
        ModelAndView modelAndView = new ModelAndView("cadastrar-funcionario");
        modelAndView.addObject("funcionario", funcionario);
        return modelAndView;
    }

}