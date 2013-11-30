package com.game.load.load.impl;

import com.game.base.IUnit;
import com.game.load.load.IUser;


/**
 * Created with IntelliJ IDEA.
 * User: xianliu.wy
 * Date: 13-11-26
 * Time: 下午8:09
 * To change this template use File | Settings | File Templates.
 */
public class User implements IUser {
    private IUnit unit;
	private String profession;//职业
    private Integer gender;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    private String userName;

    public User() {
    }

    public IUnit getUnit() {
		return unit;
	}
	public void setUnit(IUnit unit) {
		this.unit = unit;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}

    @Override
    public String getName() {
        return this.getUserName();
    }
}
