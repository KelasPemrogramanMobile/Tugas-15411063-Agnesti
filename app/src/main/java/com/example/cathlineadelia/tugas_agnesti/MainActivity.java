package com.example.cathlineadelia.tugas_agnesti;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.edNama) EditText edNama;
    @BindView(R.id.edNpm) EditText edNpm;
    @BindView(R.id.edTgs) EditText edTgs;
    @BindView(R.id.edQuiz) EditText edQuiz;
    @BindView(R.id.edUts) EditText edUts;
    @BindView(R.id.edUas) EditText edUas;

    @BindView(R.id.txtTampilan1) TextView txtTampilan1;
    @BindView(R.id.txtTampilan2) TextView txtTampilan2;
    @BindView(R.id.txtTampilan3) TextView txtTampilan3;
    @BindView(R.id.txtTampilan4) TextView txtTampilan4;
    @BindView(R.id.txtTampilan5) TextView txtTampilan5;
    @BindView(R.id.txtTampilan6) TextView txtTampilan6;

    @OnClick(R.id.btnSimpan)
    void Simpan (){
        String nama = edNama.getText().toString();
        String npm = edNpm.getText().toString();
        String ntugas = edTgs.getText().toString();
        String nquiz = edQuiz.getText().toString();
        String nuts = edUts.getText().toString();
        String nuas = edUas.getText().toString();
        String hasil = "Nama: " + nama + ", "
                + "NPM: " + npm + ", "
                + "Nilai Tugas: " + ntugas + ", "
                + "Nilai Quiz:  " + nquiz + ", "
                + "Nilai UTS: " + nuts + ", "
                + "Nilai UAS: " + nuas;
        Toast.makeText(getApplicationContext(), hasil, Toast.LENGTH_SHORT).show();
        txtTampilan1.setText(nama);
        txtTampilan2.setText(npm);
        txtTampilan3.setText(ntugas);
        txtTampilan4.setText(nquiz);
        txtTampilan5.setText(nuts);
        txtTampilan6.setText(nuas);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}
