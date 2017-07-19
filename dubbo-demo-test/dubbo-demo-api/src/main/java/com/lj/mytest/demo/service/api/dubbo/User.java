package com.lj.mytest.demo.service.api.dubbo;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -1953831207381858939L;

	private int userId;

    private String userName;

//    @JsonField
    private Date birthday;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
