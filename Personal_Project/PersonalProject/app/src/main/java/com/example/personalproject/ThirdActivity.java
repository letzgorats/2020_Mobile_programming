package com.example.personalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.nio.charset.MalformedInputException;

import static java.lang.String.valueOf;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);


        final TextView product1 = findViewById(R.id.product1);
        final TextView price1 = findViewById(R.id.price1);
        final TextView product2 = findViewById(R.id.product2);
        final TextView price2 = findViewById(R.id.price2);
        final TextView product3 = findViewById(R.id.product3);
        final TextView price3 = findViewById(R.id.price3);
        final TextView product4 = findViewById(R.id.product4);
        final TextView price4 = findViewById(R.id.price4);
        final TextView product5 = findViewById(R.id.product5);
        final TextView price5 = findViewById(R.id.price5);



        Intent product_intent6 = getIntent();

        String sangpoom1 = product_intent6.getStringExtra("상품명1");
        product1.setText(sangpoom1);

        String priceA="";
        priceA = product_intent6.getStringExtra("가격1");


        String sangpoom2 = product_intent6.getStringExtra("상품명2");
        product2.setText(sangpoom2);

        String priceB="";
        priceB = product_intent6.getStringExtra("가격2");


        String sangpoom3 = product_intent6.getStringExtra("상품명3");
        product3.setText(sangpoom3);

        String priceC="";
        priceC = product_intent6.getStringExtra("가격3");



        String sangpoom4 = product_intent6.getStringExtra("상품명4");
        product4.setText(sangpoom4);

        String priceD="";
        priceD = product_intent6.getStringExtra("가격4");;


        String sangpoom5 = product_intent6.getStringExtra("상품명5");
        product5.setText(sangpoom5);

        String priceE="";
        priceE = product_intent6.getStringExtra("가격5");;


        final TextView totalprice = findViewById(R.id.totalprice);
        int Totalprice =0;

        final TextView[] pricelist = new TextView[5];  // 가격표 텍스트뷰
        pricelist[0]=price1;pricelist[1]=price2;
        pricelist[2]=price3;pricelist[3]=price4;pricelist[4]=price5;

        String[] pricearray = new String[5];      // intent 로 받아온 price들
        pricearray[0]=priceA; pricearray[1]=priceB;
        pricearray[2]=priceC; pricearray[3]=priceD; pricearray[4]=priceE;


        for(int i=0;i<5;i++){
            if(pricearray[i]==null){    // 가격표를 intent 로 받아오지 않았다면
                Totalprice+=0;         // 그 값은 당연히 0
                pricelist[i].setVisibility(View.INVISIBLE); // 그리고 출력도 안한다.("null원" 등의 출력을 막아준다.)
            }
            else{    // 가격표를 받아왔다면
                Totalprice+=Integer.parseInt(pricearray[i]);   // 그대로 Totalprice에 값을 더해준다.
                pricelist[i].setText(pricearray[i]+"원");   // 출력은 '원'을 붙여서 해준다.
            }
        }

        totalprice.setText(String.valueOf(Totalprice)+"원");

        Button gotourl = findViewById(R.id.gotourl);
        gotourl.setOnClickListener(new View.OnClickListener() {   // 보타닉스페이스  스마트스토어에 접속
            @Override
            public void onClick(View v) {    //URL 버튼을 클릭시
                Toast toastview = Toast.makeText(getApplicationContext(), "보타닉 스페이스 URL 로 이동합니다.", Toast.LENGTH_LONG);
                toastview.show();
                Intent botanicUrl = new Intent(Intent.ACTION_VIEW, Uri.parse("http://smartstore.naver.com/botanikspace"));
                startActivity(botanicUrl);
            }
        });

        Button purchasebutton = findViewById(R.id.purchasebutton);
        purchasebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){  // 결제버튼 클릭시
                Toast toastView = Toast.makeText(getApplicationContext(), "구매 완료 하였습니다^____^", Toast.LENGTH_LONG);
                toastView.show();
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);//// Closing all the Activities, clear the back stack.
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }

            });
        }
    }

