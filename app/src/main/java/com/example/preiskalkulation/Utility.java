package com.example.preiskalkulation;

import android.view.View;
import android.widget.EditText;

public class Utility {
    private boolean vorwaerts;
    private boolean rueckwaerts;
    private boolean differenz;
    private double materialeinzelkosten;
    private double materialgemeinkosten;
    private double ergebnisMGK;
    private double materialkosten;
    private double fertigungseinzelkosten;
    private double fertigungsgemeinkosten;
    private double ergebnisFGK;
    private double sonderEkdFert;
    private double fertigungskosten;
    private double herstellkosten;
    private double verwaltungsgemeinkosten;
    private double vertriebsgemeinkosten;
    private double ergebnisvertGK;
    private double ergebnisVerwGK;
    private double sondereinzelkosten_des_Vertriebs;
    private double selbstkosten;
    private double gewinn;
    private double ergebnisGewinn;
    private double barverkaufspreis;
    private double kundenskonto;
    private double ergebnisKs;
    private double zielverkaufspreis;
    private double kundenrabatt;
    private double ergebnisKr;
    private double nettoverkaufspreis;
    private double umsatzsteuer;
    private double ergebnisUmst;
    private double bruttoverkaufspreis;


    //setter und getter


    public double getErgebnisMGK() {
        return ergebnisMGK;
    }

    public void setErgebnisMGK(double ergebnisMGK) {
        this.ergebnisMGK = ergebnisMGK;
    }

    public double getErgebnisFGK() {
        return ergebnisFGK;
    }

    public void setErgebnisFGK(double ergebnisFGK) {
        this.ergebnisFGK = ergebnisFGK;
    }

    public double getSonderEkdFert() {
        return sonderEkdFert;
    }

    public void setSonderEkdFert(double sonderEkdFert) {
        this.sonderEkdFert = sonderEkdFert;
    }

    public double getVertriebsgemeinkosten() {
        return vertriebsgemeinkosten;
    }

    public void setVertriebsgemeinkosten(double vertriebsgemeinkosten) {
        this.vertriebsgemeinkosten = vertriebsgemeinkosten;
    }

    public double getErgebnisvertGK() {
        return ergebnisvertGK;
    }

    public void setErgebnisvertGK(double ergebnisvertGK) {
        this.ergebnisvertGK = ergebnisvertGK;
    }

    public double getErgebnisVerwGK() {
        return ergebnisVerwGK;
    }

    public void setErgebnisVerwGK(double ergebnisVerwGK) {
        this.ergebnisVerwGK = ergebnisVerwGK;
    }

    public double getErgebnisGewinn() {
        return ergebnisGewinn;
    }

    public void setErgebnisGewinn(double ergebnisGewinn) {
        this.ergebnisGewinn = ergebnisGewinn;
    }

    public double getErgebnisKs() {
        return ergebnisKs;
    }

    public void setErgebnisKs(double ergebnisKs) {
        this.ergebnisKs = ergebnisKs;
    }

    public double getErgebnisKr() {
        return ergebnisKr;
    }

    public void setErgebnisKr(double ergebnisKr) {
        this.ergebnisKr = ergebnisKr;
    }

    public double getErgebnisUmst() {
        return ergebnisUmst;
    }

    public void setErgebnisUmst(double ergebnisUmst) {
        this.ergebnisUmst = ergebnisUmst;
    }

    public double getVerwaltungsgemeinkosten() {
        return verwaltungsgemeinkosten;
    }

    public void setVerwaltungsgemeinkosten(double verwaltungsgemeinkosten) {
        this.verwaltungsgemeinkosten = verwaltungsgemeinkosten;
    }

    public double getSondereinzelkosten_des_Vertriebs() {
        return sondereinzelkosten_des_Vertriebs;
    }

    public void setSondereinzelkosten_des_Vertriebs(double sondereinzelkosten_des_Vertriebs) {
        this.sondereinzelkosten_des_Vertriebs = sondereinzelkosten_des_Vertriebs;
    }

    public double getSelbstkosten() {
        return selbstkosten;
    }

    public void setSelbstkosten(double selbstkosten) {
        this.selbstkosten = selbstkosten;
    }

    public double getGewinn() {
        return gewinn;
    }

    public void setGewinn(double gewinn) {
        this.gewinn = gewinn;
    }

    public double getBarverkaufspreis() {
        return barverkaufspreis;
    }

    public void setBarverkaufspreis(double barverkaufspreis) {
        this.barverkaufspreis = barverkaufspreis;
    }

    public double getSonderEkdVert() {
        return sonderEkdFert;
    }

    public void setSonderEkdVert(double sonderEkdVert) {
        this.sonderEkdFert = sonderEkdVert;
    }

    public double getKundenskonto() {
        return kundenskonto;
    }

    public void setKundenskonto(double kundenskonto) {
        this.kundenskonto = kundenskonto;
    }

    public double getZielverkaufspreis() {
        return zielverkaufspreis;
    }

