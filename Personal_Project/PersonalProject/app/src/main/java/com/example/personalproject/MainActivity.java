package com.example.personalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private boolean[] imagecheck = new boolean[5];           // image뷰 가 눌렸는지 안눌렸는지 여부를 담은 배열
    private ImageView[] imageView = new ImageView[5];        // 이미지뷰들이 담긴 배열

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagecheck[0]=imagecheck[1]=imagecheck[2]=imagecheck[3]=imagecheck[4]=false;  // 초기값은 false(안눌려짐)로 설정
        //이미지 뷰 배열에 각 이미지 저장
        imageView[0]=findViewById(R.id.imageView1);
        imageView[1]=findViewById(R.id.imageView2);
        imageView[2]=findViewById(R.id.imageView3);
        imageView[3]=findViewById(R.id.imageView4);
        imageView[4]=findViewById(R.id.imageView5);
        //버튼 1번부터 10번까지 변수에 저장

        final CheckBox check1 = findViewById(R.id.check1);
        final CheckBox check2 = findViewById(R.id.check2);
        final CheckBox check3 = findViewById(R.id.check3);
        final CheckBox check4 = findViewById(R.id.check4);
        final CheckBox check5 = findViewById(R.id.check5);

        imageView[0].setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                if(imagecheck[0]==true){
                    imagecheck[0]=false;
                    check1.setVisibility(View.INVISIBLE);
                }
                else {
                    imagecheck[0] = true;
                    check1.setVisibility(View.VISIBLE);
                }
            }
        });
        imageView[1].setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                if(imagecheck[1]==true){
                    imagecheck[1]=false;
                    check2.setVisibility(View.INVISIBLE);
                }
                else {
                    imagecheck[1] = true;
                    check2.setVisibility(View.VISIBLE);
                }
            }
        });
        imageView[2].setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Button purchase;
                if(imagecheck[2]==true){
                    imagecheck[2]=false;
                    check3.setVisibility(View.INVISIBLE);
                }
                else {
                    imagecheck[2] = true;
                    check3.setVisibility(View.VISIBLE);
                }
            }
        });
        imageView[3].setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Button purchase;
                if(imagecheck[3]==true){
                    imagecheck[3]=false;
                    check4.setVisibility(View.INVISIBLE);
                }
                else {
                    imagecheck[3] = true;
                    check4.setVisibility(View.VISIBLE);
                }
            }
        });
        imageView[4].setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Button purchase;
                if(imagecheck[4]==true){
                    imagecheck[4]=false;
                    check5.setVisibility(View.INVISIBLE);
                }
                else {
                    imagecheck[4] = true;
                    check5.setVisibility(View.VISIBLE);
                }
            }
        });
