package com.example.preiskalkulation;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButtonToggleGroup;

public class MainActivity extends AppCompatActivity {

    Utility objUtility = new Utility();

    Button berechnung;
    EditText mek;
    EditText mgk;
    TextView mk;
    EditText fek;
    EditText fgk;
    EditText sdFert;
    TextView fk;
    TextView hk;
    EditText verwGk;
    EditText vertGk;
    EditText sdVert;
    TextView sk;
    EditText gewin;
    TextView bvpTV;
    EditText ks;
    TextView zvp;
    EditText kr;
    EditText nvp;
    EditText umst;
    EditText bvp;
    Button loeschenBtn;
    TextView ergebnisMGK;
    TextView ergebnisFGK;
    TextView ergebnisVerwGK;
    TextView ergebnisVertGk;
    TextView ergebnisGewinn;
    TextView ergebnisKr;
    TextView ergebnisKs;
    TextView ergebnisUmst;
    TextView disclaimer;

    Drawable bgEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            berechnung = findViewById(R.id.berechnung);
            mek = findViewById(R.id.mekTF);
            mgk = findViewById(R.id.mgkTF);
            mk = findViewById(R.id.ergebnisMK);
            fek = findViewById(R.id.fekTF);
            fgk = findViewById(R.id. fgkTF);
            sdFert = findViewById(R.id.sdFertTF);
            fk = findViewById(R.id.ergebnisFK);
            hk = findViewById(R.id.herstellkosten);
            verwGk = findViewById(R.id.verwGkTF);
            vertGk = findViewById(R.id.vertTF);
            sdVert = findViewById(R.id.sdvTF);
            sk = findViewById(R.id.ergebnisSK);
            gewin = findViewById(R.id.gewinnTF);
            bvpTV = findViewById(R.id.ergebnisBVP);
            ks = findViewById(R.id.ksTF);
            zvp = findViewById(R.id.ergebnisZVP);
            kr = findViewById(R.id.krTF);
            nvp = findViewById(R.id.nvpTF);
            umst = findViewById(R.id.umstTF);
            bvp = findViewById(R.id.bvpTF);
            loeschenBtn = findViewById(R.id.loeschen);
            ergebnisMGK = findViewById(R.id.ergebnisMGK);
            ergebnisFGK = findViewById(R.id.ergebnisFGK);
            ergebnisVerwGK = findViewById(R.id.ergebnisVerwGK);
            ergebnisVertGk = findViewById(R.id.ergebnisverTGK);
            ergebnisGewinn = findViewById(R.id.ergebnisGewinn);
            ergebnisKr = findViewById(R.id.ergebnisKr);
            ergebnisKs = findViewById(R.id.ergebnisKs);
            ergebnisUmst = findViewById(R.id.ergebnisUmst);
            disclaimer = findViewById(R.id.disclaimer);

        MaterialButtonToggleGroup materialButtonToggleGroup = findViewById(R.id.toggleButton);

        objUtility.setVorwaerts(true);
        berechnung.setEnabled(true);
        nvp.setEnabled(false);
        bvp.setEnabled(false);

