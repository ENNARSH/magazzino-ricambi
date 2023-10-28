package it.magazzinoricambi.controller;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import it.magazzinoricambi.entities.Fendinebbia;
import it.magazzinoricambi.entities.Modello;
import it.magazzinoricambi.service.FenService;

@Controller
public class FenController {
	
	@Autowired
    FenService fenService;
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
	    List<Fendinebbia> listaFen = fenService.listAll();
	    model.addAttribute("listaFen", listaFen);
	    return "ricambi";
	}
	
	@RequestMapping("/new")
	public String showNewProductPage(Model model) {
	    Fendinebbia fen = new Fendinebbia();
	    model.addAttribute("fen", fen);
	    return "add-fen";
	}
    
    @RequestMapping("/addFen")
    public String saveProduct(@ModelAttribute("fen") Fendinebbia fen) {
    	System.out.println("sono qua");
       fenService.save(fen);
        return "redirect :/";
    }
    
    @RequestMapping("/edit/{id}")									
    public ModelAndView showEditFen(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("edit-fen");
        Fendinebbia fen = fenService.get(id);
        mav.addObject("fen", fen);
        return mav;
    }
    
    @RequestMapping("/delete/{id}")
    public String deleteProduct(@PathVariable(name = "id") int id) {
        fenService.delete(id);
        return "redirect:/";       
    }
    
    @RequestMapping("/search")
    public String findByIdModello(@RequestParam("id_modello") Modello idModello, Model model) {
    	List<Fendinebbia> listaFen = fenService.findByIdModello(idModello);
        model.addAttribute("listaFen", listaFen);
        return "ricambi";
    }
    


}
