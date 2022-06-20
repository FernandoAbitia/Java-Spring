
package com.kuroda.mx.springdata.controller;

import com.kuroda.mx.springdata.domain.Persona;
import com.kuroda.mx.springdata.service.PersonaServiceImpl;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ClientController {
    
    @Autowired
    private PersonaServiceImpl personaService;
    
    @GetMapping("/list")
    public String list(Model model){
        List<Persona> personas = personaService.listPersonas();
        model.addAttribute("personas", personas);
        return "list";
    }
    
    @GetMapping("/insert")
    public String insert(Persona persona) {//SE DEFINE UN OBJETO NUEVO EN MEMORIA QUE SE COMPARTE EN EL ALCANCE DEL REQUEST
    	return "update";
    }
    
    @PostMapping("/save")
    public String save(@Valid Persona persona, Errors errors) {//SE RECUPERA UN OBJETO DE LA FÁBRICA SPRING (YA EN MEMORIA)
    	if (errors.hasErrors())
    		return "update";
    	personaService.save(persona);
    	return "redirect:/list";
    }
    
    @GetMapping("/update/{id_persona}")
    public String update(Persona persona, Model model) {
    	persona = personaService.searchPersonaById(persona.getId_persona());
    	model.addAttribute("persona",persona);
    	return "update";
    }
    
    @GetMapping("/delete/{id_persona}")
    public String delete(Persona persona, Model model) {
    	personaService.deletePersonaById(persona.getId_persona());
    	return "redirect:/list";
    }

}