/////////////////////////////////////////////////////////////////////////////////////////////////

        //장바구니 버튼 클릭 이벤트

        Button cartbutton =findViewById(R.id.cartbutton);
        cartbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check1.isChecked()==true && check2.isChecked()==false && check3.isChecked()==false && check4.isChecked()==false
                 && check5.isChecked()== false ){ //1
                    Toast toastView = Toast.makeText(getApplicationContext(),"네오182 Scalp 트러블 에센스'를 " +
                            "장바구니에 넣습니다.",Toast.LENGTH_LONG);
                    toastView.show();
                    Intent intent1 = new Intent(getApplicationContext(), SecondActivity.class);

                    intent1.putExtra("상품명1","상품명 : 네오182 Scalp 트러블 에센스");
                    intent1.putExtra("가격1","78000");

                    startActivity(intent1);
                }
                else if(check1.isChecked()==false && check2.isChecked()==true && check3.isChecked()==false && check4.isChecked()==false
                        && check5.isChecked()== false ){//2
                    Toast toastView = Toast.makeText(getApplicationContext(),"프로메코 아토풀 마스크 폼팩'을 " +
                            "장바구니에 넣습니다.",Toast.LENGTH_LONG);
                    toastView.show();
                    Intent intent2 = new Intent(getApplicationContext(), SecondActivity.class);

                    intent2.putExtra("상품명2","상품명 : 프로메코 아토풀 마스크 폼팩");
                    intent2.putExtra("가격2","38000");

                    startActivity(intent2);

                }
                else if(check1.isChecked()==false && check2.isChecked()==false && check3.isChecked()==true && check4.isChecked()==false
                        && check5.isChecked()== false ){//3
                    Toast toastView = Toast.makeText(getApplicationContext(),"아토풀 크림(자연유래 + 고보습)을 " +
                            "장바구니에 넣습니다.",Toast.LENGTH_LONG);
                    toastView.show();
                    Intent intent3 = new Intent(getApplicationContext(), SecondActivity.class);

                    intent3.putExtra("상품명3","상품명 : 아토풀 크림(자연유래 + 고보습)");
                    intent3.putExtra("가격3","48000");

                    startActivity(intent3);

                }
                else if(check1.isChecked()==false && check2.isChecked()==false && check3.isChecked()==false && check4.isChecked()==true
                        && check5.isChecked()== false ){//4
                    Toast toastView = Toast.makeText(getApplicationContext(),"상품명 :프로메코 네오 491 세럼을 " +
                            "장바구니에 넣습니다.",Toast.LENGTH_LONG);
                    toastView.show();
                    Intent intent4 = new Intent(getApplicationContext(), SecondActivity.class);

                    intent4.putExtra("상품명4","상품명 :프로메코 네오 491 세럼");
                    intent4.putExtra("가격4","48000");

                    startActivity(intent4);

                }
                else if(check1.isChecked()==false && check2.isChecked()==false && check3.isChecked()==false && check4.isChecked()==false
                        &&check5.isChecked()==true){//5
                    Toast toastView = Toast.makeText(getApplicationContext(),"상품명 :프로메코 네오 9 비누 아로마 테라피를 " +
                            "장바구니에 넣습니다.",Toast.LENGTH_LONG);
                    toastView.show();
                    Intent intent5 = new Intent(getApplicationContext(), SecondActivity.class);

                    intent5.putExtra("상품명5","상품명 : 프로메코 네오 9 비누 아로마 테라피");
                    intent5.putExtra("가격5","20000");

                    startActivity(intent5);
                }
                else if(check1.isChecked()==true && check2.isChecked()==true && check3.isChecked()==false && check4.isChecked()==false
                        &&check5.isChecked()==false){//1,2
                    Toast toastView = Toast.makeText(getApplicationContext(),"네오182 Scalp 트러블 에센스'와 " +
                            "프로메코 아토풀 마스크 폼팩'을 장바구니에 넣습니다. ",Toast.LENGTH_LONG);
                    toastView.show();
                    Intent intent6 = new Intent(getApplicationContext(), SecondActivity.class);

                    intent6.putExtra("상품명1","상품명 : 네오182 Scalp 트러블 에센스");
                    intent6.putExtra("가격1","78000");
                    intent6.putExtra("상품명2","상품명 : 프로메코 아토풀 마스크 폼팩");
                    intent6.putExtra("가격2","38000");

                    startActivity(intent6);
                }
                else if(check1.isChecked()==true && check2.isChecked()==false && check3.isChecked()==true && check4.isChecked()==false
                        &&check5.isChecked()==false){//1,3
                    Toast toastView = Toast.makeText(getApplicationContext(),"네오182 Scalp 트러블 에센스'와 " +
                            "아토풀 크림(자연유래 + 고보습)'을 장바구니에 넣습니다. ",Toast.LENGTH_LONG);
                    toastView.show();
                    Intent intent7 = new Intent(getApplicationContext(), SecondActivity.class);

                    intent7.putExtra("상품명1","상품명 : 네오182 Scalp 트러블 에센스");
                    intent7.putExtra("가격1","78000");
                    intent7.putExtra("상품명3","상품명 : 아토풀 크림(자연유래 + 고보습)");
                    intent7.putExtra("가격3","48000");

                    startActivity(intent7);

                }
                else if(check1.isChecked()==true && check2.isChecked()==false && check3.isChecked()==false && check4.isChecked()==true
                        &&check5.isChecked()==false){//1,4
                    Toast toastView = Toast.makeText(getApplicationContext(),"네오182 Scalp 트러블 에센스'와 " +
                            "프로메코 네오 491 세럼'을 장바구니에 넣습니다. ",Toast.LENGTH_LONG);
                    toastView.show();
                    Intent intent8 = new Intent(getApplicationContext(), SecondActivity.class);

                    intent8.putExtra("상품명1","상품명 : 네오182 Scalp 트러블 에센스");
                    intent8.putExtra("가격1","78000");
                    intent8.putExtra("상품명4","상품명 : 프로메코 네오 491 세럼");
                    intent8.putExtra("가격4","168000");

                    startActivity(intent8);

                }
                else if(check1.isChecked()==true && check2.isChecked()==false && check3.isChecked()==false && check4.isChecked()==false
                        &&check5.isChecked()==true){//1,5
                    Toast toastView = Toast.makeText(getApplicationContext(),"네오182 Scalp 트러블 에센스'와 " +
                            "프로메코 네오 9 비누 아로마 테라피'를 장바구니에 넣습니다. ",Toast.LENGTH_LONG);
                    toastView.show();
                    Intent intent9 = new Intent(getApplicationContext(), SecondActivity.class);

                    intent9.putExtra("상품명1","상품명 : 네오182 Scalp 트러블 에센스");
                    intent9.putExtra("가격1","78000");
                    intent9.putExtra("상품명5","상품명 : 프로메코 네오 9 비누 아로마 테라피");
                    intent9.putExtra("가격5","20000");

                    startActivity(intent9);
                }
                else if(check1.isChecked()==false && check2.isChecked()==true && check3.isChecked()==true && check4.isChecked()==false
                        &&check5.isChecked()==false){//2,3
                    Toast toastView = Toast.makeText(getApplicationContext(),"프로메코 아토풀 마스크 폼팩'과 " +
                            "아토풀 크림(자연유래 + 고보습)'을 장바구니에 넣습니다. ",Toast.LENGTH_LONG);
                    toastView.show();
                    Intent intent10 = new Intent(getApplicationContext(), SecondActivity.class);

                    intent10.putExtra("상품명2","상품명 : 프로메코 아토풀 마스크 폼팩");
                    intent10.putExtra("가격2","38000");
                    intent10.putExtra("상품명3","상품명 : 아토풀 크림(자연유래 + 고보습)");
                    intent10.putExtra("가격3","48000");

                    startActivity(intent10);
                }
                else if(check1.isChecked()==false && check2.isChecked()==true && check3.isChecked()==false && check4.isChecked()==true
                        &&check5.isChecked()==false){//2,4
                    Toast toastView = Toast.makeText(getApplicationContext(),"프로메코 아토풀 마스크 폼팩'과 " +
                            "프로메코 네오 491 세럼'을 장바구니에 넣습니다. ",Toast.LENGTH_LONG);
                    toastView.show();
                    Intent intent11 = new Intent(getApplicationContext(), SecondActivity.class);

                    intent11.putExtra("상품명2","상품명 : 프로메코 아토풀 마스크 폼팩");
                    intent11.putExtra("가격2","38000");
                    intent11.putExtra("상품명4","상품명 : 프로메코 네오 491 세럼");
                    intent11.putExtra("가격4","168000");

                    startActivity(intent11);
                }
                else if(check1.isChecked()==false && check2.isChecked()==true && check3.isChecked()==false && check4.isChecked()==false
                        &&check5.isChecked()==true){//2,5
                    Toast toastView = Toast.makeText(getApplicationContext(),"프로메코 아토풀 마스크 폼팩'과 " +
                            "프로메코 네오 9 비누 아로마 테라피'을 장바구니에 넣습니다. ",Toast.LENGTH_LONG);
                    toastView.show();
                    Intent intent12 = new Intent(getApplicationContext(), SecondActivity.class);

                    intent12.putExtra("상품명2","상품명 : 프로메코 아토풀 마스크 폼팩");
                    intent12.putExtra("가격2","38000");
                    intent12.putExtra("상품명5","상품명 : 프로메코 네오 9 비누 아로마 테라피");
                    intent12.putExtra("가격5","20000");

                    startActivity(intent12);
                }
                else if(check1.isChecked()==false && check2.isChecked()==false && check3.isChecked()==true && check4.isChecked()==true
                        &&check5.isChecked()==false){//3,4
                    Toast toastView = Toast.makeText(getApplicationContext(),"아토풀 크림(자연유래 + 고보습)'과 " +
                            "프로메코 네오 491 세럼'을 장바구니에 넣습니다. ",Toast.LENGTH_LONG);
                    toastView.show();
                    Intent intent13 = new Intent(getApplicationContext(), SecondActivity.class);

                    intent13.putExtra("상품명3","상품명 : 아토풀 크림(자연유래 + 고보습)");
                    intent13.putExtra("가격3","48000");
                    intent13.putExtra("상품명4","상품명 : 프로메코 네오 491 세럼");
                    intent13.putExtra("가격4","168000");

                    startActivity(intent13);
                }
                else if(check1.isChecked()==false && check2.isChecked()==false && check3.isChecked()==true && check4.isChecked()==false
                        &&check5.isChecked()==true){//3,5
                    Toast toastView = Toast.makeText(getApplicationContext(),"아토풀 크림(자연유래 + 고보습)'과 " +
                            "프로메코 네오 9 비누 아로마 테라피'를 장바구니에 넣습니다. ",Toast.LENGTH_LONG);
                    toastView.show();
                    Intent intent14 = new Intent(getApplicationContext(), SecondActivity.class);

                    intent14.putExtra("상품명3","상품명 : 아토풀 크림(자연유래 + 고보습)");
                    intent14.putExtra("가격3","48000");
                    intent14.putExtra("상품명5","상품명 : 프로메코 네오 9 비누 아로마 테라피");
                    intent14.putExtra("가격5","20000");

                    startActivity(intent14);
                }
                else if(check1.isChecked()==false && check2.isChecked()==false && check3.isChecked()==false && check4.isChecked()==true
                        &&check5.isChecked()==true){//4,5
                    Toast toastView = Toast.makeText(getApplicationContext(),"프로메코 네오 491 세럼'과 " +
                            "프로메코 네오 9 비누 아로마 테라피'을 장바구니에 넣습니다. ",Toast.LENGTH_LONG);
                    toastView.show();
                    Intent intent15 = new Intent(getApplicationContext(), SecondActivity.class);

                    intent15.putExtra("상품명4","상품명 : 프로메코 네오 491 세럼");
                    intent15.putExtra("가격4","168000");
                    intent15.putExtra("상품명5","상품명 : 프로메코 네오 9 비누 아로마 테라피");
                    intent15.putExtra("가격5","20000");

                    startActivity(intent15);
                }
                else if(check1.isChecked()==true && check2.isChecked()==true && check3.isChecked()==true && check4.isChecked()==false
                        &&check5.isChecked()==false){//1,2,3
                    Toast toastView = Toast.makeText(getApplicationContext(),"네오182 Scalp 트러블 에센스'와 " +
                            "프로메코 아토풀 마스크 폼팩'과 아토풀 크림(자연유래 + 고보습)" +
                            "을 장바구니에 넣습니다. ",Toast.LENGTH_LONG);
                    toastView.show();
                    Intent intent16 = new Intent(getApplicationContext(), SecondActivity.class);


                    intent16.putExtra("상품명1","상품명 : 네오182 Scalp 트러블 에센스");
                    intent16.putExtra("가격1","78000");
                    intent16.putExtra("상품명2","상품명 : 프로메코 아토풀 마스크 폼팩");
                    intent16.putExtra("가격2","38000");
                    intent16.putExtra("상품명3","상품명 : 아토풀 크림(자연유래 + 고보습)");
                    intent16.putExtra("가격3","48000");

                    startActivity(intent16);
                }
                else if(check1.isChecked()==true && check2.isChecked()==true && check3.isChecked()==false && check4.isChecked()==true
                        &&check5.isChecked()==false){//1,2,4
                    Toast toastView = Toast.makeText(getApplicationContext(),"네오182 Scalp 트러블 에센스'와 " +
                            "프로메코 아토풀 마스크 폼팩'과 프로메코 네오 491 세럼" +
                            "을 장바구니에 넣습니다. ",Toast.LENGTH_LONG);
                    toastView.show();
                    Intent intent17 = new Intent(getApplicationContext(), SecondActivity.class);

                    intent17.putExtra("상품명1","상품명 : 네오182 Scalp 트러블 에센스");
                    intent17.putExtra("가격1","78000");
                    intent17.putExtra("상품명2","상품명 : 프로메코 아토풀 마스크 폼팩");
                    intent17.putExtra("가격2","38000");
                    intent17.putExtra("상품명4","상품명 : 프로메코 네오 491 세럼");
                    intent17.putExtra("가격4","168000");

                    startActivity(intent17);
                }
                else if(check1.isChecked()==true && check2.isChecked()==true && check3.isChecked()==false && check4.isChecked()==false
                        &&check5.isChecked()==true){//1,2,5
                    Toast toastView = Toast.makeText(getApplicationContext(),"네오182 Scalp 트러블 에센스'와 " +
                            "프로메코 아토풀 마스크 폼팩'과 프로메코 네오 9 비누 아로마 테라피)" +
                            "을 장바구니에 넣습니다. ",Toast.LENGTH_LONG);
                    toastView.show();
                    Intent intent18 = new Intent(getApplicationContext(), SecondActivity.class);

                    intent18.putExtra("상품명1","상품명 : 네오182 Scalp 트러블 에센스");
                    intent18.putExtra("가격1","78000");
                    intent18.putExtra("상품명2","상품명 : 프로메코 아토풀 마스크 폼팩");
                    intent18.putExtra("가격2","38000");
                    intent18.putExtra("상품명5","상품명 : 프로메코 네오 9 비누 아로마 테라피");
                    intent18.putExtra("가격5","168000");

                    startActivity(intent18);
                }
                else if(check1.isChecked()==true && check2.isChecked()==false && check3.isChecked()==true && check4.isChecked()==true
                        &&check5.isChecked()==false){//1,3,4
                    Toast toastView = Toast.makeText(getApplicationContext(),"네오182 Scalp 트러블 에센스'와 " +
                            "아토풀 크림(자연유래 + 고보습'과 프로메코 네오 491 세럼" +
                            "을 장바구니에 넣습니다. ",Toast.LENGTH_LONG);
                    toastView.show();
                    Intent intent19 = new Intent(getApplicationContext(), SecondActivity.class);

                    intent19.putExtra("상품명1","상품명 : 네오182 Scalp 트러블 에센스");
                    intent19.putExtra("가격1","78000");
                    intent19.putExtra("상품명3","상품명 : 아토풀 크림(자연유래 + 고보습)");
                    intent19.putExtra("가격3","48000");
                    intent19.putExtra("상품명4","상품명 : 프로메코 네오 491 세럼");
                    intent19.putExtra("가격4","168000");

                    startActivity(intent19);
                }
                else if(check1.isChecked()==true && check2.isChecked()==false && check3.isChecked()==true && check4.isChecked()==false
                        &&check5.isChecked()==true){//1,3,5
                    Toast toastView = Toast.makeText(getApplicationContext(),"네오182 Scalp 트러블 에센스'와 " +
                            "아토풀 크림(자연유래 + 고보습'과 프로메코 네오 9 비누 아로마 테라피" +
                            "을 장바구니에 넣습니다. ",Toast.LENGTH_LONG);
                    toastView.show();
                    Intent intent20 = new Intent(getApplicationContext(), SecondActivity.class);

                    intent20.putExtra("상품명1","상품명 : 네오182 Scalp 트러블 에센스");
                    intent20.putExtra("가격1","78000");
                    intent20.putExtra("상품명3","상품명 : 아토풀 크림(자연유래 + 고보습)");
                    intent20.putExtra("가격3","48000");
                    intent20.putExtra("상품명5","상품명 : 프로메코 네오 9 비누 아로마 테라피");
                    intent20.putExtra("가격5","20000");

                    startActivity(intent20);
                }
                else if(check1.isChecked()==true && check2.isChecked()==false && check3.isChecked()==false && check4.isChecked()==true
                        &&check5.isChecked()==true){//1,4,5
                    Toast toastView = Toast.makeText(getApplicationContext(),"네오182 Scalp 트러블 에센스'와 " +
                            "프로메코 네오 491 세럼'과 프로메코 네오 9 비누 아로마 테라피" +
                            "을 장바구니에 넣습니다. ",Toast.LENGTH_LONG);
                    toastView.show();
                    Intent intent21 = new Intent(getApplicationContext(), SecondActivity.class);

                    intent21.putExtra("상품명1","상품명 : 네오182 Scalp 트러블 에센스");
                    intent21.putExtra("가격1","78000");
                    intent21.putExtra("상품명4","상품명 : 프로메코 네오 491 세럼");
                    intent21.putExtra("가격4","168000");
                    intent21.putExtra("상품명5","상품명 : 프로메코 네오 9 비누 아로마 테라피");
                    intent21.putExtra("가격5","20000");

                    startActivity(intent21);
                }
                else if(check1.isChecked()==false && check2.isChecked()==true && check3.isChecked()==true && check4.isChecked()==true
                        &&check5.isChecked()==false){//2,3,4
                    Toast toastView = Toast.makeText(getApplicationContext(),"프로메코 아토풀 마스크 폼팩'과 " +
                            "아토풀 크림(자연유래 + 고보습)'과 프로메코 네오 491 세럼" +
                            "을 장바구니에 넣습니다. ",Toast.LENGTH_LONG);
                    toastView.show();
                    Intent intent22 = new Intent(getApplicationContext(), SecondActivity.class);

                    intent22.putExtra("상품명2","상품명 : 프로메코 아토풀 마스크 폼팩");
                    intent22.putExtra("가격2","38000");
                    intent22.putExtra("상품명3","상품명 : 아토풀 크림(자연유래 + 고보습)");
                    intent22.putExtra("가격3","48000");
                    intent22.putExtra("상품명4","상품명 : 프로메코 네오 491 세럼");
                    intent22.putExtra("가격4","168000");

                    startActivity(intent22);
                }
                else if(check1.isChecked()==false && check2.isChecked()==true && check3.isChecked()==true && check4.isChecked()==false
                        &&check5.isChecked()==true){//2,3,5
                    Toast toastView = Toast.makeText(getApplicationContext(),"프로메코 아토풀 마스크 폼팩'과 " +
                            "아토풀 크림(자연유래 + 고보습)'과 프로메코 네오 9 비누 아로마 테라피" +
                            "를 장바구니에 넣습니다. ",Toast.LENGTH_LONG);
                    toastView.show();
                    Intent intent23 = new Intent(getApplicationContext(), SecondActivity.class);

                    intent23.putExtra("상품명2","상품명 : 프로메코 아토풀 마스크 폼팩");
                    intent23.putExtra("가격2","38000");
                    intent23.putExtra("상품명3","상품명 : 아토풀 크림(자연유래 + 고보습)");
                    intent23.putExtra("가격3","48000");
                    intent23.putExtra("상품명5","상품명 : 프로메코 네오 9 비누 아로마 테라피");
                    intent23.putExtra("가격5","20000");

                    startActivity(intent23);
                }
                else if(check1.isChecked()==false && check2.isChecked()==true && check3.isChecked()==false && check4.isChecked()==true
                        &&check5.isChecked()==true){//2,4,5
                    Toast toastView = Toast.makeText(getApplicationContext(),"프로메코 아토풀 마스크 폼팩'과 " +
                            "프로메코 네오 491 세럼'과 프로메코 네오 9 비누 아로마 테라피" +
                            "를 장바구니에 넣습니다. ",Toast.LENGTH_LONG);
                    toastView.show();
                    Intent intent24 = new Intent(getApplicationContext(), SecondActivity.class);

                    intent24.putExtra("상품명2","상품명 : 프로메코 아토풀 마스크 폼팩");
                    intent24.putExtra("가격2","38000");
                    intent24.putExtra("상품명4","상품명 : 프로메코 네오 491 세럼");
                    intent24.putExtra("가격4","168000");
                    intent24.putExtra("상품명5","상품명 : 프로메코 네오 9 비누 아로마 테라피");
                    intent24.putExtra("가격5","20000");

                    startActivity(intent24);
                }
                else if(check1.isChecked()==false && check2.isChecked()==false && check3.isChecked()==true && check4.isChecked()==true
                        &&check5.isChecked()==true){//3,4,5
                    Toast toastView = Toast.makeText(getApplicationContext(),"아토풀 크림(자연유래 + 고보습)'과 " +
                            "프로메코 네오 491 세럼'과 프로메코 네오 9 비누 아로마 테라피" +
                            "를 장바구니에 넣습니다. ",Toast.LENGTH_LONG);
                    toastView.show();
                    Intent intent25 = new Intent(getApplicationContext(), SecondActivity.class);

                    intent25.putExtra("상품명3","상품명 : 아토풀 크림(자연유래 + 고보습)");
                    intent25.putExtra("가격3","48000");
                    intent25.putExtra("상품명4","상품명 : 프로메코 네오 491 세럼");
                    intent25.putExtra("가격4","168000");
                    intent25.putExtra("상품명5","상품명 : 프로메코 네오 9 비누 아로마 테라피");
                    intent25.putExtra("가격5","20000");

                    startActivity(intent25);
                }
                else if(check1.isChecked()==true && check2.isChecked()==true && check3.isChecked()==true && check4.isChecked()==true
                        &&check5.isChecked()==false){//1,2,3,4
                    Toast toastView = Toast.makeText(getApplicationContext(),"네오182 Scalp 트러블 에센스'와 " +
                            "프로메코 아토풀 마스크 폼팩'과 아토풀 크림(자연유래 + 고보습)" +
                            "과 '프로메코 네오 491 세럼'을 장바구니에 넣습니다. ",Toast.LENGTH_LONG);
                    toastView.show();
                    Intent intent26 = new Intent(getApplicationContext(), SecondActivity.class);

                    intent26.putExtra("상품명1","상품명 : 네오182 Scalp 트러블 에센스");
                    intent26.putExtra("가격1","78000");
                    intent26.putExtra("상품명2","상품명 : 프로메코 아토풀 마스크 폼팩");
                    intent26.putExtra("가격2","38000");
                    intent26.putExtra("상품명3","상품명 : 아토풀 크림(자연유래 + 고보습)");
                    intent26.putExtra("가격3","48000");
                    intent26.putExtra("상품명4","상품명 : 프로메코 네오 491 세럼");
                    intent26.putExtra("가격4","168000");

                    startActivity(intent26);
                }
                else if(check1.isChecked()==true && check2.isChecked()==true && check3.isChecked()==true && check4.isChecked()==false &&
                        check5.isChecked()==true){//1,2,3,5
                    Toast toastView = Toast.makeText(getApplicationContext(),"네오182 Scalp 트러블 에센스'와 " +
                            "프로메코 아토풀 마스크 폼팩'과 아토풀 크림(자연유래 + 고보습)" +
                            "과 '프로메코 네오 9 비누 아로마 테라피'를 장바구니에 넣습니다. ",Toast.LENGTH_LONG);
                    toastView.show();
                    Intent intent27 = new Intent(getApplicationContext(), SecondActivity.class);

                    intent27.putExtra("상품명1","상품명 : 네오182 Scalp 트러블 에센스");
                    intent27.putExtra("가격1","78000");
                    intent27.putExtra("상품명2","상품명 : 프로메코 아토풀 마스크 폼팩");
                    intent27.putExtra("가격2","38000");
                    intent27.putExtra("상품명3","상품명 : 아토풀 크림(자연유래 + 고보습)");
                    intent27.putExtra("가격3","48000");
                    intent27.putExtra("상품명5","상품명 : 프로메코 네오 9 비누 아로마 테라피");
                    intent27.putExtra("가격5","20000");

                    startActivity(intent27);
                }
                else if(check1.isChecked()==true && check2.isChecked()==true && check3.isChecked()==false && check4.isChecked()==true &&
                        check5.isChecked()==true){//1,2,4,5
                    Toast toastView = Toast.makeText(getApplicationContext(),"네오182 Scalp 트러블 에센스'와 " +
                            "프로메코 아토풀 마스크 폼팩'과 프로메코 네오 491 세럼" +
                            "과 '프로메코 네오 9 비누 아로마 테라피'를 장바구니에 넣습니다. ",Toast.LENGTH_LONG);
                    toastView.show();
                    Intent intent28 = new Intent(getApplicationContext(), SecondActivity.class);

                    intent28.putExtra("상품명1","상품명 : 네오182 Scalp 트러블 에센스");
                    intent28.putExtra("가격1","78000");
                    intent28.putExtra("상품명2","상품명 : 프로메코 아토풀 마스크 폼팩");
                    intent28.putExtra("가격2","38000");
                    intent28.putExtra("상품명4","상품명 : 프로메코 네오 491 세럼");
                    intent28.putExtra("가격4","168000");
                    intent28.putExtra("상품명5","상품명 : 프로메코 네오 9 비누 아로마 테라피");
                    intent28.putExtra("가격5","20000");

                    startActivity(intent28);
                }
                else if(check1.isChecked()==true && check2.isChecked()==false &&check3.isChecked()==true && check4.isChecked()==true &&
                        check5.isChecked()==true){//1,3,4,5
                    Toast toastView = Toast.makeText(getApplicationContext(),"네오182 Scalp 트러블 에센스'와 " +
                            "아토풀 크림(자연유래 + 고보습)'과 프로메코 네오 491 세럼" +
                            "과 '프로메코 네오 9 비누 아로마 테라피'를 장바구니에 넣습니다. ",Toast.LENGTH_LONG);
                    toastView.show();
                    Intent intent29 = new Intent(getApplicationContext(), SecondActivity.class);

                    intent29.putExtra("상품명1","상품명 : 네오182 Scalp 트러블 에센스");
                    intent29.putExtra("가격1","78000");
                    intent29.putExtra("상품명3","상품명 : 아토풀 크림(자연유래 + 고보습)");
                    intent29.putExtra("가격3","48000");
                    intent29.putExtra("상품명4","상품명 : 프로메코 네오 491 세럼");
                    intent29.putExtra("가격4","168000");
                    intent29.putExtra("상품명5","상품명 : 프로메코 네오 9 비누 아로마 테라피");
                    intent29.putExtra("가격5","20000");

                    startActivity(intent29);
                }
                else if(check1.isChecked()==false && check2.isChecked()==true && check3.isChecked()==true && check4.isChecked()==true &&
                        check5.isChecked()==true){//2,3,4,5
                    Toast toastView = Toast.makeText(getApplicationContext(),"프로메코 아토풀 마스크 폼팩'과 " +
                            "아토풀 크림(자연유래 + 고보습)'과 프로메코 네오 491 세럼" +
                            "과 '프로메코 네오 9 비누 아로마 테라피'를 장바구니에 넣습니다. ",Toast.LENGTH_LONG);
                    toastView.show();
                    Intent intent30 = new Intent(getApplicationContext(), SecondActivity.class);

                    intent30.putExtra("상품명2","상품명 : 프로메코 아토풀 마스크 폼팩");
                    intent30.putExtra("가격2","38000");
                    intent30.putExtra("상품명3","상품명 : 아토풀 크림(자연유래 + 고보습)");
                    intent30.putExtra("가격3","48000");
                    intent30.putExtra("상품명4","상품명 : 프로메코 네오 491 세럼");
                    intent30.putExtra("가격4","168000");
                    intent30.putExtra("상품명5","상품명 : 프로메코 네오 9 비누 아로마 테라피");
                    intent30.putExtra("가격5","20000");

                    startActivity(intent30);
                }
                else if(check1.isChecked()==true && check2.isChecked()==true && check3.isChecked()==true && check4.isChecked()==true &&
                        check5.isChecked()==true){//1,2,3,4,5
                    Toast toastView = Toast.makeText(getApplicationContext(),
                            "'네오182 Scalp 트러블 에센스' 와 '프로메코 아토풀 마스크 폼팩'과 " +
                            "아토풀 크림(자연유래 + 고보습)'과 프로메코 네오 491 세럼" +
                            "과 '프로메코 네오 9 비누 아로마 테라피'를 장바구니에 넣습니다. ",Toast.LENGTH_LONG);
                    toastView.show();
                    Intent intent31 = new Intent(getApplicationContext(), SecondActivity.class);

                    intent31.putExtra("상품명1","상품명 : 네오182 Scalp 트러블 에센스");
                    intent31.putExtra("가격1","78000");
                    intent31.putExtra("상품명2","상품명 : 프로메코 아토풀 마스크 폼팩");
                    intent31.putExtra("가격2","38000");
                    intent31.putExtra("상품명3","상품명 : 아토풀 크림(자연유래 + 고보습)");
                    intent31.putExtra("가격3","48000");
                    intent31.putExtra("상품명4","상품명 : 프로메코 네오 491 세럼");
                    intent31.putExtra("가격4","168000");
                    intent31.putExtra("상품명5","상품명 : 프로메코 네오 9 비누 아로마 테라피");
                    intent31.putExtra("가격5","20000");

                    startActivity(intent31);
                }
                else if(check1.isChecked()==false && check2.isChecked()==false && check3.isChecked()==false
                        && check4.isChecked()==false && check5.isChecked()==false){ // 0

                    Toast toastView = Toast.makeText(getApplicationContext(),"장바구니에 상품을 담아주세요",Toast.LENGTH_LONG);
                    toastView.show();
                }
            }
        });

        // 구메페이지 버튼 클릭 이벤트

        Button immpurchase =findViewById(R.id.immpurchase);
        immpurchase.setOnClickListener(new View.OnClickListener() {
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

    }
}