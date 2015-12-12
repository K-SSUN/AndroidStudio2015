package kr.ac.kookmin.lab_intent2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt = (Button)findViewById(R.id.bt_1);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 암시적(Implicit) intent 어떤 '의도'로 원하는 컴포넌트 실행
                // 암시적 intent에 담을 수 있는 정보는 액션, 카테고리, 데이터 위치, 데이터 타입
                Intent i = new Intent(Intent.ACTION_VIEW);
                // ACTION_VIEW = 사용자에게 화면을 보여주는 액션

                Uri u = Uri.parse("http://www.naver.com/");
                i.setData(u);
                startActivity(i);
            }
        });
    }
}

