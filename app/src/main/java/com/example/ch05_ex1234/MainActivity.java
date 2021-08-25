package com.example.ch05_ex1234;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Java 코드로만 만들기(xml없이~!)

        //setContentView(R.layout.activity_main);//xml은 안쓸꺼임

        //1단계: 레이아웃 객체를 만든다.(예:LinearLayout 만들기 코드로)
        //2단계: View 객체를 만든다.(예:Button 만들기 코드로)
        //3단계: View객체(예:버튼)를 레이아웃에 꽂는다
        //4단계: View 객체 이벤트 처리


        //0단계: 레이아웃의 옵션(param)을 만든다.예:너비와 높이
        LinearLayout.LayoutParams options
            = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                                            LinearLayout.LayoutParams.MATCH_PARENT);

        //1단계: 레이아웃 객체를 만든다.(예:LinearLayout 만들기 코드로)
        LinearLayout baseLayout = new LinearLayout(this);
        //1단계-1:레이아웃의 속성을 설정한다.
        baseLayout.setOrientation(LinearLayout.VERTICAL);
        baseLayout.setBackgroundColor(Color.rgb(0,255,0));
        //1단계-2:레이아웃 객체를 View에 꽂는다
        setContentView(baseLayout, options);//xml파일이 아니고~! Java 객체

        //2단계: View 객체를 만든다.(예:Button 만들기 코드로)
        EditText edt1 = new EditText(this);
        //2단계-1:view 객체의 속성을 설정한다.
        edt1.setHint("입력해주세요!");
        edt1.setBackgroundColor(Color.YELLOW);
        //3단계: View객체(예:버튼)를 레이아웃에 꽂는다
        baseLayout.addView(edt1);


        //2단계: View 객체를 만든다.(예:Button 만들기 코드로)
        Button btn1 = new Button(this);
        //2단계-1:view 객체의 속성을 설정한다.
        btn1.setText("버튼입니다");
        btn1.setBackgroundColor(Color.MAGENTA);
        //3단계: View객체(예:버튼)를 레이아웃에 꽂는다
        baseLayout.addView(btn1);

        //2단계: View 객체를 만든다.(예:Button 만들기 코드로)
        TextView tv1 = new TextView(this);
        //2단계-1:view 객체의 속성을 설정한다.
        tv1.setText("결과출력창~!");
        tv1.setTextSize(30);
        //3단계: View객체(예:버튼)를 레이아웃에 꽂는다
        baseLayout.addView(tv1);

        //4단계: View 객체 이벤트 처리
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,
                              "클릭됨!!",
                               Toast.LENGTH_SHORT).show();

                tv1.setText(edt1.getText().toString());
            }
        });


    }
}