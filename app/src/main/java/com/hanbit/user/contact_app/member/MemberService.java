package com.hanbit.user.contact_app.member;

/**
 * Created by 1027 on 2016-07-16.
 */
public interface MemberService {
    public String join(MemberBean bean);
    public boolean login(MemberBean bean);
}
