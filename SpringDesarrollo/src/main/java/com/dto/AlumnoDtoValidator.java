package com.dto;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

@Component
public class AlumnoDtoValidator {
    public void validate(Object Target, Errors errors){
        AlumnoDto AlumnoDTO = (AlumnoDto)Target;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"desNom","error.desNom",  "Ingrese los nombre(s) del alumno");
        if (AlumnoDTO.getApePad() == null || AlumnoDTO.getApePad().equals("")) {
            errors.rejectValue("apePad", "error.apePad","Ingrese el apellido del Padre");
        }
        if (AlumnoDTO.getApeMat() == null || AlumnoDTO.getApeMat().equals("")) {
            errors.rejectValue("apeMat", "error.apeMat","Ingrese el apellido de la Madre ");
        }
        if (AlumnoDTO.getFchNac() == null || AlumnoDTO.getFchNac().equals("")) {
            errors.rejectValue("fchNac", "error.fchNac","Ingrese la fecha de nacimiento");
        }
        if (AlumnoDTO.getTipIde() == null || AlumnoDTO.getTipIde().equals("")) {
            errors.rejectValue("tipIde","error.tipIde", "Ingrese el tipo de documento");
        }
        if (AlumnoDTO.getDesIde() == null || AlumnoDTO.getDesIde().equals("")) {
            errors.rejectValue("desIde","error.desIde","Ingrese el número de identificación");
        }
        if (AlumnoDTO.getDesEma() == null || AlumnoDTO.getDesEma().equals("")) {
            errors.rejectValue("desEma","error.desEma","Ingrese un correo electrónico");
        }
        if (AlumnoDTO.getIdeGen() == null || AlumnoDTO.getIdeGen().equals("")) {
            errors.rejectValue("ideGen","error.ideGen","Ingrese el género");
        }/*
        if (AlumnoDTO.getIdeNiv() == null || AlumnoDTO.getIdeNiv().equals("")) {
            errors.rejectValue("ideNiv","error.ideNiv","Registre el nivel de estudio");
        }
        if (AlumnoDTO.getCursoDtoList() == null || AlumnoDTO.getCursoDtoList().equals("")) {
            errors.rejectValue("cursoDtoList","error.cursoDtoList","Seleccione un curso");
        }*/
    }

}
