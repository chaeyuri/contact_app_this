package com.hanbit.user.contact_app.member;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.hanbit.user.contact_app.MainActivity;
import com.hanbit.user.contact_app.R;

public class LoginActivity extends Activity implements View.OnClickListener {
    EditText etID, etPW;
    Button btLogin, btHome;
    MemberBean bean = new MemberBean();
    MemberService service = new MemberServiceImpl(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etID = (EditText) findViewById(R.id.etID);
        etPW = (EditText) findViewById(R.id.etPW);
        btLogin = (Button) findViewById(R.id.btLogin);
        btHome = (Button) findViewById(R.id.btHome);
        btLogin.setOnClickListener(this);
        btHome.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String id = etID.getText().toString();
        String pw = etPW.getText().toString();
        bean.setId(id);
        bean.setPw(pw);
        switch (v.getId()) {
            case R.id.btLogin:
                if (service.login(bean)) {
                    Toast tos = Toast.makeText(LoginActivity.this, "로그인성공", Toast.LENGTH_LONG);
                    tos.show();
                } else {
                    Toast tos = Toast.makeText(LoginActivity.this, "로그인실패", Toast.LENGTH_SHORT);
                    tos.show();
                }
                break;
            case R.id.btHome:
                this.startActivity(new Intent(this, MainActivity.class));
                break;
            default:
                break;
        }
    }
}