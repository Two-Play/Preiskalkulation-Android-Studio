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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            Berechnung objBerechnung = new Berechnung();
            Button berechnung = findViewById(R.id.berechnung);
            EditText mek = findViewById(R.id.mekTF);
            EditText mgk = findViewById(R.id.mgkTF);
            TextView mk = findViewById(R.id.ergebnisMK);
            EditText fek = findViewById(R.id.fekTF);
            EditText fgk = findViewById(R.id. fgkTF);
            EditText sdFert = findViewById(R.id.sdFertTF);
            TextView fk = findViewById(R.id.ergebnisFK);
            TextView hk = findViewById(R.id.herstellkosten);
            EditText verwGk = findViewById(R.id.verwGkTF);
            EditText vertGk = findViewById(R.id.vertTF);
            EditText sdVert = findViewById(R.id.sdvTF);
            TextView sk = findViewById(R.id.ergebnisSK);
            EditText gewin = findViewById(R.id.gewinnTF);
            TextView bvpTV = findViewById(R.id.ergebnisBVP);
            EditText ks = findViewById(R.id.ksTF);
            TextView zvp = findViewById(R.id.ergebnisZVP);
            EditText kr = findViewById(R.id.krTF);
            EditText nvp = findViewById(R.id.nvpTF);
            EditText umst = findViewById(R.id.umstTF);
            EditText bvp = findViewById(R.id.bvpTF);
            Button loeschenBtn = findViewById(R.id.loeschen);
            TextView ergebnisMGK = findViewById(R.id.ergebnisMGK);
            TextView ergebnisFGK = findViewById(R.id.ergebnisFGK);
            TextView ergebnisVerwGK = findViewById(R.id.ergebnisVerwGK);
            TextView ergebnisVertGk = findViewById(R.id.ergebnisverTGK);
            TextView ergebnisGewinn = findViewById(R.id.ergebnisGewinn);
            TextView ergebnisKr = findViewById(R.id.ergebnisKr);
            TextView ergebnisKs = findViewById(R.id.ergebnisKs);
            TextView ergebnisUmst = findViewById(R.id.ergebnisUmst);
            TextView disclaimer = findViewById(R.id.disclaimer);

        MaterialButtonToggleGroup materialButtonToggleGroup = findViewById(R.id.toggleButton);

        objBerechnung.setVorwaerts(true);
        berechnung.setEnabled(true);
        nvp.setEnabled(false);
        bvp.setEnabled(false);

        Drawable bgEditText = mek.getBackground();
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
                            objBerechnung.setVorwaerts(true);
                            objBerechnung.setRueckwaerts(false);
                            objBerechnung.setDifferenz(false);

                            gewin.setEnabled(true);
                            nvp.setEnabled(false);
                            bvp.setEnabled(false);

                            nvp.setText(null);
                            bvp.setText(null);

                            disclaimer.setVisibility(View.GONE);

                            break;
                        case R.id.rueckwaertsBtn:
                            Log.i("DEBUG", "Rückwärtskalk");
                            objBerechnung.setVorwaerts(false);
                            objBerechnung.setRueckwaerts(true);
                            objBerechnung.setDifferenz(false);

                            gewin.setEnabled(true);
                            nvp.setEnabled(true);
                            bvp.setEnabled(true);

                            disclaimer.setVisibility(View.VISIBLE);
                            break;
                        case R.id.differenzBtn:
                            Log.i("DEBUG", "Differenzkalk");
                            objBerechnung.setVorwaerts(false);
                            objBerechnung.setRueckwaerts(false);
                            objBerechnung.setDifferenz(true);

                            gewin.setEnabled(false);
                            nvp.setEnabled(true);
                            bvp.setEnabled(true);
                            gewin.setText(null);

                            disclaimer.setVisibility(View.GONE);
                            break;
                        default:
                            Log.e("ERROR", "Case nicht gefunden");
                            break;

                    }
                }
            }
        });

        berechnung.setOnClickListener(view -> {

            objBerechnung.setMaterialeinzelkosten(objBerechnung.convertToDouble(mek));
            objBerechnung.setMaterialgemeinkosten((objBerechnung.convertToDouble(mgk)));
            objBerechnung.setFertigungseinzelkosten(objBerechnung.convertToDouble(fek));
            objBerechnung.setFertigungsgemeinkosten((objBerechnung.convertToDouble(fgk)));
            objBerechnung.setSonderEkdVert(objBerechnung.convertToDouble(sdFert));
            objBerechnung.setVerwaltungsgemeinkosten(objBerechnung.convertToDouble(verwGk));
            objBerechnung.setVertriebsgemeinkosten(objBerechnung.convertToDouble(vertGk));
            objBerechnung.setSondereinzelkosten_des_Vertriebs(objBerechnung.convertToDouble(sdVert));
            objBerechnung.setGewinn(objBerechnung.convertToDouble(gewin));
            objBerechnung.setKundenskonto(objBerechnung.convertToDouble(ks));
            objBerechnung.setKundenrabatt(objBerechnung.convertToDouble(kr));
            objBerechnung.setUmsatzsteuer(objBerechnung.convertToDouble(umst));
            objBerechnung.setBruttoverkaufspreis(objBerechnung.convertToDouble(bvp));
            objBerechnung.setNettoverkaufspreis(objBerechnung.convertToDouble(nvp));


            if (objBerechnung.isVorwaerts()){
                objBerechnung.vorwaertsBerechnung();
                nvp.setBackgroundResource(R.color.ic_launcher_background);
                bvp.setBackgroundColor(getColor(R.color.ic_launcher_background));

            }

            ergebnisMGK.setText(objBerechnung.convertToString(objBerechnung.getErgebnisMGK()));
            mk.setText(getString(R.string.ergebnisMaterialkosten) + " " + objBerechnung.convertToString(objBerechnung.getMaterialkosten()));
            fk.setText(getString(R.string.ergebnisFertigungskosten) + " " + objBerechnung.convertToString(objBerechnung.getFertigungskosten()));
            ergebnisFGK.setText(objBerechnung.convertToString(objBerechnung.getErgebnisFGK()));
            hk.setText(getString(R.string.herstellkosten) + " " + objBerechnung.convertToString(objBerechnung.getHerstellkosten()));

            ergebnisVerwGK.setText(objBerechnung.convertToString(objBerechnung.getErgebnisVerwGK()));
            ergebnisVertGk.setText(objBerechnung.convertToString(objBerechnung.getErgebnisvertGK()));
            sk.setText(getString(R.string.ergebnisSelbskosten) + " " + objBerechnung.convertToString(objBerechnung.getSelbstkosten()));

            ergebnisGewinn.setText(objBerechnung.convertToString(objBerechnung.getErgebnisGewinn()));
            bvpTV.setText(getString(R.string.ergebnisBarverkaufspreis) + " " + objBerechnung.convertToString(objBerechnung.getBarverkaufspreis()));
            ergebnisKs.setText(objBerechnung.convertToString(objBerechnung.getErgebnisKs()));
            zvp.setText(String.format("%s %s", getString(R.string.ergebnisZielverkaufspreis), objBerechnung.convertToString(objBerechnung.getZielverkaufspreis())));
            ergebnisKr.setText(objBerechnung.convertToString(objBerechnung.getErgebnisKr()));

            nvp.setText(objBerechnung.convertToString(objBerechnung.getNettoverkaufspreis()));
            ergebnisUmst.setText(objBerechnung.convertToString(objBerechnung.getErgebnisUmst()));
            bvp.setText(objBerechnung.convertToString(objBerechnung.getBruttoverkaufspreis()));

        });

        loeschenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mek.setText(null);
                mgk.setText(null);
                mk.setText(R.string.ergebnisMaterialkosten);
                ergebnisMGK.setText(null);
                fek.setText(null);
                fgk.setText(null);
                sdFert.setText(null);
                ergebnisFGK.setText(null);
                fk.setText(R.string.ergebnisFertigungskosten);
                hk.setText(R.string.herstellkosten);
                vertGk.setText(null);
                ergebnisVertGk.setText(null);
                verwGk.setText(null);
                ergebnisVerwGK.setText(null);
                sdVert.setText(null);
                sk.setText(R.string.ergebnisSelbskosten);
                gewin.setText(null);
                bvpTV.setText(R.string.ergebnisBarverkaufspreis);
                ks.setText(null);
                zvp.setText(R.string.ergebnisZielverkaufspreis);
                kr.setText(null);
                nvp.setText(null);
                umst.setText(null);
                bvp.setText(null);
                ergebnisGewinn.setText(null);
                ergebnisKr.setText(null);
                ergebnisKs.setText(null);
                ergebnisUmst.setText(null);

                nvp.setBackground(bgEditText);
                bvp.setBackground(bgEditText);
                mek.setBackground(bgEditText);
                fek.setBackground(bgEditText);
                gewin.setBackground(bgEditText);
                Toast.makeText(MainActivity.this,"Alle Daten gelöscht",Toast.LENGTH_LONG).show();
            }
        });



    }

}
