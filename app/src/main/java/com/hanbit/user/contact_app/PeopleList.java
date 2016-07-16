package com.hanbit.user.contact_app;

import java.util.ArrayList;

/**
 * Created by 1027 on 2016-07-16.
 */
public class PeopleList {
    public static ArrayList<People> getList() {
        ArrayList<People> list = new ArrayList<People>();
        String[][] peoples = {
                       {"컵케이크", "cup@test.com", "010-9075-3070", "1"},
                       {"도넛", "donut@test.com", "010-9075-3070", "2"},
                      {"이클레어", "eclare@test.com", "010-9075-3070", "3"},
                        {"프로요", "froyo@test.com", "010-9075-3070", "4"},
                       {"진저", "gin@test.com", "010-9075-3070", "5"},
                       {"하니컴", "honey@test.com", "010-9075-3070", "6"},
                      {"아이스크림", "icecream@test.com", "010-9075-3070", "7"},
                        {"젤리빈", "jel@test.com", "010-9075-3070", "8"},
                       {"킷켓", "kit@test.com", "010-9075-3070", "9"},
                       {"롤리팝", "lol@test.com", "010-9075-3070", "10"},
                 };
         for(int i=0;i<peoples.length;i++){
                  People people = new People();
                   int j=0;
                    while(j<peoples[i].length){
                                j=0;
                         people.setName(peoples[i][j]);
                                j++;
                                people.setEmail(peoples[i][j]);
                                j++;
                                people.setPhoneNo(peoples[i][j]);
                                j++;
                                people.setPhoto(Integer.parseInt(peoples[i][j]));
                            }
                        list.add(people);
                    }
                return list;
            }

}
