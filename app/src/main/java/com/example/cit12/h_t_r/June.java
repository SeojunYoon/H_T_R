package com.example.cit12.h_t_r;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class June extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_june);

        final Button next = (Button) findViewById(R.id.next);
        final Button prev = (Button) findViewById(R.id.prev);
        final TextView foodtrash = (TextView) findViewById(R.id.foodtrash);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                foodtrash.setText("3. 녹차가루 + 찻잎\n" +
                        "티백의 녹차 가루 혹은 차를 우려내고 난 찻잎을 음식물 쓰레기 위에 뿌리면 차에 들어있는 탄닌과 엽록소가 음식물 쓰레기 냄새를 제거해준답니다.\n" +
                        "\n" +
                        "4. 에센셜 오일 + 물\n" +
                        "쓰다 남은 오일을 뜨거운 물에 희석하여 실내에 주기적으로 뿌리면 희석된 오일의 향이 해충으로부터 보호해줍니다.\n" +
                        "\n" +
                        "5. 베이킹소다 + 신문지\n" +
                        "음식물 쓰레기통 속 바닥에 신문지를 깔고 베이킹 소다를 뿌리면 산성의 악취를 알칼리성인 베이킹소다가 중화시켜 음식물 쓰레기 냄새를 막아줍니다.\n" +
                        "\n" +
                        "6. 식초\n" +
                        "음식물 쓰레기 위에 식초를 뿌리고 뚜껑을 닫아주세요. 식초는 세균과 곰팡이를 없애는 살균 효과뿐만 아니라 탈취효과까지 볼 수 있어요. 악취나는 배수구에도 식초를 뿌리면 소독 효과가 있어요\n");
                prev.setVisibility(View.VISIBLE);
                next.setVisibility(View.INVISIBLE);
            }
        });

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                foodtrash.setText("여름철이면 더 심해지는 음식물 쓰레기 냄새와 어디서 날아들어오는지 들끓는 벌레들 때문에 고민 많으시죠? 음식물 쓰레기를 깔끔하게 처리하는 방법을 알려드리겠습니다.\\n\\n\n" +
                        "\n" +
                        "1. 지퍼백\n" +
                        "음식물 쓰레기를 지퍼백에 담아 꼭꼭 잠가두면 냄새가 새어 나오는 것을 차단해줘요. 혹시, 냉동실에 음식물 쓰레기를 넣어 보관하는 분 있으신가요? 음식물 쓰레기를 냉동실에 얼려뒀다가 버리는 분들이 의외로 많은데요. 냉동실에 음식물 쓰레기를 넣어 보관하면 세균 증식의 원인이 될 수 있어요.\\n\\n\n" +
                        "\n" +
                        "2. 소주 + 물\n" +
                        "물과 소주를 3:1로 섞어 분무기에 담아 음식물 쓰레기에 뿌리면 알코올 냄새로 날파리 등 벌레를 예방할 수 있어요.\n");
                next.setVisibility(View.VISIBLE);
                prev.setVisibility(View.INVISIBLE);
            }
        });
    }
}
