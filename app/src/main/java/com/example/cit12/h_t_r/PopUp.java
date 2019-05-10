package com.example.cit12.h_t_r;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class PopUp extends Activity {

    TextView txtText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //타이틀바 없애기
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_pop_up);

        //UI 객체생성
        txtText = (TextView)findViewById(R.id.txtText);
        TextView head = (TextView)findViewById(R.id.head);

        //데이터 가져오기
        Intent intent = getIntent();
        String data = intent.getStringExtra("data");

        head.setText(data);

        switch(data){
            case "종이류":
                txtText.setText("예) 신문지, 전단지, 종이박스,\n" +
                        "책자, 노트 등\n\n 물기에 젖지 않게 묶거나 박스류에 담아서 배출\n" +
                        "※ 비닐 코팅된 전단지 등은 섞이지 않도록 해야 함.\n" +
                        "※ 비닐 코팅된 책 표지, 노트의 스프링은 제거 해야 함.\n" +
                        "※ 사용한 휴지, 1회용 기저귀 등은 일반 종량제봉투에 배출");
                break;
            case "종이팩류":
                txtText.setText("예) 종이팩(음료수, 우유팩 등 ), 종이컵\n" +
                        "내용물을 비우고 물로 헹군 후 압착하여 배출\n" +
                        "※ 분리 배출함이 없는 경우 다른 재활용품과 함께 배출");
                break;

            case"캔·고철류":
                txtText.setText("예) 철캔, 알루미늄캔\n" +
                        "내용물을 비우고 배출\n" +
                        "플라스틱 뚜껑이 있는 경우 분리하여 배출\n" +
                        "부탄가스, 살충제 용기 등\n" +
                        "구멍을 뚫어 내용물을 비운 후 배출\n" +
                        "공구, 철사, 못, 전선,\n" +
                        "알루미늄, 스텐 등\n" +
                        "투명 비닐봉투에 넣어 배출");
                break;

            case"유리병류":
                txtText.setText("예) 음료수병, 기타병류\n"+
                        "병뚜껑을 제거한 후 내용물을 비우고 배출"+
                        "※ 소주병, 맥주병 등은 소매점 등에서 보증금 환불 가능");
                break;

            case"플라스틱류":
                txtText.setText("예) 페트병, 플라스틱 용기류\n" +
                        "다른 재질로 된 뚜껑은 제거 후 내용물을 비우고 배출\n" +
                        "폐스티로폼\n" +
                        "이물질(테이프 등)을 제거한 후 배출");
                break;

            case"비닐류":
                txtText.setText("예) 과자·라면봉지, 1회용 비닐봉투 등\n" +
                        "투명 비닐봉투에 넣어 배출\n" +
                        "음식물 등 이물질이 묻은 경우 깨끗이 씻어서 배출\n" +
                        "※ 오염된 비닐은 일반 종량제봉투에 배출");
                break;
            case"형광등":
                txtText.setText("예) 형광등, 삼파장 전구, 기타\n" +
                        "수은을 함유한 조명 제품\n" +
                        "깨지지 않게 주요거점(동주민센터·아파트·주택가\n" +
                        "골목 등) 폐형광등 전용수거함에 배출\n" +
                        "※ 깨진 형광등, 백열전구 등은 일반 종량제봉투에 배출");
                break;
            case"전지류":
                txtText.setText("예) 건전지, 충전지 등\n" +
                        "주요거점 전용수거함에 배출\n" +
                        "- 동주민센터·편의점·아파트 및 주택가 폐형광등(전지)수거함\n" +
                        "전지를 제품과 분리해 배출");
                break;
            case"섬유류":
                txtText.setText("예) 의류, 솜 없는 이불 등\n" +
                        "지자체 등에서 설치한 의류수거함에 배출\n" +
                        "※ 솜이 들어있는 이불은 일반 종량제 봉투에 넣어 배출");
                break;
            case"폐전자제품":
                txtText.setText("예) 세탁기, 에어컨, 냉장고,\n" +
                        "TV 들 중 한 면의 길이가 1m 이상인 대형가전\n" +
                        "대형폐가전 무상방문수거 서비스를 이용해 배출\n" +
                        "콜센터 : 1599-0903\n" +
                        "인터넷 : http://www.15990903.or.kr\n" +
                        "※ 원형훼손된 제품은 동주민센터 또는 구청 홈페이지에서 신고 후 배출\n" +
                        "컴퓨터, 전기밥솥 등 한 면의 길이가 1m 미만인 소형가전\n" +
                        "재활용품 배출 시 함께 배출하거나\n" +
                        "동주민센터 및 아파트 내 전용수거함에 배출");
                break;
        }
    }


    public void mOnClose(View v){
        //데이터 전달하기
        Intent intent = new Intent();
        intent.putExtra("result", "Close Popup");
        setResult(RESULT_OK, intent);

        //액티비티(팝업) 닫기
        finish();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        //바깥레이어 클릭시 안닫히게
        if(event.getAction()==MotionEvent.ACTION_OUTSIDE){
            return false;
        }
        return true;
    }

    @Override
    public void onBackPressed() {
        //안드로이드 백버튼 막기
        return;
    }
}
