package kr.ac.kookmin.lab_intent3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/*
    Extra -> Bundle(데이터묶음) 타입의 데이터의 한종류.
    Intent putExtra(String name, int value)
    Intent putExtra(String name, String value)
    Intent putExtra(String name, boolean value)

    // 리턴값을 돌려주는 액티비티를 호출하는 함수
    // requestCode : 어떤 액티비티에 대한 리턴인지 구분하기 위한 고유의 번호, 음수의 경우 리턴 안받음
    public void startActivityForResult(Intent intent, int requsetCode)
    // 누구에 대한 호출이 어떻게 처리되는지 알기위한 함수, 액티비티가 끝나면 호출됨
    // requestCode : 호출할 때 전달한 요청코드
    // resultCode : 액티비티의 실행결과
    proteced void onActivityResult(int requestCode, int resultCode, Intent data)

 */
public class MainActivity extends Activity {
    TextView mText;
    final static int ACT_EDIT = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mText = (TextView)findViewById(R.id.text);

        Button btnEdit = (Button)findViewById(R.id.edit);
        btnEdit.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActEdit.class);
                intent.putExtra("TextIn", mText.getText().toString()); //인텐트에 데이터 보내기

                // starActivityForResult : 결과 값을 얻기 위해 액티비티를 시작
                // 첫번째 인자 - 인텐트
                // 두번째 인자 - 요청코드 = 실행한 액티비티를 구분하기 위해 지정
                startActivityForResult(intent, ACT_EDIT);
            }
        });
    }


    // onActivityResult는 startActivityForResult로 실행한 액티비티가 종료되면 호출됨
    // 종료된 액티비티가 setResult 메서드로 설정한 결과 코드와 데이터(인텐트를 첨부했을 때) 전달
    // 첫번째 매개변수 - startActivityForResult에서 사용했던 요청코드
    // 두번째 매개변수 - 종료된 액티비티가 setResult로 지정한 결과 코드
    // 세번째 매개변수 - 종료된 액티비티가 인텐트를 첨부했으면 그 인텐트
    public void onActivityResult (int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
            case ACT_EDIT:
                if(resultCode == RESULT_OK) {
                    mText.setText(data.getStringExtra("TextOut"));
                }
                break;
        }
    }
}
