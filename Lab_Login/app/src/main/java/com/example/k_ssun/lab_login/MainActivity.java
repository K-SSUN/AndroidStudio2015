package com.example.k_ssun.lab_login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("TEST", "oncreate1");
        setContentView(R.layout.activity_main);
        Button btNew = (Button)this.findViewById(R.id.btnNew);

/*      //익명 inner class 임시객체
        //1
        btNew.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this.getApplicationContext(), "Click Button", Toast.LENGTH_LONG).show();
            }
        }
        );
*/

/*        // 익명 클래스
        //2
        // btNew.setOnClickListener(btnlistener2);
        
        View.OnClickListener btnlistener2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this.getApplicationContext(), "Click Button", Toast.LENGTH_LONG).show();
            }
        };
*/
        /*
            //3 리스너 구현
            ButtonClickListener btnlistener = new ButtonClickListener();
                btNew.setOnClickListener(btnlistener);
         */

    }


/*    //3 리스너 구현
    class ButtonClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this.getApplicationContext(), "Click Button", Toast.LENGTH_LONG).show();
        }
    }
*/

    public void onTestBtnClicked(View v) {
        // 첫번째 인자 - 액티비티 자신. 액티비티 안의 이너, 익명 클래스 속에서 인텐트를 생성할 때
        // this 대신 명시할 클래스명.this
        // 두번째 인자 - 이동할 액티비티의 클래스 오브젝트 클래스명.class
        // 단순 이동, 액티비티끼리 데이터를 주고받는 일종의 의사소통
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    public void onNewBtnClicked(View v) {
        Toast.makeText(getApplicationContext(), "click button", Toast.LENGTH_LONG).show();
    }
}

