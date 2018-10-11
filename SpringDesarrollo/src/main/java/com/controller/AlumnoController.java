package com.controller;

import com.dto.AlumnoDto;
import com.dto.AlumnoDtoValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/alumno")
public class AlumnoController {
    @Autowired
    private AlumnoDtoValidator AlumnoDtoValid;
    @GetMapping("/save")
    public String SaveGET(){
        return "alumno/index";
    }
    @PostMapping("/save")
    public String SavePOST(RedirectAttributes Redirect, ModelMap Model, @ModelAttribute ("Datos")AlumnoDto AlumnoDTO, BindingResult Results) throws IOException {
        AlumnoDtoValid.validate(AlumnoDTO,Results);
        if (Results.hasErrors()) {
        /*   FileCopyUtils.copy(AlumnoDTO.getDesFot().getBytes(), new File("C:/FileSystem/" + AlumnoDTO.getDesFot().getOriginalFilename()));

            Model.addAttribute("Foto",AlumnoDTO.getDesFot().getName());*/
            Model.addAttribute("Results",Results);
            Model.addAttribute("AlumnoDTO",AlumnoDTO);
            String genero = AlumnoDTO.getIdeGen()== 0 ? "Femenino" : "Masculino";
            String NombreCompleto = AlumnoDTO.getDesNom() + "" + AlumnoDTO.getApePad() + " "+ AlumnoDTO.getApeMat();
            Model.addAttribute("NombreCompleto",NombreCompleto);
            return "alumno/index";
        }else{
            Redirect.addAttribute("Succes",true);
            return "redirect:alumno/index";
        }
    }

}
