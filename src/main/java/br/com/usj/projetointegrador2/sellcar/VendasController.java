package br.com.usj.projetointegrador2.sellcar;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class VendasController {

    @Autowired
    VendasRepository vendasRepository;

    @GetMapping(value = "/index-vendas")
    ModelAndView getListarVendas() {
        List<Vendas> listaVendas = vendasRepository.findAll();
        ModelAndView modelAndView = new ModelAndView("index-vendas");
        modelAndView.addObject("listaVendas", listaVendas);
        return modelAndView;
    }

    @GetMapping(value = "/mostrar-vendas/{id}")
    ModelAndView getMostrarVendas(@PathVariable Long id) {
        Vendas vendas = vendasRepository.findById(id).get();
        ModelAndView modelAndView = new ModelAndView("mostrar-vendas");
        modelAndView.addObject("vendas", vendas);
        return modelAndView;
    }

    @GetMapping(value = "/cadastrar-vendas")
    ModelAndView getCadastrarVendas() {
        Vendas vendas = new Vendas();
        ModelAndView modelAndView = new ModelAndView("cadastrar-vendas");
        modelAndView.addObject("vendas", vendas);
        return modelAndView;
    }

    @PostMapping(value = "/cadastrar-vendas")
    ModelAndView postCadastrarVendas(Vendas vendas) {
        Vendas cadastrarVendas = vendasRepository.save(vendas);
        ModelAndView modelAndView = new ModelAndView("mostrar-vendas");
        modelAndView.addObject("vendas", cadastrarVendas);
        return modelAndView;
    }

    @GetMapping(value = "/deletar-vendas/{id}")
    String getDeletarVendas(@PathVariable Long id) {
        vendasRepository.deleteById(id);
        return "redirect:/index-vendas";

        // List<Produto> lista = produtoRepository.findAll();
        // ModelAndView modelAndView = new ModelAndView("index");
        // modelAndView.addObject("lista", lista);
        // return modelAndView;
    }

    @GetMapping(value = "/editar-vendas/{id}")
    ModelAndView getEditarVendas(@PathVariable Long id) {
        Vendas vendas = vendasRepository.findById(id).get();
        ModelAndView modelAndView = new ModelAndView("cadastrar-vendas");
        modelAndView.addObject("vendas", vendas);
        return modelAndView;
    }

}