        bgEditText = mek.getBackground();
        //Button GroupActionListener
        materialButtonToggleGroup.addOnButtonCheckedListener(new MaterialButtonToggleGroup.OnButtonCheckedListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public void onButtonChecked(MaterialButtonToggleGroup group, int checkedId, boolean isChecked) {
                if (isChecked) {
                    //Button ID check
                    switch (checkedId){
                        case R.id.vorwaertsBtn:
                            Log.i("DEBUG", "Vorwärtskalk");
                            objUtility.setVorwaerts(true);
                            objUtility.setRueckwaerts(false);
                            objUtility.setDifferenz(false);

                            gewin.setEnabled(true);
                            nvp.setEnabled(false);
                            bvp.setEnabled(false);

                            nvp.setText("");
                            bvp.setText("");

                            disclaimer.setVisibility(View.GONE);

                            //Leert EditTexts
                            datenLoeschung();
                            break;
                        case R.id.rueckwaertsBtn:
                            Log.i("DEBUG", "Rückwärtskalk");
                            objUtility.setVorwaerts(false);
                            objUtility.setRueckwaerts(true);
                            objUtility.setDifferenz(false);

                            gewin.setEnabled(true);
                            nvp.setEnabled(true);
                            bvp.setEnabled(true);

                            disclaimer.setVisibility(View.VISIBLE);

                            //Leert EditTexts
                            datenLoeschung();
                            break;
                        case R.id.differenzBtn:
                            Log.i("DEBUG", "Differenzkalk");
                            objUtility.setVorwaerts(false);
                            objUtility.setRueckwaerts(false);
                            objUtility.setDifferenz(true);

                            gewin.setEnabled(false);
                            nvp.setEnabled(true);
                            bvp.setEnabled(true);
                            gewin.setText("");

                            disclaimer.setVisibility(View.GONE);

                            //Leert EditTexts
                            datenLoeschung();
                            break;
                        default:
                            Log.e("ERROR", "Fall nicht gefunden");
                            break;
                    }
                }
            }
        });

        berechnung.setOnClickListener(view -> {

            //Übertran an die Klasse
            objUtility.setMaterialeinzelkosten(objUtility.convertToDouble(mek));
            objUtility.setMaterialgemeinkosten((objUtility.convertToDouble(mgk)));
            objUtility.setFertigungseinzelkosten(objUtility.convertToDouble(fek));
            objUtility.setFertigungsgemeinkosten((objUtility.convertToDouble(fgk)));
            objUtility.setSonderEkdVert(objUtility.convertToDouble(sdFert));
            objUtility.setVerwaltungsgemeinkosten(objUtility.convertToDouble(verwGk));
            objUtility.setVertriebsgemeinkosten(objUtility.convertToDouble(vertGk));
            objUtility.setSondereinzelkosten_des_Vertriebs(objUtility.convertToDouble(sdVert));
            objUtility.setGewinn(objUtility.convertToDouble(gewin));
            objUtility.setKundenskonto(objUtility.convertToDouble(ks));
            objUtility.setKundenrabatt(objUtility.convertToDouble(kr));
            objUtility.setUmsatzsteuer(objUtility.convertToDouble(umst));
            objUtility.setBruttoverkaufspreis(objUtility.convertToDouble(bvp));
            objUtility.setNettoverkaufspreis(objUtility.convertToDouble(nvp));

            //MultiChois Check #### Rückwärts Vorwärts und Differenz
            //Vorwärts
            if (objUtility.isVorwaerts()){
                if (!(objUtility.validate(new EditText[] {mek,mgk,fek,fgk,verwGk,vertGk,gewin,umst}))) {
                    objUtility.vorwaertsBerechnung();
                    nvp.setBackgroundResource(R.color.ic_launcher_background);
                    bvp.setBackgroundResource(R.color.ic_launcher_background);
                    setDaten();
                }else
                    Toast.makeText(MainActivity.this, "Nicht alle Pflichtfeldert ausgefüllt! Bitte alle Felder überprüfen", Toast.LENGTH_LONG).show();
                //Rückwärts
            }else if (objUtility.isRueckwaerts()){
                if (mek.getText().toString().isEmpty() && fek.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Keine Eingaben! Bitte MEK oder FEK ausfüllen", Toast.LENGTH_LONG).show();
                }
                else if (mek.getText().toString().isEmpty()) {
                    mek.setBackgroundResource(R.color.ic_launcher_background);
                    fek.setBackground(bgEditText);
                    objUtility.rueckwaertsBerechnung(true);
                    mek.setText(objUtility.convertToString(objUtility.getMaterialeinzelkosten()));
                    setDaten();
                }
                else if (fek.getText().toString().isEmpty()) {
                    fek.setBackgroundResource(R.color.ic_launcher_background);
                    mek.setBackground(bgEditText);
                    objUtility.rueckwaertsBerechnung(false);
                    fek.setText(objUtility.convertToString(objUtility.getFertigungseinzelkosten()));
                    setDaten();
                }
                else {
                    Toast.makeText(MainActivity.this, "Zuviele Eingaben! Bitte nur MEK oder FEK ausfüllen", Toast.LENGTH_LONG).show();
                }
                //Differenz
            }else if (objUtility.isDifferenz()){
                if (!(objUtility.validate(new EditText[] {mek,mgk,fek,fgk,verwGk,vertGk,umst,nvp}))) {
                objUtility.differenz();
                gewin.setText(objUtility.convertToString(objUtility.getGewinn()));
                ergebnisGewinn.setText(objUtility.convertToString(objUtility.getErgebnisGewinn()));
                gewin.setBackgroundResource(R.color.ic_launcher_background);
                setDaten();
                }
            }


        });

        loeschenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Alle Daten gelöscht",Toast.LENGTH_LONG).show();
                datenLoeschung();
            }
        });



    }

    public void setDaten(){
        ergebnisMGK.setText(objUtility.convertToString(objUtility.getErgebnisMGK()));
        mk.setText(String.format("%s %s", getString(R.string.ergebnisMaterialkosten), objUtility.convertToString(objUtility.getMaterialkosten())));
        fk.setText(String.format("%s %s", getString(R.string.ergebnisFertigungskosten), objUtility.convertToString(objUtility.getFertigungskosten())));
        ergebnisFGK.setText(objUtility.convertToString(objUtility.getErgebnisFGK()));
        hk.setText(String.format("%s %s", getString(R.string.herstellkosten), objUtility.convertToString(objUtility.getHerstellkosten())));

        ergebnisVerwGK.setText(objUtility.convertToString(objUtility.getErgebnisVerwGK()));
        ergebnisVertGk.setText(objUtility.convertToString(objUtility.getErgebnisvertGK()));
        sk.setText(String.format("%s %s", getString(R.string.ergebnisSelbskosten), objUtility.convertToString(objUtility.getSelbstkosten())));

        ergebnisGewinn.setText(objUtility.convertToString(objUtility.getErgebnisGewinn()));
        bvpTV.setText(String.format("%s %s", getString(R.string.ergebnisBarverkaufspreis), objUtility.convertToString(objUtility.getBarverkaufspreis())));
        ergebnisKs.setText(objUtility.convertToString(objUtility.getErgebnisKs()));
        zvp.setText(String.format("%s %s", getString(R.string.ergebnisZielverkaufspreis), objUtility.convertToString(objUtility.getZielverkaufspreis())));
        ergebnisKr.setText(objUtility.convertToString(objUtility.getErgebnisKr()));

        nvp.setText(objUtility.convertToString(objUtility.getNettoverkaufspreis()));
        ergebnisUmst.setText(objUtility.convertToString(objUtility.getErgebnisUmst()));
        bvp.setText(objUtility.convertToString(objUtility.getBruttoverkaufspreis()));

    }

    public void datenLoeschung(){
        //Hintergrund reset EditText
        nvp.setBackground(bgEditText);
        bvp.setBackground(bgEditText);
        mek.setBackground(bgEditText);
        fek.setBackground(bgEditText);
        gewin.setBackground(bgEditText);

        //Leere EditText
        mek.setText("");
        mgk.setText("");
        mk.setText(R.string.ergebnisMaterialkosten);
        ergebnisMGK.setText("");
        fek.setText("");
        fgk.setText("");
        sdFert.setText("");
        ergebnisFGK.setText("");
        fk.setText(R.string.ergebnisFertigungskosten);
        hk.setText(R.string.herstellkosten);
        vertGk.setText("");
        ergebnisVertGk.setText("");
        verwGk.setText("");
        ergebnisVerwGK.setText("");
        sdVert.setText("");
        sk.setText(R.string.ergebnisSelbskosten);
        gewin.setText("");
        bvpTV.setText(R.string.ergebnisBarverkaufspreis);
        ks.setText("");
        zvp.setText(R.string.ergebnisZielverkaufspreis);
        kr.setText("");
        nvp.setText("");
        umst.setText("");
        bvp.setText("");
        ergebnisGewinn.setText("");
        ergebnisKr.setText("");
        ergebnisKs.setText("");
        ergebnisUmst.setText("");

        //Reset Class Data
        objUtility.setMaterialeinzelkosten(0);
        objUtility.setMaterialgemeinkosten(0);
        objUtility.setFertigungseinzelkosten(0);
        objUtility.setFertigungsgemeinkosten(0);
        objUtility.setSonderEkdVert(0);
        objUtility.setVerwaltungsgemeinkosten(0);
        objUtility.setVertriebsgemeinkosten(0);
        objUtility.setSondereinzelkosten_des_Vertriebs(0);
        objUtility.setGewinn(0);
        objUtility.setKundenskonto(0);
        objUtility.setKundenrabatt(0);
        objUtility.setUmsatzsteuer(0);
        objUtility.setBruttoverkaufspreis(0);
        objUtility.setNettoverkaufspreis(0);
    }
}
