package com.example.recyclerview;

import java.util.ArrayList;
import java.util.List;

public class UserData {
    UserModel m = new UserModel("Ssentamu Abel");
    private static List<UserModel>userList = new ArrayList<UserModel>();



    public static List<UserModel> getUserList() {
        return userList;
    }

    public static void setUserList(List<UserModel> userList) {
        UserData.userList = userList;
    }
}
