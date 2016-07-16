package com.hanbit.user.contact_app.member;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by 1027 on 2016-07-16.
 */
public class MemberDAO extends SQLiteOpenHelper {
    public MemberDAO(Context context) {
        super(context, "test.db",null,1 );
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public MemberBean login(MemberBean param){
        MemberBean member = new MemberBean();
        SQLiteDatabase db = this.getReadableDatabase();
        Log.d("DB 진입 전 ID: ", param.getId());
        Cursor cursor = db.rawQuery("select * from member where id='"+param.getId()+"'," +
                " and pw='"+param.getPw()+"'", null);
        if (cursor.moveToNext()){
            member.setId(cursor.getString(1));      //컬럼인덱스 1번부터 시작함
            member.setPw(cursor.getColumnName(2));
        }else{
            member.setId("fail");
        }

        Log.d("DB 결과 : ", member.getId());

        return member;
    }
}
