package id.ac.unsyiah.elektro.mobile.pservices;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setCustomView(R.layout.actionbar);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);

        final Spinner spinner = (Spinner) findViewById(R.id.spinner);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                int kabkot = parent.getSelectedItemPosition();

                if (kabkot==0){ //Banda Aceh

                    ImageView rumahSakit = (ImageView) findViewById(R.id.rumahSakit);
                    rumahSakit.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                            String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh"," RS Malahayati",
                                    "RSIA Harapan Bunda","RS Teuku Fakinah","RSU Meuraxa","RS Ibu dan Anak Propinsi NAD","RS Permata Hati","Rumkit Bhayangkara Banda Aceh"
                                    ,"RS UBUDIYAH BANDA ACEH","RS Meutia","RS Cempaka Az Zahra Banda Aceh","RS PRINCE NAYEF BIN ABDUL AZIZ SYIAH KUALA UNIVERS"
                                    ,"RSU Bulan Sabit Merah Indonesia Aceh","RS NABILA HOSPITAL","RS PERTAMEDIKA UMMI ROSNATI"};
                            String[] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh", "Jl. T. Hamzah Bendahara Banda Aceh", "Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh"
                                    ,"Jl. Cut Nyak Dhien No : 498 ,Banda Ace","Jl. Teuku Umar 181,Banda Aceh","Jl. Jend.Sudirman 27-29,Banda Aceh","Jl. Soekarno Hatta Km.2 Mibo Banda Aceh"
                                    ,"Jl. Prof.A.Madjid Ibrahim I, no. 3 Banda Aceh","Jl. Sultan Iskandar Muda No.217,Banda Aceh","Jl. Cut Nyak Dhien No. 23, Lamteumen Barat Banda Aceh"
                                    ,"Jln. T. Nyak Arief No.17-24 Jeulingke","Jl. Cut Meutia No. 55","Jln. Pocut Baren, 36-40","Jl. Lingkar Kampus","Jl. Sultan Malikul Saleh No. 17 Lamlagang, Kec. Banda Raya"
                                    ,"JL. STA. MAHMUDSYAH N0 9 BANDA ACEH","Jl. Sekolah No. 5 Gampoeng Ateuk Pahlawan, Kecamatan Baiturahman, Kota Banda Aceh 23241"};

                            int[] gambar = {R.drawable.a, R.drawable.a, R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,
                                    R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,
                                    R.drawable.a,R.drawable.a,R.drawable.a};
                            String[]sms ={"smsto:","smsto:","smsto:","smsto:","smsto:",
                                    "smsto:","smsto:","smsto:","smsto:","smsto:",
                                    "smsto:","smsto:","smsto:","smsto:","smsto:","smsto:",
                                    "smsto:"};
                            String[]mail ={"mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com",
                                    "mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com",
                                    "mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com",
                                    "mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com",
                                    "mailto:dsyech@gmail.com"};

                            double[] lat = {5.579462, 5.564446, 5.565996, 5.565996,
                                    5.565996, 5.565996, 5.565996, 5.565996,
                                    5.565996, 5.565996, 5.565996, 5.565996,
                                    5.565996, 5.565996, 5.565996, 5.565996,5.565996};
                            double []lang={95.348918, 95.325893, 95.336772,95.336772,
                                    95.348918, 95.325893, 95.336772,95.336772,
                                    95.348918, 95.325893, 95.336772,95.336772,
                                    95.348918, 95.325893, 95.336772,95.336772,
                                    95.348918};

                            String []web = {"http://m.detik.com","http://vemale.com","http://okezone.com"};
                            String[]tel = {"tel:085359101995","tel:085359101995","tel:085359101995"};
                            next.putExtra("tel",tel);
                            next.putExtra("namaKantor", namaKantor);
                            next.putExtra("gambar", gambar);
                            next.putExtra("desk", desk);
                            next.putExtra("sms",sms);
                            next.putExtra("lat",lat);
                            next.putExtra("lang",lang);
                            next.putExtra("web",web);
                            next.putExtra("mail",mail);
                            startActivity(next);
                        }
                    });

                    ImageView kantorPolisi = (ImageView) findViewById(R.id.kantorPolisi);
                    kantorPolisi.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                            String[] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh", "Jl. T. Hamzah Bendahara Banda Aceh", "Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh"};
                            String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh"};
                            int[] gambar = {R.drawable.a, R.drawable.a, R.drawable.a};
                            String[]sms ={"smsto:085359101995","smsto:085359101948","smsto:085359101996"};
                            String[]mail ={"mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com"};

                            double[] lat = {5.579462, 5.564446, 5.565996};
                            double []lang={95.348918, 95.325893, 95.336772};

                            String []web = {"http://m.detik.com","http://vemale.com","http://okezone.com"};
                            String[]tel = {"tel:085359101995","tel:085359101995","tel:085359101995"};
                            next.putExtra("tel",tel);
                            next.putExtra("namaKantor", namaKantor);
                            next.putExtra("gambar", gambar);
                            next.putExtra("desk", desk);
                            next.putExtra("sms",sms);
                            next.putExtra("lat",lat);
                            next.putExtra("lang",lang);
                            next.putExtra("web",web);
                            next.putExtra("mail",mail);
                            startActivity(next);
                        }
                    });

                    ImageView damkar = (ImageView) findViewById(R.id.damkar);
                    damkar.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                            String[] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh", "Jl. T. Hamzah Bendahara Banda Aceh", "Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh"};
                            String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh"};
                            int[] gambar = {R.drawable.a, R.drawable.a, R.drawable.a};
                            String[]sms ={"smsto:085359101995","smsto:085359101948","smsto:085359101996"};
                            String[]mail ={"mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com"};

                            double[] lat = {5.579462, 5.564446, 5.565996};
                            double []lang={95.348918, 95.325893, 95.336772};

                            String []web = {"http://m.detik.com","http://vemale.com","http://okezone.com"};
                            String[]tel = {"tel:085359101995","tel:085359101995","tel:085359101995"};
                            next.putExtra("tel",tel);
                            next.putExtra("namaKantor", namaKantor);
                            next.putExtra("gambar", gambar);
                            next.putExtra("desk", desk);
                            next.putExtra("sms",sms);
                            next.putExtra("lat",lat);
                            next.putExtra("lang",lang);
                            next.putExtra("web",web);
                            next.putExtra("mail",mail);
                            startActivity(next);
                        }
                    });

                    ImageView pmi = (ImageView) findViewById(R.id.pmi);
                    pmi.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                            String[] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh", "Jl. T. Hamzah Bendahara Banda Aceh", "Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh"};
                            String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh"};
                            int[] gambar = {R.drawable.a, R.drawable.a, R.drawable.a};
                            String[]sms ={"smsto:085359101995","smsto:085359101948","smsto:085359101996"};
                            String[]mail ={"mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com"};

                            double[] lat = {5.579462, 5.564446, 5.565996};
                            double []lang={95.348918, 95.325893, 95.336772};

                            String []web = {"http://m.detik.com","http://vemale.com","http://okezone.com"};
                            String[]tel = {"tel:085359101995","tel:085359101995","tel:085359101995"};
                            next.putExtra("tel",tel);
                            next.putExtra("namaKantor", namaKantor);
                            next.putExtra("gambar", gambar);
                            next.putExtra("desk", desk);
                            next.putExtra("sms",sms);
                            next.putExtra("lat",lat);
                            next.putExtra("lang",lang);
                            next.putExtra("web",web);
                            next.putExtra("mail",mail);
                            startActivity(next);
                        }
                    });

                    ImageView pln = (ImageView) findViewById(R.id.pln);
                    pln.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                            String[] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh", "Jl. T. Hamzah Bendahara Banda Aceh", "Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh"};
                            String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh"};
                            int[] gambar = {R.drawable.a, R.drawable.a, R.drawable.a};
                            String[]sms ={"smsto:085359101995","smsto:085359101948","smsto:085359101996"};
                            String[]mail ={"mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com"};

                            double[] lat = {5.579462, 5.564446, 5.565996};
                            double []lang={95.348918, 95.325893, 95.336772};

                            String []web = {"http://m.detik.com","http://vemale.com","http://okezone.com"};
                            String[]tel = {"tel:085359101995","tel:085359101995","tel:085359101995"};
                            next.putExtra("tel",tel);
                            next.putExtra("namaKantor", namaKantor);
                            next.putExtra("gambar", gambar);
                            next.putExtra("desk", desk);
                            next.putExtra("sms",sms);
                            next.putExtra("lat",lat);
                            next.putExtra("lang",lang);
                            next.putExtra("web",web);
                            next.putExtra("mail",mail);
                            startActivity(next);
                        }
                    });

                    ImageView sar = (ImageView) findViewById(R.id.sar);
                    sar.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                            String[] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh", "Jl. T. Hamzah Bendahara Banda Aceh", "Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh"};
                            String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh"};
                            int[] gambar = {R.drawable.a, R.drawable.a, R.drawable.a};
                            String[]sms ={"smsto:085359101995","smsto:085359101948","smsto:085359101996"};
                            String[]mail ={"mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com"};

                            double[] lat = {5.579462, 5.564446, 5.565996};
                            double []lang={95.348918, 95.325893, 95.336772};

                            String []web = {"http://m.detik.com","http://vemale.com","http://okezone.com"};
                            String[]tel = {"tel:085359101995","tel:085359101995","tel:085359101995"};
                            next.putExtra("tel",tel);
                            next.putExtra("namaKantor", namaKantor);
                            next.putExtra("gambar", gambar);
                            next.putExtra("desk", desk);
                            next.putExtra("sms",sms);
                            next.putExtra("lat",lat);
                            next.putExtra("lang",lang);
                            next.putExtra("web",web);
                            next.putExtra("mail",mail);
                            startActivity(next);
                        }
                    });

                    ImageView bpbd = (ImageView) findViewById(R.id.bpbd);
                    bpbd.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                            String[] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh", "Jl. T. Hamzah Bendahara Banda Aceh", "Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh"};
                            String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh"};
                            int[] gambar = {R.drawable.a, R.drawable.a, R.drawable.a};
                            String[]sms ={"smsto:085359101995","smsto:085359101948","smsto:085359101996"};
                            String[]mail ={"mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com"};

                            double[] lat = {5.579462, 5.564446, 5.565996};
                            double []lang={95.348918, 95.325893, 95.336772};

                            String []web = {"http://m.detik.com","http://vemale.com","http://okezone.com"};
                            String[]tel = {"tel:085359101995","tel:085359101995","tel:085359101995"};
                            next.putExtra("tel",tel);
                            next.putExtra("namaKantor", namaKantor);
                            next.putExtra("gambar", gambar);
                            next.putExtra("desk", desk);
                            next.putExtra("sms",sms);
                            next.putExtra("lat",lat);
                            next.putExtra("lang",lang);
                            next.putExtra("web",web);
                            next.putExtra("mail",mail);
                            startActivity(next);
                        }
                    });

                    ImageView ppwh = (ImageView) findViewById(R.id.ppwh);
                    ppwh.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                            String[] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh", "Jl. T. Hamzah Bendahara Banda Aceh", "Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh"};
                            String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh"};
                            int[] gambar = {R.drawable.a, R.drawable.a, R.drawable.a};
                            String[]sms ={"smsto:085359101995","smsto:085359101948","smsto:085359101996"};
                            String[]mail ={"mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com"};

                            double[] lat = {5.579462, 5.564446, 5.565996};
                            double []lang={95.348918, 95.325893, 95.336772};

                            String []web = {"http://m.detik.com","http://vemale.com","http://okezone.com"};
                            String[]tel = {"tel:085359101995","tel:085359101995","tel:085359101995"};
                            next.putExtra("tel",tel);
                            next.putExtra("namaKantor", namaKantor);
                            next.putExtra("gambar", gambar);
                            next.putExtra("desk", desk);
                            next.putExtra("sms",sms);
                            next.putExtra("lat",lat);
                            next.putExtra("lang",lang);
                            next.putExtra("web",web);
                            next.putExtra("mail",mail);
                            startActivity(next);
                        }
                    });

                    ImageView pemerintah = (ImageView) findViewById(R.id.pemerintah);
                    pemerintah.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                            String[] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh", "Jl. T. Hamzah Bendahara Banda Aceh", "Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh"};
                            String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh"};
                            int[] gambar = {R.drawable.a, R.drawable.a, R.drawable.a};
                            String[]sms ={"smsto:085359101995","smsto:085359101948","smsto:085359101996"};
                            String[]mail ={"mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com"};

                            double[] lat = {5.579462, 5.564446, 5.565996};
                            double []lang={95.348918, 95.325893, 95.336772};

                            String []web = {"http://m.detik.com","http://vemale.com","http://okezone.com"};
                            String[]tel = {"tel:085359101995","tel:085359101995","tel:085359101995"};
                            next.putExtra("tel",tel);
                            next.putExtra("namaKantor", namaKantor);
                            next.putExtra("gambar", gambar);
                            next.putExtra("desk", desk);
                            next.putExtra("sms",sms);
                            next.putExtra("lat",lat);
                            next.putExtra("lang",lang);
                            next.putExtra("web",web);
                            next.putExtra("mail",mail);
                            startActivity(next);
                        }
                    });

                }

                else if (kabkot==1){ //Aceh Besar

                    ImageView rumahSakit = (ImageView) findViewById(R.id.rumahSakit);
                    rumahSakit.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                            String[] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh", "Jl. T. Hamzah Bendahara Banda Aceh", "Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh"};
                            String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh"};
                            int[] gambar = {R.drawable.a, R.drawable.a, R.drawable.a};
                            String[]sms ={"smsto:085359101995","smsto:085359101948","smsto:085359101996"};
                            String[]mail ={"mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com"};

                            double[] lat = {5.579462, 5.564446, 5.565996};
                            double []lang={95.348918, 95.325893, 95.336772};

                            String []web = {"http://m.detik.com","http://vemale.com","http://okezone.com"};
                            String[]tel = {"tel:085359101995","tel:085359101995","tel:085359101995"};
                            next.putExtra("tel",tel);
                            next.putExtra("namaKantor", namaKantor);
                            next.putExtra("gambar", gambar);
                            next.putExtra("desk", desk);
                            next.putExtra("sms",sms);
                            next.putExtra("lat",lat);
                            next.putExtra("lang",lang);
                            next.putExtra("web",web);
                            next.putExtra("mail",mail);
                            startActivity(next);

                        }
                    });

                    ImageView kantorPolisi = (ImageView) findViewById(R.id.kantorPolisi);
                    kantorPolisi.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                            String[] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh", "Jl. T. Hamzah Bendahara Banda Aceh", "Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh"};
                            String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh"};
                            int[] gambar = {R.drawable.a, R.drawable.a, R.drawable.a};
                            String[]sms ={"smsto:085359101995","smsto:085359101948","smsto:085359101996"};
                            String[]mail ={"mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com"};

                            double[] lat = {5.579462, 5.564446, 5.565996};
                            double []lang={95.348918, 95.325893, 95.336772};

                            String []web = {"http://m.detik.com","http://vemale.com","http://okezone.com"};
                            String[]tel = {"tel:085359101995","tel:085359101995","tel:085359101995"};
                            next.putExtra("tel",tel);
                            next.putExtra("namaKantor", namaKantor);
                            next.putExtra("gambar", gambar);
                            next.putExtra("desk", desk);
                            next.putExtra("sms",sms);
                            next.putExtra("lat",lat);
                            next.putExtra("lang",lang);
                            next.putExtra("web",web);
                            next.putExtra("mail",mail);
                            startActivity(next);
                        }
                    });

                    ImageView damkar = (ImageView) findViewById(R.id.damkar);
                    damkar.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                            String[] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh", "Jl. T. Hamzah Bendahara Banda Aceh", "Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh"};
                            String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh"};
                            int[] gambar = {R.drawable.a, R.drawable.a, R.drawable.a};
                            String[]sms ={"smsto:085359101995","smsto:085359101948","smsto:085359101996"};
                            String[]mail ={"mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com"};

                            double[] lat = {5.579462, 5.564446, 5.565996};
                            double []lang={95.348918, 95.325893, 95.336772};

                            String []web = {"http://m.detik.com","http://vemale.com","http://okezone.com"};
                            String[]tel = {"tel:085359101995","tel:085359101995","tel:085359101995"};
                            next.putExtra("tel",tel);
                            next.putExtra("namaKantor", namaKantor);
                            next.putExtra("gambar", gambar);
                            next.putExtra("desk", desk);
                            next.putExtra("sms",sms);
                            next.putExtra("lat",lat);
                            next.putExtra("lang",lang);
                            next.putExtra("web",web);
                            next.putExtra("mail",mail);
                            startActivity(next);
                        }
                    });

                    ImageView pmi = (ImageView) findViewById(R.id.pmi);
                    pmi.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                            String[] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh", "Jl. T. Hamzah Bendahara Banda Aceh", "Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh"};
                            String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh"};
                            int[] gambar = {R.drawable.a, R.drawable.a, R.drawable.a};
                            String[]sms ={"smsto:085359101995","smsto:085359101948","smsto:085359101996"};
                            String[]mail ={"mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com"};

                            double[] lat = {5.579462, 5.564446, 5.565996};
                            double []lang={95.348918, 95.325893, 95.336772};

                            String []web = {"http://m.detik.com","http://vemale.com","http://okezone.com"};
                            String[]tel = {"tel:085359101995","tel:085359101995","tel:085359101995"};
                            next.putExtra("tel",tel);
                            next.putExtra("namaKantor", namaKantor);
                            next.putExtra("gambar", gambar);
                            next.putExtra("desk", desk);
                            next.putExtra("sms",sms);
                            next.putExtra("lat",lat);
                            next.putExtra("lang",lang);
                            next.putExtra("web",web);
                            next.putExtra("mail",mail);
                            startActivity(next);
                        }
                    });

                    ImageView pln = (ImageView) findViewById(R.id.pln);
                    pln.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                            String[] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh", "Jl. T. Hamzah Bendahara Banda Aceh", "Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh"};
                            String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh"};
                            int[] gambar = {R.drawable.a, R.drawable.a, R.drawable.a};
                            String[]sms ={"smsto:085359101995","smsto:085359101948","smsto:085359101996"};
                            String[]mail ={"mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com"};

                            double[] lat = {5.579462, 5.564446, 5.565996};
                            double []lang={95.348918, 95.325893, 95.336772};

                            String []web = {"http://m.detik.com","http://vemale.com","http://okezone.com"};
                            String[]tel = {"tel:085359101995","tel:085359101995","tel:085359101995"};
                            next.putExtra("tel",tel);
                            next.putExtra("namaKantor", namaKantor);
                            next.putExtra("gambar", gambar);
                            next.putExtra("desk", desk);
                            next.putExtra("sms",sms);
                            next.putExtra("lat",lat);
                            next.putExtra("lang",lang);
                            next.putExtra("web",web);
                            next.putExtra("mail",mail);
                            startActivity(next);
                        }
                    });

                    ImageView sar = (ImageView) findViewById(R.id.sar);
                    sar.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                            String[] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh", "Jl. T. Hamzah Bendahara Banda Aceh", "Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh"};
                            String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh"};
                            int[] gambar = {R.drawable.a, R.drawable.a, R.drawable.a};
                            String[]sms ={"smsto:085359101995","smsto:085359101948","smsto:085359101996"};
                            String[]mail ={"mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com"};

                            double[] lat = {5.579462, 5.564446, 5.565996};
                            double []lang={95.348918, 95.325893, 95.336772};

                            String []web = {"http://m.detik.com","http://vemale.com","http://okezone.com"};
                            String[]tel = {"tel:085359101995","tel:085359101995","tel:085359101995"};
                            next.putExtra("tel",tel);
                            next.putExtra("namaKantor", namaKantor);
                            next.putExtra("gambar", gambar);
                            next.putExtra("desk", desk);
                            next.putExtra("sms",sms);
                            next.putExtra("lat",lat);
                            next.putExtra("lang",lang);
                            next.putExtra("web",web);
                            next.putExtra("mail",mail);
                            startActivity(next);
                        }
                    });

                    ImageView bpbd = (ImageView) findViewById(R.id.bpbd);
                    bpbd.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                            String[] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh", "Jl. T. Hamzah Bendahara Banda Aceh", "Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh"};
                            String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh"};
                            int[] gambar = {R.drawable.a, R.drawable.a, R.drawable.a};
                            String[]sms ={"smsto:085359101995","smsto:085359101948","smsto:085359101996"};
                            String[]mail ={"mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com"};

                            double[] lat = {5.579462, 5.564446, 5.565996};
                            double []lang={95.348918, 95.325893, 95.336772};

                            String []web = {"http://m.detik.com","http://vemale.com","http://okezone.com"};
                            String[]tel = {"tel:085359101995","tel:085359101995","tel:085359101995"};
                            next.putExtra("tel",tel);
                            next.putExtra("namaKantor", namaKantor);
                            next.putExtra("gambar", gambar);
                            next.putExtra("desk", desk);
                            next.putExtra("sms",sms);
                            next.putExtra("lat",lat);
                            next.putExtra("lang",lang);
                            next.putExtra("web",web);
                            next.putExtra("mail",mail);
                            startActivity(next);
                        }
                    });

                    ImageView ppwh = (ImageView) findViewById(R.id.ppwh);
                    ppwh.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                            String[] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh", "Jl. T. Hamzah Bendahara Banda Aceh", "Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh"};
                            String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh"};
                            int[] gambar = {R.drawable.a, R.drawable.a, R.drawable.a};
                            String[]sms ={"smsto:085359101995","smsto:085359101948","smsto:085359101996"};
                            String[]mail ={"mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com"};

                            double[] lat = {5.579462, 5.564446, 5.565996};
                            double []lang={95.348918, 95.325893, 95.336772};

                            String []web = {"http://m.detik.com","http://vemale.com","http://okezone.com"};
                            String[]tel = {"tel:085359101995","tel:085359101995","tel:085359101995"};
                            next.putExtra("tel",tel);
                            next.putExtra("namaKantor", namaKantor);
                            next.putExtra("gambar", gambar);
                            next.putExtra("desk", desk);
                            next.putExtra("sms",sms);
                            next.putExtra("lat",lat);
                            next.putExtra("lang",lang);
                            next.putExtra("web",web);
                            next.putExtra("mail",mail);
                            startActivity(next);
                        }
                    });

                    ImageView pemerintah = (ImageView) findViewById(R.id.pemerintah);
                    pemerintah.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                            String[] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh", "Jl. T. Hamzah Bendahara Banda Aceh", "Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh"};
                            String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh"};
                            int[] gambar = {R.drawable.a, R.drawable.a, R.drawable.a};
                            String[]sms ={"smsto:085359101995","smsto:085359101948","smsto:085359101996"};
                            String[]mail ={"mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com"};

                            double[] lat = {5.579462, 5.564446, 5.565996};
                            double []lang={95.348918, 95.325893, 95.336772};

                            String []web = {"http://m.detik.com","http://vemale.com","http://okezone.com"};
                            String[]tel = {"tel:085359101995","tel:085359101995","tel:085359101995"};
                            next.putExtra("tel",tel);
                            next.putExtra("namaKantor", namaKantor);
                            next.putExtra("gambar", gambar);
                            next.putExtra("desk", desk);
                            next.putExtra("sms",sms);
                            next.putExtra("lat",lat);
                            next.putExtra("lang",lang);
                            next.putExtra("web",web);
                            next.putExtra("mail",mail);
                            startActivity(next);
                        }
                    });
                }

                else if (kabkot==2){ //Sabang

                    ImageView rumahSakit = (ImageView) findViewById(R.id.rumahSakit);
                    rumahSakit.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                            String[] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh", "Jl. T. Hamzah Bendahara Banda Aceh", "Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh"};
                            String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh"};
                            int[] gambar = {R.drawable.a, R.drawable.a, R.drawable.a};
                            String[]sms ={"smsto:085359101995","smsto:085359101948","smsto:085359101996"};
                            String[]mail ={"mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com"};

                            double[] lat = {5.579462, 5.564446, 5.565996};
                            double []lang={95.348918, 95.325893, 95.336772};

                            String []web = {"http://m.detik.com","http://vemale.com","http://okezone.com"};
                            String[]tel = {"tel:085359101995","tel:085359101995","tel:085359101995"};
                            next.putExtra("tel",tel);
                            next.putExtra("namaKantor", namaKantor);
                            next.putExtra("gambar", gambar);
                            next.putExtra("desk", desk);
                            next.putExtra("sms",sms);
                            next.putExtra("lat",lat);
                            next.putExtra("lang",lang);
                            next.putExtra("web",web);
                            next.putExtra("mail",mail);
                            startActivity(next);

                        }
                    });

                    ImageView kantorPolisi = (ImageView) findViewById(R.id.kantorPolisi);
                    kantorPolisi.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                            String[] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh", "Jl. T. Hamzah Bendahara Banda Aceh", "Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh"};
                            String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh"};
                            int[] gambar = {R.drawable.a, R.drawable.a, R.drawable.a};
                            String[]sms ={"smsto:085359101995","smsto:085359101948","smsto:085359101996"};
                            String[]mail ={"mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com"};

                            double[] lat = {5.579462, 5.564446, 5.565996};
                            double []lang={95.348918, 95.325893, 95.336772};

                            String []web = {"http://m.detik.com","http://vemale.com","http://okezone.com"};
                            String[]tel = {"tel:085359101995","tel:085359101995","tel:085359101995"};
                            next.putExtra("tel",tel);
                            next.putExtra("namaKantor", namaKantor);
                            next.putExtra("gambar", gambar);
                            next.putExtra("desk", desk);
                            next.putExtra("sms",sms);
                            next.putExtra("lat",lat);
                            next.putExtra("lang",lang);
                            next.putExtra("web",web);
                            next.putExtra("mail",mail);
                            startActivity(next);
                        }
                    });

                    ImageView damkar = (ImageView) findViewById(R.id.damkar);
                    damkar.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                            String[] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh", "Jl. T. Hamzah Bendahara Banda Aceh", "Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh"};
                            String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh"};
                            int[] gambar = {R.drawable.a, R.drawable.a, R.drawable.a};
                            String[]sms ={"smsto:085359101995","smsto:085359101948","smsto:085359101996"};
                            String[]mail ={"mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com"};

                            double[] lat = {5.579462, 5.564446, 5.565996};
                            double []lang={95.348918, 95.325893, 95.336772};

                            String []web = {"http://m.detik.com","http://vemale.com","http://okezone.com"};
                            String[]tel = {"tel:085359101995","tel:085359101995","tel:085359101995"};
                            next.putExtra("tel",tel);
                            next.putExtra("namaKantor", namaKantor);
                            next.putExtra("gambar", gambar);
                            next.putExtra("desk", desk);
                            next.putExtra("sms",sms);
                            next.putExtra("lat",lat);
                            next.putExtra("lang",lang);
                            next.putExtra("web",web);
                            next.putExtra("mail",mail);
                            startActivity(next);
                        }
                    });

                    ImageView pmi = (ImageView) findViewById(R.id.pmi);
                    pmi.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                            String[] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh", "Jl. T. Hamzah Bendahara Banda Aceh", "Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh"};
                            String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh"};
                            int[] gambar = {R.drawable.a, R.drawable.a, R.drawable.a};
                            String[]sms ={"smsto:085359101995","smsto:085359101948","smsto:085359101996"};
                            String[]mail ={"mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com"};

                            double[] lat = {5.579462, 5.564446, 5.565996};
                            double []lang={95.348918, 95.325893, 95.336772};

                            String []web = {"http://m.detik.com","http://vemale.com","http://okezone.com"};
                            String[]tel = {"tel:085359101995","tel:085359101995","tel:085359101995"};
                            next.putExtra("tel",tel);
                            next.putExtra("namaKantor", namaKantor);
                            next.putExtra("gambar", gambar);
                            next.putExtra("desk", desk);
                            next.putExtra("sms",sms);
                            next.putExtra("lat",lat);
                            next.putExtra("lang",lang);
                            next.putExtra("web",web);
                            next.putExtra("mail",mail);
                            startActivity(next);
                        }
                    });

                    ImageView pln = (ImageView) findViewById(R.id.pln);
                    pln.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                            String[] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh", "Jl. T. Hamzah Bendahara Banda Aceh", "Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh"};
                            String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh"};
                            int[] gambar = {R.drawable.a, R.drawable.a, R.drawable.a};
                            String[]sms ={"smsto:085359101995","smsto:085359101948","smsto:085359101996"};
                            String[]mail ={"mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com"};

                            double[] lat = {5.579462, 5.564446, 5.565996};
                            double []lang={95.348918, 95.325893, 95.336772};

                            String []web = {"http://m.detik.com","http://vemale.com","http://okezone.com"};
                            String[]tel = {"tel:085359101995","tel:085359101995","tel:085359101995"};
                            next.putExtra("tel",tel);
                            next.putExtra("namaKantor", namaKantor);
                            next.putExtra("gambar", gambar);
                            next.putExtra("desk", desk);
                            next.putExtra("sms",sms);
                            next.putExtra("lat",lat);
                            next.putExtra("lang",lang);
                            next.putExtra("web",web);
                            next.putExtra("mail",mail);
                            startActivity(next);
                        }
                    });

                    ImageView sar = (ImageView) findViewById(R.id.sar);
                    sar.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                            String[] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh", "Jl. T. Hamzah Bendahara Banda Aceh", "Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh"};
                            String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh"};
                            int[] gambar = {R.drawable.a, R.drawable.a, R.drawable.a};
                            String[]sms ={"smsto:085359101995","smsto:085359101948","smsto:085359101996"};
                            String[]mail ={"mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com"};

                            double[] lat = {5.579462, 5.564446, 5.565996};
                            double []lang={95.348918, 95.325893, 95.336772};

                            String []web = {"http://m.detik.com","http://vemale.com","http://okezone.com"};
                            String[]tel = {"tel:085359101995","tel:085359101995","tel:085359101995"};
                            next.putExtra("tel",tel);
                            next.putExtra("namaKantor", namaKantor);
                            next.putExtra("gambar", gambar);
                            next.putExtra("desk", desk);
                            next.putExtra("sms",sms);
                            next.putExtra("lat",lat);
                            next.putExtra("lang",lang);
                            next.putExtra("web",web);
                            next.putExtra("mail",mail);
                            startActivity(next);
                        }
                    });

                    ImageView bpbd = (ImageView) findViewById(R.id.bpbd);
                    bpbd.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                            String[] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh", "Jl. T. Hamzah Bendahara Banda Aceh", "Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh"};
                            String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh"};
                            int[] gambar = {R.drawable.a, R.drawable.a, R.drawable.a};
                            String[]sms ={"smsto:085359101995","smsto:085359101948","smsto:085359101996"};
                            String[]mail ={"mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com"};

                            double[] lat = {5.579462, 5.564446, 5.565996};
                            double []lang={95.348918, 95.325893, 95.336772};

                            String []web = {"http://m.detik.com","http://vemale.com","http://okezone.com"};
                            String[]tel = {"tel:085359101995","tel:085359101995","tel:085359101995"};
                            next.putExtra("tel",tel);
                            next.putExtra("namaKantor", namaKantor);
                            next.putExtra("gambar", gambar);
                            next.putExtra("desk", desk);
                            next.putExtra("sms",sms);
                            next.putExtra("lat",lat);
                            next.putExtra("lang",lang);
                            next.putExtra("web",web);
                            next.putExtra("mail",mail);
                            startActivity(next);
                        }
                    });

                    ImageView ppwh = (ImageView) findViewById(R.id.ppwh);
                    ppwh.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                            String[] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh", "Jl. T. Hamzah Bendahara Banda Aceh", "Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh"};
                            String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh"};
                            int[] gambar = {R.drawable.a, R.drawable.a, R.drawable.a};
                            String[]sms ={"smsto:085359101995","smsto:085359101948","smsto:085359101996"};
                            String[]mail ={"mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com"};

                            double[] lat = {5.579462, 5.564446, 5.565996};
                            double []lang={95.348918, 95.325893, 95.336772};

                            String []web = {"http://m.detik.com","http://vemale.com","http://okezone.com"};
                            String[]tel = {"tel:085359101995","tel:085359101995","tel:085359101995"};
                            next.putExtra("tel",tel);
                            next.putExtra("namaKantor", namaKantor);
                            next.putExtra("gambar", gambar);
                            next.putExtra("desk", desk);
                            next.putExtra("sms",sms);
                            next.putExtra("lat",lat);
                            next.putExtra("lang",lang);
                            next.putExtra("web",web);
                            next.putExtra("mail",mail);
                            startActivity(next);
                        }
                    });

                    ImageView pemerintah = (ImageView) findViewById(R.id.pemerintah);
                    pemerintah.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                            String[] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh", "Jl. T. Hamzah Bendahara Banda Aceh", "Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh"};
                            String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh"};
                            int[] gambar = {R.drawable.a, R.drawable.a, R.drawable.a};
                            String[]sms ={"smsto:085359101995","smsto:085359101948","smsto:085359101996"};
                            String[]mail ={"mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com"};

                            double[] lat = {5.579462, 5.564446, 5.565996};
                            double []lang={95.348918, 95.325893, 95.336772};

                            String []web = {"http://m.detik.com","http://vemale.com","http://okezone.com"};
                            String[]tel = {"tel:085359101995","tel:085359101995","tel:085359101995"};
                            next.putExtra("tel",tel);
                            next.putExtra("namaKantor", namaKantor);
                            next.putExtra("gambar", gambar);
                            next.putExtra("desk", desk);
                            next.putExtra("sms",sms);
                            next.putExtra("lat",lat);
                            next.putExtra("lang",lang);
                            next.putExtra("web",web);
                            next.putExtra("mail",mail);
                            startActivity(next);
                        }
                    });
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

                ImageView rumahSakit = (ImageView) findViewById(R.id.rumahSakit);
                rumahSakit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                        String[] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh", "Jl. T. Hamzah Bendahara Banda Aceh", "Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh"};
                        String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh"};
                        int[] gambar = {R.drawable.a, R.drawable.a, R.drawable.a};
                        String[]sms ={"smsto:085359101995","smsto:085359101948","smsto:085359101996"};
                        String[]mail ={"mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com"};

                        double[] lat = {5.579462, 5.564446, 5.565996};
                        double []lang={95.348918, 95.325893, 95.336772};

                        String []web = {"http://m.detik.com","http://vemale.com","http://okezone.com"};
                        String[]tel = {"tel:085359101995","tel:085359101995","tel:085359101995"};
                        next.putExtra("tel",tel);
                        next.putExtra("namaKantor", namaKantor);
                        next.putExtra("gambar", gambar);
                        next.putExtra("desk", desk);
                        next.putExtra("sms",sms);
                        next.putExtra("lat",lat);
                        next.putExtra("lang",lang);
                        next.putExtra("web",web);
                        next.putExtra("mail",mail);
                        startActivity(next);

                    }
                });

                ImageView kantorPolisi = (ImageView) findViewById(R.id.kantorPolisi);
                kantorPolisi.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                        String[] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh", "Jl. T. Hamzah Bendahara Banda Aceh", "Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh"};
                        String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh"};
                        int[] gambar = {R.drawable.a, R.drawable.a, R.drawable.a};
                        String[]sms ={"smsto:085359101995","smsto:085359101948","smsto:085359101996"};
                        String[]mail ={"mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com"};

                        double[] lat = {5.579462, 5.564446, 5.565996};
                        double []lang={95.348918, 95.325893, 95.336772};

                        String []web = {"http://m.detik.com","http://vemale.com","http://okezone.com"};
                        String[]tel = {"tel:085359101995","tel:085359101995","tel:085359101995"};
                        next.putExtra("tel",tel);
                        next.putExtra("namaKantor", namaKantor);
                        next.putExtra("gambar", gambar);
                        next.putExtra("desk", desk);
                        next.putExtra("sms",sms);
                        next.putExtra("lat",lat);
                        next.putExtra("lang",lang);
                        next.putExtra("web",web);
                        next.putExtra("mail",mail);
                        startActivity(next);
                    }
                });

                ImageView damkar = (ImageView) findViewById(R.id.damkar);
                damkar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                        String[] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh", "Jl. T. Hamzah Bendahara Banda Aceh", "Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh"};
                        String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh"};
                        int[] gambar = {R.drawable.a, R.drawable.a, R.drawable.a};
                        String[]sms ={"smsto:085359101995","smsto:085359101948","smsto:085359101996"};
                        String[]mail ={"mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com"};

                        double[] lat = {5.579462, 5.564446, 5.565996};
                        double []lang={95.348918, 95.325893, 95.336772};

                        String []web = {"http://m.detik.com","http://vemale.com","http://okezone.com"};
                        String[]tel = {"tel:085359101995","tel:085359101995","tel:085359101995"};
                        next.putExtra("tel",tel);
                        next.putExtra("namaKantor", namaKantor);
                        next.putExtra("gambar", gambar);
                        next.putExtra("desk", desk);
                        next.putExtra("sms",sms);
                        next.putExtra("lat",lat);
                        next.putExtra("lang",lang);
                        next.putExtra("web",web);
                        next.putExtra("mail",mail);
                        startActivity(next);
                    }
                });

                ImageView pmi = (ImageView) findViewById(R.id.pmi);
                pmi.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                        String[] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh", "Jl. T. Hamzah Bendahara Banda Aceh", "Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh"};
                        String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh"};
                        int[] gambar = {R.drawable.a, R.drawable.a, R.drawable.a};
                        String[]sms ={"smsto:085359101995","smsto:085359101948","smsto:085359101996"};
                        String[]mail ={"mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com"};

                        double[] lat = {5.579462, 5.564446, 5.565996};
                        double []lang={95.348918, 95.325893, 95.336772};

                        String []web = {"http://m.detik.com","http://vemale.com","http://okezone.com"};
                        String[]tel = {"tel:085359101995","tel:085359101995","tel:085359101995"};
                        next.putExtra("tel",tel);
                        next.putExtra("namaKantor", namaKantor);
                        next.putExtra("gambar", gambar);
                        next.putExtra("desk", desk);
                        next.putExtra("sms",sms);
                        next.putExtra("lat",lat);
                        next.putExtra("lang",lang);
                        next.putExtra("web",web);
                        next.putExtra("mail",mail);
                        startActivity(next);
                    }
                });

                ImageView pln = (ImageView) findViewById(R.id.pln);
                pln.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                        String[] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh", "Jl. T. Hamzah Bendahara Banda Aceh", "Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh"};
                        String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh"};
                        int[] gambar = {R.drawable.a, R.drawable.a, R.drawable.a};
                        String[]sms ={"smsto:085359101995","smsto:085359101948","smsto:085359101996"};
                        String[]mail ={"mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com"};

                        double[] lat = {5.579462, 5.564446, 5.565996};
                        double []lang={95.348918, 95.325893, 95.336772};

                        String []web = {"http://m.detik.com","http://vemale.com","http://okezone.com"};
                        String[]tel = {"tel:085359101995","tel:085359101995","tel:085359101995"};
                        next.putExtra("tel",tel);
                        next.putExtra("namaKantor", namaKantor);
                        next.putExtra("gambar", gambar);
                        next.putExtra("desk", desk);
                        next.putExtra("sms",sms);
                        next.putExtra("lat",lat);
                        next.putExtra("lang",lang);
                        next.putExtra("web",web);
                        next.putExtra("mail",mail);
                        startActivity(next);
                    }
                });

                ImageView sar = (ImageView) findViewById(R.id.sar);
                sar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                        String[] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh", "Jl. T. Hamzah Bendahara Banda Aceh", "Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh"};
                        String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh"};
                        int[] gambar = {R.drawable.a, R.drawable.a, R.drawable.a};
                        String[]sms ={"smsto:085359101995","smsto:085359101948","smsto:085359101996"};
                        String[]mail ={"mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com"};

                        double[] lat = {5.579462, 5.564446, 5.565996};
                        double []lang={95.348918, 95.325893, 95.336772};

                        String []web = {"http://m.detik.com","http://vemale.com","http://okezone.com"};
                        String[]tel = {"tel:085359101995","tel:085359101995","tel:085359101995"};
                        next.putExtra("tel",tel);
                        next.putExtra("namaKantor", namaKantor);
                        next.putExtra("gambar", gambar);
                        next.putExtra("desk", desk);
                        next.putExtra("sms",sms);
                        next.putExtra("lat",lat);
                        next.putExtra("lang",lang);
                        next.putExtra("web",web);
                        next.putExtra("mail",mail);
                        startActivity(next);
                    }
                });

                ImageView bpbd = (ImageView) findViewById(R.id.bpbd);
                bpbd.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                        String[] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh", "Jl. T. Hamzah Bendahara Banda Aceh", "Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh"};
                        String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh"};
                        int[] gambar = {R.drawable.a, R.drawable.a, R.drawable.a};
                        String[]sms ={"smsto:085359101995","smsto:085359101948","smsto:085359101996"};
                        String[]mail ={"mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com"};

                        double[] lat = {5.579462, 5.564446, 5.565996};
                        double []lang={95.348918, 95.325893, 95.336772};

                        String []web = {"http://m.detik.com","http://vemale.com","http://okezone.com"};
                        String[]tel = {"tel:085359101995","tel:085359101995","tel:085359101995"};
                        next.putExtra("tel",tel);
                        next.putExtra("namaKantor", namaKantor);
                        next.putExtra("gambar", gambar);
                        next.putExtra("desk", desk);
                        next.putExtra("sms",sms);
                        next.putExtra("lat",lat);
                        next.putExtra("lang",lang);
                        next.putExtra("web",web);
                        next.putExtra("mail",mail);
                        startActivity(next);
                    }
                });

                ImageView ppwh = (ImageView) findViewById(R.id.ppwh);
                ppwh.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                        String[] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh", "Jl. T. Hamzah Bendahara Banda Aceh", "Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh"};
                        String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh"};
                        int[] gambar = {R.drawable.a, R.drawable.a, R.drawable.a};
                        String[]sms ={"smsto:085359101995","smsto:085359101948","smsto:085359101996"};
                        String[]mail ={"mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com"};

                        double[] lat = {5.579462, 5.564446, 5.565996};
                        double []lang={95.348918, 95.325893, 95.336772};

                        String []web = {"http://m.detik.com","http://vemale.com","http://okezone.com"};
                        String[]tel = {"tel:085359101995","tel:085359101995","tel:085359101995"};
                        next.putExtra("tel",tel);
                        next.putExtra("namaKantor", namaKantor);
                        next.putExtra("gambar", gambar);
                        next.putExtra("desk", desk);
                        next.putExtra("sms",sms);
                        next.putExtra("lat",lat);
                        next.putExtra("lang",lang);
                        next.putExtra("web",web);
                        next.putExtra("mail",mail);
                        startActivity(next);
                    }
                });

                ImageView pemerintah = (ImageView) findViewById(R.id.pemerintah);
                pemerintah.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent next = new Intent(getApplicationContext(), KantorActivity.class);
                        String[] desk = {"Jl. Tgk Daud Beureueh, NO. 108 B. Aceh", "Jl. T. Hamzah Bendahara Banda Aceh", "Jl. Dr.T.Syarief Thayeb,No.25 Banda Aceh"};
                        String[] namaKantor = {"RSU Dr. Zainoel Abidin", "Rumkit Tk II Iskandar Muda Banda Aceh", "RS Jiwa Banda Aceh"};
                        int[] gambar = {R.drawable.a, R.drawable.a, R.drawable.a};
                        String[]sms ={"smsto:085359101995","smsto:085359101948","smsto:085359101996"};
                        String[]mail ={"mailto:dsyech@gmail.com","mailto:dsyech@gmail.com","mailto:dsyech@gmail.com"};

                        double[] lat = {5.579462, 5.564446, 5.565996};
                        double []lang={95.348918, 95.325893, 95.336772};

                        String []web = {"http://m.detik.com","http://vemale.com","http://okezone.com"};

                        String[]tel = {"tel:085359101995","tel:085359101995","tel:085359101995"};
                        next.putExtra("tel",tel);
                        next.putExtra("namaKantor", namaKantor);
                        next.putExtra("gambar", gambar);
                        next.putExtra("desk", desk);
                        next.putExtra("sms",sms);
                        next.putExtra("lat",lat);
                        next.putExtra("lang",lang);
                        next.putExtra("web",web);
                        next.putExtra("mail",mail);

                        startActivity(next);
                    }
                });
            }
        });
    }
}
