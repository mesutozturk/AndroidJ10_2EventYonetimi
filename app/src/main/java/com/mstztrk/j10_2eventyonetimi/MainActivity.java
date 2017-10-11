package com.mstztrk.j10_2eventyonetimi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.txtMesaj)
    TextView txtMesaj;
    @BindView(R.id.btn1)
    Button btn1;
    @BindView(R.id.btn2)
    Button btn2;
    @BindView(R.id.btn3)
    Button btn3;

    @OnClick(R.id.btn1)
    public void btn1Click() {
        Toast.makeText(this, "Ben buton 1'im", Toast.LENGTH_SHORT).show();
        txtMesaj.setText("ButterKnife");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        /*txtMesaj = (TextView) findViewById(R.id.txtMesaj);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);

        btn2.setOnClickListener(this);*/
        /*btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtMesaj.setText("Btn1'e basıldı");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtMesaj.setText("Btn2'e basıldı");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtMesaj.setText("Btn3'e basıldı");
            }
        });*/
    }

    public void btnClick(View view) {
        int id = view.getId();
        /*switch (id) {
            case R.id.btn1:
                txtMesaj.setText("Btn1'e basıldı");
                break;
            case R.id.btn2:
                txtMesaj.setText("Btn2'e basıldı");
                break;
            default:
                txtMesaj.setText("Btn3'e basıldı");
                break;
        }*/
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.btn1:
                txtMesaj.setText("Btn1'e basıldı");
                break;
            case R.id.btn2:
                txtMesaj.setText("Btn2'e basıldı");
                break;
            default:
                txtMesaj.setText("Btn3'e basıldı");
                break;
        }
    }
}
