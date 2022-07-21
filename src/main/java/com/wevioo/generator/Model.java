package com.wevioo.generator;

public class Model {
    String nom;
    String capital;
    String adresse;
    String templatePath;
    String outputPath;

    public Model(String nom, String capital, String adresse, String templatePath, String outputPath) {
        this.nom = nom;
        this.capital = capital;
        this.adresse = adresse;
        this.templatePath = templatePath;
        this.outputPath = outputPath;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTemplatePath() {
        return templatePath;
    }

    public void setTemplatePath(String templatePath) {
        this.templatePath = templatePath;
    }

    public String getOutputPath() {
        return outputPath;
    }

    public void setOutputPath(String outputPath) {
        this.outputPath = outputPath;
    }
}
