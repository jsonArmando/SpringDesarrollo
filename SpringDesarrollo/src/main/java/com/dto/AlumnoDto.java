package com.dto;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotEmpty;
import java.util.Date;
import java.util.List;

public class AlumnoDto {
    private Integer ideAlu;
    private String apePad;
    private String apeMat;
    private String desNom;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fchNac;
    private Integer tipIde;
    private Integer desIde;
    private String desEma;
    private Integer ideGen;
    private Integer ideNiv;
    private List<CursoDto> cursoDtoList;
    @NotEmpty(message = "Cargar una Foto")
    private MultipartFile desFot;

    public MultipartFile getDesFot() {
        return desFot;
    }

    public void setDesFot(MultipartFile desFot) {
        this.desFot = desFot;
    }

    public Integer getTipIde() {
        return tipIde;
    }

    public void setTipIde(Integer tipIde) {
        this.tipIde = tipIde;
    }

    public Integer getDesIde() {
        return desIde;
    }

    public void setDesIde(Integer desIde) {
        this.desIde = desIde;
    }

    public Integer getIdeNiv() {
        return ideNiv;
    }

    public void setIdeNiv(Integer ideNiv) {
        this.ideNiv = ideNiv;
    }

    public List<CursoDto> getCursoDtoList() {
        return cursoDtoList;
    }

    public void setCursoDtoList(List<CursoDto> cursoDtoList) {
        this.cursoDtoList = cursoDtoList;
    }

    public Integer getIdeAlu() {
        return ideAlu;
    }

    public void setIdeAlu(Integer ideAlu) {
        this.ideAlu = ideAlu;
    }

    public String getApePad() {
        return apePad;
    }

    public void setApePad(String apePad) {
        this.apePad = apePad;
    }

    public String getApeMat() {
        return apeMat;
    }

    public void setApeMat(String apeMat) {
        this.apeMat = apeMat;
    }

    public String getDesNom() {
        return desNom;
    }

    public void setDesNom(String desNom) {
        this.desNom = desNom;
    }

    public Date getFchNac() {
        return fchNac;
    }

    public void setFchNac(Date fchNac) {
        this.fchNac = fchNac;
    }

    public String getDesEma() {
        return desEma;
    }

    public void setDesEma(String desEma) {
        this.desEma = desEma;
    }

    public Integer getIdeGen() {
        return ideGen;
    }

    public void setIdeGen(Integer ideGen) {
        this.ideGen = ideGen;
    }
}
