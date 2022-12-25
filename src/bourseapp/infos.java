/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bourseapp;

import static Tools.Tools.Message;
import javax.swing.JTable;

/**
 *
 * @author Abdelatif Hamdi
 */
public class infos implements MainDataIN{
private int numéro;
private String bénéficiaire ;
private String nomPreAr;
private String nomPreFr;
private String dateNaissance;
private String sexe;
private String grade;
private String durée;
private String dateDepart;
private String dateArrivé;
private String paysAcc;
private String EtabAcc;
private String domaine;
private String typeStage;
private double allocation;
private double billet;
private int annéeFinac;
private String faculté;



    @Override
    public void add() {
String insert ="insert into infos values("
                +numéro+",'"+bénéficiaire+"','"+nomPreAr+"','"+nomPreFr+"','"
        +dateNaissance+"','"+sexe+"','"+grade+"','"+durée+"','"+dateDepart+"','"+dateArrivé+"','"+paysAcc+"','"+EtabAcc+"','"+domaine+"','"+typeStage+"',"+allocation
        +","+billet+","+annéeFinac+",'"+faculté+"')";
        boolean isAdd = db.go.RunNonQuery(insert);
        if(isAdd){
        Message("Le bénéficiaire est ajouté");    }}

    @Override
    public void update() {
String update = "update infos set benf='"+bénéficiaire+"',nomPreAr='"+nomPreAr+"', nomPreFr='"+nomPreFr+"',dateN='"+dateNaissance+"',sexe='"+sexe+"',grade='"+grade+"',durée='"+durée+"',dateD='"+dateDepart+"',dateF='"+dateArrivé+"',"
        + "paysAcc='"+paysAcc+"',etabAcc='"+EtabAcc+"',domaine='"+domaine+"',typeStage='"+typeStage+"',allocation="+allocation+" ,billet="+billet+" , annFinac="+annéeFinac
        +" , faculté='"+faculté+"' where numB="+numéro;
        boolean isUpdate=db.go.RunNonQuery(update);
        if(isUpdate){Message("Le bénéficiaire est mis à jour");}    }

    @Override
    public void delete() {
        String delete="delete from infos where numB="+numéro;
        boolean isdelete=db.go.RunNonQuery(delete);
        if(isdelete){Message("Le bénéficiaire est supprimé");}
    }

    @Override
    public String getAutoNumber() {
String auto = db.go.getAutoNumber("infos", "numB");
        return auto;     }

    @Override
    public void getAllRows(JTable table) {
db.go.fillToJTableWithTableName("infos", table);    }

    @Override
    public void getOneRow(JTable table) {
String select="select * from infos where numB="+numéro;
       db.go.fillToJTableWithStatement(select, table);    }

    @Override
    public void getCustomRows(String Statement, JTable table) {
db.go.fillToJTableWithStatement(Statement, table);    }

    @Override
    public String getValueByName(String Name) {

      return "Erreur";    }

    @Override
    public String getNameByValue(String Value) {
return "Erreur";    }

    public int getNuméro() {
        return numéro;
    }

    public void setNuméro(int numéro) {
        this.numéro = numéro;
    }

    public String getBénéficiaire() {
        return bénéficiaire;
    }

    public void setBénéficiaire(String bénéficiaire) {
        this.bénéficiaire = bénéficiaire;
    }

    public String getNomPreAr() {
        return nomPreAr;
    }

    public void setNomPreAr(String nomPreAr) {
        this.nomPreAr = nomPreAr;
    }

    public String getNomPreFr() {
        return nomPreFr;
    }

    public void setNomPreFr(String nomPreFr) {
        this.nomPreFr = nomPreFr;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getDurée() {
        return durée;
    }

    public void setDurée(String durée) {
        this.durée = durée;
    }

    public String getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(String dateDepart) {
        this.dateDepart = dateDepart;
    }

    public String getDateArrivé() {
        return dateArrivé;
    }

    public void setDateArrivé(String dateArrivé) {
        this.dateArrivé = dateArrivé;
    }

    public String getPaysAcc() {
        return paysAcc;
    }

    public void setPaysAcc(String paysAcc) {
        this.paysAcc = paysAcc;
    }

    public String getEtabAcc() {
        return EtabAcc;
    }

    public void setEtabAcc(String EtabAcc) {
        this.EtabAcc = EtabAcc;
    }

    public String getDomaine() {
        return domaine;
    }

    public void setDomaine(String domaine) {
        this.domaine = domaine;
    }

    public String getTypeStage() {
        return typeStage;
    }

    public void setTypeStage(String typeStage) {
        this.typeStage = typeStage;
    }

    public double getAllocation() {
        return allocation;
    }

    public void setAllocation(double allocation) {
        this.allocation = allocation;
    }

    public double getBillet() {
        return billet;
    }

    public void setBillet(double billet) {
        this.billet = billet;
    }

    public int getAnnéeFinac() {
        return annéeFinac;
    }

    public void setAnnéeFinac(int annéeFinac) {
        this.annéeFinac = annéeFinac;
    }

    public String getFaculté() {
        return faculté;
    }

    public void setFaculté(String faculté) {
        this.faculté = faculté;
    }
    
    
}