    public void setZielverkaufspreis(double zielverkaufspreis) {
        this.zielverkaufspreis = zielverkaufspreis;
    }

    public double getKundenrabatt() {
        return kundenrabatt;
    }

    public void setKundenrabatt(double kundenrabatt) {
        this.kundenrabatt = kundenrabatt;
    }

    public double getNettoverkaufspreis() {
        return nettoverkaufspreis;
    }

    public void setNettoverkaufspreis(double nettoverkaufspreis) {
        this.nettoverkaufspreis = nettoverkaufspreis;
    }

    public double getUmsatzsteuer() {
        return umsatzsteuer;
    }

    public void setUmsatzsteuer(double umsatzsteuer) {
        this.umsatzsteuer = umsatzsteuer;
    }

    public double getBruttoverkaufspreis() {
        return bruttoverkaufspreis;
    }

    public void setBruttoverkaufspreis(double bruttoverkaufspreis) {
        this.bruttoverkaufspreis = bruttoverkaufspreis;
    }

    public boolean isVorwaerts() {
        return vorwaerts;
    }

    public void setVorwaerts(boolean vorwaerts) {
        this.vorwaerts = vorwaerts;
    }

    public boolean isRueckwaerts() {
        return rueckwaerts;
    }

    public void setRueckwaerts(boolean rueckwaerts) {
        this.rueckwaerts = rueckwaerts;
    }

    public boolean isDifferenz() {
        return differenz;
    }

    public void setDifferenz(boolean differenz) {
        this.differenz = differenz;
    }

    public double getMaterialeinzelkosten() {
        return materialeinzelkosten;
    }

    public void setMaterialeinzelkosten(double materialeinzelkosten) {
        this.materialeinzelkosten = materialeinzelkosten;
    }

    public double getMaterialgemeinkosten() {
        return materialgemeinkosten;
    }

    public void setMaterialgemeinkosten(double materialgemeinkosten) {
        this.materialgemeinkosten = materialgemeinkosten;
    }

    public double getMaterialkosten() {
        return materialkosten;
    }

    public void setMaterialkosten(double materialkosten) {
        this.materialkosten = materialkosten;
    }

    public double getFertigungseinzelkosten() {
        return fertigungseinzelkosten;
    }

    public void setFertigungseinzelkosten(double fertigungseinzelkosten) {
        this.fertigungseinzelkosten = fertigungseinzelkosten;
    }

    public double getFertigungsgemeinkosten() {
        return fertigungsgemeinkosten;
    }

    public void setFertigungsgemeinkosten(double fertigungsgemeinkosten) {
        this.fertigungsgemeinkosten = fertigungsgemeinkosten;
    }

    public double getFertigungskosten() {
        return fertigungskosten;
    }

    public void setFertigungskosten(double fertigungskosten) {
        this.fertigungskosten = fertigungskosten;
    }

    public double getHerstellkosten() {
        return herstellkosten;
    }

    public void setHerstellkosten(double herstellkosten) {
        this.herstellkosten = herstellkosten;
    }



    //Eigene Methoden
    private double prozentBerechnen(double prozentzsatz, double grundwert){
        return prozentzsatz/100*grundwert;
    }

    public double convertToDouble(EditText textField){
        String value = textField.getText().toString();
        //Überprüfung ob EditText leer ist
        if (!value.isEmpty()){
            value = value.replaceAll(" €","");
            return Double.parseDouble(value.replaceAll(",", "."));
        }else {
            return 0.0;
        }
    }

    public String convertToString(double number){
        return String.format("%.2f €", number);
    }

    public boolean validate(EditText[] fields){
        for(int i = 0; i < fields.length; i++){
            EditText currentField = fields[i];
            if(currentField.getText().toString().isEmpty()){
                return true;
            }
        }
        return false;
    }

    //Berechnungen
    public void vorwaertsBerechnung(){
        setErgebnisMGK(prozentBerechnen(getMaterialgemeinkosten(),getMaterialeinzelkosten()));
        setMaterialkosten((getErgebnisMGK()+ getMaterialeinzelkosten()));
        setErgebnisFGK(prozentBerechnen(getFertigungsgemeinkosten(),getFertigungseinzelkosten()));
        setFertigungskosten(getErgebnisFGK()+ getFertigungseinzelkosten()+getSonderEkdVert());
        setHerstellkosten(getMaterialkosten()+getFertigungskosten());
        setErgebnisVerwGK(prozentBerechnen(getVerwaltungsgemeinkosten(),getHerstellkosten()));
        setErgebnisvertGK(prozentBerechnen(getVertriebsgemeinkosten(),getHerstellkosten()));
        setSelbstkosten(getSonderEkdFert()+getErgebnisVerwGK()+getErgebnisvertGK()+getHerstellkosten());
        setErgebnisGewinn(prozentBerechnen(getGewinn(),getSelbstkosten()));
        setBarverkaufspreis(getSelbstkosten()+getErgebnisGewinn());
        double prozent_im_hundert = 100-getKundenskonto();
        setErgebnisKs(getBarverkaufspreis()/prozent_im_hundert*getKundenskonto());
        setZielverkaufspreis(getBarverkaufspreis()+getErgebnisKs());
        prozent_im_hundert = 100-getKundenrabatt();
        setErgebnisKr(getZielverkaufspreis()/prozent_im_hundert*getKundenrabatt());
        setNettoverkaufspreis(getZielverkaufspreis()+getErgebnisKr());
        setErgebnisUmst(prozentBerechnen(getUmsatzsteuer(),getNettoverkaufspreis()));
        setBruttoverkaufspreis(getNettoverkaufspreis()+getErgebnisUmst());
    }

