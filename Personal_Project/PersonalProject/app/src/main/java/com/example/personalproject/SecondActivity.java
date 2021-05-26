package com.example.personalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private boolean[] deletecheck = new boolean[5];  // 삭제 check 여부
    private TextView[] shoppingcart1 = new TextView[5];  // 상품이름

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        deletecheck[0]=deletecheck[1]=deletecheck[2]=deletecheck[3]=deletecheck[4]=false;
        shoppingcart1[0]=findViewById(R.id.product1);
        shoppingcart1[1]=findViewById(R.id.product2);
        shoppingcart1[2]=findViewById(R.id.product3);
        shoppingcart1[3]=findViewById(R.id.product4);
        shoppingcart1[4]=findViewById(R.id.product5);

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


        final CheckBox check1 = (CheckBox) findViewById(R.id.checkBox1) ;
        final CheckBox check2 = (CheckBox) findViewById(R.id.checkBox2) ;
        final CheckBox check3 = (CheckBox) findViewById(R.id.checkBox3) ;
        final CheckBox check4 = (CheckBox) findViewById(R.id.checkBox4) ;
        final CheckBox check5 = (CheckBox) findViewById(R.id.checkBox5) ;


        Intent product_intent = getIntent();

        String sangpoom1 = product_intent.getStringExtra("상품명1");
        product1.setText(sangpoom1);

        String priceA="";
        priceA = product_intent.getStringExtra("가격1");


        String sangpoom2 = product_intent.getStringExtra("상품명2");
        product2.setText(sangpoom2);

        String priceB="";
        priceB = product_intent.getStringExtra("가격2");


        String sangpoom3 = product_intent.getStringExtra("상품명3");
        product3.setText(sangpoom3);

        String priceC="";
        priceC = product_intent.getStringExtra("가격3");

        String sangpoom4 = product_intent.getStringExtra("상품명4");
        product4.setText(sangpoom4);

        String priceD="";
        priceD = product_intent.getStringExtra("가격4");;


        String sangpoom5 = product_intent.getStringExtra("상품명5");
        product5.setText(sangpoom5);

        String priceE="";
        priceE = product_intent.getStringExtra("가격5");;


        final TextView[] pricelist = new TextView[5];  // 가격표 텍스트뷰
        pricelist[0]=price1;pricelist[1]=price2;
        pricelist[2]=price3;pricelist[3]=price4;pricelist[4]=price5;

        String[] pricearray = new String[5];      // intent 로 받아온 price들
        pricearray[0]=priceA; pricearray[1]=priceB;
        pricearray[2]=priceC; pricearray[3]=priceD; pricearray[4]=priceE;


        for(int i=0;i<5;i++){
            if(pricearray[i]==null){    // 가격표를 intent 로 받아오지 않았다면
                pricelist[i].setVisibility(View.VISIBLE); // Visible로 해준다. 여기서 중요한 점은
                                                            // 애초에 priceTextView 를 아무런 text 가 안쳐진 invisibleTestView
                                                            // 였기 때문에 이를 VISIBLE 로 바꿔주면 빈 텍스트뷰가 보이게 되는 것이다.
            }
            else{    // 가격표를 받아왔다면
                pricelist[i].setText(pricearray[i]+"원");   // 출력은 '원'을 붙여서 해준다.
            }
        }
        final Button itemselectbutton = findViewById(R.id.itemselect);
        itemselectbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(product1.length()!=0){
                    check1.setVisibility(View.VISIBLE);
                }
                if(product2.length()!=0){
                    check2.setVisibility(View.VISIBLE);
                }
                if(product3.length()!=0){
                    check3.setVisibility(View.VISIBLE);
                }
                if(product4.length()!=0){
                    check4.setVisibility(View.VISIBLE);
                }if(product5.length()!=0){
                    check5.setVisibility(View.VISIBLE);
                }
            }
        });


        Button gotopurchasepage =findViewById(R.id.gotopurchasepage);
        gotopurchasepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check1.isChecked()==true && check2.isChecked()==false && check3.isChecked()==false && check4.isChecked()==false
                        && check5.isChecked()== false ){ //1
                    Toast toastView = Toast.makeText(getApplicationContext(),"네오182 Scalp 트러블 에센스'를 " +
                            "구매합니다.",Toast.LENGTH_LONG);
                    toastView.show();
                    Intent intent1 = new Intent(getApplicationContext(), ThirdActivity.class);

                    intent1.putExtra("상품명1","네오182 Scalp 트러블 에센스");
                    intent1.putExtra("가격1","78000");

                    startActivity(intent1);
                }
                else if(check1.isChecked()==false && check2.isChecked()==true && check3.isChecked()==false && check4.isChecked()==false
                        && check5.isChecked()== false ){//2
                    Toast toastView = Toast.makeText(getApplicationContext(),"프로메코 아토풀 마스크 폼팩'을 " +
                            "구매합니다.",Toast.LENGTH_LONG);
                    toastView.show();
                    Intent intent2 = new Intent(getApplicationContext(), ThirdActivity.class);

                    intent2.putExtra("상품명2","프로메코 아토풀 마스크 폼팩");
                    intent2.putExtra("가격2","38000");

                    startActivity(intent2);

                }
                else if(check1.isChecked()==false && check2.isChecked()==false && check3.isChecked()==true && check4.isChecked()==false
                        && check5.isChecked()== false ){//3
                    Toast toastView = Toast.makeText(getApplicationContext(),"아토풀 크림(자연유래 + 고보습)을 " +
                            "구매합니다.",Toast.LENGTH_LONG);
                    toastView.show();
                    Intent intent3 = new Intent(getApplicationContext(), ThirdActivity.class);

                    intent3.putExtra("상품명3","아토풀 크림(자연유래 + 고보습)");
                    intent3.putExtra("가격3","48000");

                    startActivity(intent3);

                }
                else if(check1.isChecked()==false && check2.isChecked()==false && check3.isChecked()==false && check4.isChecked()==true
                        && check5.isChecked()== false ){//4
                    Toast toastView = Toast.makeText(getApplicationContext(),"상품명 :프로메코 네오 491 세럼을 " +
                            "구매합니다.",Toast.LENGTH_LONG);
                    toastView.show();
                    Intent intent4 = new Intent(getApplicationContext(), ThirdActivity.class);

                    intent4.putExtra("상품명4","프로메코 네오 491 세럼");
                    intent4.putExtra("가격4","48000");

                    startActivity(intent4);

                }
                else if(check1.isChecked()==false && check2.isChecked()==false && check3.isChecked()==false && check4.isChecked()==false
                        &&check5.isChecked()==true){//5
                    Toast toastView = Toast.makeText(getApplicationContext(),"상품명 :프로메코 네오 9 비누 아로마 테라피를 " +
                            "구매합니다.",Toast.LENGTH_LONG);
                    toastView.show();
                    Intent intent5 = new Intent(getApplicationContext(), ThirdActivity.class);

                    intent5.putExtra("상품명5","프로메코 네오 9 비누 아로마 테라피");
                    intent5.putExtra("가격5","20000");

                    startActivity(intent5);
                }
                else if(check1.isChecked()==true && check2.isChecked()==true && check3.isChecked()==false && check4.isChecked()==false
                        &&check5.isChecked()==false){//1,2
                    Toast toastView = Toast.makeText(getApplicationContext(),"네오182 Scalp 트러블 에센스'와 " +
                            "프로메코 아토풀 마스크 폼팩'을 구매합니다. ",Toast.LENGTH_LONG);
                    toastView.show();
                    Intent intent6 = new Intent(getApplicationContext(), ThirdActivity.class);

                    intent6.putExtra("상품명1","네오182 Scalp 트러블 에센스");
                    intent6.putExtra("가격1","78000");
                    intent6.putExtra("상품명2","프로메코 아토풀 마스크 폼팩");
                    intent6.putExtra("가격2","38000");

                    startActivity(intent6);
                }
                else if(check1.isChecked()==true && check2.isChecked()==false && check3.isChecked()==true && check4.isChecked()==false
                        &&check5.isChecked()==false){//1,3
                    Toast toastView = Toast.makeText(getApplicationContext(),"네오182 Scalp 트러블 에센스'와 " +
                            "아토풀 크림(자연유래 + 고보습)'을 구매합니다.",Toast.LENGTH_LONG);
                    toastView.show();
                    Intent intent7 = new Intent(getApplicationContext(), ThirdActivity.class);

                    intent7.putExtra("상품명1","네오182 Scalp 트러블 에센스");
                    intent7.putExtra("가격1","78000");
                    intent7.putExtra("상품명3","아토풀 크림(자연유래 + 고보습)");
                    intent7.putExtra("가격3","48000");

                    startActivity(intent7);

                }
                else if(check1.isChecked()==true && check2.isChecked()==false && check3.isChecked()==false && check4.isChecked()==true
                        &&check5.isChecked()==false){//1,4
                    Toast toastView = Toast.makeText(getApplicationContext(),"네오182 Scalp 트러블 에센스'와 " +
                            "프로메코 네오 491 세럼'을 구매합니다.",Toast.LENGTH_LONG);
                    toastView.show();
                    Intent intent8 = new Intent(getApplicationContext(), ThirdActivity.class);

                    intent8.putExtra("상품명1","네오182 Scalp 트러블 에센스");
                    intent8.putExtra("가격1","78000");
                    intent8.putExtra("상품명4","프로메코 네오 491 세럼");
                    intent8.putExtra("가격4","168000");

                    startActivity(intent8);

                }
                else if(check1.isChecked()==true && check2.isChecked()==false && check3.isChecked()==false && check4.isChecked()==false
                        &&check5.isChecked()==true){//1,5
                    Toast toastView = Toast.makeText(getApplicationContext(),"네오182 Scalp 트러블 에센스'와 " +
                            "프로메코 네오 9 비누 아로마 테라피'를 구매합니다.",Toast.LENGTH_LONG);
                    toastView.show();
                    Intent intent9 = new Intent(getApplicationContext(), ThirdActivity.class);

                    intent9.putExtra("상품명1","네오182 Scalp 트러블 에센스");
                    intent9.putExtra("가격1","78000");
                    intent9.putExtra("상품명5","프로메코 네오 9 비누 아로마 테라피");
                    intent9.putExtra("가격5","20000");

                    startActivity(intent9);
                }
                else if(check1.isChecked()==false && check2.isChecked()==true && check3.isChecked()==true && check4.isChecked()==false
                        &&check5.isChecked()==false){//2,3
                    Toast toastView = Toast.makeText(getApplicationContext(),"프로메코 아토풀 마스크 폼팩'과 " +
                            "아토풀 크림(자연유래 + 고보습)'을 구매합니다.",Toast.LENGTH_LONG);
                    toastView.show();
                    Intent intent10 = new Intent(getApplicationContext(), ThirdActivity.class);

                    intent10.putExtra("상품명2","프로메코 아토풀 마스크 폼팩");
                    intent10.putExtra("가격2","38000");
                    intent10.putExtra("상품명3","아토풀 크림(자연유래 + 고보습)");
                    intent10.putExtra("가격3","48000");

                    startActivity(intent10);
                }
                else if(check1.isChecked()==false && check2.isChecked()==true && check3.isChecked()==false && check4.isChecked()==true
                        &&check5.isChecked()==false){//2,4
                    Toast toastView = Toast.makeText(getApplicationContext(),"프로메코 아토풀 마스크 폼팩'과 " +
                            "프로메코 네오 491 세럼'을 구매합니다.",Toast.LENGTH_LONG);
                    toastView.show();
                    Intent intent11 = new Intent(getApplicationContext(), ThirdActivity.class);

                    intent11.putExtra("상품명2","프로메코 아토풀 마스크 폼팩");
                    intent11.putExtra("가격2","38000");
                    intent11.putExtra("상품명4","프로메코 네오 491 세럼");
                    intent11.putExtra("가격4","168000");

                    startActivity(intent11);
                }
                else if(check1.isChecked()==false && check2.isChecked()==true && check3.isChecked()==false && check4.isChecked()==false
                        &&check5.isChecked()==true){//2,5
                    Toast toastView = Toast.makeText(getApplicationContext(),"프로메코 아토풀 마스크 폼팩'과 " +
                            "프로메코 네오 9 비누 아로마 테라피'을 구매합니다.",Toast.LENGTH_LONG);
                    toastView.show();
                    Intent intent12 = new Intent(getApplicationContext(), ThirdActivity.class);

                    intent12.putExtra("상품명2","프로메코 아토풀 마스크 폼팩");
                    intent12.putExtra("가격2","38000");
                    intent12.putExtra("상품명5","프로메코 네오 9 비누 아로마 테라피");
                    intent12.putExtra("가격5","20000");

                    startActivity(intent12);
                }
                else if(check1.isChecked()==false && check2.isChecked()==false && check3.isChecked()==true && check4.isChecked()==true
                        &&check5.isChecked()==false){//3,4
                    Toast toastView = Toast.makeText(getApplicationContext(),"아토풀 크림(자연유래 + 고보습)'과 " +
                            "프로메코 네오 491 세럼'을 구매합니다.",Toast.LENGTH_LONG);
                    toastView.show();
                    Intent intent13 = new Intent(getApplicationContext(), ThirdActivity.class);

                    intent13.putExtra("상품명3","아토풀 크림(자연유래 + 고보습)");
                    intent13.putExtra("가격3","48000");
                    intent13.putExtra("상품명4","프로메코 네오 491 세럼");
                    intent13.putExtra("가격4","168000");

                    startActivity(intent13);
                }
                else if(check1.isChecked()==false && check2.isChecked()==false && check3.isChecked()==true && check4.isChecked()==false
                        &&check5.isChecked()==true){//3,5
                    Toast toastView = Toast.makeText(getApplicationContext(),"아토풀 크림(자연유래 + 고보습)'과 " +
                            "프로메코 네오 9 비누 아로마 테라피'를 구매합니다.",Toast.LENGTH_LONG);
                    toastView.show();
                    Intent intent14 = new Intent(getApplicationContext(), ThirdActivity.class);

                    intent14.putExtra("상품명3","아토풀 크림(자연유래 + 고보습)");
                    intent14.putExtra("가격3","48000");
                    intent14.putExtra("상품명5","프로메코 네오 9 비누 아로마 테라피");
                    intent14.putExtra("가격5","20000");

                    startActivity(intent14);
                }
                else if(check1.isChecked()==false && check2.isChecked()==false && check3.isChecked()==false && check4.isChecked()==true
                        &&check5.isChecked()==true){//4,5
                    Toast toastView = Toast.makeText(getApplicationContext(),"프로메코 네오 491 세럼'과 " +
                            "프로메코 네오 9 비누 아로마 테라피'을 구매합니다.",Toast.LENGTH_LONG);
                    toastView.show();
                    Intent intent15 = new Intent(getApplicationContext(), ThirdActivity.class);

                    intent15.putExtra("상품명4","프로메코 네오 491 세럼");
                    intent15.putExtra("가격4","168000");
                    intent15.putExtra("상품명5","프로메코 네오 9 비누 아로마 테라피");
                    intent15.putExtra("가격5","20000");

                    startActivity(intent15);
                }
                else if(check1.isChecked()==true && check2.isChecked()==true && check3.isChecked()==true && check4.isChecked()==false
                        &&check5.isChecked()==false){//1,2,3
                    Toast toastView = Toast.makeText(getApplicationContext(),"네오182 Scalp 트러블 에센스'와 " +
                            "프로메코 아토풀 마스크 폼팩'과 아토풀 크림(자연유래 + 고보습)" +
                            "을 구매합니다.",Toast.LENGTH_LONG);
                    toastView.show();
                    Intent intent16 = new Intent(getApplicationContext(), ThirdActivity.class);


                    intent16.putExtra("상품명1","네오182 Scalp 트러블 에센스");
                    intent16.putExtra("가격1","78000");
                    intent16.putExtra("상품명2","프로메코 아토풀 마스크 폼팩");
                    intent16.putExtra("가격2","38000");
                    intent16.putExtra("상품명3","아토풀 크림(자연유래 + 고보습)");
                    intent16.putExtra("가격3","48000");

                    startActivity(intent16);
                }
                else if(check1.isChecked()==true && check2.isChecked()==true && check3.isChecked()==false && check4.isChecked()==true
                        &&check5.isChecked()==false){//1,2,4
                    Toast toastView = Toast.makeText(getApplicationContext(),"네오182 Scalp 트러블 에센스'와 " +
                            "프로메코 아토풀 마스크 폼팩'과 프로메코 네오 491 세럼" +
                            "을 구매합니다.",Toast.LENGTH_LONG);
                    toastView.show();
                    Intent intent17 = new Intent(getApplicationContext(), ThirdActivity.class);

                    intent17.putExtra("상품명1","네오182 Scalp 트러블 에센스");
                    intent17.putExtra("가격1","78000");
                    intent17.putExtra("상품명2","프로메코 아토풀 마스크 폼팩");
                    intent17.putExtra("가격2","38000");
                    intent17.putExtra("상품명4","프로메코 네오 491 세럼");
                    intent17.putExtra("가격4","168000");

                    startActivity(intent17);
                }
                else if(check1.isChecked()==true && check2.isChecked()==true && check3.isChecked()==false && check4.isChecked()==false
                        &&check5.isChecked()==true){//1,2,5
                    Toast toastView = Toast.makeText(getApplicationContext(),"네오182 Scalp 트러블 에센스'와 " +
                            "프로메코 아토풀 마스크 폼팩'과 프로메코 네오 9 비누 아로마 테라피)" +
                            "을 구매합니다. ",Toast.LENGTH_LONG);
                    toastView.show();
                    Intent intent18 = new Intent(getApplicationContext(), ThirdActivity.class);

                    intent18.putExtra("상품명1","네오182 Scalp 트러블 에센스");
                    intent18.putExtra("가격1","78000");
                    intent18.putExtra("상품명2","프로메코 아토풀 마스크 폼팩");
                    intent18.putExtra("가격2","38000");
                    intent18.putExtra("상품명5","프로메코 네오 9 비누 아로마 테라피");
                    intent18.putExtra("가격5","168000");

                    startActivity(intent18);
                }
                else if(check1.isChecked()==true && check2.isChecked()==false && check3.isChecked()==true && check4.isChecked()==true
                        &&check5.isChecked()==false){//1,3,4
                    Toast toastView = Toast.makeText(getApplicationContext(),"네오182 Scalp 트러블 에센스'와 " +
                            "아토풀 크림(자연유래 + 고보습'과 프로메코 네오 491 세럼" +
                            "을 구매합니다.",Toast.LENGTH_LONG);
                    toastView.show();
                    Intent intent19 = new Intent(getApplicationContext(), ThirdActivity.class);

                    intent19.putExtra("상품명1","네오182 Scalp 트러블 에센스");
                    intent19.putExtra("가격1","78000");
                    intent19.putExtra("상품명3","아토풀 크림(자연유래 + 고보습)");
                    intent19.putExtra("가격3","48000");
                    intent19.putExtra("상품명4","프로메코 네오 491 세럼");
                    intent19.putExtra("가격4","168000");

                    startActivity(intent19);
                }
                else if(check1.isChecked()==true && check2.isChecked()==false && check3.isChecked()==true && check4.isChecked()==false
                        &&check5.isChecked()==true){//1,3,5
                    Toast toastView = Toast.makeText(getApplicationContext(),"네오182 Scalp 트러블 에센스'와 " +
                            "아토풀 크림(자연유래 + 고보습'과 프로메코 네오 9 비누 아로마 테라피" +
                            "을 구매합니다.",Toast.LENGTH_LONG);
                    toastView.show();
                    Intent intent20 = new Intent(getApplicationContext(), ThirdActivity.class);

                    intent20.putExtra("상품명1","네오182 Scalp 트러블 에센스");
                    intent20.putExtra("가격1","78000");
                    intent20.putExtra("상품명3","아토풀 크림(자연유래 + 고보습)");
                    intent20.putExtra("가격3","48000");
                    intent20.putExtra("상품명5","프로메코 네오 9 비누 아로마 테라피");
                    intent20.putExtra("가격5","20000");

                    startActivity(intent20);
                }
                else if(check1.isChecked()==true && check2.isChecked()==false && check3.isChecked()==false && check4.isChecked()==true
                        &&check5.isChecked()==true){//1,4,5
                    Toast toastView = Toast.makeText(getApplicationContext(),"네오182 Scalp 트러블 에센스'와 " +
                            "프로메코 네오 491 세럼'과 프로메코 네오 9 비누 아로마 테라피" +
                            "을 구매합니다.",Toast.LENGTH_LONG);
                    toastView.show();
                    Intent intent21 = new Intent(getApplicationContext(), ThirdActivity.class);

                    intent21.putExtra("상품명1","네오182 Scalp 트러블 에센스");
                    intent21.putExtra("가격1","78000");
                    intent21.putExtra("상품명4","프로메코 네오 491 세럼");
                    intent21.putExtra("가격4","168000");
                    intent21.putExtra("상품명5","프로메코 네오 9 비누 아로마 테라피");
                    intent21.putExtra("가격5","20000");

                    startActivity(intent21);
                }
                else if(check1.isChecked()==false && check2.isChecked()==true && check3.isChecked()==true && check4.isChecked()==true
                        &&check5.isChecked()==false){//2,3,4
                    Toast toastView = Toast.makeText(getApplicationContext(),"프로메코 아토풀 마스크 폼팩'과 " +
                            "아토풀 크림(자연유래 + 고보습)'과 프로메코 네오 491 세럼" +
                            "을 구매합니다.",Toast.LENGTH_LONG);
                    toastView.show();
                    Intent intent22 = new Intent(getApplicationContext(),ThirdActivity.class);

                    intent22.putExtra("상품명2","프로메코 아토풀 마스크 폼팩");
                    intent22.putExtra("가격2","38000");
                    intent22.putExtra("상품명3","아토풀 크림(자연유래 + 고보습)");
                    intent22.putExtra("가격3","48000");
                    intent22.putExtra("상품명4","프로메코 네오 491 세럼");
                    intent22.putExtra("가격4","168000");

                    startActivity(intent22);
                }
                else if(check1.isChecked()==false && check2.isChecked()==true && check3.isChecked()==true && check4.isChecked()==false
                        &&check5.isChecked()==true){//2,3,5
                    Toast toastView = Toast.makeText(getApplicationContext(),"프로메코 아토풀 마스크 폼팩'과 " +
                            "아토풀 크림(자연유래 + 고보습)'과 프로메코 네오 9 비누 아로마 테라피" +
                            "를 구매합니다.",Toast.LENGTH_LONG);
                    toastView.show();
                    Intent intent23 = new Intent(getApplicationContext(), ThirdActivity.class);

                    intent23.putExtra("상품명2","프로메코 아토풀 마스크 폼팩");
                    intent23.putExtra("가격2","38000");
                    intent23.putExtra("상품명3","아토풀 크림(자연유래 + 고보습)");
                    intent23.putExtra("가격3","48000");
                    intent23.putExtra("상품명5","프로메코 네오 9 비누 아로마 테라피");
                    intent23.putExtra("가격5","20000");

                    startActivity(intent23);
                }
                else if(check1.isChecked()==false && check2.isChecked()==true && check3.isChecked()==false && check4.isChecked()==true
                        &&check5.isChecked()==true){//2,4,5
                    Toast toastView = Toast.makeText(getApplicationContext(),"프로메코 아토풀 마스크 폼팩'과 " +
                            "프로메코 네오 491 세럼'과 프로메코 네오 9 비누 아로마 테라피" +
                            "를 구매합니다.",Toast.LENGTH_LONG);
                    toastView.show();
                    Intent intent24 = new Intent(getApplicationContext(), ThirdActivity.class);

                    intent24.putExtra("상품명2","프로메코 아토풀 마스크 폼팩");
                    intent24.putExtra("가격2","38000");
                    intent24.putExtra("상품명4","프로메코 네오 491 세럼");
                    intent24.putExtra("가격4","168000");
                    intent24.putExtra("상품명5","프로메코 네오 9 비누 아로마 테라피");
                    intent24.putExtra("가격5","20000");

                    startActivity(intent24);
                }
                else if(check1.isChecked()==false && check2.isChecked()==false && check3.isChecked()==true && check4.isChecked()==true
                        &&check5.isChecked()==true){//3,4,5
                    Toast toastView = Toast.makeText(getApplicationContext(),"아토풀 크림(자연유래 + 고보습)'과 " +
                            "프로메코 네오 491 세럼'과 프로메코 네오 9 비누 아로마 테라피" +
                            "를 구매합니다.",Toast.LENGTH_LONG);
                    toastView.show();
                    Intent intent25 = new Intent(getApplicationContext(), ThirdActivity.class);

                    intent25.putExtra("상품명3","아토풀 크림(자연유래 + 고보습)");
                    intent25.putExtra("가격3","48000");
                    intent25.putExtra("상품명4","프로메코 네오 491 세럼");
                    intent25.putExtra("가격4","168000");
                    intent25.putExtra("상품명5","프로메코 네오 9 비누 아로마 테라피");
                    intent25.putExtra("가격5","20000");

                    startActivity(intent25);
                }
                else if(check1.isChecked()==true && check2.isChecked()==true && check3.isChecked()==true && check4.isChecked()==true
                        &&check5.isChecked()==false){//1,2,3,4
                    Toast toastView = Toast.makeText(getApplicationContext(),"네오182 Scalp 트러블 에센스'와 " +
                            "프로메코 아토풀 마스크 폼팩'과 아토풀 크림(자연유래 + 고보습)" +
                            "과 '프로메코 네오 491 세럼'을 구매합니다.",Toast.LENGTH_LONG);
                    toastView.show();
                    Intent intent26 = new Intent(getApplicationContext(), ThirdActivity.class);

                    intent26.putExtra("상품명1","네오182 Scalp 트러블 에센스");
                    intent26.putExtra("가격1","78000");
                    intent26.putExtra("상품명2","프로메코 아토풀 마스크 폼팩");
                    intent26.putExtra("가격2","38000");
                    intent26.putExtra("상품명3","아토풀 크림(자연유래 + 고보습)");
                    intent26.putExtra("가격3","48000");
                    intent26.putExtra("상품명4","프로메코 네오 491 세럼");
                    intent26.putExtra("가격4","168000");

                    startActivity(intent26);
                }
                else if(check1.isChecked()==true && check2.isChecked()==true && check3.isChecked()==true && check4.isChecked()==false &&
                        check5.isChecked()==true){//1,2,3,5
                    Toast toastView = Toast.makeText(getApplicationContext(),"네오182 Scalp 트러블 에센스'와 " +
                            "프로메코 아토풀 마스크 폼팩'과 아토풀 크림(자연유래 + 고보습)" +
                            "과 '프로메코 네오 9 비누 아로마 테라피'를 구매합니다. ",Toast.LENGTH_LONG);
                    toastView.show();
                    Intent intent27 = new Intent(getApplicationContext(),ThirdActivity.class);

                    intent27.putExtra("상품명1","네오182 Scalp 트러블 에센스");
                    intent27.putExtra("가격1","78000");
                    intent27.putExtra("상품명2","프로메코 아토풀 마스크 폼팩");
                    intent27.putExtra("가격2","38000");
                    intent27.putExtra("상품명3","아토풀 크림(자연유래 + 고보습)");
                    intent27.putExtra("가격3","48000");
                    intent27.putExtra("상품명5","프로메코 네오 9 비누 아로마 테라피");
                    intent27.putExtra("가격5","20000");

                    startActivity(intent27);
                }
                else if(check1.isChecked()==true && check2.isChecked()==true && check3.isChecked()==false && check4.isChecked()==true &&
                        check5.isChecked()==true){//1,2,4,5
                    Toast toastView = Toast.makeText(getApplicationContext(),"네오182 Scalp 트러블 에센스'와 " +
                            "프로메코 아토풀 마스크 폼팩'과 프로메코 네오 491 세럼" +
                            "과 '프로메코 네오 9 비누 아로마 테라피'를 구매합니다.",Toast.LENGTH_LONG);
                    toastView.show();
                    Intent intent28 = new Intent(getApplicationContext(),ThirdActivity.class);

                    intent28.putExtra("상품명1","네오182 Scalp 트러블 에센스");
                    intent28.putExtra("가격1","78000");
                    intent28.putExtra("상품명2","프로메코 아토풀 마스크 폼팩");
                    intent28.putExtra("가격2","38000");
                    intent28.putExtra("상품명4","프로메코 네오 491 세럼");
                    intent28.putExtra("가격4","168000");
                    intent28.putExtra("상품명5","프로메코 네오 9 비누 아로마 테라피");
                    intent28.putExtra("가격5","20000");

                    startActivity(intent28);
                }
                else if(check1.isChecked()==true && check2.isChecked()==false &&check3.isChecked()==true && check4.isChecked()==true &&
                        check5.isChecked()==true){//1,3,4,5
                    Toast toastView = Toast.makeText(getApplicationContext(),"네오182 Scalp 트러블 에센스'와 " +
                            "아토풀 크림(자연유래 + 고보습)'과 프로메코 네오 491 세럼" +
                            "과 '프로메코 네오 9 비누 아로마 테라피'를 구매합니다. ",Toast.LENGTH_LONG);
                    toastView.show();
                    Intent intent29 = new Intent(getApplicationContext(), ThirdActivity.class);

                    intent29.putExtra("상품명1","네오182 Scalp 트러블 에센스");
                    intent29.putExtra("가격1","78000");
                    intent29.putExtra("상품명3","아토풀 크림(자연유래 + 고보습)");
                    intent29.putExtra("가격3","48000");
                    intent29.putExtra("상품명4","프로메코 네오 491 세럼");
                    intent29.putExtra("가격4","168000");
                    intent29.putExtra("상품명5","프로메코 네오 9 비누 아로마 테라피");
                    intent29.putExtra("가격5","20000");

                    startActivity(intent29);
                }
                else if(check1.isChecked()==false && check2.isChecked()==true && check3.isChecked()==true && check4.isChecked()==true &&
                        check5.isChecked()==true){//2,3,4,5
                    Toast toastView = Toast.makeText(getApplicationContext(),"프로메코 아토풀 마스크 폼팩'과 " +
                            "아토풀 크림(자연유래 + 고보습)'과 프로메코 네오 491 세럼" +
                            "과 '프로메코 네오 9 비누 아로마 테라피'를 구매합니다.",Toast.LENGTH_LONG);
                    toastView.show();
                    Intent intent30 = new Intent(getApplicationContext(), ThirdActivity.class);

                    intent30.putExtra("상품명2","프로메코 아토풀 마스크 폼팩");
                    intent30.putExtra("가격2","38000");
                    intent30.putExtra("상품명3","아토풀 크림(자연유래 + 고보습)");
                    intent30.putExtra("가격3","48000");
                    intent30.putExtra("상품명4","프로메코 네오 491 세럼");
                    intent30.putExtra("가격4","168000");
                    intent30.putExtra("상품명5","프로메코 네오 9 비누 아로마 테라피");
                    intent30.putExtra("가격5","20000");

                    startActivity(intent30);
                }
                else if(check1.isChecked()==true && check2.isChecked()==true && check3.isChecked()==true && check4.isChecked()==true &&
                        check5.isChecked()==true){//1,2,3,4,5
                    Toast toastView = Toast.makeText(getApplicationContext(),
                            "'네오182 Scalp 트러블 에센스' 와 '프로메코 아토풀 마스크 폼팩'과 " +
                                    "아토풀 크림(자연유래 + 고보습)'과 프로메코 네오 491 세럼" +
                                    "과 '프로메코 네오 9 비누 아로마 테라피'를 구매합니다.",Toast.LENGTH_LONG);
                    toastView.show();
                    Intent intent31 = new Intent(getApplicationContext(),ThirdActivity.class);

                    intent31.putExtra("상품명1","네오182 Scalp 트러블 에센스");
                    intent31.putExtra("가격1","78000");
                    intent31.putExtra("상품명2","프로메코 아토풀 마스크 폼팩");
                    intent31.putExtra("가격2","38000");
                    intent31.putExtra("상품명3","아토풀 크림(자연유래 + 고보습)");
                    intent31.putExtra("가격3","48000");
                    intent31.putExtra("상품명4","프로메코 네오 491 세럼");
                    intent31.putExtra("가격4","168000");
                    intent31.putExtra("상품명5","프로메코 네오 9 비누 아로마 테라피");
                    intent31.putExtra("가격5","20000");

                    startActivity(intent31);
                }
                else if(check1.isChecked()==false && check2.isChecked()==false && check3.isChecked()==false
                        && check4.isChecked()==false && check5.isChecked()==false){ // 0

                    Toast toastView = Toast.makeText(getApplicationContext(),"어떠한 상품도 선택하지 않으셨습니다.",Toast.LENGTH_LONG);
                    toastView.show();
                }
            }
        });

        Button homebutton = findViewById(R.id.homebutton); // 홈으로 돌아가기 버튼을 누르면 첫페이지로 돌아간다.
        homebutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

    }

}