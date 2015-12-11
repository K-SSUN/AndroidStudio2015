package com.example.k_ssun.lab_button;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
// AppCompatActivity 클래스 상속

    private Button bt;
    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    // onCreate는 activity가 만들어지고 화면에 나타나기 직전에 호출되는 메서드. 보통 초기화에 이용
        super.onCreate(savedInstanceState); // 시스템 요소 초기화
        setContentView(R.layout.activity_main);
        // activity에 사용할 레이아웃 지정. activity와 레이아웃 연결
        // 레이아웃 파일은 aapt라는 리소스 컴파일러에 의해 컴파일 된 뒤 id를 부여받음.
        // 부여받은 id가 'R'이라는 이름을 가진 클래스에 자동으로 저장. R 클래스는 R.java에 담겨있음

        mContext = this.getApplication().getApplicationContext();

        bt = (Button)this.findViewById(R.id.button);
        // 레이아웃에 정의 된 view는 findViewById 메서드를 사용하여 코드로 가져옴.
        // 인자 = R.id.지정했던 아이디 / view타입을 반환하니 view에 맞는 타입으로 캐스팅 해줘야함

        // 익명 inner class의 임시 객체 사용
        // 객체 생성문을 setOnClickListener 호출문안에 넣음음
 //      bt.setOnClickListener(new View.OnClickListener() {
 //           @Override
 //           public void onClick(View v) {
 //               Toast.makeText(mContext, "Click Button", Toast.LENGTH_LONG).show();
 //           }
 //       });
        bt.setOnClickListener(this);
    }

    // activity가 직접 listener interface를 구현
    @Override
    public void onClick(View v) {
        if(v == (Button) bt) {
            Toast.makeText(mContext, "Click Button", Toast.LENGTH_LONG).show();
            // Toast.makeText(액티비티 클래스의 인스턴스, "띄울 메시지", Toast.LENGTH_SHORT).show();
        }
    }
}
