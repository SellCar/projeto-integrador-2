package br.com.usj.projetointegrador2.sellcar;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class VeiculoController {

    @Autowired
    VeiculoRepository veiculoRepository;

    @GetMapping(value = "/index-veiculo")
    ModelAndView getListarVeiculo() {
        List<Veiculo> listaVeiculo = veiculoRepository.findAll();
        ModelAndView modelAndView = new ModelAndView("index-veiculo");
        modelAndView.addObject("listaVeiculo", listaVeiculo);
        return modelAndView;
    }

    @GetMapping(value = "/mostrar-veiculo/{id}")
    ModelAndView getMostrarVeiculo(@PathVariable Long id) {
        Veiculo veiculo = veiculoRepository.findById(id).get();
        ModelAndView modelAndView = new ModelAndView("mostrar-veiculo");
        modelAndView.addObject("veiculo", veiculo);
        return modelAndView;
    }

    @GetMapping(value = "/cadastrar-veiculo")
    ModelAndView getCadastrarVeiculo() {
        Veiculo veiculo = new Veiculo();
        ModelAndView modelAndView = new ModelAndView("cadastrar-veiculo");
        modelAndView.addObject("veiculo", veiculo);
        return modelAndView;
    }

    @PostMapping(value = "/cadastrar-veiculo")
    ModelAndView postCadastrarVeiculo(Veiculo veiculo) {
        Veiculo cadastrarVeiculo = veiculoRepository.save(veiculo);
        ModelAndView modelAndView = new ModelAndView("mostrar-veiculo");
        modelAndView.addObject("veiculo", cadastrarVeiculo);
        return modelAndView;
    }

    @GetMapping(value = "/deletar-veiculo/{id}")
    String getDeletarVeiculo(@PathVariable Long id) {
        veiculoRepository.deleteById(id);
        return "redirect:/index-veiculo";

        // List<Produto> lista = produtoRepository.findAll();
        // ModelAndView modelAndView = new ModelAndView("index");
        // modelAndView.addObject("lista", lista);
        // return modelAndView;
    }

    @GetMapping(value = "/editar-veiculo/{id}")
    ModelAndView getEditarveiculo(@PathVariable Long id) {
        Veiculo veiculo = veiculoRepository.findById(id).get();
        ModelAndView modelAndView = new ModelAndView("cadastrar-veiculo");
        modelAndView.addObject("veiculo", veiculo);
        return modelAndView;
    }

}