    public void rueckwaertsBerechnung(boolean isMEK_Leer){

        if (!(bruttoverkaufspreis == 0)){
            setErgebnisUmst(getBruttoverkaufspreis()/(100+getUmsatzsteuer())*getUmsatzsteuer());
            setNettoverkaufspreis(getBruttoverkaufspreis()-getErgebnisUmst());
        }
        setErgebnisKr(getNettoverkaufspreis()/100*getKundenrabatt());
        setZielverkaufspreis(getNettoverkaufspreis()-getErgebnisKr());
        setErgebnisKs(getZielverkaufspreis()/100*getKundenskonto());
        setBarverkaufspreis(getZielverkaufspreis()-getErgebnisKs());
        setErgebnisGewinn(getBarverkaufspreis()/(100+getGewinn())*getGewinn());
        setSelbstkosten(getBarverkaufspreis()-getErgebnisGewinn());
        double prozet = 100+getVertriebsgemeinkosten()+getVerwaltungsgemeinkosten();
        setErgebnisVerwGK(getSelbstkosten()/prozet*getVerwaltungsgemeinkosten());
        setErgebnisvertGK(getSelbstkosten()/prozet*getVertriebsgemeinkosten());
        setHerstellkosten(getSelbstkosten()-getSonderEkdVert()-getErgebnisvertGK()-getErgebnisVerwGK());

        if ( isMEK_Leer){
            setErgebnisFGK(prozentBerechnen(getFertigungsgemeinkosten(),getFertigungseinzelkosten()));
            setFertigungskosten(getErgebnisFGK()+getSonderEkdFert()+getFertigungseinzelkosten());
            setMaterialkosten(getHerstellkosten()-getFertigungskosten());
            setErgebnisMGK(getMaterialkosten()/(100+getMaterialgemeinkosten())*getMaterialgemeinkosten());
            setMaterialeinzelkosten(getMaterialkosten()-getErgebnisMGK());
        }else {
            setErgebnisMGK(prozentBerechnen(getMaterialgemeinkosten(),getMaterialeinzelkosten()));
            setMaterialkosten(getErgebnisMGK()+getMaterialeinzelkosten());
            setFertigungskosten(getHerstellkosten()-getMaterialkosten());
            setErgebnisFGK(getFertigungskosten()/(100+getFertigungsgemeinkosten())*getFertigungsgemeinkosten());
            setFertigungseinzelkosten(getFertigungskosten()-getErgebnisFGK());
        }
    }
    public void differenz(){

        setErgebnisMGK(prozentBerechnen(getMaterialgemeinkosten(),getMaterialeinzelkosten()));
        setMaterialkosten((getErgebnisMGK()+ getMaterialeinzelkosten()));
        setErgebnisFGK(prozentBerechnen(getFertigungsgemeinkosten(),getFertigungseinzelkosten()));
        setFertigungskosten(getErgebnisFGK()+ getFertigungseinzelkosten()+getSonderEkdVert());
        setHerstellkosten(getMaterialkosten()+getFertigungskosten());
        setErgebnisVerwGK(prozentBerechnen(getVerwaltungsgemeinkosten(),getHerstellkosten()));
        setErgebnisvertGK(prozentBerechnen(getVertriebsgemeinkosten(),getHerstellkosten()));
        setSelbstkosten(getSonderEkdFert()+getErgebnisVerwGK()+getErgebnisvertGK()+getHerstellkosten());

        if (!(bruttoverkaufspreis == 0)){
            setErgebnisUmst(getBruttoverkaufspreis()/(100+getUmsatzsteuer())*getUmsatzsteuer());
            setNettoverkaufspreis(getBruttoverkaufspreis()-getErgebnisUmst());
        }
        setErgebnisKr(getNettoverkaufspreis()/100*getKundenrabatt());
        setZielverkaufspreis(getNettoverkaufspreis()-getErgebnisKr());
        setErgebnisKs(getZielverkaufspreis()/100*getKundenskonto());
        setBarverkaufspreis(getZielverkaufspreis()-getErgebnisKs());
        setErgebnisGewinn(getBarverkaufspreis()-getSelbstkosten());
        setGewinn(100/getSelbstkosten()*getErgebnisGewinn());
    }


}
