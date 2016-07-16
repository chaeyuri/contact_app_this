package com.hanbit.user.contact_app.member;

import android.content.Context;
import android.util.Log;

/**
 * Created by 1027 on 2016-07-16.
 */
public class MemberServiceImpl implements MemberService {
    public static String sessionID,sessionPW;
    MemberDAO dao;

    public MemberServiceImpl(Context context){
        this.dao = new MemberDAO(context);
    }

    @Override
    public String join(MemberBean bean) {
        String id = bean.getId();
        String pw = bean.getPw();
        String name = bean.getName();
        String email = bean.getEmail();
        Log.d("넘어온 ID : ",id);
        Log.d("넘어온 PW : ",pw);
        Log.d("넘어온 이름 : ",name);
        Log.d("넘어온 이메일 : ",email);
        sessionID = id;
        sessionPW = pw;

        return name+"님 회원가입을 축하드립니다.";
    }

    @Override
    public boolean login(MemberBean bean) {
        boolean loginOK = false;
        String id = bean.getId();
        String pw = bean.getPw();
        Log.d("넘어온 ID : ",id);
        Log.d("넘어온 PW : ",pw);
        MemberBean member = dao.login(bean);
        Log.d("서비스에서 체크한 ID",member.getId());
        /*if(sessionID.equals(id) && sessionPW.equals(pw)){
            loginOK = true;
        }*/

        if(member.getId().equals("fail")){
            loginOK = false;
        }else{
            loginOK = true;
        }
        return loginOK;
    }
}